
package dk.fd.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.fd.dm.indv.v1.CustomerReferenceType;
import dk.fd.dm.vess.v1.VesselReferenceType;


/**
 * <p>Java class for VesselCustomerAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselCustomerAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VesselRef" type="{urn:dk:fd:dm:vess:v1.0}VesselReferenceType"/>
 *         &lt;element name="CustomerRef" type="{urn:dk:fd:dm:indv:v1.0}CustomerReferenceType"/>
 *         &lt;element name="VesselCustomerAssocRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselCustomerAssocType", propOrder = {
    "vesselRef",
    "customerRef",
    "vesselCustomerAssocRole"
})
public class VesselCustomerAssocType
    implements Serializable
{

    @XmlElement(name = "VesselRef", required = true)
    protected VesselReferenceType vesselRef;
    @XmlElement(name = "CustomerRef", required = true)
    protected CustomerReferenceType customerRef;
    @XmlElement(name = "VesselCustomerAssocRole", required = true)
    protected String vesselCustomerAssocRole;

    /**
     * Gets the value of the vesselRef property.
     * 
     * @return
     *     possible object is
     *     {@link VesselReferenceType }
     *     
     */
    public VesselReferenceType getVesselRef() {
        return vesselRef;
    }

    /**
     * Sets the value of the vesselRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselReferenceType }
     *     
     */
    public void setVesselRef(VesselReferenceType value) {
        this.vesselRef = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReferenceType }
     *     
     */
    public CustomerReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReferenceType }
     *     
     */
    public void setCustomerRef(CustomerReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the vesselCustomerAssocRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselCustomerAssocRole() {
        return vesselCustomerAssocRole;
    }

    /**
     * Sets the value of the vesselCustomerAssocRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselCustomerAssocRole(String value) {
        this.vesselCustomerAssocRole = value;
    }

}
