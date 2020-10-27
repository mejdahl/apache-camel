
package dk.fd.dm.vess.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Very general information about a vessel
 * 
 * <p>Java class for VesselInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalIdentification" type="{urn:dk:fd:dm:vess:v1.0}ExternalIdentificationType" minOccurs="0"/>
 *         &lt;element name="Nation" type="{urn:dk:fd:dm:geod:v1.0}CountryCodeAlpha3Type" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioCallSignal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EUIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MMSI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImoNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VesselType" type="{urn:dk:fd:dm:vess:v1.0}VesselTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselInfoType", propOrder = {
    "externalIdentification",
    "nation",
    "name",
    "radioCallSignal",
    "euIdent",
    "mmsi",
    "imoNumber",
    "vesselType"
})
public class VesselInfoType
    implements Serializable
{

    @XmlElement(name = "ExternalIdentification")
    protected String externalIdentification;
    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RadioCallSignal")
    protected String radioCallSignal;
    @XmlElement(name = "EUIdent")
    protected String euIdent;
    @XmlElement(name = "MMSI")
    protected Integer mmsi;
    @XmlElement(name = "ImoNumber")
    protected Integer imoNumber;
    @XmlElement(name = "VesselType")
    protected String vesselType;

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

    /**
     * Gets the value of the euIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUIdent() {
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
    public void setEUIdent(String value) {
        this.euIdent = value;
    }

    /**
     * Gets the value of the mmsi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMSI() {
        return mmsi;
    }

    /**
     * Sets the value of the mmsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMSI(Integer value) {
        this.mmsi = value;
    }

    /**
     * Gets the value of the imoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImoNumber() {
        return imoNumber;
    }

    /**
     * Sets the value of the imoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImoNumber(Integer value) {
        this.imoNumber = value;
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

}
