
package dk.naturerhverv.fishery.dm.base.v1;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionFactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionFactorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionFactorIdentification" type="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ConversionFactorIdentityType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionFactorType", propOrder = {
    "conversionFactorIdentification",
    "value"
})
public class ConversionFactorType
    implements Serializable
{

    @XmlElement(name = "ConversionFactorIdentification")
    protected ConversionFactorIdentityType conversionFactorIdentification;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the conversionFactorIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType }
     *     
     */
    public ConversionFactorIdentityType getConversionFactorIdentification() {
        return conversionFactorIdentification;
    }

    /**
     * Sets the value of the conversionFactorIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType }
     *     
     */
    public void setConversionFactorIdentification(ConversionFactorIdentityType value) {
        this.conversionFactorIdentification = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
