
package dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.fd.dm.indv.v1.CustomerType;


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
 *         &lt;element name="VesselWithOwner" type="{urn:dk:naturerhverv:fishery:sm:cmon:Common:FindVessels:v3.0}VesselWithOwnerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VesselMaster" type="{urn:dk:fd:dm:indv:v1.0}CustomerType" maxOccurs="unbounded" minOccurs="0"/>
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
    "vesselWithOwner",
    "vesselMaster"
})
public class FindVesselsResponseType
    implements Serializable
{

    @XmlElement(name = "VesselWithOwner")
    protected List<VesselWithOwnerType> vesselWithOwner;
    @XmlElement(name = "VesselMaster")
    protected List<CustomerType> vesselMaster;

    /**
     * Gets the value of the vesselWithOwner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vesselWithOwner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVesselWithOwner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VesselWithOwnerType }
     * 
     * 
     */
    public List<VesselWithOwnerType> getVesselWithOwner() {
        if (vesselWithOwner == null) {
            vesselWithOwner = new ArrayList<VesselWithOwnerType>();
        }
        return this.vesselWithOwner;
    }

    /**
     * Gets the value of the vesselMaster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vesselMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVesselMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerType }
     * 
     * 
     */
    public List<CustomerType> getVesselMaster() {
        if (vesselMaster == null) {
            vesselMaster = new ArrayList<CustomerType>();
        }
        return this.vesselMaster;
    }

}
