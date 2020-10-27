
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * P-Enheder
 * 
 * <p>Java class for ProductionUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="ProductionUnitIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}ProductionUnitIdentificationType" minOccurs="0"/>
 *         &lt;element name="ProductionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}PNumberType"/>
 *         &lt;element name="CompanyIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CompanyIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionUnitType", propOrder = {
    "productionUnitIdentification",
    "productionUnitName",
    "pNumber",
    "companyIdentification"
})
public class ProductionUnitType
    extends CustomerBaseType
    implements Serializable
{

    @XmlElement(name = "ProductionUnitIdentification")
    protected String productionUnitIdentification;
    @XmlElement(name = "ProductionUnitName")
    protected String productionUnitName;
    @XmlElement(name = "PNumber", required = true)
    protected String pNumber;
    @XmlElement(name = "CompanyIdentification")
    protected String companyIdentification;

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

}
