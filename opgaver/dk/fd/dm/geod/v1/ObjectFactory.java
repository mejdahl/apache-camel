
package dk.fd.dm.geod.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.fd.dm.geod.v1 package. 
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

    private final static QName _NationCode_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "NationCode");
    private final static QName _CountryCodeAlpha3_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "CountryCodeAlpha3");
    private final static QName _PostalDistrict_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "PostalDistrict");
    private final static QName _PostalCode_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "PostalCode");
    private final static QName _NationIdentity_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "NationIdentity");
    private final static QName _PostalDistrictIdentification_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "PostalDistrictIdentification");
    private final static QName _NationReference_QNAME = new QName("urn:dk:fd:dm:geod:v1.0", "NationReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.fd.dm.geod.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostalDistrictReferenceType }
     * 
     */
    public PostalDistrictReferenceType createPostalDistrictReferenceType() {
        return new PostalDistrictReferenceType();
    }

    /**
     * Create an instance of {@link NationReferenceType }
     * 
     */
    public NationReferenceType createNationReferenceType() {
        return new NationReferenceType();
    }

    /**
     * Create an instance of {@link PostalDistrictType }
     * 
     */
    public PostalDistrictType createPostalDistrictType() {
        return new PostalDistrictType();
    }

    /**
     * Create an instance of {@link PostalDistrictIdentificationType }
     * 
     */
    public PostalDistrictIdentificationType createPostalDistrictIdentificationType() {
        return new PostalDistrictIdentificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "NationCode")
    public JAXBElement<String> createNationCode(String value) {
        return new JAXBElement<String>(_NationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "CountryCodeAlpha3")
    public JAXBElement<String> createCountryCodeAlpha3(String value) {
        return new JAXBElement<String>(_CountryCodeAlpha3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDistrictType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "PostalDistrict")
    public JAXBElement<PostalDistrictType> createPostalDistrict(PostalDistrictType value) {
        return new JAXBElement<PostalDistrictType>(_PostalDistrict_QNAME, PostalDistrictType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "NationIdentity")
    public JAXBElement<String> createNationIdentity(String value) {
        return new JAXBElement<String>(_NationIdentity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDistrictIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "PostalDistrictIdentification")
    public JAXBElement<PostalDistrictIdentificationType> createPostalDistrictIdentification(PostalDistrictIdentificationType value) {
        return new JAXBElement<PostalDistrictIdentificationType>(_PostalDistrictIdentification_QNAME, PostalDistrictIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:geod:v1.0", name = "NationReference")
    public JAXBElement<NationReferenceType> createNationReference(NationReferenceType value) {
        return new JAXBElement<NationReferenceType>(_NationReference_QNAME, NationReferenceType.class, null, value);
    }

}
