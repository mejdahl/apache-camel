
package dk.fd.dm.vess.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Public key to a vessel using nation and external identification. Note that hull identification is deprecated and will be removed
 * 
 * <p>Java class for VesselIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Nation" type="{urn:dk:fd:dm:geod:v1.0}CountryCodeAlpha3Type"/>
 *         &lt;element name="ExternalIdentification" type="{urn:dk:fd:dm:vess:v1.0}ExternalIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselIdentityType", propOrder = {
    "nation",
    "externalIdentification"
})
@XmlSeeAlso({
    VesselReferenceType.class,
    VesselIdentityConcreteType.class,
    VesselIdentificationType.class
})
public class VesselIdentityType
    implements Serializable
{

    @XmlElement(name = "Nation")
    protected String nation;
    @XmlElement(name = "ExternalIdentification")
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