
package dk.fd.dm.indv.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaDateTimeAdapter;
import org.joda.time.DateTime;


/**
 * Defines an unknown company.
 * 
 * <p>Java class for UnknownCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnknownCompanyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:fd:dm:indv:v1.0}CustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SystemCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UnknownEntityRole" type="{urn:dk:fd:dm:indv:v1.0}UnknownEntityRoleType"/>
 *         &lt;element name="NationalityCode" type="{urn:dk:fd:dm:geod:v1.0}CountryCodeAlpha3Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownCompanyType", propOrder = {
    "companyName",
    "systemCode",
    "creationDateTime",
    "unknownEntityRole",
    "nationalityCode"
})
public class UnknownCompanyType
    extends CustomerBaseType
    implements Serializable
{

    @XmlElement(name = "CompanyName", required = true)
    protected String companyName;
    @XmlElement(name = "SystemCode", required = true)
    protected String systemCode;
    @XmlElement(name = "CreationDateTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime creationDateTime;
    @XmlElement(name = "UnknownEntityRole", required = true)
    protected String unknownEntityRole;
    @XmlElement(name = "NationalityCode")
    protected String nationalityCode;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(DateTime value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the unknownEntityRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownEntityRole() {
        return unknownEntityRole;
    }

    /**
     * Sets the value of the unknownEntityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownEntityRole(String value) {
        this.unknownEntityRole = value;
    }

    /**
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

}
