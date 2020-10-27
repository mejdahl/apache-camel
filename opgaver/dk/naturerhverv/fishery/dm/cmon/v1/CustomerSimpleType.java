
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A customer, that has interaction with NES and is not other governmental institutions
 * 
 * <p>Java class for CustomerSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CustomerNumber" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}AddressSimpleType" minOccurs="0"/>
 *         &lt;element name="ProductionUnit" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}ProductionUnitSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSimpleType", propOrder = {
    "customerIdentification",
    "customerNumber",
    "name",
    "address",
    "productionUnit"
})
public class CustomerSimpleType
    implements Serializable
{

    @XmlElement(name = "CustomerIdentification")
    protected String customerIdentification;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Address")
    protected AddressSimpleType address;
    @XmlElement(name = "ProductionUnit")
    protected List<ProductionUnitSimpleType> productionUnit;

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
     *     {@link AddressSimpleType }
     *     
     */
    public AddressSimpleType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSimpleType }
     *     
     */
    public void setAddress(AddressSimpleType value) {
        this.address = value;
    }

    /**
     * Gets the value of the productionUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionUnitSimpleType }
     * 
     * 
     */
    public List<ProductionUnitSimpleType> getProductionUnit() {
        if (productionUnit == null) {
            productionUnit = new ArrayList<ProductionUnitSimpleType>();
        }
        return this.productionUnit;
    }

}
