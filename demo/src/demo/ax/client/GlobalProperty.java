
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="globalProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NODE_POWER_SAMPLING_FREQUENCY"/>
 *     &lt;enumeration value="NODE_POWER_MEASUREMENT_GRANULARITY"/>
 *     &lt;enumeration value="NODE_THERMAL_SAMPLING_FREQUENCY"/>
 *     &lt;enumeration value="NODE_THERMAL_MEASUREMENT_GRANULARITY"/>
 *     &lt;enumeration value="NODE_BMC_SEL_MONITORING_FREQUENCY"/>
 *     &lt;enumeration value="NODE_STATUS_MONITORING_FREQUENCY"/>
 *     &lt;enumeration value="ACTION_LOG_BACK_TRACKING_PERIOD"/>
 *     &lt;enumeration value="ACTION_LOG_MAX_ITEM_COUNT"/>
 *     &lt;enumeration value="APP_LOG_MAX_SIZE"/>
 *     &lt;enumeration value="APP_LOG_LEVEL"/>
 *     &lt;enumeration value="COOLING_MULT"/>
 *     &lt;enumeration value="COST_PER_KW_HR"/>
 *     &lt;enumeration value="TIME_UNTIL_DB_COMPRESSION"/>
 *     &lt;enumeration value="TIME_UNTIL_NODE_DATA_COMPRESSION"/>
 *     &lt;enumeration value="TIME_UNTIL_GROUP_DATA_COMPRESSION"/>
 *     &lt;enumeration value="MAX_NUM_RECORDS_INVOLVED"/>
 *     &lt;enumeration value="TIME_UNTIL_DB_DELETION"/>
 *     &lt;enumeration value="TIME_UNTIL_NODE_DATA_DELETION"/>
 *     &lt;enumeration value="TIME_UNTIL_GROUP_DATA_DELETION"/>
 *     &lt;enumeration value="DB_MAINTENANCE_HOUR"/>
 *     &lt;enumeration value="DB_STORE_MEASUREMENT"/>
 *     &lt;enumeration value="DB_STORE_TIER2_NODE_DATA_IN_CENTRAL"/>
 *     &lt;enumeration value="MONITORING_ACTIVE"/>
 *     &lt;enumeration value="SILENT_MODE"/>
 *     &lt;enumeration value="ENABLE_SENSOR_MONITORING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "globalProperty")
@XmlEnum
public enum GlobalProperty {

    NODE_POWER_SAMPLING_FREQUENCY("NODE_POWER_SAMPLING_FREQUENCY"),
    NODE_POWER_MEASUREMENT_GRANULARITY("NODE_POWER_MEASUREMENT_GRANULARITY"),
    NODE_THERMAL_SAMPLING_FREQUENCY("NODE_THERMAL_SAMPLING_FREQUENCY"),
    NODE_THERMAL_MEASUREMENT_GRANULARITY("NODE_THERMAL_MEASUREMENT_GRANULARITY"),
    NODE_BMC_SEL_MONITORING_FREQUENCY("NODE_BMC_SEL_MONITORING_FREQUENCY"),
    NODE_STATUS_MONITORING_FREQUENCY("NODE_STATUS_MONITORING_FREQUENCY"),
    ACTION_LOG_BACK_TRACKING_PERIOD("ACTION_LOG_BACK_TRACKING_PERIOD"),
    ACTION_LOG_MAX_ITEM_COUNT("ACTION_LOG_MAX_ITEM_COUNT"),
    APP_LOG_MAX_SIZE("APP_LOG_MAX_SIZE"),
    APP_LOG_LEVEL("APP_LOG_LEVEL"),
    COOLING_MULT("COOLING_MULT"),
    COST_PER_KW_HR("COST_PER_KW_HR"),
    TIME_UNTIL_DB_COMPRESSION("TIME_UNTIL_DB_COMPRESSION"),
    TIME_UNTIL_NODE_DATA_COMPRESSION("TIME_UNTIL_NODE_DATA_COMPRESSION"),
    TIME_UNTIL_GROUP_DATA_COMPRESSION("TIME_UNTIL_GROUP_DATA_COMPRESSION"),
    MAX_NUM_RECORDS_INVOLVED("MAX_NUM_RECORDS_INVOLVED"),
    TIME_UNTIL_DB_DELETION("TIME_UNTIL_DB_DELETION"),
    TIME_UNTIL_NODE_DATA_DELETION("TIME_UNTIL_NODE_DATA_DELETION"),
    TIME_UNTIL_GROUP_DATA_DELETION("TIME_UNTIL_GROUP_DATA_DELETION"),
    DB_MAINTENANCE_HOUR("DB_MAINTENANCE_HOUR"),
    DB_STORE_MEASUREMENT("DB_STORE_MEASUREMENT"),
    @XmlEnumValue("DB_STORE_TIER2_NODE_DATA_IN_CENTRAL")
    DB_STORE_TIER_2_NODE_DATA_IN_CENTRAL("DB_STORE_TIER2_NODE_DATA_IN_CENTRAL"),
    MONITORING_ACTIVE("MONITORING_ACTIVE"),
    SILENT_MODE("SILENT_MODE"),
    ENABLE_SENSOR_MONITORING("ENABLE_SENSOR_MONITORING");
    private final String value;

    GlobalProperty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalProperty fromValue(String v) {
        for (GlobalProperty c: GlobalProperty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
