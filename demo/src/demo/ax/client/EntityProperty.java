
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entityProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BMC_ADDRESS"/>
 *     &lt;enumeration value="BMC_USER"/>
 *     &lt;enumeration value="BMC_PASSWORD"/>
 *     &lt;enumeration value="BMC_KEY"/>
 *     &lt;enumeration value="BMC_MAC_ADDRESS"/>
 *     &lt;enumeration value="IPMI_CIPHER_SUITE"/>
 *     &lt;enumeration value="SNMP_ADDRESS"/>
 *     &lt;enumeration value="SNMP_PROTOCOL"/>
 *     &lt;enumeration value="SNMP_COMMUNITY_STRING"/>
 *     &lt;enumeration value="SNMP_USER"/>
 *     &lt;enumeration value="SNMP_AUTHENTICATION_PASSWORD"/>
 *     &lt;enumeration value="SNMP_ENCRYPTION_PASSWORD"/>
 *     &lt;enumeration value="PDU_MAC_ADDRESS"/>
 *     &lt;enumeration value="SSH_ADDRESS"/>
 *     &lt;enumeration value="SSH_USER"/>
 *     &lt;enumeration value="SSH_PASSWORD"/>
 *     &lt;enumeration value="SSH_PORT"/>
 *     &lt;enumeration value="HTTPS_ADDRESS"/>
 *     &lt;enumeration value="HTTPS_PORT"/>
 *     &lt;enumeration value="HTTP_BASIC_USER"/>
 *     &lt;enumeration value="HTTP_BASIC_PASSWORD"/>
 *     &lt;enumeration value="UCS_USER"/>
 *     &lt;enumeration value="UCS_PASSWORD"/>
 *     &lt;enumeration value="DISTINGUISHED_NAME"/>
 *     &lt;enumeration value="DCM_SERVER_ADDRESS"/>
 *     &lt;enumeration value="DCM_SERVER_PORT"/>
 *     &lt;enumeration value="EVENT_HANDLER_HOST_ADDRESS"/>
 *     &lt;enumeration value="EVENT_HANDLER_PORT"/>
 *     &lt;enumeration value="ENABLE_TLS"/>
 *     &lt;enumeration value="SERVER_POWER_SAMPLING_PERIOD"/>
 *     &lt;enumeration value="SERVER_THERMAL_SAMPLING_PERIOD"/>
 *     &lt;enumeration value="CONNECTOR_NAME"/>
 *     &lt;enumeration value="DCM_SERVER_ID"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="DESCRIPTION"/>
 *     &lt;enumeration value="CAPABILITIES"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="DIMENSION"/>
 *     &lt;enumeration value="ENTITY_TYPE"/>
 *     &lt;enumeration value="NAMEPLATE_PWR"/>
 *     &lt;enumeration value="DERATED_PWR"/>
 *     &lt;enumeration value="NAMEPLATE_PWR_UNMNGD_EQPMNT"/>
 *     &lt;enumeration value="PDU_PWR_LIMIT"/>
 *     &lt;enumeration value="NODE_STATUS"/>
 *     &lt;enumeration value="ENCLOSURE_STATUS"/>
 *     &lt;enumeration value="NODE_POLICY_STATUS"/>
 *     &lt;enumeration value="NODE_PWR_LIMIT"/>
 *     &lt;enumeration value="REPORT_INLET_TEMP"/>
 *     &lt;enumeration value="NODE_IDRAC_TYPE"/>
 *     &lt;enumeration value="BLADE_FORM_FACTOR"/>
 *     &lt;enumeration value="CUSTOMIZED_PROPERTY"/>
 *     &lt;enumeration value="CUSTOMIZED_INFO"/>
 *     &lt;enumeration value="INBAND_OS_TYPE"/>
 *     &lt;enumeration value="INBAND_ADDRESS"/>
 *     &lt;enumeration value="INBAND_USERNAME"/>
 *     &lt;enumeration value="INBAND_PASSWORD"/>
 *     &lt;enumeration value="INBAND_SSH_PORT"/>
 *     &lt;enumeration value="PLATFORM_ID"/>
 *     &lt;enumeration value="DEVICE_TYPE"/>
 *     &lt;enumeration value="DEVICE_MODEL"/>
 *     &lt;enumeration value="AUTHENTICATE_ENTITY"/>
 *     &lt;enumeration value="MIN_POWER_DRAW"/>
 *     &lt;enumeration value="MAX_POWER_DRAW"/>
 *     &lt;enumeration value="REQUESTED_TIMEOUT"/>
 *     &lt;enumeration value="AGGREGATION_MULTIPLIER"/>
 *     &lt;enumeration value="UUID"/>
 *     &lt;enumeration value="ENCLOSURE_ADDRESS"/>
 *     &lt;enumeration value="ASSET_TAG"/>
 *     &lt;enumeration value="PWR_ESTIMATOR"/>
 *     &lt;enumeration value="GROUP_LIMIT_ON_ENCLOSURE"/>
 *     &lt;enumeration value="MGMT_CONSOLE_URL"/>
 *     &lt;enumeration value="IDRAC_TAG"/>
 *     &lt;enumeration value="MAX_PWR_BUDGET"/>
 *     &lt;enumeration value="MIN_PWR_BUDGET"/>
 *     &lt;enumeration value="SERVICE_TAG"/>
 *     &lt;enumeration value="PDU_PWR_AS_IT_EQPMNT_PWR"/>
 *     &lt;enumeration value="FIRMWARE_VERSION"/>
 *     &lt;enumeration value="MGMT_PROCESSOR_TYPE"/>
 *     &lt;enumeration value="TEMPERATURE_UPPER_LIMIT"/>
 *     &lt;enumeration value="SERIAL_NUMBER"/>
 *     &lt;enumeration value="HARD_CAPPING"/>
 *     &lt;enumeration value="BMC_GUID"/>
 *     &lt;enumeration value="EFFICIENT_LOWER_LIMIT"/>
 *     &lt;enumeration value="TMM_LICENSE"/>
 *     &lt;enumeration value="SOL_INFO"/>
 *     &lt;enumeration value="SOL_SECRET"/>
 *     &lt;enumeration value="VNC_INFO"/>
 *     &lt;enumeration value="VNC_SECRET"/>
 *     &lt;enumeration value="MPCM_CAPABLE"/>
 *     &lt;enumeration value="MPCM_ENABLED"/>
 *     &lt;enumeration value="MPCM_REQUESTED"/>
 *     &lt;enumeration value="CAPABILITY_DISABLED"/>
 *     &lt;enumeration value="ORIGINAL_CAPABILITY"/>
 *     &lt;enumeration value="IDRAC_LOCATION"/>
 *     &lt;enumeration value="OUTLET_NUM"/>
 *     &lt;enumeration value="PDU_RATING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entityProperty")
@XmlEnum
public enum EntityProperty {

    BMC_ADDRESS,
    BMC_USER,
    BMC_PASSWORD,
    BMC_KEY,
    BMC_MAC_ADDRESS,
    IPMI_CIPHER_SUITE,
    SNMP_ADDRESS,
    SNMP_PROTOCOL,
    SNMP_COMMUNITY_STRING,
    SNMP_USER,
    SNMP_AUTHENTICATION_PASSWORD,
    SNMP_ENCRYPTION_PASSWORD,
    PDU_MAC_ADDRESS,
    SSH_ADDRESS,
    SSH_USER,
    SSH_PASSWORD,
    SSH_PORT,
    HTTPS_ADDRESS,
    HTTPS_PORT,
    HTTP_BASIC_USER,
    HTTP_BASIC_PASSWORD,
    UCS_USER,
    UCS_PASSWORD,
    DISTINGUISHED_NAME,
    DCM_SERVER_ADDRESS,
    DCM_SERVER_PORT,
    EVENT_HANDLER_HOST_ADDRESS,
    EVENT_HANDLER_PORT,
    ENABLE_TLS,
    SERVER_POWER_SAMPLING_PERIOD,
    SERVER_THERMAL_SAMPLING_PERIOD,
    CONNECTOR_NAME,
    DCM_SERVER_ID,
    NAME,
    DESCRIPTION,
    CAPABILITIES,
    LOCATION,
    DIMENSION,
    ENTITY_TYPE,
    NAMEPLATE_PWR,
    DERATED_PWR,
    NAMEPLATE_PWR_UNMNGD_EQPMNT,
    PDU_PWR_LIMIT,
    NODE_STATUS,
    ENCLOSURE_STATUS,
    NODE_POLICY_STATUS,
    NODE_PWR_LIMIT,
    REPORT_INLET_TEMP,
    NODE_IDRAC_TYPE,
    BLADE_FORM_FACTOR,
    CUSTOMIZED_PROPERTY,
    CUSTOMIZED_INFO,
    INBAND_OS_TYPE,
    INBAND_ADDRESS,
    INBAND_USERNAME,
    INBAND_PASSWORD,
    INBAND_SSH_PORT,
    PLATFORM_ID,
    DEVICE_TYPE,
    DEVICE_MODEL,
    AUTHENTICATE_ENTITY,
    MIN_POWER_DRAW,
    MAX_POWER_DRAW,
    REQUESTED_TIMEOUT,
    AGGREGATION_MULTIPLIER,
    UUID,
    ENCLOSURE_ADDRESS,
    ASSET_TAG,
    PWR_ESTIMATOR,
    GROUP_LIMIT_ON_ENCLOSURE,
    MGMT_CONSOLE_URL,
    IDRAC_TAG,
    MAX_PWR_BUDGET,
    MIN_PWR_BUDGET,
    SERVICE_TAG,
    PDU_PWR_AS_IT_EQPMNT_PWR,
    FIRMWARE_VERSION,
    MGMT_PROCESSOR_TYPE,
    TEMPERATURE_UPPER_LIMIT,
    SERIAL_NUMBER,
    HARD_CAPPING,
    BMC_GUID,
    EFFICIENT_LOWER_LIMIT,
    TMM_LICENSE,
    SOL_INFO,
    SOL_SECRET,
    VNC_INFO,
    VNC_SECRET,
    MPCM_CAPABLE,
    MPCM_ENABLED,
    MPCM_REQUESTED,
    CAPABILITY_DISABLED,
    ORIGINAL_CAPABILITY,
    IDRAC_LOCATION,
    OUTLET_NUM,
    PDU_RATING;

    public String value() {
        return name();
    }

    public static EntityProperty fromValue(String v) {
        return valueOf(v);
    }

}
