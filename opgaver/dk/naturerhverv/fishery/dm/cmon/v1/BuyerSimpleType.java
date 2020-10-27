
package dk.naturerhverv.fishery.dm.cmon.v1;

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
 * Buyer simple type
 * 
 * <p>Java class for BuyerSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BuyerIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}BuyerIdentificationType" minOccurs="0"/>
 *         &lt;element name="BuyerNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}BuyerNumberType" minOccurs="0"/>
 *         &lt;element name="CustomerIdentification" type="{urn:dk:naturerhverv:fishery:dm:indv:v1.0}CustomerIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerSimpleType", propOrder = {
    "date",
    "buyerIdentification",
    "buyerNumber",
    "customerIdentification"
})
public class BuyerSimpleType
    implements Serializable
{

    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime date;
    @XmlElement(name = "BuyerIdentification")
    protected String buyerIdentification;
    @XmlElement(name = "BuyerNumber")
    protected Integer buyerNumber;
    @XmlElement(name = "CustomerIdentification")
    protected String customerIdentification;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
    }

    /**
     * Gets the value of the buyerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerIdentification() {
        return buyerIdentification;
    }

    /**
     * Sets the value of the buyerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerIdentification(String value) {
        this.buyerIdentification = value;
    }

    /**
     * Gets the value of the buyerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyerNumber() {
        return buyerNumber;
    }

    /**
     * Sets the value of the buyerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyerNumber(Integer value) {
        this.buyerNumber = value;
    }

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentification(String value) {
        this.customerIdentification = value;
    }

}
