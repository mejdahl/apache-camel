
package dk.naturerhverv.fishery.dm.base.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SpeciesObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeciesObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ObjectType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesCodeType"/>
 *         &lt;element name="Gender" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesGenderType" minOccurs="0"/>
 *         &lt;element name="SubSpecies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StageOfLife" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesStageOfLifeType" minOccurs="0"/>
 *         &lt;element name="CountRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BreedingSpecies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PresentationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeciesObjectType", propOrder = {
    "code",
    "gender",
    "subSpecies",
    "stageOfLife",
    "countRequired",
    "breedingSpecies",
    "presentationOrder",
    "name"
})
public class SpeciesObjectType
    extends ObjectType
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "SubSpecies")
    protected String subSpecies;
    @XmlElement(name = "StageOfLife")
    protected String stageOfLife;
    @XmlElement(name = "CountRequired")
    protected Boolean countRequired;
    @XmlElement(name = "BreedingSpecies")
    protected Boolean breedingSpecies;
    @XmlElement(name = "PresentationOrder")
    protected Integer presentationOrder;
    @XmlElement(name = "Name")
    protected List<SpeciesObjectType.Name> name;

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

    /**
     * Gets the value of the countRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountRequired() {
        return countRequired;
    }

    /**
     * Sets the value of the countRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountRequired(Boolean value) {
        this.countRequired = value;
    }

    /**
     * Gets the value of the breedingSpecies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBreedingSpecies() {
        return breedingSpecies;
    }

    /**
     * Sets the value of the breedingSpecies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBreedingSpecies(Boolean value) {
        this.breedingSpecies = value;
    }

    /**
     * Gets the value of the presentationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresentationOrder() {
        return presentationOrder;
    }

    /**
     * Sets the value of the presentationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresentationOrder(Integer value) {
        this.presentationOrder = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeciesObjectType.Name }
     * 
     * 
     */
    public List<SpeciesObjectType.Name> getName() {
        if (name == null) {
            name = new ArrayList<SpeciesObjectType.Name>();
        }
        return this.name;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Name {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "lang", required = true)
        protected String lang;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the lang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Sets the value of the lang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }

}
