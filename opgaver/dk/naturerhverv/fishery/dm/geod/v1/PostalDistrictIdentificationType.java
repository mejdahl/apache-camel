
package dk.naturerhverv.fishery.dm.geod.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the business key for a postal district. Should be renamed to PostalDistrictIdentityType
 * 
 * <p>Java class for PostalDistrictIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalDistrictIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCodeAlpha3" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}CountryCodeAlpha3Type"/>
 *         &lt;element name="PostalCode" type="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}PostalCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalDistrictIdentificationType", propOrder = {
    "countryCodeAlpha3",
    "postalCode"
})
public class PostalDistrictIdentificationType
    implements Serializable
{

    @XmlElement(name = "CountryCodeAlpha3", required = true)
    protected String countryCodeAlpha3;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;

    /**
     * Gets the value of the countryCodeAlpha3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeAlpha3() {
        return countryCodeAlpha3;
    }

    /**
     * Sets the value of the countryCodeAlpha3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeAlpha3(String value) {
        this.countryCodeAlpha3 = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
