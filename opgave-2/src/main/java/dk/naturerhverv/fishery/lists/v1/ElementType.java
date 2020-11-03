
package dk.naturerhverv.fishery.lists.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import dk.fd.dm.ctrl.v1.InspectionPurposeType;
import dk.fd.dm.indv.v1.DepartmentType;
import dk.fd.dm.indv.v1.EmployeeType;
import dk.naturerhverv.fishery.base.area.v1.RelevantAreaType;
import dk.naturerhverv.fishery.dm.base.v1.SpeciesType;
import dk.naturerhverv.fishery.dm.base.v1.VesselType;
import dk.naturerhverv.fishery.dm.geod.v1.PostalDistrictIdentificationType;


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
 *           &lt;element name="EconomicZone" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}EconomicZoneType"/>
 *           &lt;element name="Currency" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}CurrencyCodeType"/>
 *           &lt;element name="Location" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}LocationType"/>
 *           &lt;element name="Nation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}NationType"/>
 *           &lt;element name="Violation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ViolationIdentityType"/>
 *           &lt;element name="Preservation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PreservationType"/>
 *           &lt;element name="Presentation" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}PresentationType"/>
 *           &lt;element name="RelevantArea" type="{urn:dk:naturerhverv:fishery:base:area:v1}RelevantAreaType"/>
 *           &lt;element name="Size" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SizeType"/>
 *           &lt;element name="Species" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}SpeciesType"/>
 *           &lt;element name="Quality" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}QualityType"/>
 *           &lt;element name="ProductDestination" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ProductDestinationType"/>
 *           &lt;element name="ProductDestinationPO" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ProductDestinationType"/>
 *           &lt;element name="Vessel" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}VesselType"/>
 *           &lt;element name="Buyer" type="{urn:dk:fd:dm:indv:v1.0}BuyerIdentificationType"/>
 *           &lt;element name="InspectionPurpose" type="{urn:dk:fd:dm:ctrl:v1.0}InspectionPurposeType"/>
 *           &lt;element name="PostalDistrict" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}PostalDistrictIdentificationType"/>
 *           &lt;element name="Department" type="{urn:dk:fd:dm:indv:v1.0}DepartmentType"/>
 *           &lt;element name="Employee" type="{urn:dk:fd:dm:indv:v1.0}EmployeeType"/>
 *           &lt;element name="VesselType" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}VesselTypeType"/>
 *         &lt;/choice>
 *         &lt;element name="Descriptions" type="{urn:dk:naturerhverv:fishery:lists:v1}DescriptionType"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    "currency",
    "location",
    "nation",
    "violation",
    "preservation",
    "presentation",
    "relevantArea",
    "size",
    "species",
    "quality",
    "productDestination",
    "productDestinationPO",
    "vessel",
    "buyer",
    "inspectionPurpose",
    "postalDistrict",
    "department",
    "employee",
    "vesselType",
    "descriptions",
    "validFrom",
    "validTo",
    "presentationOrder"
})
public class ElementType {

    @XmlElement(name = "EconomicZone")
    protected String economicZone;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "Violation")
    protected String violation;
    @XmlElement(name = "Preservation")
    protected String preservation;
    @XmlElement(name = "Presentation")
    protected String presentation;
    @XmlElement(name = "RelevantArea")
    protected RelevantAreaType relevantArea;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Species")
    protected SpeciesType species;
    @XmlElement(name = "Quality")
    protected String quality;
    @XmlElement(name = "ProductDestination")
    protected String productDestination;
    @XmlElement(name = "ProductDestinationPO")
    protected String productDestinationPO;
    @XmlElement(name = "Vessel")
    protected VesselType vessel;
    @XmlElement(name = "Buyer")
    protected String buyer;
    @XmlElement(name = "InspectionPurpose")
    protected InspectionPurposeType inspectionPurpose;
    @XmlElement(name = "PostalDistrict")
    protected PostalDistrictIdentificationType postalDistrict;
    @XmlElement(name = "Department")
    protected DepartmentType department;
    @XmlElement(name = "Employee")
    protected EmployeeType employee;
    @XmlElement(name = "VesselType")
    protected String vesselType;
    @XmlElement(name = "Descriptions", required = true)
    protected DescriptionType descriptions;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
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
     * Gets the value of the violation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolation() {
        return violation;
    }

    /**
     * Sets the value of the violation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolation(String value) {
        this.violation = value;
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
     * Gets the value of the relevantArea property.
     * 
     * @return
     *     possible object is
     *     {@link RelevantAreaType }
     *     
     */
    public RelevantAreaType getRelevantArea() {
        return relevantArea;
    }

    /**
     * Sets the value of the relevantArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevantAreaType }
     *     
     */
    public void setRelevantArea(RelevantAreaType value) {
        this.relevantArea = value;
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
     *     {@link SpeciesType }
     *     
     */
    public SpeciesType getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeciesType }
     *     
     */
    public void setSpecies(SpeciesType value) {
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
     *     {@link VesselType }
     *     
     */
    public VesselType getVessel() {
        return vessel;
    }

    /**
     * Sets the value of the vessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselType }
     *     
     */
    public void setVessel(VesselType value) {
        this.vessel = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyer(String value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the inspectionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionPurposeType }
     *     
     */
    public InspectionPurposeType getInspectionPurpose() {
        return inspectionPurpose;
    }

    /**
     * Sets the value of the inspectionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionPurposeType }
     *     
     */
    public void setInspectionPurpose(InspectionPurposeType value) {
        this.inspectionPurpose = value;
    }

    /**
     * Gets the value of the postalDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public PostalDistrictIdentificationType getPostalDistrict() {
        return postalDistrict;
    }

    /**
     * Sets the value of the postalDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public void setPostalDistrict(PostalDistrictIdentificationType value) {
        this.postalDistrict = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentType }
     *     
     */
    public DepartmentType getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentType }
     *     
     */
    public void setDepartment(DepartmentType value) {
        this.department = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    public EmployeeType getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    public void setEmployee(EmployeeType value) {
        this.employee = value;
    }

    /**
     * Gets the value of the vesselType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselType() {
        return vesselType;
    }

    /**
     * Sets the value of the vesselType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselType(String value) {
        this.vesselType = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescriptions(DescriptionType value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
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
