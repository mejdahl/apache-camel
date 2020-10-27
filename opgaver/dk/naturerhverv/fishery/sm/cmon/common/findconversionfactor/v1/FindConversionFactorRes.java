
package dk.naturerhverv.fishery.sm.cmon.common.findconversionfactor.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dk.naturerhverv.fishery.dm.base.v1.ConversionFactorType;
import dk.naturerhverv.fishery.dm.base.v1.PresentationObjectType;
import dk.naturerhverv.fishery.dm.base.v1.PreservationObjectType;
import dk.naturerhverv.fishery.dm.base.v1.RelevantAreaObjectType;
import dk.naturerhverv.fishery.dm.base.v1.SizeObjectType;
import dk.naturerhverv.fishery.dm.base.v1.SpeciesObjectType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Species" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Presentation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PresentationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Preservation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PreservationObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelevantArea" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}RelevantAreaObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Size" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SizeObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConversionFactor" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ConversionFactorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "species",
    "presentation",
    "preservation",
    "relevantArea",
    "size",
    "conversionFactor"
})
@XmlRootElement(name = "FindConversionFactorRes")
public class FindConversionFactorRes
    implements Serializable
{

    @XmlElement(name = "Species")
    protected List<SpeciesObjectType> species;
    @XmlElement(name = "Presentation")
    protected List<PresentationObjectType> presentation;
    @XmlElement(name = "Preservation")
    protected List<PreservationObjectType> preservation;
    @XmlElement(name = "RelevantArea")
    protected List<RelevantAreaObjectType> relevantArea;
    @XmlElement(name = "Size")
    protected List<SizeObjectType> size;
    @XmlElement(name = "ConversionFactor")
    protected List<ConversionFactorType> conversionFactor;

    /**
     * Gets the value of the species property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the species property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeciesObjectType }
     * 
     * 
     */
    public List<SpeciesObjectType> getSpecies() {
        if (species == null) {
            species = new ArrayList<SpeciesObjectType>();
        }
        return this.species;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationObjectType }
     * 
     * 
     */
    public List<PresentationObjectType> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<PresentationObjectType>();
        }
        return this.presentation;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreservationObjectType }
     * 
     * 
     */
    public List<PreservationObjectType> getPreservation() {
        if (preservation == null) {
            preservation = new ArrayList<PreservationObjectType>();
        }
        return this.preservation;
    }

    /**
     * Gets the value of the relevantArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelevantAreaObjectType }
     * 
     * 
     */
    public List<RelevantAreaObjectType> getRelevantArea() {
        if (relevantArea == null) {
            relevantArea = new ArrayList<RelevantAreaObjectType>();
        }
        return this.relevantArea;
    }

    /**
     * Gets the value of the size property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the size property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SizeObjectType }
     * 
     * 
     */
    public List<SizeObjectType> getSize() {
        if (size == null) {
            size = new ArrayList<SizeObjectType>();
        }
        return this.size;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionFactorType }
     * 
     * 
     */
    public List<ConversionFactorType> getConversionFactor() {
        if (conversionFactor == null) {
            conversionFactor = new ArrayList<ConversionFactorType>();
        }
        return this.conversionFactor;
    }

}
