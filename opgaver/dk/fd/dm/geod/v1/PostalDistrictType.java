
package dk.fd.dm.geod.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a postal district.
 * 
 * <p>Java class for PostalDistrictType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalDistrictType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalDistrictIdentification" type="{urn:dk:fd:dm:geod:v1.0}PostalDistrictIdentificationType"/>
 *         &lt;element name="PostalCode" type="{urn:dk:fd:dm:geod:v1.0}PostalCodeType"/>
 *         &lt;element name="PostalDistrictName" type="{urn:dk:fd:dm:geod:v1.0}PostalDistrictNameType" minOccurs="0"/>
 *         &lt;element name="CountryCodeAlpha3" type="{urn:dk:fd:dm:geod:v1.0}CountryCodeAlpha3Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalDistrictType", propOrder = {
    "postalDistrictIdentification",
    "postalCode",
    "postalDistrictName",
    "countryCodeAlpha3"
})
public class PostalDistrictType
    implements Serializable
{

    @XmlElement(name = "PostalDistrictIdentification", required = true)
    protected PostalDistrictIdentificationType postalDistrictIdentification;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "PostalDistrictName")
    protected String postalDistrictName;
    @XmlElement(name = "CountryCodeAlpha3", required = true)
    protected String countryCodeAlpha3;

    /**
     * Gets the value of the postalDistrictIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public PostalDistrictIdentificationType getPostalDistrictIdentification() {
        return postalDistrictIdentification;
    }

    /**
     * Sets the value of the postalDistrictIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalDistrictIdentificationType }
     *     
     */
    public void setPostalDistrictIdentification(PostalDistrictIdentificationType value) {
        this.postalDistrictIdentification = value;
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

    /**
     * Gets the value of the postalDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalDistrictName() {
        return postalDistrictName;
    }

    /**
     * Sets the value of the postalDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalDistrictName(String value) {
        this.postalDistrictName = value;
    }

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

}
