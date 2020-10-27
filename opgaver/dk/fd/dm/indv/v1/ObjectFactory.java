
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

    private final static QName _CustomerReference_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CustomerReference");
    private final static QName _Person_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Person");
    private final static QName _CommunicationTypeCode_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CommunicationTypeCode");
    private final static QName _OtherAddress_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "OtherAddress");
    private final static QName _AddressTypeCode_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "AddressTypeCode");
    private final static QName _PersonName_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "PersonName");
    private final static QName _WorkerInitials_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "WorkerInitials");
    private final static QName _UnknownPerson_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "UnknownPerson");
    private final static QName _CompanyName_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CompanyName");
    private final static QName _CvrNumber_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CvrNumber");
    private final static QName _Communication_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Communication");
    private final static QName _CprNumber_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CprNumber");
    private final static QName _PersonIdentification_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "PersonIdentification");
    private final static QName _Customer_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Customer");
    private final static QName _Address_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Address");
    private final static QName _CustomerBase_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "CustomerBase");
    private final static QName _Company_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Company");
    private final static QName _DanishAddress_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "DanishAddress");
    private final static QName _Buyer_QNAME = new QName("urn:dk:fd:dm:indv:v1.0", "Buyer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.fd.dm.indv.v1
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link ProductionUnitType }
     * 
     */
    public ProductionUnitType createProductionUnitType() {
        return new ProductionUnitType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link CompanyReferenceType }
     * 
     */
    public CompanyReferenceType createCompanyReferenceType() {
        return new CompanyReferenceType();
    }

    /**
     * Create an instance of {@link UnknownCompanyType }
     * 
     */
    public UnknownCompanyType createUnknownCompanyType() {
        return new UnknownCompanyType();
    }

    /**
     * Create an instance of {@link CompanyNameType }
     * 
     */
    public CompanyNameType createCompanyNameType() {
        return new CompanyNameType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link ProductionUnitReferenceType }
     * 
     */
    public ProductionUnitReferenceType createProductionUnitReferenceType() {
        return new ProductionUnitReferenceType();
    }

    /**
     * Create an instance of {@link BuyerReferenceType }
     * 
     */
    public BuyerReferenceType createBuyerReferenceType() {
        return new BuyerReferenceType();
    }

    /**
     * Create an instance of {@link CustomerReferenceType }
     * 
     */
    public CustomerReferenceType createCustomerReferenceType() {
        return new CustomerReferenceType();
    }

    /**
     * Create an instance of {@link UnknownPersonType }
     * 
     */
    public UnknownPersonType createUnknownPersonType() {
        return new UnknownPersonType();
    }

    /**
     * Create an instance of {@link DanishAddressType }
     * 
     */
    public DanishAddressType createDanishAddressType() {
        return new DanishAddressType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CustomerReference")
    public JAXBElement<CustomerReferenceType> createCustomerReference(CustomerReferenceType value) {
        return new JAXBElement<CustomerReferenceType>(_CustomerReference_QNAME, CustomerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "UnknownPerson")
    public JAXBElement<UnknownPersonType> createUnknownPerson(UnknownPersonType value) {
        return new JAXBElement<UnknownPersonType>(_UnknownPerson_QNAME, UnknownPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CompanyName")
    public JAXBElement<CompanyNameType> createCompanyName(CompanyNameType value) {
        return new JAXBElement<CompanyNameType>(_CompanyName_QNAME, CompanyNameType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Customer")
    public JAXBElement<CustomerType> createCustomer(CustomerType value) {
        return new JAXBElement<CustomerType>(_Customer_QNAME, CustomerType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "CustomerBase")
    public JAXBElement<CustomerBaseType> createCustomerBase(CustomerBaseType value) {
        return new JAXBElement<CustomerBaseType>(_CustomerBase_QNAME, CustomerBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:dk:fd:dm:indv:v1.0", name = "Company")
    public JAXBElement<CompanyType> createCompany(CompanyType value) {
        return new JAXBElement<CompanyType>(_Company_QNAME, CompanyType.class, null, value);
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
