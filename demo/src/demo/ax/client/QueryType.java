
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAX_PWR"/>
 *     &lt;enumeration value="AVG_PWR"/>
 *     &lt;enumeration value="MIN_PWR"/>
 *     &lt;enumeration value="MAX_CPU_PWR"/>
 *     &lt;enumeration value="AVG_CPU_PWR"/>
 *     &lt;enumeration value="MIN_CPU_PWR"/>
 *     &lt;enumeration value="MAX_MEM_PWR"/>
 *     &lt;enumeration value="AVG_MEM_PWR"/>
 *     &lt;enumeration value="MIN_MEM_PWR"/>
 *     &lt;enumeration value="MAX_AVG_PWR"/>
 *     &lt;enumeration value="MIC_PWR"/>
 *     &lt;enumeration value="TOTAL_MAX_PWR"/>
 *     &lt;enumeration value="TOTAL_AVG_PWR"/>
 *     &lt;enumeration value="MAX_AVG_PWR_CAP"/>
 *     &lt;enumeration value="TOTAL_MAX_PWR_CAP"/>
 *     &lt;enumeration value="TOTAL_AVG_PWR_CAP"/>
 *     &lt;enumeration value="TOTAL_MIN_PWR"/>
 *     &lt;enumeration value="MIN_AVG_PWR"/>
 *     &lt;enumeration value="MAX_INLET_TEMP"/>
 *     &lt;enumeration value="AVG_INLET_TEMP"/>
 *     &lt;enumeration value="MIN_INLET_TEMP"/>
 *     &lt;enumeration value="INS_PWR"/>
 *     &lt;enumeration value="PDU_PWR"/>
 *     &lt;enumeration value="OBSV_MAX_PDU_PWR"/>
 *     &lt;enumeration value="CPU_USED"/>
 *     &lt;enumeration value="MEMORY_USED"/>
 *     &lt;enumeration value="IO_USED"/>
 *     &lt;enumeration value="NETWORK_USED"/>
 *     &lt;enumeration value="CUPS"/>
 *     &lt;enumeration value="ESTIMATED_CPU_USED"/>
 *     &lt;enumeration value="ESTIMATED_MEMORY_USED"/>
 *     &lt;enumeration value="ESTIMATED_DISK_USED"/>
 *     &lt;enumeration value="AVG_OUTLET_TEMP"/>
 *     &lt;enumeration value="AIRFLOW"/>
 *     &lt;enumeration value="ESTIMATED_PWR"/>
 *     &lt;enumeration value="CPU_UTIL"/>
 *     &lt;enumeration value="DISK_IO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "queryType")
@XmlEnum
public enum QueryType {

    MAX_PWR,
    AVG_PWR,
    MIN_PWR,
    MAX_CPU_PWR,
    AVG_CPU_PWR,
    MIN_CPU_PWR,
    MAX_MEM_PWR,
    AVG_MEM_PWR,
    MIN_MEM_PWR,
    MAX_AVG_PWR,
    MIC_PWR,
    TOTAL_MAX_PWR,
    TOTAL_AVG_PWR,
    MAX_AVG_PWR_CAP,
    TOTAL_MAX_PWR_CAP,
    TOTAL_AVG_PWR_CAP,
    TOTAL_MIN_PWR,
    MIN_AVG_PWR,
    MAX_INLET_TEMP,
    AVG_INLET_TEMP,
    MIN_INLET_TEMP,
    INS_PWR,
    PDU_PWR,
    OBSV_MAX_PDU_PWR,
    CPU_USED,
    MEMORY_USED,
    IO_USED,
    NETWORK_USED,
    CUPS,
    ESTIMATED_CPU_USED,
    ESTIMATED_MEMORY_USED,
    ESTIMATED_DISK_USED,
    AVG_OUTLET_TEMP,
    AIRFLOW,
    ESTIMATED_PWR,
    CPU_UTIL,
    DISK_IO;

    public String value() {
        return name();
    }

    public static QueryType fromValue(String v) {
        return valueOf(v);
    }

}
