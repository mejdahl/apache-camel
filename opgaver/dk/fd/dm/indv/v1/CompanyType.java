
package dk.fd.dm.indv.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This type defines a company. No production units are returned, only data about the main entity.
 * 
 *                 A company may have a cvr number (Danish companies only).
 *                 Furthermore there may be zero or more names, addresses and communication means.
 *                 A company should always have a name.
 *             
 * 
 * <p>Java class for CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:fd:dm:indv:v1.0}CustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="CompanyIdentification" type="{urn:dk:fd:dm:indv:v1.0}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="CvrNumber" type="{urn:dk:fd:dm:indv:v1.0}CvrNumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:dk:fd:dm:indv:v1.0}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="ProductionUnitRef" type="{urn:dk:fd:dm:indv:v1.0}ProductionUnitReferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
    "productionUnitRef"
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
    protected CompanyNameType name;
    @XmlElement(name = "ProductionUnitRef")
    protected List<ProductionUnitReferenceType> productionUnitRef;

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
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setName(CompanyNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the productionUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionUnitReferenceType }
     * 
     * 
     */
    public List<ProductionUnitReferenceType> getProductionUnitRef() {
        if (productionUnitRef == null) {
            productionUnitRef = new ArrayList<ProductionUnitReferenceType>();
        }
        return this.productionUnitRef;
    }

}