
package dk.naturerhverv.fishery.dm.base.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresentationCodeDnkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationCodeDnkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="1"/>
 *     &lt;pattern value="[A-Z0-9]{1}"/>
 *     &lt;enumeration value="[A-Z]{3}"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresentationCodeDnkType")
@XmlEnum
public enum PresentationCodeDnkType {

    @XmlEnumValue("[A-Z]{3}")
    A_Z_3("[A-Z]{3}");
    private final String value;

    PresentationCodeDnkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationCodeDnkType fromValue(String v) {
        for (PresentationCodeDnkType c: PresentationCodeDnkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
