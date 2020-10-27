
package dk.naturerhverv.fishery.sm.cmon.common.findsimplecustomerinfos.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.naturerhverv.fishery.dm.cmon.v1.BuyerSimpleType;
import dk.naturerhverv.fishery.dm.cmon.v1.CustomerSimpleType;


/**
 * <p>Java class for FindCustomerInfosResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCustomerInfosResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CustomerSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Buyer" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}BuyerSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCustomerInfosResponseType", propOrder = {
    "customer",
    "buyer"
})
public class FindCustomerInfosResponseType
    implements Serializable
{

    @XmlElement(name = "Customer")
    protected List<CustomerSimpleType> customer;
    @XmlElement(name = "Buyer")
    protected List<BuyerSimpleType> buyer;

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSimpleType }
     * 
     * 
     */
    public List<CustomerSimpleType> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<CustomerSimpleType>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerSimpleType }
     * 
     * 
     */
    public List<BuyerSimpleType> getBuyer() {
        if (buyer == null) {
            buyer = new ArrayList<BuyerSimpleType>();
        }
        return this.buyer;
    }

}
