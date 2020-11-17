
package dk.naturerhverv.fishery.lists.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for EntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Zone" type="{urn:dk:naturerhverv:fishery:lists:v2}EconomicZoneType"/>
 *           &lt;element name="Currency" type="{urn:dk:naturerhverv:fishery:lists:v2}CurrencyCodeType"/>
 *           &lt;element name="VesselActivity" type="{urn:dk:naturerhverv:fishery:lists:v2}VesselActivityType"/>
 *           &lt;element name="Location" type="{urn:dk:naturerhverv:fishery:lists:v2}LocationType"/>
 *           &lt;element name="Nation" type="{urn:dk:naturerhverv:fishery:lists:v2}NationType"/>
 *           &lt;element name="Violation" type="{urn:dk:naturerhverv:fishery:lists:v2}ViolationType"/>
 *           &lt;element name="Preservation" type="{urn:dk:naturerhverv:fishery:lists:v2}PreservationType"/>
 *           &lt;element name="Presentation" type="{urn:dk:naturerhverv:fishery:lists:v2}PresentationType"/>
 *           &lt;element name="Area" type="{urn:dk:naturerhverv:fishery:lists:v2}RelevantAreaType"/>
 *           &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="Size" type="{urn:dk:naturerhverv:fishery:lists:v2}SizeType"/>
 *           &lt;element name="Species" type="{urn:dk:naturerhverv:fishery:lists:v2}SpeciesType"/>
 *           &lt;element name="Quality" type="{urn:dk:naturerhverv:fishery:lists:v2}QualityType"/>
 *           &lt;element name="ProductDestination" type="{urn:dk:naturerhverv:fishery:lists:v2}ProductDestinationType"/>
 *           &lt;element name="FormType" type="{urn:dk:naturerhverv:fishery:lists:v2}FormTypeType"/>
 *           &lt;element name="Buyer" type="{urn:dk:naturerhverv:fishery:lists:v2}BuyerType"/>
 *           &lt;element name="InspectionPurpose" type="{urn:dk:naturerhverv:fishery:lists:v2}InspectionPurposeType"/>
 *           &lt;element name="StreetName" type="{urn:dk:naturerhverv:fishery:lists:v2}StreetNameType"/>
 *           &lt;element name="Postal" type="{urn:dk:naturerhverv:fishery:lists:v2}PostalDistrictType"/>
 *           &lt;element name="Department" type="{urn:dk:naturerhverv:fishery:lists:v2}DepartmentType"/>
 *           &lt;element name="Employee" type="{urn:dk:naturerhverv:fishery:lists:v2}EmployeeType"/>
 *           &lt;element name="VesselType" type="{urn:dk:naturerhverv:fishery:lists:v2}VesselTypeType"/>
 *           &lt;element name="NaturaAreas" type="{urn:dk:naturerhverv:fishery:lists:v2}NaturaAreasType"/>
 *           &lt;element name="EmployeeDepartment" type="{urn:dk:naturerhverv:fishery:lists:v2}EmployeeDepartmentType"/>
 *           &lt;element name="GearType" type="{urn:dk:naturerhverv:fishery:lists:v2}GearType"/>
 *         &lt;/choice>
 *         &lt;element name="Abbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryType", propOrder = {
    "zone",
    "currency",
    "vesselActivity",
    "location",
    "nation",
    "violation",
    "preservation",
    "presentation",
    "area",
    "startDate",
    "endDate",
    "size",
    "species",
    "quality",
    "productDestination",
    "formType",
    "buyer",
    "inspectionPurpose",
    "streetName",
    "postal",
    "department",
    "employee",
    "vesselType",
    "naturaAreas",
    "employeeDepartment",
    "gearType",
    "abbr",
    "name",
    "order"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryType {

    @XmlElement(name = "Zone")
    protected String zone;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "VesselActivity")
    protected VesselActivityType vesselActivity;
    @XmlElement(name = "Location")
    @JsonProperty("Location")
    protected String location;
    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "Violation")
    protected String violation;
    @XmlElement(name = "Preservation")
    protected String preservation;
    @XmlElement(name = "Presentation")
    protected String presentation;
    @XmlElement(name = "Area")
    protected RelevantAreaType area;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "Species")
    protected SpeciesType species;
    @XmlElement(name = "Quality")
    protected String quality;
    @XmlElement(name = "ProductDestination")
    protected String productDestination;
    @XmlElement(name = "FormType")
    protected String formType;
    @XmlElement(name = "Buyer")
    protected BuyerType buyer;
    @XmlElement(name = "InspectionPurpose")
    protected String inspectionPurpose;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "Postal")
    protected PostalDistrictType postal;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Employee")
    protected String employee;
    @XmlElement(name = "VesselType")
    protected String vesselType;
    @XmlElement(name = "NaturaAreas")
    protected NaturaAreasType naturaAreas;
    @XmlElement(name = "EmployeeDepartment")
    protected EmployeeDepartmentType employeeDepartment;
    @XmlElement(name = "GearType")
    protected GearType gearType;
    @XmlElement(name = "Abbr")
    @JsonProperty("Abbr")
    protected String abbr;
    @JsonProperty("Name")
    @XmlElement(name = "Name", required = true)
    protected String name;
    @JsonProperty("Order")
    @XmlElement(name = "Order")
    protected Integer order;

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
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
     * Gets the value of the vesselActivity property.
     * 
     * @return
     *     possible object is
     *     {@link VesselActivityType }
     *     
     */
    public VesselActivityType getVesselActivity() {
        return vesselActivity;
    }

    /**
     * Sets the value of the vesselActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselActivityType }
     *     
     */
    public void setVesselActivity(VesselActivityType value) {
        this.vesselActivity = value;
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
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link RelevantAreaType }
     *     
     */
    public RelevantAreaType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelevantAreaType }
     *     
     */
    public void setArea(RelevantAreaType value) {
        this.area = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
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
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyer(BuyerType value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the inspectionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPurpose() {
        return inspectionPurpose;
    }

    /**
     * Sets the value of the inspectionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectionPurpose(String value) {
        this.inspectionPurpose = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDistrictType }
     *     
     */
    public PostalDistrictType getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDistrictType }
     *     
     */
    public void setPostal(PostalDistrictType value) {
        this.postal = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployee(String value) {
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
     * Gets the value of the naturaAreas property.
     * 
     * @return
     *     possible object is
     *     {@link NaturaAreasType }
     *     
     */
    public NaturaAreasType getNaturaAreas() {
        return naturaAreas;
    }

    /**
     * Sets the value of the naturaAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturaAreasType }
     *     
     */
    public void setNaturaAreas(NaturaAreasType value) {
        this.naturaAreas = value;
    }

    /**
     * Gets the value of the employeeDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDepartmentType }
     *     
     */
    public EmployeeDepartmentType getEmployeeDepartment() {
        return employeeDepartment;
    }

    /**
     * Sets the value of the employeeDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDepartmentType }
     *     
     */
    public void setEmployeeDepartment(EmployeeDepartmentType value) {
        this.employeeDepartment = value;
    }

    /**
     * Gets the value of the gearType property.
     * 
     * @return
     *     possible object is
     *     {@link GearType }
     *     
     */
    public GearType getGearType() {
        return gearType;
    }

    /**
     * Sets the value of the gearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GearType }
     *     
     */
    public void setGearType(GearType value) {
        this.gearType = value;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

}
