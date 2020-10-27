
package dk.fd.dm.indv.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Kunde, that has interaction with NES and is not other governmental institutions
 * 
 * <p>Java class for CustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIdentification" type="{urn:dk:fd:dm:indv:v1.0}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{urn:dk:fd:dm:indv:v1.0}CustomerNumber" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Person" type="{urn:dk:fd:dm:indv:v1.0}PersonType"/>
 *           &lt;element name="Company" type="{urn:dk:fd:dm:indv:v1.0}CompanyType"/>
 *           &lt;element name="UnknownCompany" type="{urn:dk:fd:dm:indv:v1.0}UnknownCompanyType"/>
 *           &lt;element name="UnknownPerson" type="{urn:dk:fd:dm:indv:v1.0}UnknownPersonType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "customerIdentification",
    "customerNumber",
    "person",
    "company",
    "unknownCompany",
    "unknownPerson"
})
public class CustomerType
    implements Serializable
{

    @XmlElement(name = "CustomerIdentification")
    protected String customerIdentification;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "Person")
    protected PersonType person;
    @XmlElement(name = "Company")
    protected CompanyType company;
    @XmlElement(name = "UnknownCompany")
    protected UnknownCompanyType unknownCompany;
    @XmlElement(name = "UnknownPerson")
    protected UnknownPersonType unknownPerson;

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentification(String value) {
        this.customerIdentification = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompany(CompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the unknownCompany property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownCompanyType }
     *     
     */
    public UnknownCompanyType getUnknownCompany() {
        return unknownCompany;
    }

    /**
     * Sets the value of the unknownCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownCompanyType }
     *     
     */
    public void setUnknownCompany(UnknownCompanyType value) {
        this.unknownCompany = value;
    }

    /**
     * Gets the value of the unknownPerson property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownPersonType }
     *     
     */
    public UnknownPersonType getUnknownPerson() {
        return unknownPerson;
    }

    /**
     * Sets the value of the unknownPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownPersonType }
     *     
     */
    public void setUnknownPerson(UnknownPersonType value) {
        this.unknownPerson = value;
    }

}
