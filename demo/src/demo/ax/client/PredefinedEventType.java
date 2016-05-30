
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predefinedEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="predefinedEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPMI_PWR_UNIT"/>
 *     &lt;enumeration value="SNMP_PWR_UNIT"/>
 *     &lt;enumeration value="IPMI_PWR_SUPPLY"/>
 *     &lt;enumeration value="IPMI_PROCESSOR_THERMAL_TRIP"/>
 *     &lt;enumeration value="IPMI_FAN"/>
 *     &lt;enumeration value="BMC_SEL_REACHING_FULL_CAPACITY"/>
 *     &lt;enumeration value="BMC_SEL_AT_FULL_CAPACITY"/>
 *     &lt;enumeration value="ENTITY_PROPERTY_CHANGED"/>
 *     &lt;enumeration value="COMMUNICATION_WITH_NODE_FAILED"/>
 *     &lt;enumeration value="COMMUNICATION_WITH_NODE_RESTORED"/>
 *     &lt;enumeration value="INSUFFICIENT_NODE_PERMISSION"/>
 *     &lt;enumeration value="CONTROL_POLICY_CANNOT_BE_MAINTAINED"/>
 *     &lt;enumeration value="CANT_SET_NODE_EVENT"/>
 *     &lt;enumeration value="CONTROL_POLICY_APPLIED"/>
 *     &lt;enumeration value="CONTROL_POLICY_ENDED"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="CONFIGURATION_CHANGED"/>
 *     &lt;enumeration value="HIERARCHY_CHANGED"/>
 *     &lt;enumeration value="CONTROL_POLICY_CHANGED"/>
 *     &lt;enumeration value="CUSTOM_EVENT_CHANGED"/>
 *     &lt;enumeration value="EVENT_EVALUATION_FAILURE"/>
 *     &lt;enumeration value="COLLECTION_STATE_CHANGED"/>
 *     &lt;enumeration value="IMPORTHIERARCHY_COMPLETED"/>
 *     &lt;enumeration value="DB_MAINTENANCE_STARTING"/>
 *     &lt;enumeration value="DB_MAINTENANCE_ENDED"/>
 *     &lt;enumeration value="DB_CONNECTION_FAILED"/>
 *     &lt;enumeration value="DB_CONNECTION_RESTORED"/>
 *     &lt;enumeration value="CONTROL_POLICY_PRIORITY_CONFLICT"/>
 *     &lt;enumeration value="DCM_SERVER_CONNECTION_FAILED"/>
 *     &lt;enumeration value="DCM_SERVER_CONNECTION_RESTORED"/>
 *     &lt;enumeration value="CLOCK_NOT_SYNCHRONIZED"/>
 *     &lt;enumeration value="POWER_ON_MACHINE_FAILED"/>
 *     &lt;enumeration value="POWER_OFF_MACHINE_FAILED"/>
 *     &lt;enumeration value="DCM_SERVER_CONFLICT"/>
 *     &lt;enumeration value="CRITICAL_DATA_SYNCHRONIZATION_STARTING"/>
 *     &lt;enumeration value="CRITICAL_DATA_SYNCHRONIZATION_ENDED"/>
 *     &lt;enumeration value="NOTIFICATION_CHANGED"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *     &lt;enumeration value="SET_POLICY_TO_ENTITY_FAILED"/>
 *     &lt;enumeration value="REMOVE_POLICY_FROM_ENTITY_FAILED"/>
 *     &lt;enumeration value="COMMUNICATION_WITH_ENCLOSURE_FAILED"/>
 *     &lt;enumeration value="COMMUNICATION_WITH_ENCLOSURE_RESTORED"/>
 *     &lt;enumeration value="UPS_BAD_BATTERY"/>
 *     &lt;enumeration value="UPS_LOW_BATTERY"/>
 *     &lt;enumeration value="UPS_BAD_TEMPERATURE"/>
 *     &lt;enumeration value="UPS_BAD_INPUT"/>
 *     &lt;enumeration value="UPS_BAD_OUTPUT"/>
 *     &lt;enumeration value="UPS_OVERLOAD"/>
 *     &lt;enumeration value="UPS_ON_BYPASS"/>
 *     &lt;enumeration value="UPS_BAD_BYPASS"/>
 *     &lt;enumeration value="UPS_SHUTDOWN"/>
 *     &lt;enumeration value="UPS_CHARGE_FAILURE"/>
 *     &lt;enumeration value="UPS_FAN_FAILURE"/>
 *     &lt;enumeration value="UPS_COMMUNICATION_LOST"/>
 *     &lt;enumeration value="ENTITY_WITH_DUPLICATED_PLATFORMID"/>
 *     &lt;enumeration value="PDU_LOW_LOAD"/>
 *     &lt;enumeration value="PDU_HIGH_LOAD"/>
 *     &lt;enumeration value="PDU_OVERLOAD"/>
 *     &lt;enumeration value="PDU_OUTLET_ON"/>
 *     &lt;enumeration value="PDU_OUTLET_OFF"/>
 *     &lt;enumeration value="ENTITY_CAPABILITIES_CHANGED"/>
 *     &lt;enumeration value="PDU_OUTLET_LOW_LOAD"/>
 *     &lt;enumeration value="PDU_OUTLET_HIGH_LOAD"/>
 *     &lt;enumeration value="PDU_OUTLET_OVERLOAD"/>
 *     &lt;enumeration value="PLATFORM_OPERATION_FAILED"/>
 *     &lt;enumeration value="IPMI_TEST_EVENT"/>
 *     &lt;enumeration value="CMC_SNMP_EVENT"/>
 *     &lt;enumeration value="IDRAC_SNMP_EVENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "predefinedEventType")
@XmlEnum
public enum PredefinedEventType {

    IPMI_PWR_UNIT,
    SNMP_PWR_UNIT,
    IPMI_PWR_SUPPLY,
    IPMI_PROCESSOR_THERMAL_TRIP,
    IPMI_FAN,
    BMC_SEL_REACHING_FULL_CAPACITY,
    BMC_SEL_AT_FULL_CAPACITY,
    ENTITY_PROPERTY_CHANGED,
    COMMUNICATION_WITH_NODE_FAILED,
    COMMUNICATION_WITH_NODE_RESTORED,
    INSUFFICIENT_NODE_PERMISSION,
    CONTROL_POLICY_CANNOT_BE_MAINTAINED,
    CANT_SET_NODE_EVENT,
    CONTROL_POLICY_APPLIED,
    CONTROL_POLICY_ENDED,
    INTERNAL_ERROR,
    CONFIGURATION_CHANGED,
    HIERARCHY_CHANGED,
    CONTROL_POLICY_CHANGED,
    CUSTOM_EVENT_CHANGED,
    EVENT_EVALUATION_FAILURE,
    COLLECTION_STATE_CHANGED,
    IMPORTHIERARCHY_COMPLETED,
    DB_MAINTENANCE_STARTING,
    DB_MAINTENANCE_ENDED,
    DB_CONNECTION_FAILED,
    DB_CONNECTION_RESTORED,
    CONTROL_POLICY_PRIORITY_CONFLICT,
    DCM_SERVER_CONNECTION_FAILED,
    DCM_SERVER_CONNECTION_RESTORED,
    CLOCK_NOT_SYNCHRONIZED,
    POWER_ON_MACHINE_FAILED,
    POWER_OFF_MACHINE_FAILED,
    DCM_SERVER_CONFLICT,
    CRITICAL_DATA_SYNCHRONIZATION_STARTING,
    CRITICAL_DATA_SYNCHRONIZATION_ENDED,
    NOTIFICATION_CHANGED,
    NOTIFICATION,
    SET_POLICY_TO_ENTITY_FAILED,
    REMOVE_POLICY_FROM_ENTITY_FAILED,
    COMMUNICATION_WITH_ENCLOSURE_FAILED,
    COMMUNICATION_WITH_ENCLOSURE_RESTORED,
    UPS_BAD_BATTERY,
    UPS_LOW_BATTERY,
    UPS_BAD_TEMPERATURE,
    UPS_BAD_INPUT,
    UPS_BAD_OUTPUT,
    UPS_OVERLOAD,
    UPS_ON_BYPASS,
    UPS_BAD_BYPASS,
    UPS_SHUTDOWN,
    UPS_CHARGE_FAILURE,
    UPS_FAN_FAILURE,
    UPS_COMMUNICATION_LOST,
    ENTITY_WITH_DUPLICATED_PLATFORMID,
    PDU_LOW_LOAD,
    PDU_HIGH_LOAD,
    PDU_OVERLOAD,
    PDU_OUTLET_ON,
    PDU_OUTLET_OFF,
    ENTITY_CAPABILITIES_CHANGED,
    PDU_OUTLET_LOW_LOAD,
    PDU_OUTLET_HIGH_LOAD,
    PDU_OUTLET_OVERLOAD,
    PLATFORM_OPERATION_FAILED,
    IPMI_TEST_EVENT,
    CMC_SNMP_EVENT,
    IDRAC_SNMP_EVENT;

    public String value() {
        return name();
    }

    public static PredefinedEventType fromValue(String v) {
        return valueOf(v);
    }

}
