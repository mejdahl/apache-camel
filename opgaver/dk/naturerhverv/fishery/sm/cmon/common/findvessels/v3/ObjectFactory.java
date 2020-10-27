
package dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindVesselsRequest_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindVessels:v3.0", "FindVesselsRequest");
    private final static QName _FindVesselsResponse_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindVessels:v3.0", "FindVesselsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindVesselsRequestType }
     * 
     */
    public FindVesselsRequestType createFindVesselsRequestType() {
        return new FindVesselsRequestType();
    }

    /**
     * Create an instance of {@link VesselWithOwnerType }
     * 
     */
    public VesselWithOwnerType createVesselWithOwnerType() {
        return new VesselWithOwnerType();
    }

    /**
     * Create an instance of {@link FindVesselsResponseType }
     * 
     */
    public FindVesselsResponseType createFindVesselsResponseType() {
        return new FindVesselsResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVesselsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindVessels:v3.0", name = "FindVesselsRequest")
    public JAXBElement<FindVesselsRequestType> createFindVesselsRequest(FindVesselsRequestType value) {
        return new JAXBElement<FindVesselsRequestType>(_FindVesselsRequest_QNAME, FindVesselsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVesselsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindVessels:v3.0", name = "FindVesselsResponse")
    public JAXBElement<FindVesselsResponseType> createFindVesselsResponse(FindVesselsResponseType value) {
        return new JAXBElement<FindVesselsResponseType>(_FindVesselsResponse_QNAME, FindVesselsResponseType.class, null, value);
    }

}
