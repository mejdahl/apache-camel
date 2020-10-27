
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaLocalDateAdapter;
import dk.naturerhverv.fishery.dm.base.v1.SpeciesIdentificationType;
import dk.naturerhverv.fishery.dm.geod.v1.AreaIdentificationType;
import dk.naturerhverv.fishery.dm.vess.v1.VesselIdentificationType;
import org.joda.time.LocalDate;


/**
 * <p>Java class for ElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="EconomicZone" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}EconomicZoneIdentificationType"/>
 *           &lt;element name="RelevantArea" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}AreaIdentificationType"/>
 *           &lt;element name="Currency" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}CurrencyCodeIdentificationType"/>
 *           &lt;element name="Location" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}LocationIdentificationType"/>
 *           &lt;element name="Nation" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}NationIdentificationType"/>
 *           &lt;element name="Preservation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PreservationIdentificationType"/>
 *           &lt;element name="Presentation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PresentationIdentificationType"/>
 *           &lt;element name="Size" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SizeIdentificationType"/>
 *           &lt;element name="Species" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesIdentificationType"/>
 *           &lt;element name="Quality" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}QualityIdentificationType"/>
 *           &lt;element name="ProductDestination" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ProductDestinationIdentificationType"/>
 *           &lt;element name="ProductDestinationPO" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ProductDestinationIdentificationType"/>
 *           &lt;element name="Vessel" type="{urn:dk:naturerhverv:fishery:dm:vess:v1.0}VesselIdentificationType"/>
 *         &lt;/choice>
 *         &lt;element name="ShortForm" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}ShortFormType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PresentationOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementType", propOrder = {
    "economicZone",
    "relevantArea",
    "currency",
    "location",
    "nation",
    "preservation",
    "presentation",
    "size",
    "species",
    "quality",
    "productDestination",
    "productDestinationPO",
    "vessel",
    "shortForm",
    "description",
    "validFrom",
    "validTo",
    "presentationOrder"
})
public class ElementType
    implements Serializable
{

    @XmlElement(name = "EconomicZone")
    protected String economicZone;
    @XmlElement(name = "RelevantArea")
    protected AreaIdentificationType relevantArea;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "Preservation")
    protected String preservation;
    @XmlElement(name = "Presentation")
    protected String presentation;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Species")
    protected SpeciesIdentificationType species;
    @XmlElement(name = "Quality")
    protected String quality;
    @XmlElement(name = "ProductDestination")
    protected String productDestination;
    @XmlElement(name = "ProductDestinationPO")
    protected String productDestinationPO;
    @XmlElement(name = "Vessel")
    protected VesselIdentificationType vessel;
    @XmlElement(name = "ShortForm")
    protected List<ShortFormType> shortForm;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ValidFrom", required = true, type = String.class)
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate validFrom;
    @XmlElement(name = "ValidTo", type = String.class)
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate validTo;
    @XmlElement(name = "PresentationOrder")
    protected Integer presentationOrder;

    /**
     * Gets the value of the economicZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicZone() {
        return economicZone;
    }

    /**
     * Sets the value of the economicZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicZone(String value) {
        this.economicZone = value;
    }

    /**
     * Gets the value of the relevantArea property.
     * 
     * @return
     *     possible object is
     *     {@link AreaIdentificationType }
     *     
     */
    public AreaIdentificationType getRelevantArea() {
        return relevantArea;
    }

    /**
     * Sets the value of the relevantArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaIdentificationType }
     *     
     */
    public void setRelevantArea(AreaIdentificationType value) {
        this.relevantArea = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
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

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link SpeciesIdentificationType }
     *     
     */
    public SpeciesIdentificationType getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesIdentificationType }
     *     
     */
    public void setSpecies(SpeciesIdentificationType value) {
        this.species = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
    }

    /**
     * Gets the value of the productDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDestination() {
        return productDestination;
    }

    /**
     * Sets the value of the productDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDestination(String value) {
        this.productDestination = value;
    }

    /**
     * Gets the value of the productDestinationPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDestinationPO() {
        return productDestinationPO;
    }

    /**
     * Sets the value of the productDestinationPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDestinationPO(String value) {
        this.productDestinationPO = value;
    }

    /**
     * Gets the value of the vessel property.
     * 
     * @return
     *     possible object is
     *     {@link VesselIdentificationType }
     *     
     */
    public VesselIdentificationType getVessel() {
        return vessel;
    }

    /**
     * Sets the value of the vessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselIdentificationType }
     *     
     */
    public void setVessel(VesselIdentificationType value) {
        this.vessel = value;
    }

    /**
     * Gets the value of the shortForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortFormType }
     * 
     * 
     */
    public List<ShortFormType> getShortForm() {
        if (shortForm == null) {
            shortForm = new ArrayList<ShortFormType>();
        }
        return this.shortForm;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(LocalDate value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(LocalDate value) {
        this.validTo = value;
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

}
