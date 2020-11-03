
package dk.fd.dm.indv.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartmentIdentification" type="{urn:dk:fd:dm:indv:v1.0}DepartmentInitialsType" minOccurs="0"/>
 *         &lt;element name="Abbreviation" type="{urn:dk:fd:dm:indv:v1.0}DepartmentInitialsType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:dk:fd:dm:indv:v1.0}AddressType"/>
 *         &lt;element name="DepartmentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParentDepartmentRef" type="{urn:dk:fd:dm:indv:v1.0}DepartmentReferenceType"/>
 *         &lt;element name="Communications" type="{urn:dk:fd:dm:indv:v1.0}CommunicationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentType", propOrder = {
    "departmentIdentification",
    "abbreviation",
    "name",
    "address",
    "departmentType",
    "parentDepartmentRef",
    "communications"
})
public class DepartmentType {

    @XmlElement(name = "DepartmentIdentification")
    protected String departmentIdentification;
    @XmlElement(name = "Abbreviation")
    protected String abbreviation;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "DepartmentType", required = true)
    protected String departmentType;
    @XmlElement(name = "ParentDepartmentRef", required = true)
    protected DepartmentReferenceType parentDepartmentRef;
    @XmlElement(name = "Communications")
    protected List<CommunicationType> communications;

    /**
     * Gets the value of the departmentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentIdentification() {
        return departmentIdentification;
    }

    /**
     * Sets the value of the departmentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentIdentification(String value) {
        this.departmentIdentification = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the departmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentType() {
        return departmentType;
    }

    /**
     * Sets the value of the departmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentType(String value) {
        this.departmentType = value;
    }

    /**
     * Gets the value of the parentDepartmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentReferenceType }
     *     
     */
    public DepartmentReferenceType getParentDepartmentRef() {
        return parentDepartmentRef;
    }

    /**
     * Sets the value of the parentDepartmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentReferenceType }
     *     
     */
    public void setParentDepartmentRef(DepartmentReferenceType value) {
        this.parentDepartmentRef = value;
    }

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType }
     * 
     * 
     */
    public List<CommunicationType> getCommunications() {
        if (communications == null) {
            communications = new ArrayList<CommunicationType>();
        }
        return this.communications;
    }

}
