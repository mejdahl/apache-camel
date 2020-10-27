
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * P-Enheder
 * 
 * <p>Java class for ProductionUnitSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionUnitSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductionUnitIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}ProductionUnitIdentificationType" minOccurs="0"/>
 *         &lt;element name="ProductionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}PNumberType"/>
 *         &lt;element name="Address" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}AddressSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionUnitSimpleType", propOrder = {
    "productionUnitIdentification",
    "productionUnitName",
    "pNumber",
    "address"
})
public class ProductionUnitSimpleType
    implements Serializable
{

    @XmlElement(name = "ProductionUnitIdentification")
    protected String productionUnitIdentification;
    @XmlElement(name = "ProductionUnitName")
    protected String productionUnitName;
    @XmlElement(name = "PNumber", required = true)
    protected String pNumber;
    @XmlElement(name = "Address")
    protected List<AddressSimpleType> address;

    /**
     * Gets the value of the productionUnitIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionUnitIdentification() {
        return productionUnitIdentification;
    }

    /**
     * Sets the value of the productionUnitIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionUnitIdentification(String value) {
        this.productionUnitIdentification = value;
    }

    /**
     * Gets the value of the productionUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionUnitName() {
        return productionUnitName;
    }

    /**
     * Sets the value of the productionUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionUnitName(String value) {
        this.productionUnitName = value;
    }

    /**
     * Gets the value of the pNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNumber() {
        return pNumber;
    }

    /**
     * Sets the value of the pNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNumber(String value) {
        this.pNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressSimpleType }
     * 
     * 
     */
    public List<AddressSimpleType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressSimpleType>();
        }
        return this.address;
    }

}
