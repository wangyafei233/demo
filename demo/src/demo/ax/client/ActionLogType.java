
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionLogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionLogType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="EVENT_CHANGE"/>
 *     &lt;enumeration value="CONFIGURATION_CHANGE"/>
 *     &lt;enumeration value="HIERARCHY_CHANGE"/>
 *     &lt;enumeration value="CONTROL_POLICY_CHANGE"/>
 *     &lt;enumeration value="EXTERNAL_ACTION_SUCCEEDED"/>
 *     &lt;enumeration value="EXTERNAL_ACTION_FAILED"/>
 *     &lt;enumeration value="SYSTEM_CHANGE"/>
 *     &lt;enumeration value="POLICY_WARNING"/>
 *     &lt;enumeration value="EVENT"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "actionLogType")
@XmlEnum
public enum ActionLogType {

    ALL,
    EVENT_CHANGE,
    CONFIGURATION_CHANGE,
    HIERARCHY_CHANGE,
    CONTROL_POLICY_CHANGE,
    EXTERNAL_ACTION_SUCCEEDED,
    EXTERNAL_ACTION_FAILED,
    SYSTEM_CHANGE,
    POLICY_WARNING,
    EVENT,
    NOTIFICATION;

    public String value() {
        return name();
    }

    public static ActionLogType fromValue(String v) {
        return valueOf(v);
    }

}
