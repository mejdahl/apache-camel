
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaLocalDateAdapter;
import org.joda.time.LocalDate;


/**
 * 
 *         This is the base type of all addresses. It defines various metadata and a country and postal code.
 * 
 *         If more than one address exists then the priority defines an order.
 *         If the address is secret to the public the protected is set to true.
 *         The from- and toDate defines the validity interval. If the toDate is not present then the address is
 *         valid to infinity.
 *       
 * 
 * <p>Java class for BaseAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressTypeCode" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}AddressTypeCodeType"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Protected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAddressType", propOrder = {
    "addressTypeCode",
    "fromDate",
    "toDate",
    "priority",
    "_protected"
})
@XmlSeeAlso({
    DanishAddressType.class,
    OtherAddressType.class,
    AddressSimpleType.class
})
public abstract class BaseAddressType
    implements Serializable
{

    @XmlElement(name = "AddressTypeCode", required = true)
    protected String addressTypeCode;
    @XmlElement(name = "FromDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fromDate;
    @XmlElement(name = "ToDate", type = String.class)
    @XmlJavaTypeAdapter(JodaLocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate toDate;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElement(name = "Protected")
    protected Boolean _protected;

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(LocalDate value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(LocalDate value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

}
