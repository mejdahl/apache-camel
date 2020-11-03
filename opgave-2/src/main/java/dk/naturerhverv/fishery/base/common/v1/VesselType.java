
package dk.naturerhverv.fishery.base.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VesselType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nation" type="{urn:dk:naturerhverv:fishery:base:common:v1}CountryCodeAlpha3Type"/>
 *         &lt;element name="ExternalIdentification" type="{urn:dk:naturerhverv:fishery:base:common:v1}ExternalIdentificationType"/>
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
    "nation",
    "externalIdentification"
})
public class VesselType {

    @XmlElement(name = "Nation", required = true)
    protected String nation;
    @XmlElement(name = "ExternalIdentification", required = true)
    protected String externalIdentification;

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

}
