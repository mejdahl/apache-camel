package dk.naturerhverv.fishery.sm.cmon.common.findconversionfactor.v1_0;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-10-27T13:08:18.959+01:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "BizTalkServiceInstance", 
                  wsdlLocation = "classpath:v1.0/CMON.Conversion.FindConversionFactor.wsdl",
                  targetNamespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindConversionFactor:v1.0") 
public class BizTalkServiceInstance extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindConversionFactor:v1.0", "BizTalkServiceInstance");
    public final static QName CustomBindingITwoWayAsync = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindConversionFactor:v1.0", "CustomBinding_ITwoWayAsync");
    static {
        URL url = BizTalkServiceInstance.class.getClassLoader().getResource("v1.0/CMON.Conversion.FindConversionFactor.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(BizTalkServiceInstance.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:v1.0/CMON.Conversion.FindConversionFactor.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public BizTalkServiceInstance(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BizTalkServiceInstance(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BizTalkServiceInstance() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizTalkServiceInstance(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizTalkServiceInstance(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizTalkServiceInstance(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CMONConversionFindConversionFactor
     */
    @WebEndpoint(name = "CustomBinding_ITwoWayAsync")
    public CMONConversionFindConversionFactor getCustomBindingITwoWayAsync() {
        return super.getPort(CustomBindingITwoWayAsync, CMONConversionFindConversionFactor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMONConversionFindConversionFactor
     */
    @WebEndpoint(name = "CustomBinding_ITwoWayAsync")
    public CMONConversionFindConversionFactor getCustomBindingITwoWayAsync(WebServiceFeature... features) {
        return super.getPort(CustomBindingITwoWayAsync, CMONConversionFindConversionFactor.class, features);
    }

}
