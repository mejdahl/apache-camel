
package dk.naturerhverv.fishery.lists.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gear Type Model
 * 
 * <p>Java class for GearType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GearType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FAO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GearClassification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GearType", propOrder = {
    "name",
    "fao",
    "gearClassification"
})
public class GearType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FAO", required = true)
    protected String fao;
    @XmlElement(name = "GearClassification", required = true)
    protected String gearClassification;

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
     * Gets the value of the fao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAO() {
        return fao;
    }

    /**
     * Sets the value of the fao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAO(String value) {
        this.fao = value;
    }

    /**
     * Gets the value of the gearClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearClassification() {
        return gearClassification;
    }

    /**
     * Sets the value of the gearClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearClassification(String value) {
        this.gearClassification = value;
    }

}
