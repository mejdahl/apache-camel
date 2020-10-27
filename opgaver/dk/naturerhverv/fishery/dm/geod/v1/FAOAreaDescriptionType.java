
package dk.naturerhverv.fishery.dm.geod.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type til reportering af farvand via FAO
 * 
 * <p>Java class for FAOAreaDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAOAreaDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Area" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}FAOAreaType" minOccurs="0"/>
 *         &lt;element name="SubArea" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}FAOSubAreaType" minOccurs="0"/>
 *         &lt;element name="Division" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}FAODivisionType" minOccurs="0"/>
 *         &lt;element name="SubDivision" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}FAOSubDivisionType" minOccurs="0"/>
 *         &lt;element name="Unit" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}FAOUnitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAOAreaDescriptionType", propOrder = {
    "area",
    "subArea",
    "division",
    "subDivision",
    "unit"
})
public class FAOAreaDescriptionType
    implements Serializable
{

    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "SubArea")
    protected String subArea;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "SubDivision")
    protected String subDivision;
    @XmlElement(name = "Unit")
    protected String unit;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the subArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubArea() {
        return subArea;
    }

    /**
     * Sets the value of the subArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubArea(String value) {
        this.subArea = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the subDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDivision() {
        return subDivision;
    }

    /**
     * Sets the value of the subDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDivision(String value) {
        this.subDivision = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
