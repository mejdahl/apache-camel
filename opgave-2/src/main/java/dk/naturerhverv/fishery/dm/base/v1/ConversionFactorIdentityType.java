
package dk.naturerhverv.fishery.dm.base.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Public key of conversion factor.
 * 
 * <p>Java class for ConversionFactorIdentityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionFactorIdentityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpeciesRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelevantAreaRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PresentationRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreservationRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SizeRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionFactorIdentityType", propOrder = {
    "speciesRef",
    "relevantAreaRef",
    "presentationRef",
    "preservationRef",
    "sizeRef"
})
public class ConversionFactorIdentityType {

    @XmlElement(name = "SpeciesRef")
    protected ConversionFactorIdentityType.SpeciesRef speciesRef;
    @XmlElement(name = "RelevantAreaRef")
    protected ConversionFactorIdentityType.RelevantAreaRef relevantAreaRef;
    @XmlElement(name = "PresentationRef")
    protected ConversionFactorIdentityType.PresentationRef presentationRef;
    @XmlElement(name = "PreservationRef")
    protected ConversionFactorIdentityType.PreservationRef preservationRef;
    @XmlElement(name = "SizeRef")
    protected ConversionFactorIdentityType.SizeRef sizeRef;

    /**
     * Gets the value of the speciesRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType.SpeciesRef }
     *     
     */
    public ConversionFactorIdentityType.SpeciesRef getSpeciesRef() {
        return speciesRef;
    }

    /**
     * Sets the value of the speciesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType.SpeciesRef }
     *     
     */
    public void setSpeciesRef(ConversionFactorIdentityType.SpeciesRef value) {
        this.speciesRef = value;
    }

    /**
     * Gets the value of the relevantAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType.RelevantAreaRef }
     *     
     */
    public ConversionFactorIdentityType.RelevantAreaRef getRelevantAreaRef() {
        return relevantAreaRef;
    }

    /**
     * Sets the value of the relevantAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType.RelevantAreaRef }
     *     
     */
    public void setRelevantAreaRef(ConversionFactorIdentityType.RelevantAreaRef value) {
        this.relevantAreaRef = value;
    }

    /**
     * Gets the value of the presentationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType.PresentationRef }
     *     
     */
    public ConversionFactorIdentityType.PresentationRef getPresentationRef() {
        return presentationRef;
    }

    /**
     * Sets the value of the presentationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType.PresentationRef }
     *     
     */
    public void setPresentationRef(ConversionFactorIdentityType.PresentationRef value) {
        this.presentationRef = value;
    }

    /**
     * Gets the value of the preservationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType.PreservationRef }
     *     
     */
    public ConversionFactorIdentityType.PreservationRef getPreservationRef() {
        return preservationRef;
    }

    /**
     * Sets the value of the preservationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType.PreservationRef }
     *     
     */
    public void setPreservationRef(ConversionFactorIdentityType.PreservationRef value) {
        this.preservationRef = value;
    }

    /**
     * Gets the value of the sizeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFactorIdentityType.SizeRef }
     *     
     */
    public ConversionFactorIdentityType.SizeRef getSizeRef() {
        return sizeRef;
    }

    /**
     * Sets the value of the sizeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFactorIdentityType.SizeRef }
     *     
     */
    public void setSizeRef(ConversionFactorIdentityType.SizeRef value) {
        this.sizeRef = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PresentationRef
        extends ReferenceType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PreservationRef
        extends ReferenceType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RelevantAreaRef
        extends ReferenceType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SizeRef
        extends ReferenceType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:base:v1.0}ReferenceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpeciesRef
        extends ReferenceType
    {


    }

}
