
package dk.naturerhverv.fishery.dm.indv.v1;

import java.io.Serializable;
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}BuyerIdentificationType" minOccurs="0"/>
 *         &lt;element name="BuyerNumber" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}BuyerNumberType" minOccurs="0"/>
 *         &lt;element name="ProductionUnitIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}ProductionUnitIdentificationType" minOccurs="0"/>
 *         &lt;element name="PNumber" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}PNumberType" minOccurs="0"/>
 *         &lt;element name="CompanyIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="CvrNumber" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CvrNumberType" minOccurs="0"/>
 *         &lt;element name="CustomerIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="CustomerNumber" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CustomerNumber" minOccurs="0"/>
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
    "name",
    "buyerIdentification",
    "buyerNumber",
    "productionUnitIdentification",
    "pNumber",
    "companyIdentification",
    "cvrNumber",
    "customerIdentification",
    "customerNumber"
})
public class BuyerType
    implements Serializable
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BuyerIdentification")
    protected String buyerIdentification;
    @XmlElement(name = "BuyerNumber")
    protected String buyerNumber;
    @XmlElement(name = "ProductionUnitIdentification")
    protected String productionUnitIdentification;
    @XmlElement(name = "PNumber")
    protected String pNumber;
    @XmlElement(name = "CompanyIdentification")
    protected String companyIdentification;
    @XmlElement(name = "CvrNumber")
    protected String cvrNumber;
    @XmlElement(name = "CustomerIdentification")
    protected String customerIdentification;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;

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
     * Gets the value of the buyerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerIdentification() {
        return buyerIdentification;
    }

    /**
     * Sets the value of the buyerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerIdentification(String value) {
        this.buyerIdentification = value;
    }

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
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdentification(String value) {
        this.companyIdentification = value;
    }

    /**
     * Gets the value of the cvrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvrNumber() {
        return cvrNumber;
    }

    /**
     * Sets the value of the cvrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvrNumber(String value) {
        this.cvrNumber = value;
    }

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

}
