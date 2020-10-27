package dk.fd.soa.cdm.ws;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for calling web services ie. web service client. This class handles various things:<br>
 * <p/>
 * <p/>
 * <li>The compiled jaxws classes requires an url to the wsdl-file at runtime. This url will be the url from the
 * development environment (it is set in the generated annotations) unless changed.
 * <li>The web service url called needs to be set. If not the url from the wsdl will be used.
 * <li>If calling a web service using ssl this class has a method for adding the necessary security information
 * <p/>
 * Assumption: The WSDL-file (and xsd's) MUST be packed in the root of the resulting jar-file calling this class.
 */
public class JAXWSUtil {
    // Private constants
    private static final String HTTP_HEADER_ENCODING = "UTF-8";
    private static final String HTTP_HEADER_USER_NAME = "soa_username";
    private static final String HTTP_HEADER_MACHINE_NAME = "soa_machinename";
    private static final Pattern WSDLNAME = Pattern.compile(".*(/[a-zA-Z0-9_]*\\.wsdl)");

    private static final String JBOSS_JAXWS_TIMEOUT = "org.jboss.ws.timeout"; // Native-lib: org.jbossws.core.StubExt.PROPERTY_CLIENT_TIMEOUT
    private static final String SUN_JAXWS_CONNECT_TIMEOUT = "com.sun.xml.internal.ws.connect.timeout"; // Sun rt: com.sun.xml.internal.ws.developer.JAXWSProperties.CONNECT_TIMEOUT
    private static final String SUN_JAXWS_REQUEST_TIMEOUT = "com.sun.xml.internal.ws.request.timeout"; // Sun rt: com.sun.xml.internal.ws.developer.JAXWSProperties.REQUEST_TIMEOUT
    private static final String METRO_JAXWS_CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout"; // Metro: com.sun.xml.ws.developer.JAXWSProperties.CONNECT_TIMEOUT
    private static final String METRO_JAXWS_REQUEST_TIMEOUT = "com.sun.xml.ws.request.timeout"; // Metro: com.sun.xml.ws.developer.JAXWSProperties.REQUEST_TIMEOUT
    private static final String CXF_JAXWS_CONNECT_TIMEOUT = "javax.xml.ws.client.connectionTimeout"; // CXF: org.apache.cxf.message.Message.CONNECTION_TIMEOUT
    private static final String CXF_JAXWS_REQUEST_TIMEOUT = "javax.xml.ws.client.receiveTimeout"; // CXF: org.apache.cxf.message.Message.RECEIVE_TIMEOUT

    // jax-ws constants in the Sun api
    // The value of the ssl_socket_factory constant is different in the standalone jax-ws library and in jdk1.6.0
    // Therefore we support both these options
    // jaxws:  com.sun.xml.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY
    // jdk1.6: com.sun.xml.internal.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY
    private static final String JAXWS_SSL_SOCKET_FACTORY = "com.sun.xml.ws.transport.https.client.SSLSocketFactory";
    private static final String JDK16_SSL_SOCKET_FACTORY = "com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory";

    private JAXWSUtil() {
    }

    /**
     * Instantiates the service client based on the supplied class.
     *
     * @param <T>          The type of the service.
     * @param serviceClass the service class in question.
     * @return an instance of the service class.
     */
    public static <T> T createWebServiceClient(Class<T> serviceClass) {
        // Get annotation
        WebServiceClient annotation = serviceClass.getAnnotation(WebServiceClient.class);

        // Get constructor
        Constructor<T> c;
        try {
            c = serviceClass.getDeclaredConstructor(URL.class, QName.class);
        } catch (Exception e) {
            throw new RuntimeException("The class " + serviceClass.getName() + " is not a web service client", e);
        }

        // Get parameters
        URL wsdlUrl = getWSDLURL(annotation, serviceClass);
        QName qname = getQName(annotation);

        // Create instance
        T client;
        try {
            client = c.newInstance(wsdlUrl, qname);
        } catch (Exception e) {
            throw new RuntimeException("Could not instantiate service", e);
        }
        return client;
    }

    /**
     * Set the url to the web service called.
     *
     * @param portInstance the instance of a jaxws port.
     * @param url          the url to call.
     */
    public static void setWebServiceURL(Object portInstance, String url) {
        BindingProvider binding = (BindingProvider) portInstance;
        binding.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
    }

    /**
     * Adds a timeout to the web service call.<br>
     * <p/>
     * Works with JBoss native and Sun Metro. CXF requires version 3.4.0: https://issues.apache.org/jira/browse/CXF-2991
     *
     * @param portInstance the instance of a jaxws port.
     * @param timeoutInMs  the timeout in milli seconds. If 0 or less than 0 then no timeout is enforced.
     */
    public static void setTimeout(Object portInstance, Integer timeoutInMs) {
        // Default is no timeout
        Integer to = null;
        if (timeoutInMs == null) {
            throw new NullPointerException("The timeout value was null.");
        }
        if (timeoutInMs > 0L) {
            to = timeoutInMs;
        }

        // Set timeout
        BindingProvider binding = (BindingProvider) portInstance;
        Map<String, Object> map = binding.getRequestContext();
        if (to == null) {
            map.remove(JBOSS_JAXWS_TIMEOUT);
            map.remove(SUN_JAXWS_CONNECT_TIMEOUT);
            map.remove(SUN_JAXWS_REQUEST_TIMEOUT);
            map.remove(METRO_JAXWS_CONNECT_TIMEOUT);
            map.remove(METRO_JAXWS_REQUEST_TIMEOUT);
            map.remove(CXF_JAXWS_CONNECT_TIMEOUT);
            map.remove(CXF_JAXWS_REQUEST_TIMEOUT);
        } else {
            map.put(JBOSS_JAXWS_TIMEOUT, to);
            map.put(SUN_JAXWS_CONNECT_TIMEOUT, to);
            map.put(SUN_JAXWS_REQUEST_TIMEOUT, to);
            map.put(METRO_JAXWS_CONNECT_TIMEOUT, to);
            map.put(METRO_JAXWS_REQUEST_TIMEOUT, to);
            map.put(CXF_JAXWS_CONNECT_TIMEOUT, to);
            map.put(CXF_JAXWS_REQUEST_TIMEOUT, to);
        }
    }

    /**
     * Sets a user name as an encoded string as a http header.
     *
     * @param portInstance the port instance of the web service
     * @param userName     the user name to set
     */
    public static void setUserName(Object portInstance, String userName) {
        addHttpHeader(portInstance, HTTP_HEADER_USER_NAME, userName);
    }

    /**
     * Returns the user name that was set as a http header on the request.
     *
     * @param wsc the web service context
     * @return the user name
     */
    public static String getUserName(WebServiceContext wsc) {
        return getHttpHeader(wsc, HTTP_HEADER_USER_NAME);
    }

    /**
     * Sets a machine name as an encoded string as a http header.
     *
     * @param portInstance the port instance of the web service
     * @param machineName     the machine name to set
     */
    public static void setMachineName(Object portInstance, String machineName) {
        addHttpHeader(portInstance, HTTP_HEADER_MACHINE_NAME, machineName);
    }

    /**
     * Returns the user name that was set as a http header on the request.
     *
     * @param wsc the web service context
     * @return the machine name
     */
    public static String getMachineName(WebServiceContext wsc) {
        return getHttpHeader(wsc, HTTP_HEADER_MACHINE_NAME);
    }
    
    /**
     * Add SSL configuration per call. This includes trusted certificates and optionally private keys
     * for client authentication.
     *
     * @param portInstance the port instance of the web service
     * @param sslHelper    the ssl helper instance containing information about certificates and keys
     */
    public static void addSSLConfiguration(Object portInstance, SSLKeystoreHelper sslHelper) {
        BindingProvider binding = (BindingProvider) portInstance;

        // Add SSL keystore and truststore
        binding.getRequestContext().put(JAXWS_SSL_SOCKET_FACTORY, sslHelper.getSSLSocketFactory());
        binding.getRequestContext().put(JDK16_SSL_SOCKET_FACTORY, sslHelper.getSSLSocketFactory());
    }

    /**
     * Get an URL to the WSDL in the classpath.
     *
     * @param annotation the WebServiceClient class annotation on the generated service class.
     * @param clazz      a class from the jar-file containing the wsdl-file.
     * @return .
     */
    private static URL getWSDLURL(WebServiceClient annotation, Class<?> clazz) {
        // Get name
        String location = annotation.wsdlLocation();
        Matcher matcher = WSDLNAME.matcher(location);
        if (!matcher.matches()) {
            throw new RuntimeException("Cannot find WSDL name for: " + location);
        }
        if (matcher.groupCount() < 1) {
            throw new RuntimeException("Cannot find group for: " + location);
        }
        String name = matcher.group(1);

        // Create URL from classpath (WSDL are bundled with the library)
        URL url = clazz.getResource(name);
        if (url == null) {
            // Try standard location of wsdl directory
            url = clazz.getResource("/wsdl" + name);
        }
        return url;
    }

    /**
     * Returns the service name.
     *
     * @param annotation the WebServiceClient class annotation on the generated service class.
     * @return .
     */
    private static QName getQName(WebServiceClient annotation) {
        return new QName(annotation.targetNamespace(), annotation.name());
    }
    
    /**
     * Sets a header value as an encoded string as a http header.
     *
     * @param portInstance the port instance of the web service
     * @param headerName the name of the header to set
     * @param headerValue the value of the header to set
     */
    @SuppressWarnings("unchecked")
    private static void addHttpHeader(Object portInstance, String headerName, String headerValue) {
        // Init
        if (headerValue == null || headerValue.isEmpty()) {
            return;
        }

        // Encode: http headers MUST only use US-ASCII, see fex: http://hc.apache.org/httpclient-3.x/charencodings.html
        // The Base64 encoding uses US-ASCII as alphabet, so we use this. The underlying encoding is UTF-8 <br>
        // Note that the UTF-8 alphabet is NOT US-ASCII (as the name implies it is an 8 bit alphabet).
        String encoded = null;
        try {
            encoded = URLEncoder.encode(headerValue, HTTP_HEADER_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not legal: " + HTTP_HEADER_ENCODING, e);
        }

        // Add http header
        BindingProvider binding = (BindingProvider) portInstance;
        Map<String, List<String>> headers = (Map<String, List<String>>) binding.getRequestContext().get(MessageContext.HTTP_REQUEST_HEADERS);
        if (headers == null) {
            headers = new HashMap<String, List<String>>();
            binding.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        }
        List<String> list = headers.get(headerName);
        if (list == null) {
            list = new ArrayList<String>();
            headers.put(headerName, list);
        }
        list.add(encoded);
    }

    /**
     * Returns the header value that was set as a http header on the request.
     *
     * @param wsc the web service context
     * @param headerName the name of the http header
     * @return the header value
     */
    @SuppressWarnings("unchecked")
    private static String getHttpHeader(WebServiceContext wsc, String headerName) {
        // Get encoded string
        Map<String, Object> headers = (Map<String, Object>) wsc.getMessageContext().get(MessageContext.HTTP_REQUEST_HEADERS);
        if (headers == null) {
            return null;
        }
        List<String> list = (List<String>) headers.get(headerName);
        if (list == null || list.size() == 0) {
            return null;
        }
        String encoded = list.get(0);
        if (encoded == null || encoded.isEmpty()) {
            return null;
        }

        // Decode
        String decoded;
        try {
            decoded = URLDecoder.decode(encoded, HTTP_HEADER_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not legal: " + HTTP_HEADER_ENCODING, e);
        }

        return decoded;
    }
    
    
}
