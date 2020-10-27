package dk.fd.soa.cdm.ws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Properties;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/**
 * Helper class that reads a truststore and/or a keystore and then instantiates a ssl socket factory.
 */
public class SSLKeystoreHelper {
    private static final String DEFAULT_STORE_TYPE = "JKS";
    
    private static final String TRUSTSTORE_TYPE    = "dk.fd.ssl.truststore.type";
    private static final String TRUSTSTORE_FILE    = "dk.fd.ssl.truststore.file";
    private static final String TRUSTSTORE_PASSWD  = "dk.fd.ssl.truststore.password";
    private static final String KEYSTORE_TYPE      = "dk.fd.ssl.keystore.type";
    private static final String KEYSTORE_FILE      = "dk.fd.ssl.keystore.file";
    private static final String KEYSTORE_PASSWD    = "dk.fd.ssl.keystore.password";
    
    private static final String SECURITY_PROTOCOL  = "TLS";
    private static final String SECURITY_ALGORITHM = "SunX509";
    
    private SSLSocketFactory sslSocketFactory;
    
    /**
     * Constructor. 
     * 
     * @param configurationFileName the file name of the configuration file containing
     * the parameters needed
     */
    public SSLKeystoreHelper(String configurationFileName) {
        // Read properties
        Properties props = readPropertiesFromFile(configurationFileName);
        // Trust store
        String trustStoreFile = (String)props.get(TRUSTSTORE_FILE);
        String trustStorePasswd = (String)props.get(TRUSTSTORE_PASSWD);
        String trustStoreType = (String)props.get(TRUSTSTORE_TYPE);
        if (trustStoreType == null) {
            trustStoreType = DEFAULT_STORE_TYPE;
        }
        // Key store
        String keyStoreFile = (String)props.get(KEYSTORE_FILE);
        String keyStorePasswd = (String)props.get(KEYSTORE_PASSWD);
        String keyStoreType = (String)props.get(KEYSTORE_TYPE);
        if (keyStoreType == null) {
            keyStoreType = DEFAULT_STORE_TYPE;
        }
        
        // Init ssl socket factory
        try {
            // Init
            SSLContext ctx = SSLContext.getInstance(SECURITY_PROTOCOL);
            KeyManager[] keyManagers = null;
            TrustManager[] trustManagers = null;
            
            // Trust store
            if (trustStoreFile != null) {
                // Load trust store
                KeyStore trustks = KeyStore.getInstance(trustStoreType);
                char[] passphrase = trustStorePasswd.toCharArray();
                InputStream inStream = getInputStream(trustStoreFile);
                trustks.load(inStream, passphrase);
                
                // Add to trust manager
                TrustManagerFactory truststoremf = TrustManagerFactory.getInstance(SECURITY_ALGORITHM);            
                truststoremf.init(trustks);
                trustManagers = truststoremf.getTrustManagers();
            }
            
            // Key store
            if (keyStoreFile != null) {
                // Load key store
                KeyStore ks = KeyStore.getInstance(keyStoreType);
                char[] passphrase = keyStorePasswd.toCharArray();
                InputStream inStream = getInputStream(keyStoreFile);
                ks.load(inStream, passphrase);
                
                // Add to key manager
                KeyManagerFactory keystoremf = KeyManagerFactory.getInstance(SECURITY_ALGORITHM);
                keystoremf.init(ks, passphrase);
                keyManagers = keystoremf.getKeyManagers();
            }
            
            // Init factory
            ctx.init(keyManagers, trustManagers, null);
            sslSocketFactory = ctx.getSocketFactory();
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize ssl", e);
        }
    }
    
    /**
     * Returns the ssl socket factory.
     */
    public SSLSocketFactory getSSLSocketFactory() {
        return sslSocketFactory;
    }
    
    /**
     * Read properties from a file.
     */
    private Properties readPropertiesFromFile(String fileName) {
        // Get input stream
        InputStream in = getInputStream(fileName);
        
        // Read
        Properties props = new Properties();
        try {
            props.load(in);
        } catch (IOException e) {
            throw new RuntimeException("Could not load SSL configuration file: " + fileName, e);
        }
        
        return props;
    }
    
    /**
     * Find a file and return its inputstream.
     */
    private InputStream getInputStream(String fileName) {
        // First: Try as resource
        InputStream inStream = SSLKeystoreHelper.class.getResourceAsStream(fileName);
        if (inStream == null) {
            inStream = SSLKeystoreHelper.class.getResourceAsStream("/" + fileName);
        }
        
        // Next: Try as absolute file
        if (inStream == null) {
            File file = new File(fileName);
            if (file.exists()) {
                try {
                    inStream = new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException("File not found: " + file, e);
                }
            }
        }

        // Test
        if (inStream == null) {
            throw new RuntimeException("File not found: " + fileName);
        }
        return inStream;
    }
    
}
