
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coolingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="coolingStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WELL_COOLED"/>
 *     &lt;enumeration value="HOT_OUTLIERS_DETECTED"/>
 *     &lt;enumeration value="HOTSPOTS_DETECTED"/>
 *     &lt;enumeration value="OVER_COOLED"/>
 *     &lt;enumeration value="LARGE_TEMPERATURE_SPAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "coolingStatus")
@XmlEnum
public enum CoolingStatus {

    WELL_COOLED,
    HOT_OUTLIERS_DETECTED,
    HOTSPOTS_DETECTED,
    OVER_COOLED,
    LARGE_TEMPERATURE_SPAN;

    public String value() {
        return name();
    }

    public static CoolingStatus fromValue(String v) {
        return valueOf(v);
    }

}
