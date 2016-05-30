
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOM_PWR_LIMIT"/>
 *     &lt;enumeration value="MIN_PWR"/>
 *     &lt;enumeration value="MIN_PWR_ON_INLET_TEMP_TRIGGER"/>
 *     &lt;enumeration value="STATIC_PWR_LIMIT"/>
 *     &lt;enumeration value="CPU_PWR_LIMIT"/>
 *     &lt;enumeration value="MEM_PWR_LIMIT"/>
 *     &lt;enumeration value="PWR_EFFICIENT"/>
 *     &lt;enumeration value="MIC_PWR_LIMIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policyType")
@XmlEnum
public enum PolicyType {

    CUSTOM_PWR_LIMIT,
    MIN_PWR,
    MIN_PWR_ON_INLET_TEMP_TRIGGER,
    STATIC_PWR_LIMIT,
    CPU_PWR_LIMIT,
    MEM_PWR_LIMIT,
    PWR_EFFICIENT,
    MIC_PWR_LIMIT;

    public String value() {
        return name();
    }

    public static PolicyType fromValue(String v) {
        return valueOf(v);
    }

}
