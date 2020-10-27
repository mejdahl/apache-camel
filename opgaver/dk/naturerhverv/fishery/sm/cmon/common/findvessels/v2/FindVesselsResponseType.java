
package dk.naturerhverv.fishery.sm.cmon.common.findvessels.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.fd.dm.cmon.v1.VesselCustomerAssocType;
import dk.fd.dm.indv.v1.CustomerType;
import dk.fd.dm.vess.v1.VesselType;


/**
 * <p>Java class for FindVesselsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindVesselsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vessel" type="{urn:dk:fd:dm:vess:v1.0}VesselType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Customer" type="{urn:dk:fd:dm:indv:v1.0}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VesselCustomerAssoc" type="{urn:dk:fd:dm:cmon:v1.0}VesselCustomerAssocType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindVesselsResponseType", propOrder = {
    "vessel",
    "customer",
    "vesselCustomerAssoc"
})
public class FindVesselsResponseType
    implements Serializable
{

    @XmlElement(name = "Vessel")
    protected List<VesselType> vessel;
    @XmlElement(name = "Customer")
    protected List<CustomerType> customer;
    @XmlElement(name = "VesselCustomerAssoc")
    protected List<VesselCustomerAssocType> vesselCustomerAssoc;

    /**
     * Gets the value of the vessel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vessel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVessel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VesselType }
     * 
     * 
     */
    public List<VesselType> getVessel() {
        if (vessel == null) {
            vessel = new ArrayList<VesselType>();
        }
        return this.vessel;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType }
     * 
     * 
     */
    public List<CustomerType> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<CustomerType>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the vesselCustomerAssoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vesselCustomerAssoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVesselCustomerAssoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VesselCustomerAssocType }
     * 
     * 
     */
    public List<VesselCustomerAssocType> getVesselCustomerAssoc() {
        if (vesselCustomerAssoc == null) {
            vesselCustomerAssoc = new ArrayList<VesselCustomerAssocType>();
        }
        return this.vesselCustomerAssoc;
    }

}
