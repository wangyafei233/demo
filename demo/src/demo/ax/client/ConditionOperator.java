
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="conditionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "conditionOperator")
@XmlEnum
public enum ConditionOperator {

    GREATER_THAN,
    LESS_THAN;

    public String value() {
        return name();
    }

    public static ConditionOperator fromValue(String v) {
        return valueOf(v);
    }

}
