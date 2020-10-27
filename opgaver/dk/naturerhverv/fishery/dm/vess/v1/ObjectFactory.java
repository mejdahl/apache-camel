
package dk.naturerhverv.fishery.dm.vess.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.dm.vess.v1 package. 
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

    private final static QName _ExternalIdentification_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:vess:v1.0", "ExternalIdentification");
    private final static QName _VesselReference_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:vess:v1.0", "VesselReference");
    private final static QName _VesselIdentificationConcrete_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:vess:v1.0", "VesselIdentificationConcrete");
    private final static QName _VesselInfo_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:vess:v1.0", "VesselInfo");
    private final static QName _Vessel_QNAME = new QName("urn:dk:naturerhverv:fishery:dm:vess:v1.0", "Vessel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.dm.vess.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VesselIdentificationType }
     * 
     */
    public VesselIdentificationType createVesselIdentificationType() {
        return new VesselIdentificationType();
    }

    /**
     * Create an instance of {@link VesselReferenceType }
     * 
     */
    public VesselReferenceType createVesselReferenceType() {
        return new VesselReferenceType();
    }

    /**
     * Create an instance of {@link VesselInfoType }
     * 
     */
    public VesselInfoType createVesselInfoType() {
        return new VesselInfoType();
    }

    /**
     * Create an instance of {@link VesselIdentificationConcreteType }
     * 
     */
    public VesselIdentificationConcreteType createVesselIdentificationConcreteType() {
        return new VesselIdentificationConcreteType();
    }

    /**
     * Create an instance of {@link VesselType }
     * 
     */
    public VesselType createVesselType() {
        return new VesselType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:vess:v1.0", name = "ExternalIdentification")
    public JAXBElement<String> createExternalIdentification(String value) {
        return new JAXBElement<String>(_ExternalIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:vess:v1.0", name = "VesselReference")
    public JAXBElement<VesselReferenceType> createVesselReference(VesselReferenceType value) {
        return new JAXBElement<VesselReferenceType>(_VesselReference_QNAME, VesselReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselIdentificationConcreteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:vess:v1.0", name = "VesselIdentificationConcrete")
    public JAXBElement<VesselIdentificationConcreteType> createVesselIdentificationConcrete(VesselIdentificationConcreteType value) {
        return new JAXBElement<VesselIdentificationConcreteType>(_VesselIdentificationConcrete_QNAME, VesselIdentificationConcreteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:vess:v1.0", name = "VesselInfo")
    public JAXBElement<VesselInfoType> createVesselInfo(VesselInfoType value) {
        return new JAXBElement<VesselInfoType>(_VesselInfo_QNAME, VesselInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:naturerhverv:fishery:dm:vess:v1.0", name = "Vessel")
    public JAXBElement<VesselType> createVessel(VesselType value) {
        return new JAXBElement<VesselType>(_Vessel_QNAME, VesselType.class, null, value);
    }

}
