
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="historyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POWER_CAP_REQUESTED"/>
 *     &lt;enumeration value="POWER_CAP_ACTUAL"/>
 *     &lt;enumeration value="THERMAL_TRIGGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "historyType")
@XmlEnum
public enum HistoryType {

    POWER_CAP_REQUESTED,
    POWER_CAP_ACTUAL,
    THERMAL_TRIGGER;

    public String value() {
        return name();
    }

    public static HistoryType fromValue(String v) {
        return valueOf(v);
    }

}
