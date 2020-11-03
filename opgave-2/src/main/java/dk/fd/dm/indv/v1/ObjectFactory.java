
package dk.fd.dm.indv.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.fd.dm.indv.v1 package. 
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

    private final static QName _Employee_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Employee");
    private final static QName _CommunicationTypeCode_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CommunicationTypeCode");
    private final static QName _OtherAddress_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "OtherAddress");
    private final static QName _AddressTypeCode_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "AddressTypeCode");
    private final static QName _WorkerInitials_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "WorkerInitials");
    private final static QName _Department_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Department");
    private final static QName _CvrNumber_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CvrNumber");
    private final static QName _Communication_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Communication");
    private final static QName _CprNumber_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CprNumber");
    private final static QName _PersonIdentification_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "PersonIdentification");
    private final static QName _Address_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Address");
    private final static QName _DanishAddress_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "DanishAddress");
    private final static QName _Buyer_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Buyer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.fd.dm.indv.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeReferenceType }
     * 
     */
    public EmployeeReferenceType createEmployeeReferenceType() {
        return new EmployeeReferenceType();
    }

    /**
     * Create an instance of {@link DepartmentReferenceType }
     * 
     */
    public DepartmentReferenceType createDepartmentReferenceType() {
        return new DepartmentReferenceType();
    }

    /**
     * Create an instance of {@link DanishAddressType }
     * 
     */
    public DanishAddressType createDanishAddressType() {
        return new DanishAddressType();
    }

    /**
     * Create an instance of {@link EmployeeType }
     * 
     */
    public EmployeeType createEmployeeType() {
        return new EmployeeType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link BuyerType }
     * 
     */
    public BuyerType createBuyerType() {
        return new BuyerType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link BuyerReferenceType }
     * 
     */
    public BuyerReferenceType createBuyerReferenceType() {
        return new BuyerReferenceType();
    }

    /**
     * Create an instance of {@link DepartmentType }
     * 
     */
    public DepartmentType createDepartmentType() {
        return new DepartmentType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Employee")
    public JAXBElement<EmployeeType> createEmployee(EmployeeType value) {
        return new JAXBElement<EmployeeType>(_Employee_QNAME, EmployeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CommunicationTypeCode")
    public JAXBElement<String> createCommunicationTypeCode(String value) {
        return new JAXBElement<String>(_CommunicationTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "OtherAddress")
    public JAXBElement<OtherAddressType> createOtherAddress(OtherAddressType value) {
        return new JAXBElement<OtherAddressType>(_OtherAddress_QNAME, OtherAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "AddressTypeCode")
    public JAXBElement<String> createAddressTypeCode(String value) {
        return new JAXBElement<String>(_AddressTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "WorkerInitials")
    public JAXBElement<String> createWorkerInitials(String value) {
        return new JAXBElement<String>(_WorkerInitials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Department")
    public JAXBElement<DepartmentType> createDepartment(DepartmentType value) {
        return new JAXBElement<DepartmentType>(_Department_QNAME, DepartmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CvrNumber")
    public JAXBElement<String> createCvrNumber(String value) {
        return new JAXBElement<String>(_CvrNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CprNumber")
    public JAXBElement<String> createCprNumber(String value) {
        return new JAXBElement<String>(_CprNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "PersonIdentification")
    public JAXBElement<String> createPersonIdentification(String value) {
        return new JAXBElement<String>(_PersonIdentification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DanishAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "DanishAddress")
    public JAXBElement<DanishAddressType> createDanishAddress(DanishAddressType value) {
        return new JAXBElement<DanishAddressType>(_DanishAddress_QNAME, DanishAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Buyer")
    public JAXBElement<BuyerType> createBuyer(BuyerType value) {
        return new JAXBElement<BuyerType>(_Buyer_QNAME, BuyerType.class, null, value);
    }

}
