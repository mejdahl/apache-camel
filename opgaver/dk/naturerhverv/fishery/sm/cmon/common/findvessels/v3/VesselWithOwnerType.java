
package dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.fd.dm.indv.v1.CustomerType;
import dk.fd.dm.vess.v1.VesselType;


/**
 * <p>Java class for VesselWithOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselWithOwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vessel" type="{urn:dk:fd:dm:vess:v1.0}VesselType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{urn:dk:fd:dm:indv:v1.0}CustomerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselWithOwnerType", propOrder = {
    "vessel",
    "customer"
})
public class VesselWithOwnerType
    implements Serializable
{

    @XmlElement(name = "Vessel")
    protected VesselType vessel;
    @XmlElement(name = "Customer")
    protected CustomerType customer;

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

}
