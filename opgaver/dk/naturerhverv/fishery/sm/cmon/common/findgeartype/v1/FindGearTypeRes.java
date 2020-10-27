
package dk.naturerhverv.fishery.sm.cmon.common.findgeartype.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import dk.fd.dm.base.v1.GearTypeType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GearType" type="{urn:dk:fd:dm:base:v1.0}GearTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gearType"
})
@XmlRootElement(name = "FindGearTypeRes")
public class FindGearTypeRes
    implements Serializable
{

    @XmlElement(name = "GearType")
    protected List<GearTypeType> gearType;

    /**
     * Gets the value of the gearType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gearType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGearType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GearTypeType }
     * 
     * 
     */
    public List<GearTypeType> getGearType() {
        if (gearType == null) {
            gearType = new ArrayList<GearTypeType>();
        }
        return this.gearType;
    }

}
