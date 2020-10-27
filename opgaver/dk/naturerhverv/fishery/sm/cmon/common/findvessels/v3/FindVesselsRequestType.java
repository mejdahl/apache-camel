
package dk.naturerhverv.fishery.sm.cmon.common.findvessels.v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.dm.vess.v1.VesselInfoType;
import dk.fd.soa.util.JodaDateTimeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for FindVesselsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindVesselsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Vessel" type="{urn:dk:fd:dm:vess:v1.0}VesselInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindVesselsRequestType", propOrder = {
    "validAt",
    "vessel"
})
public class FindVesselsRequestType
    implements Serializable
{

    @XmlElement(name = "ValidAt", type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime validAt;
    @XmlElement(name = "Vessel")
    protected List<VesselInfoType> vessel;

    /**
     * Gets the value of the validAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getValidAt() {
        return validAt;
    }

    /**
     * Sets the value of the validAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidAt(DateTime value) {
        this.validAt = value;
    }

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
     * {@link VesselInfoType }
     * 
     * 
     */
    public List<VesselInfoType> getVessel() {
        if (vessel == null) {
            vessel = new ArrayList<VesselInfoType>();
        }
        return this.vessel;
    }

}
