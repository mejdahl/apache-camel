
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.naturerhverv.fishery.dm.geod.v1.PostalDistrictIdentificationType;


/**
 * This structure defines a danish address as defined in the 'begrebsmodel'
 * 
 * <p>Java class for DanishAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanishAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;element name="PostOfficeBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetBuilding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetNameForAddressing" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MailDeliverySubLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistrictSubdivisionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalDistrictIdentification" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}PostalDistrictIdentificationType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanishAddressType", propOrder = {
    "postOfficeBox",
    "streetName",
    "streetBuilding",
    "floor",
    "streetNameForAddressing",
    "mailDeliverySubLocation",
    "streetCode",
    "districtSubdivisionIdentifier",
    "postalDistrictIdentification",
    "description"
})
public class DanishAddressType
    extends BaseAddressType
    implements Serializable
{

    @XmlElement(name = "PostOfficeBox")
    protected String postOfficeBox;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetBuilding")
    protected String streetBuilding;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "StreetNameForAddressing")
    protected String streetNameForAddressing;
    @XmlElement(name = "MailDeliverySubLocation")
    protected String mailDeliverySubLocation;
    @XmlElement(name = "StreetCode")
    protected String streetCode;
    @XmlElement(name = "DistrictSubdivisionIdentifier")
    protected String districtSubdivisionIdentifier;
    @XmlElement(name = "PostalDistrictIdentification")
    protected PostalDistrictIdentificationType postalDistrictIdentification;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
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
     * Gets the value of the streetBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetBuilding() {
        return streetBuilding;
    }

    /**
     * Sets the value of the streetBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetBuilding(String value) {
        this.streetBuilding = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the streetNameForAddressing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNameForAddressing() {
        return streetNameForAddressing;
    }

    /**
     * Sets the value of the streetNameForAddressing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNameForAddressing(String value) {
        this.streetNameForAddressing = value;
    }

    /**
     * Gets the value of the mailDeliverySubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailDeliverySubLocation() {
        return mailDeliverySubLocation;
    }

    /**
     * Sets the value of the mailDeliverySubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailDeliverySubLocation(String value) {
        this.mailDeliverySubLocation = value;
    }

    /**
     * Gets the value of the streetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetCode() {
        return streetCode;
    }

    /**
     * Sets the value of the streetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetCode(String value) {
        this.streetCode = value;
    }

    /**
     * Gets the value of the districtSubdivisionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictSubdivisionIdentifier() {
        return districtSubdivisionIdentifier;
    }

    /**
     * Sets the value of the districtSubdivisionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictSubdivisionIdentifier(String value) {
        this.districtSubdivisionIdentifier = value;
    }

    /**
     * Gets the value of the postalDistrictIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public PostalDistrictIdentificationType getPostalDistrictIdentification() {
        return postalDistrictIdentification;
    }

    /**
     * Sets the value of the postalDistrictIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public void setPostalDistrictIdentification(PostalDistrictIdentificationType value) {
        this.postalDistrictIdentification = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
