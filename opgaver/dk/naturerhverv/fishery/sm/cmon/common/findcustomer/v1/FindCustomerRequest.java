
package dk.naturerhverv.fishery.sm.cmon.common.findcustomer.v1;

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
import dk.fd.dm.indv.v1.CustomerReferenceType;
import dk.fd.soa.util.JodaDateTimeAdapter;
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
 *         &lt;element name="ValidAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{urn:dk:fd:dm:indv:v1.0}CustomerReferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
    "validAt",
    "customerReference"
})
@XmlRootElement(name = "FindCustomerRequest")
public class FindCustomerRequest
    implements Serializable
{

    @XmlElement(name = "ValidAt", type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime validAt;
    @XmlElement(name = "CustomerReference")
    protected List<CustomerReferenceType> customerReference;

    /**
     * Gets the value of the validAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getValidAt() {
        return validAt;
    }

    /**
     * Sets the value of the validAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidAt(DateTime value) {
        this.validAt = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReferenceType }
     * 
     * 
     */
    public List<CustomerReferenceType> getCustomerReference() {
        if (customerReference == null) {
            customerReference = new ArrayList<CustomerReferenceType>();
        }
        return this.customerReference;
    }

}
