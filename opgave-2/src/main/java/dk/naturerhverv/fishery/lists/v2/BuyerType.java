
package dk.naturerhverv.fishery.lists.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Buyer
 * 
 * <p>Java class for BuyerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerNumber" type="{urn:dk:naturerhverv:fishery:lists:v2}BuyerNumberType" minOccurs="0"/>
 *         &lt;element name="PNumber" type="{urn:dk:naturerhverv:fishery:lists:v2}PNumberType" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{urn:dk:naturerhverv:fishery:lists:v2}CustomerNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerType", propOrder = {
    "buyerNumber",
    "pNumber",
    "customerNumber"
})
public class BuyerType {

    @XmlElement(name = "BuyerNumber")
    protected String buyerNumber;
    @XmlElement(name = "PNumber")
    protected String pNumber;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;

    /**
     * Gets the value of the buyerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerNumber() {
        return buyerNumber;
    }

    /**
     * Sets the value of the buyerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerNumber(String value) {
        this.buyerNumber = value;
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

}
