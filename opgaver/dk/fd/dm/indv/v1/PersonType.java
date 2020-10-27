
package dk.fd.dm.indv.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type defines a person.
 * 
 *         A person may have a CPR number
 *         Furthermore there may be zero or more names, addresses and communication means.
 *         A person should always have a name.
 *       
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:fd:dm:indv:v1.0}CustomerBaseType">
 *       &lt;sequence>
 *         &lt;element name="PersonIdentification" type="{urn:dk:fd:dm:indv:v1.0}PersonIdentificationType"/>
 *         &lt;element name="CprNumber" type="{urn:dk:fd:dm:indv:v1.0}CprNumberType" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{urn:dk:fd:dm:indv:v1.0}PersonNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "personIdentification",
    "cprNumber",
    "personName"
})
public class PersonType
    extends CustomerBaseType
    implements Serializable
{

    @XmlElement(name = "PersonIdentification", required = true)
    protected String personIdentification;
    @XmlElement(name = "CprNumber")
    protected String cprNumber;
    @XmlElement(name = "PersonName")
    protected PersonNameType personName;

    /**
     * Gets the value of the personIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonIdentification() {
        return personIdentification;
    }

    /**
     * Sets the value of the personIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonIdentification(String value) {
        this.personIdentification = value;
    }

    /**
     * Gets the value of the cprNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprNumber() {
        return cprNumber;
    }

    /**
     * Sets the value of the cprNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprNumber(String value) {
        this.cprNumber = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

}
