
package dk.fd.dm.indv.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This structure defines a general address. This may be a foreign address or an danish address that is not
 *                 verified.
 *             
 * 
 * <p>Java class for OtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FourthAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FifthAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SixthAddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", propOrder = {
    "firstAddressLine",
    "secondAddressLine",
    "thirdAddressLine",
    "fourthAddressLine",
    "fifthAddressLine",
    "sixthAddressLine"
})
public class OtherAddressType {

    @XmlElement(name = "FirstAddressLine")
    protected String firstAddressLine;
    @XmlElement(name = "SecondAddressLine")
    protected String secondAddressLine;
    @XmlElement(name = "ThirdAddressLine")
    protected String thirdAddressLine;
    @XmlElement(name = "FourthAddressLine")
    protected String fourthAddressLine;
    @XmlElement(name = "FifthAddressLine")
    protected String fifthAddressLine;
    @XmlElement(name = "SixthAddressLine")
    protected String sixthAddressLine;

    /**
     * Gets the value of the firstAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAddressLine() {
        return firstAddressLine;
    }

    /**
     * Sets the value of the firstAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAddressLine(String value) {
        this.firstAddressLine = value;
    }

    /**
     * Gets the value of the secondAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondAddressLine() {
        return secondAddressLine;
    }

    /**
     * Sets the value of the secondAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondAddressLine(String value) {
        this.secondAddressLine = value;
    }

    /**
     * Gets the value of the thirdAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdAddressLine() {
        return thirdAddressLine;
    }

    /**
     * Sets the value of the thirdAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdAddressLine(String value) {
        this.thirdAddressLine = value;
    }

    /**
     * Gets the value of the fourthAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthAddressLine() {
        return fourthAddressLine;
    }

    /**
     * Sets the value of the fourthAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthAddressLine(String value) {
        this.fourthAddressLine = value;
    }

    /**
     * Gets the value of the fifthAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifthAddressLine() {
        return fifthAddressLine;
    }

    /**
     * Sets the value of the fifthAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifthAddressLine(String value) {
        this.fifthAddressLine = value;
    }

    /**
     * Gets the value of the sixthAddressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSixthAddressLine() {
        return sixthAddressLine;
    }

    /**
     * Sets the value of the sixthAddressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSixthAddressLine(String value) {
        this.sixthAddressLine = value;
    }

}
