
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.naturerhverv.fishery.dm.vess.v1.VesselIdentificationType;


/**
 * DEPRECATED: Use Vessel in VESS domain instead
 * 
 * <p>Java class for VesselType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VesselIdentification" type="{urn:dk:naturerhverv:fishery:dm:vess:v1.0}VesselIdentificationType"/>
 *         &lt;element name="ExternalIdentification" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}ExternalIdentificationType"/>
 *         &lt;element name="Nation" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}CountryCodeAlpha3Type"/>
 *         &lt;element name="EuIdent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RadioCallSignal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselType", propOrder = {
    "vesselIdentification",
    "externalIdentification",
    "nation",
    "euIdent",
    "name",
    "radioCallSignal"
})
public class VesselType
    implements Serializable
{

    @XmlElement(name = "VesselIdentification", required = true)
    protected VesselIdentificationType vesselIdentification;
    @XmlElement(name = "ExternalIdentification", required = true)
    protected String externalIdentification;
    @XmlElement(name = "Nation", required = true)
    protected String nation;
    @XmlElement(name = "EuIdent", required = true)
    protected String euIdent;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "RadioCallSignal", required = true)
    protected String radioCallSignal;

    /**
     * Gets the value of the vesselIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link VesselIdentificationType }
     *     
     */
    public VesselIdentificationType getVesselIdentification() {
        return vesselIdentification;
    }

    /**
     * Sets the value of the vesselIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselIdentificationType }
     *     
     */
    public void setVesselIdentification(VesselIdentificationType value) {
        this.vesselIdentification = value;
    }

    /**
     * Gets the value of the externalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentification() {
        return externalIdentification;
    }

    /**
     * Sets the value of the externalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentification(String value) {
        this.externalIdentification = value;
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
     * Gets the value of the euIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuIdent() {
        return euIdent;
    }

    /**
     * Sets the value of the euIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuIdent(String value) {
        this.euIdent = value;
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
     * Gets the value of the radioCallSignal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioCallSignal() {
        return radioCallSignal;
    }

    /**
     * Sets the value of the radioCallSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioCallSignal(String value) {
        this.radioCallSignal = value;
    }

}
