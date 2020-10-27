
package dk.fd.dm.vess.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Public key to a vessel using nation and external identification.
 * 
 * <p>Java class for VesselIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselIdentificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:dk:fd:dm:vess:v1.0}VesselIdentityType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselIdentificationType")
public class VesselIdentificationType
    extends VesselIdentityType
    implements Serializable
{


}
