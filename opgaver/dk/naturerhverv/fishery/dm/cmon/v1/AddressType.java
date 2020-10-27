
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An address for a legal entity
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}DanishAddress"/>
 *           &lt;element ref="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}OtherAddress"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "danishAddress",
    "otherAddress"
})
public class AddressType
    implements Serializable
{

    @XmlElement(name = "DanishAddress")
    protected DanishAddressType danishAddress;
    @XmlElement(name = "OtherAddress")
    protected OtherAddressType otherAddress;

    /**
     * Gets the value of the danishAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DanishAddressType }
     *     
     */
    public DanishAddressType getDanishAddress() {
        return danishAddress;
    }

    /**
     * Sets the value of the danishAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DanishAddressType }
     *     
     */
    public void setDanishAddress(DanishAddressType value) {
        this.danishAddress = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAddressType }
     *     
     */
    public OtherAddressType getOtherAddress() {
        return otherAddress;
    }

    /**
     * Sets the value of the otherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAddressType }
     *     
     */
    public void setOtherAddress(OtherAddressType value) {
        this.otherAddress = value;
    }

}
