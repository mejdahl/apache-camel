
package dk.naturerhverv.fishery.lists.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaturaAreasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaturaAreasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainArea" type="{urn:dk:naturerhverv:fishery:lists:v2}MainArea"/>
 *         &lt;element name="SubArea" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturaAreasType", propOrder = {
    "mainArea",
    "subArea"
})
public class NaturaAreasType {

    @XmlElement(name = "MainArea", required = true)
    protected String mainArea;
    @XmlElement(name = "SubArea", required = true)
    protected List<String> subArea;

    /**
     * Gets the value of the mainArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainArea() {
        return mainArea;
    }

    /**
     * Sets the value of the mainArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainArea(String value) {
        this.mainArea = value;
    }

    /**
     * Gets the value of the subArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubArea() {
        if (subArea == null) {
            subArea = new ArrayList<String>();
        }
        return this.subArea;
    }

}
