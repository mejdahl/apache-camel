
package dk.naturerhverv.fishery.dm.vess.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaLocalDateAdapter;
import org.joda.time.LocalDate;


/**
 * <p>Java class for VesselType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:dk:naturerhverv:fishery:dm:vess:v1.0}VesselReference"/>
 *         &lt;element ref="{urn:dk:naturerhverv:fishery:dm:vess:v1.0}VesselInfo"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselType", propOrder = {
    "vesselReference",
    "vesselInfo"
})
public class VesselType
    implements Serializable
{

    @XmlElement(name = "VesselReference", required = true)
    protected VesselReferenceType vesselReference;
    @XmlElement(name = "VesselInfo", required = true)
    protected VesselInfoType vesselInfo;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "ValidFrom")
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate validFrom;
    @XmlAttribute(name = "ValidTo")
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate validTo;

    /**
     * Gets the value of the vesselReference property.
     * 
     * @return
     *     possible object is
     *     {@link VesselReferenceType }
     *     
     */
    public VesselReferenceType getVesselReference() {
        return vesselReference;
    }

    /**
     * Sets the value of the vesselReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselReferenceType }
     *     
     */
    public void setVesselReference(VesselReferenceType value) {
        this.vesselReference = value;
    }

    /**
     * Gets the value of the vesselInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VesselInfoType }
     *     
     */
    public VesselInfoType getVesselInfo() {
        return vesselInfo;
    }

    /**
     * Sets the value of the vesselInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselInfoType }
     *     
     */
    public void setVesselInfo(VesselInfoType value) {
        this.vesselInfo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(LocalDate value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(LocalDate value) {
        this.validTo = value;
    }

}
