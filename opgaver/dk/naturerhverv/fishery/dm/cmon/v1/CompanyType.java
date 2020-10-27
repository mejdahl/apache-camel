
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type defines a company.
 * 
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="CompanyIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="CvrNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CvrNumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionUnit" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}ProductionUnitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyType", propOrder = {
    "companyIdentification",
    "cvrNumber",
    "name",
    "description",
    "productionUnit"
})
public class CompanyType
    extends CustomerBaseType
    implements Serializable
{

    @XmlElement(name = "CompanyIdentification")
    protected String companyIdentification;
    @XmlElement(name = "CvrNumber")
    protected String cvrNumber;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ProductionUnit")
    protected List<ProductionUnitType> productionUnit;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * {@link ProductionUnitType }
     * 
     * 
     */
    public List<ProductionUnitType> getProductionUnit() {
        if (productionUnit == null) {
            productionUnit = new ArrayList<ProductionUnitType>();
        }
        return this.productionUnit;
    }

}
