
package dk.naturerhverv.fishery.sm.cmon.common.findsimplecustomerinfos.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.sm.cmon.common.findsimplecustomerinfos.v1 package. 
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

    private final static QName _FindCustomerInfosResponse_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "FindCustomerInfosResponse");
    private final static QName _FindCustomerInfosRequest_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "FindCustomerInfosRequest");
    private final static QName _FindCustomerInfosRequestTypeCvrNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "CvrNumber");
    private final static QName _FindCustomerInfosRequestTypeCprNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "CprNumber");
    private final static QName _FindCustomerInfosRequestTypePNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "PNumber");
    private final static QName _FindCustomerInfosRequestTypeBuyerNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "BuyerNumber");
    private final static QName _FindCustomerInfosRequestTypeCustomerNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", "CustomerNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.sm.cmon.common.findsimplecustomerinfos.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCustomerInfosResponseType }
     * 
     */
    public FindCustomerInfosResponseType createFindCustomerInfosResponseType() {
        return new FindCustomerInfosResponseType();
    }

    /**
     * Create an instance of {@link FindCustomerInfosRequestType }
     * 
     */
    public FindCustomerInfosRequestType createFindCustomerInfosRequestType() {
        return new FindCustomerInfosRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerInfosResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "FindCustomerInfosResponse")
    public JAXBElement<FindCustomerInfosResponseType> createFindCustomerInfosResponse(FindCustomerInfosResponseType value) {
        return new JAXBElement<FindCustomerInfosResponseType>(_FindCustomerInfosResponse_QNAME, FindCustomerInfosResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerInfosRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "FindCustomerInfosRequest")
    public JAXBElement<FindCustomerInfosRequestType> createFindCustomerInfosRequest(FindCustomerInfosRequestType value) {
        return new JAXBElement<FindCustomerInfosRequestType>(_FindCustomerInfosRequest_QNAME, FindCustomerInfosRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "CvrNumber", scope = FindCustomerInfosRequestType.class)
    public JAXBElement<String> createFindCustomerInfosRequestTypeCvrNumber(String value) {
        return new JAXBElement<String>(_FindCustomerInfosRequestTypeCvrNumber_QNAME, String.class, FindCustomerInfosRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "CprNumber", scope = FindCustomerInfosRequestType.class)
    public JAXBElement<String> createFindCustomerInfosRequestTypeCprNumber(String value) {
        return new JAXBElement<String>(_FindCustomerInfosRequestTypeCprNumber_QNAME, String.class, FindCustomerInfosRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "PNumber", scope = FindCustomerInfosRequestType.class)
    public JAXBElement<String> createFindCustomerInfosRequestTypePNumber(String value) {
        return new JAXBElement<String>(_FindCustomerInfosRequestTypePNumber_QNAME, String.class, FindCustomerInfosRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "BuyerNumber", scope = FindCustomerInfosRequestType.class)
    public JAXBElement<Integer> createFindCustomerInfosRequestTypeBuyerNumber(Integer value) {
        return new JAXBElement<Integer>(_FindCustomerInfosRequestTypeBuyerNumber_QNAME, Integer.class, FindCustomerInfosRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", name = "CustomerNumber", scope = FindCustomerInfosRequestType.class)
    public JAXBElement<String> createFindCustomerInfosRequestTypeCustomerNumber(String value) {
        return new JAXBElement<String>(_FindCustomerInfosRequestTypeCustomerNumber_QNAME, String.class, FindCustomerInfosRequestType.class, value);
    }

}
