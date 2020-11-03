
package dk.naturerhverv.fishery.lists.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:dk:naturerhverv:fishery:lists:v2}SpeciesCodeType"/>
 *         &lt;element name="Gender" type="{urn:dk:naturerhverv:fishery:lists:v2}SpeciesGenderType" minOccurs="0"/>
 *         &lt;element name="SubSpecies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StageOfLife" type="{urn:dk:naturerhverv:fishery:lists:v2}SpeciesStageOfLifeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeciesType", propOrder = {
    "code",
    "gender",
    "subSpecies",
    "stageOfLife"
})
public class SpeciesType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "SubSpecies")
    protected String subSpecies;
    @XmlElement(name = "StageOfLife")
    protected String stageOfLife;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the subSpecies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSpecies() {
        return subSpecies;
    }

    /**
     * Sets the value of the subSpecies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSpecies(String value) {
        this.subSpecies = value;
    }

    /**
     * Gets the value of the stageOfLife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageOfLife() {
        return stageOfLife;
    }

    /**
     * Sets the value of the stageOfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageOfLife(String value) {
        this.stageOfLife = value;
    }

}
