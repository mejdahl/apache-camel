
package dk.naturerhverv.fishery.sm.cmon.common.findsimplecustomerinfos.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dk.fd.soa.util.JodaDateTimeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for FindCustomerInfosRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCustomerInfosRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="BuyerNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}BuyerNumberType"/>
 *           &lt;element name="CvrNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CvrNumberType"/>
 *           &lt;element name="CprNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CprNumberType"/>
 *           &lt;element name="PNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}PNumberType"/>
 *           &lt;element name="CustomerNumber" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CustomerNumberType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCustomerInfosRequestType", propOrder = {
    "validAt",
    "buyerNumberOrCvrNumberOrCprNumber"
})
public class FindCustomerInfosRequestType
    implements Serializable
{

    @XmlElement(name = "ValidAt", type = String.class)
    @XmlJavaTypeAdapter(JodaDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected DateTime validAt;
    @XmlElementRefs({
        @XmlElementRef(name = "CustomerNumber", namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CvrNumber", namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "PNumber", namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "CprNumber", namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", type = JAXBElement.class),
        @XmlElementRef(name = "BuyerNumber", namespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindSimpleCustomerInfos:v1.0", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> buyerNumberOrCvrNumberOrCprNumber;

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
     * Gets the value of the buyerNumberOrCvrNumberOrCprNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerNumberOrCvrNumberOrCprNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerNumberOrCvrNumberOrCprNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getBuyerNumberOrCvrNumberOrCprNumber() {
        if (buyerNumberOrCvrNumberOrCprNumber == null) {
            buyerNumberOrCvrNumberOrCprNumber = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.buyerNumberOrCvrNumberOrCprNumber;
    }

}
