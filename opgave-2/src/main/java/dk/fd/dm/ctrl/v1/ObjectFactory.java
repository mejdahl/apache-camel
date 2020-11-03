
package dk.fd.dm.ctrl.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.fd.dm.ctrl.v1 package. 
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

    private final static QName _InspectionPurpose_QNAME = new QName("urn:dk:fd:dm:ctrl:v1.0", "InspectionPurpose");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.fd.dm.ctrl.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InspectionPurposeType }
     * 
     */
    public InspectionPurposeType createInspectionPurposeType() {
        return new InspectionPurposeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InspectionPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:ctrl:v1.0", name = "InspectionPurpose")
    public JAXBElement<InspectionPurposeType> createInspectionPurpose(InspectionPurposeType value) {
        return new JAXBElement<InspectionPurposeType>(_InspectionPurpose_QNAME, InspectionPurposeType.class, null, value);
    }

}
