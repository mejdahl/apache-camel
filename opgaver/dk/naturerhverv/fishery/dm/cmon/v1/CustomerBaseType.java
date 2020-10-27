
package dk.naturerhverv.fishery.dm.cmon.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A legal entity, that has interaction with NES
 * 
 * <p>Java class for CustomerBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Communication" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}CommunicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:dk:naturerhverv:fishery:dm:cmon:v1.0}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBaseType", propOrder = {
    "communication",
    "address"
})
@XmlSeeAlso({
    CompanyType.class,
    UnknownCompanyType.class,
    UnknownPersonType.class,
    PersonType.class,
    ProductionUnitType.class
})
public abstract class CustomerBaseType
    implements Serializable
{

    @XmlElement(name = "Communication")
    protected List<CommunicationType> communication;
    @XmlElement(name = "Address")
    protected List<AddressType> address;

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationType }
     * 
     * 
     */
    public List<CommunicationType> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CommunicationType>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressType>();
        }
        return this.address;
    }

}