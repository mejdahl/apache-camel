
package dk.fd.dm.indv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reference to a buyer using the business key
 * 
 * <p>Java class for EmployeeReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeIdentification" type="{urn:dk:fd:dm:indv:v1.0}EmployeeInitialsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeReferenceType", propOrder = {
    "employeeIdentification"
})
public class EmployeeReferenceType {

    @XmlElement(name = "EmployeeIdentification")
    protected String employeeIdentification;

    /**
     * Gets the value of the employeeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeIdentification() {
        return employeeIdentification;
    }

    /**
     * Sets the value of the employeeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeIdentification(String value) {
        this.employeeIdentification = value;
    }

}
