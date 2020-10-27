
package dk.naturerhverv.fishery.dm.indv.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.dm.indv.v1 package. 
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

    private final static QName _CommunicationTypeCode_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "CommunicationTypeCode");
    private final static QName _AddressTypeCode_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "AddressTypeCode");
    private final static QName _PersonIdentification_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "PersonIdentification");
    private final static QName _CvrNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "CvrNumber");
    private final static QName _CprNumber_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "CprNumber");
    private final static QName _WorkerInitials_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:indv:v1.0", "WorkerInitials");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.dm.indv.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyerReferenceType }
     * 
     */
    public BuyerReferenceType createBuyerReferenceType() {
        return new BuyerReferenceType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "CommunicationTypeCode")
    public JAXBElement<String> createCommunicationTypeCode(String value) {
        return new JAXBElement<String>(_CommunicationTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "AddressTypeCode")
    public JAXBElement<String> createAddressTypeCode(String value) {
        return new JAXBElement<String>(_AddressTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "PersonIdentification")
    public JAXBElement<String> createPersonIdentification(String value) {
        return new JAXBElement<String>(_PersonIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "CvrNumber")
    public JAXBElement<String> createCvrNumber(String value) {
        return new JAXBElement<String>(_CvrNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "CprNumber")
    public JAXBElement<String> createCprNumber(String value) {
        return new JAXBElement<String>(_CprNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:indv:v1.0", name = "WorkerInitials")
    public JAXBElement<String> createWorkerInitials(String value) {
        return new JAXBElement<String>(_WorkerInitials_QNAME, String.class, null, value);
    }

}
