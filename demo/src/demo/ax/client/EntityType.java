
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NODE"/>
 *     &lt;enumeration value="ENCLOSURE"/>
 *     &lt;enumeration value="RACK"/>
 *     &lt;enumeration value="ROW"/>
 *     &lt;enumeration value="ROOM"/>
 *     &lt;enumeration value="DATACENTER"/>
 *     &lt;enumeration value="LOGICAL_GROUP"/>
 *     &lt;enumeration value="DCM_SERVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entityType")
@XmlEnum
public enum EntityType {

    NODE,
    ENCLOSURE,
    RACK,
    ROW,
    ROOM,
    DATACENTER,
    LOGICAL_GROUP,
    DCM_SERVER;

    public String value() {
        return name();
    }

    public static EntityType fromValue(String v) {
        return valueOf(v);
    }

}
