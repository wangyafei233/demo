
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coolingStatusSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="coolingStatusSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRITICAL"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="NORMAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "coolingStatusSeverity")
@XmlEnum
public enum CoolingStatusSeverity {

    CRITICAL,
    WARNING,
    NORMAL;

    public String value() {
        return name();
    }

    public static CoolingStatusSeverity fromValue(String v) {
        return valueOf(v);
    }

}
