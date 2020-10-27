
package dk.fd.dm.indv.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An adress for a legal entity
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:fd:dm:indv:v1.0}BaseAddressType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="DanishAddress" type="{urn:dk:fd:dm:indv:v1.0}DanishAddressType"/>
 *           &lt;element name="OtherAddress" type="{urn:dk:fd:dm:indv:v1.0}OtherAddressType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
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
    extends BaseAddressType
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
