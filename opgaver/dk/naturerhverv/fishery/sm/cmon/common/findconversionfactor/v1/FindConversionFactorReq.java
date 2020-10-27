
package dk.naturerhverv.fishery.sm.cmon.common.findconversionfactor.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaDateTimeAdapter;
import dk.naturerhverv.fishery.dm.base.v1.ConversionFactorIdentityType;
import org.joda.time.DateTime;


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
 *         &lt;element name="ValidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ConversionFactorIdentitiy" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ConversionFactorIdentityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConversionFactor" type="{urn:dk:naturerhverv:fishery:sm:cmon:Common:FindConversionFactor:v1.0}ConversionFactorType" maxOccurs="unbounded" minOccurs="0"/>
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
    "validTime",
    "conversionFactorIdentitiy",
    "conversionFactor"
})
@XmlRootElement(name = "FindConversionFactorReq")
public class FindConversionFactorReq
    implements Serializable
{

    @XmlElement(name = "ValidTime", type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime validTime;
    @XmlElement(name = "ConversionFactorIdentitiy")
    protected List<ConversionFactorIdentityType> conversionFactorIdentitiy;
    @XmlElement(name = "ConversionFactor")
    protected List<ConversionFactorType> conversionFactor;

    /**
     * Gets the value of the validTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getValidTime() {
        return validTime;
    }

    /**
     * Sets the value of the validTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTime(DateTime value) {
        this.validTime = value;
    }

    /**
     * Gets the value of the conversionFactorIdentitiy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionFactorIdentitiy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionFactorIdentitiy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionFactorIdentityType }
     * 
     * 
     */
    public List<ConversionFactorIdentityType> getConversionFactorIdentitiy() {
        if (conversionFactorIdentitiy == null) {
            conversionFactorIdentitiy = new ArrayList<ConversionFactorIdentityType>();
        }
        return this.conversionFactorIdentitiy;
    }

    /**
     * Gets the value of the conversionFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionFactorType }
     * 
     * 
     */
    public List<ConversionFactorType> getConversionFactor() {
        if (conversionFactor == null) {
            conversionFactor = new ArrayList<ConversionFactorType>();
        }
        return this.conversionFactor;
    }

}
