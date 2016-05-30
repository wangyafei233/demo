
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAX_PWR"/>
 *     &lt;enumeration value="AVG_PWR"/>
 *     &lt;enumeration value="MIN_PWR"/>
 *     &lt;enumeration value="MAX_AVG_PWR"/>
 *     &lt;enumeration value="TOTAL_MAX_PWR"/>
 *     &lt;enumeration value="TOTAL_AVG_PWR"/>
 *     &lt;enumeration value="TOTAL_MIN_PWR"/>
 *     &lt;enumeration value="MIN_AVG_PWR"/>
 *     &lt;enumeration value="MAX_INLET_TEMP"/>
 *     &lt;enumeration value="AVG_INLET_TEMP"/>
 *     &lt;enumeration value="MIN_INLET_TEMP"/>
 *     &lt;enumeration value="AVG_WATTS_PER_DIMENSION"/>
 *     &lt;enumeration value="AVG_COOLING_PWR"/>
 *     &lt;enumeration value="INLET_TEMPERATURE_SPAN"/>
 *     &lt;enumeration value="TOTAL_AVG_PWR_CAP"/>
 *     &lt;enumeration value="IT_EQPMNT_PWR"/>
 *     &lt;enumeration value="CPU_TEMP"/>
 *     &lt;enumeration value="MEM_TEMP"/>
 *     &lt;enumeration value="PCH_TEMP"/>
 *     &lt;enumeration value="IOH_TEMP"/>
 *     &lt;enumeration value="OUTLET_TEMP"/>
 *     &lt;enumeration value="CPU_TEMP_MARGIN"/>
 *     &lt;enumeration value="MEM_TEMP_MARGIN"/>
 *     &lt;enumeration value="IOH_TEMP_MARGIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customEventType")
@XmlEnum
public enum CustomEventType {

    MAX_PWR,
    AVG_PWR,
    MIN_PWR,
    MAX_AVG_PWR,
    TOTAL_MAX_PWR,
    TOTAL_AVG_PWR,
    TOTAL_MIN_PWR,
    MIN_AVG_PWR,
    MAX_INLET_TEMP,
    AVG_INLET_TEMP,
    MIN_INLET_TEMP,
    AVG_WATTS_PER_DIMENSION,
    AVG_COOLING_PWR,
    INLET_TEMPERATURE_SPAN,
    TOTAL_AVG_PWR_CAP,
    IT_EQPMNT_PWR,
    CPU_TEMP,
    MEM_TEMP,
    PCH_TEMP,
    IOH_TEMP,
    OUTLET_TEMP,
    CPU_TEMP_MARGIN,
    MEM_TEMP_MARGIN,
    IOH_TEMP_MARGIN;

    public String value() {
        return name();
    }

    public static CustomEventType fromValue(String v) {
        return valueOf(v);
    }

}
