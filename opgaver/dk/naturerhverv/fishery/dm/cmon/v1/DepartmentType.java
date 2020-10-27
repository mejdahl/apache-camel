
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Internel NES departments
 * 
 * <p>Java class for DepartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartmentIdenitification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}DepartmentIdentificationType" minOccurs="0"/>
 *         &lt;element name="Abbreviation" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}DepartmentInitialsType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}DanishAddressType"/>
 *         &lt;element name="DepartmentType" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}DepartmentTypeType"/>
 *         &lt;element name="ParentDeparmentIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}DepartmentIdentificationType" minOccurs="0"/>
 *         &lt;element name="Communications" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CommunicationType" maxOccurs="unbounded" minOccurs="0"/>
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
    "departmentIdenitification",
    "abbreviation",
    "name",
    "address",
    "departmentType",
    "parentDeparmentIdentification",
    "communications"
})
public class DepartmentType
    implements Serializable
{

    @XmlElement(name = "DepartmentIdenitification")
    protected String departmentIdenitification;
    @XmlElement(name = "Abbreviation")
    protected String abbreviation;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address", required = true)
    protected DanishAddressType address;
    @XmlElement(name = "DepartmentType", required = true)
    protected DepartmentTypeType departmentType;
    @XmlElement(name = "ParentDeparmentIdentification")
    protected String parentDeparmentIdentification;
    @XmlElement(name = "Communications")
    protected List<CommunicationType> communications;

    /**
     * Gets the value of the departmentIdenitification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentIdenitification() {
        return departmentIdenitification;
    }

    /**
     * Sets the value of the departmentIdenitification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentIdenitification(String value) {
        this.departmentIdenitification = value;
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
     *     {@link DanishAddressType }
     *     
     */
    public DanishAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link DanishAddressType }
     *     
     */
    public void setAddress(DanishAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the departmentType property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentTypeType }
     *     
     */
    public DepartmentTypeType getDepartmentType() {
        return departmentType;
    }

    /**
     * Sets the value of the departmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentTypeType }
     *     
     */
    public void setDepartmentType(DepartmentTypeType value) {
        this.departmentType = value;
    }

    /**
     * Gets the value of the parentDeparmentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDeparmentIdentification() {
        return parentDeparmentIdentification;
    }

    /**
     * Sets the value of the parentDeparmentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDeparmentIdentification(String value) {
        this.parentDeparmentIdentification = value;
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
