
package dk.naturerhverv.fishery.base.area.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Beskrivelsetype for et havomraade.
 * 
 * <p>Java class for RelevantAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelevantAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EconomicZone" type="{urn:dk:naturerhverv:fishery:base:common:v1}EconomicZoneType"/>
 *         &lt;element name="FAO" type="{urn:dk:naturerhverv:fishery:base:area:v1}FAOAreaDescriptionType" minOccurs="0"/>
 *         &lt;element name="StatisticalRectangle" type="{urn:dk:naturerhverv:fishery:base:area:v1}StatisticalRectangleType" minOccurs="0"/>
 *         &lt;element name="EffortZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DkFishArea" type="{urn:dk:naturerhverv:fishery:base:area:v1}DkFishAreaType" minOccurs="0"/>
 *         &lt;element name="Natura2000Sites" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelevantAreaType", propOrder = {
    "economicZone",
    "fao",
    "statisticalRectangle",
    "effortZone",
    "dkFishArea",
    "natura2000Sites"
})
public class RelevantAreaType {

    @XmlElement(name = "EconomicZone", required = true)
    protected String economicZone;
    @XmlElement(name = "FAO")
    protected FAOAreaDescriptionType fao;
    @XmlElement(name = "StatisticalRectangle")
    protected String statisticalRectangle;
    @XmlElement(name = "EffortZone")
    protected String effortZone;
    @XmlElement(name = "DkFishArea")
    protected String dkFishArea;
    @XmlElement(name = "Natura2000Sites")
    protected String natura2000Sites;

    /**
     * Gets the value of the economicZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicZone() {
        return economicZone;
    }

    /**
     * Sets the value of the economicZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicZone(String value) {
        this.economicZone = value;
    }

    /**
     * Gets the value of the fao property.
     * 
     * @return
     *     possible object is
     *     {@link FAOAreaDescriptionType }
     *     
     */
    public FAOAreaDescriptionType getFAO() {
        return fao;
    }

    /**
     * Sets the value of the fao property.
     * 
     * @param value
     *     allowed object is
     *     {@link FAOAreaDescriptionType }
     *     
     */
    public void setFAO(FAOAreaDescriptionType value) {
        this.fao = value;
    }

    /**
     * Gets the value of the statisticalRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalRectangle() {
        return statisticalRectangle;
    }

    /**
     * Sets the value of the statisticalRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalRectangle(String value) {
        this.statisticalRectangle = value;
    }

    /**
     * Gets the value of the effortZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffortZone() {
        return effortZone;
    }

    /**
     * Sets the value of the effortZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffortZone(String value) {
        this.effortZone = value;
    }

    /**
     * Gets the value of the dkFishArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDkFishArea() {
        return dkFishArea;
    }

    /**
     * Sets the value of the dkFishArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDkFishArea(String value) {
        this.dkFishArea = value;
    }

    /**
     * Gets the value of the natura2000Sites property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatura2000Sites() {
        return natura2000Sites;
    }

    /**
     * Sets the value of the natura2000Sites property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatura2000Sites(String value) {
        this.natura2000Sites = value;
    }

}
