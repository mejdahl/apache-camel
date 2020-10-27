
package dk.naturerhverv.fishery.sm.cmon.common.findconversionfactor.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.naturerhverv.fishery.dm.base.v1.RelevantAreaObjectType;
import dk.naturerhverv.fishery.dm.base.v1.SpeciesObjectType;


/**
 * <p>Java class for ConversionFactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionFactorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Species" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesObjectType" minOccurs="0"/>
 *         &lt;element name="RelevantArea" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}RelevantAreaObjectType" minOccurs="0"/>
 *         &lt;element name="Presentation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PresentationCodeType" minOccurs="0"/>
 *         &lt;element name="Preservation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PreservationCodeType" minOccurs="0"/>
 *         &lt;element name="Size" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SizeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionFactorType", propOrder = {
    "species",
    "relevantArea",
    "presentation",
    "preservation",
    "size"
})
public class ConversionFactorType
    implements Serializable
{

    @XmlElement(name = "Species")
    protected SpeciesObjectType species;
    @XmlElement(name = "RelevantArea")
    protected RelevantAreaObjectType relevantArea;
    @XmlElement(name = "Presentation")
    protected String presentation;
    @XmlElement(name = "Preservation")
    protected String preservation;
    @XmlElement(name = "Size")
    protected String size;

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesObjectType }
     *     
     */
    public SpeciesObjectType getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesObjectType }
     *     
     */
    public void setSpecies(SpeciesObjectType value) {
        this.species = value;
    }

    /**
     * Gets the value of the relevantArea property.
     * 
     * @return
     *     possible object is
     *     {@link RelevantAreaObjectType }
     *     
     */
    public RelevantAreaObjectType getRelevantArea() {
        return relevantArea;
    }

    /**
     * Sets the value of the relevantArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevantAreaObjectType }
     *     
     */
    public void setRelevantArea(RelevantAreaObjectType value) {
        this.relevantArea = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservation() {
        return preservation;
    }

    /**
     * Sets the value of the preservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservation(String value) {
        this.preservation = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

}
