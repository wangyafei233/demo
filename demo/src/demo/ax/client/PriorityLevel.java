
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priorityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="priorityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="CRITICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "priorityLevel")
@XmlEnum
public enum PriorityLevel {

    LOW,
    MEDIUM,
    HIGH,
    CRITICAL;

    public String value() {
        return name();
    }

    public static PriorityLevel fromValue(String v) {
        return valueOf(v);
    }

}
