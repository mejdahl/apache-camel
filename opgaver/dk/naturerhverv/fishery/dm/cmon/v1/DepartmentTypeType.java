
package dk.naturerhverv.fishery.dm.cmon.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartmentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepartmentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHIP"/>
 *     &lt;enumeration value="LOCALOFFICE"/>
 *     &lt;enumeration value="INSPECTORATE"/>
 *     &lt;enumeration value="HEADQUARTERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepartmentTypeType")
@XmlEnum
public enum DepartmentTypeType {

    SHIP,
    LOCALOFFICE,
    INSPECTORATE,
    HEADQUARTERS;

    public String value() {
        return name();
    }

    public static DepartmentTypeType fromValue(String v) {
        return valueOf(v);
    }

}
