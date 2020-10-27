
package dk.fd.dm.base.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.fd.dm.base.v1 package. 
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

    private final static QName _GearType_QNAME = new QName("urn:dk:fd:dm:base:v1.0", "GearType");
    private final static QName _GearIdentity_QNAME = new QName("urn:dk:fd:dm:base:v1.0", "GearIdentity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.fd.dm.base.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GearTypeType }
     * 
     */
    public GearTypeType createGearTypeType() {
        return new GearTypeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GearTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:base:v1.0", name = "GearType")
    public JAXBElement<GearTypeType> createGearType(GearTypeType value) {
        return new JAXBElement<GearTypeType>(_GearType_QNAME, GearTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:base:v1.0", name = "GearIdentity")
    public JAXBElement<String> createGearIdentity(String value) {
        return new JAXBElement<String>(_GearIdentity_QNAME, String.class, null, value);
    }

}
