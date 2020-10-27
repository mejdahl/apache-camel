
package dk.naturerhverv.fishery.dm.geod.v1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.dm.geod.v1 package. 
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

    private final static QName _EuPortCode_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "EuPortCode");
    private final static QName _NationCode_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "NationCode");
    private final static QName _CountryCodeAlpha3_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "CountryCodeAlpha3");
    private final static QName _LocationIdentification_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "LocationIdentification");
    private final static QName _NationIdentification_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "NationIdentification");
    private final static QName _PolygonBusinessKey_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "PolygonBusinessKey");
    private final static QName _PostalCode_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "PostalCode");
    private final static QName _PostalDistrictIdentification_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "PostalDistrictIdentification");
    private final static QName _NationReference_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:geod:v1.0", "NationReference");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.dm.geod.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaReferenceType }
     * 
     */
    public AreaReferenceType createAreaReferenceType() {
        return new AreaReferenceType();
    }

    /**
     * Create an instance of {@link LocationReferenceType }
     * 
     */
    public LocationReferenceType createLocationReferenceType() {
        return new LocationReferenceType();
    }

    /**
     * Create an instance of {@link NationReferenceType }
     * 
     */
    public NationReferenceType createNationReferenceType() {
        return new NationReferenceType();
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link FAOAreaDescriptionType }
     * 
     */
    public FAOAreaDescriptionType createFAOAreaDescriptionType() {
        return new FAOAreaDescriptionType();
    }

    /**
     * Create an instance of {@link AreaIdentificationType }
     * 
     */
    public AreaIdentificationType createAreaIdentificationType() {
        return new AreaIdentificationType();
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
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "EuPortCode")
    public JAXBElement<String> createEuPortCode(String value) {
        return new JAXBElement<String>(_EuPortCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "NationCode")
    public JAXBElement<String> createNationCode(String value) {
        return new JAXBElement<String>(_NationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "CountryCodeAlpha3")
    public JAXBElement<String> createCountryCodeAlpha3(String value) {
        return new JAXBElement<String>(_CountryCodeAlpha3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "LocationIdentification")
    public JAXBElement<String> createLocationIdentification(String value) {
        return new JAXBElement<String>(_LocationIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "NationIdentification")
    public JAXBElement<String> createNationIdentification(String value) {
        return new JAXBElement<String>(_NationIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "PolygonBusinessKey")
    public JAXBElement<BigInteger> createPolygonBusinessKey(BigInteger value) {
        return new JAXBElement<BigInteger>(_PolygonBusinessKey_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDistrictIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "PostalDistrictIdentification")
    public JAXBElement<PostalDistrictIdentificationType> createPostalDistrictIdentification(PostalDistrictIdentificationType value) {
        return new JAXBElement<PostalDistrictIdentificationType>(_PostalDistrictIdentification_QNAME, PostalDistrictIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:geod:v1.0", name = "NationReference")
    public JAXBElement<NationReferenceType> createNationReference(NationReferenceType value) {
        return new JAXBElement<NationReferenceType>(_NationReference_QNAME, NationReferenceType.class, null, value);
    }

}
