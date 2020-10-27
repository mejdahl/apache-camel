
package dk.naturerhverv.fishery.dm.geod.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaIdentificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:naturerhverv:fishery:dm:geod:v1.0}AreaType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaIdentificationType")
@XmlSeeAlso({
    AreaReferenceType.class
})
public class AreaIdentificationType
    extends AreaType
    implements Serializable
{


}
