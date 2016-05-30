
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metricType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="metricType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MNGED_NODES_ENERGY"/>
 *     &lt;enumeration value="MNGED_NODES_ENERGY_BILL"/>
 *     &lt;enumeration value="IT_EQPMNT_ENERGY"/>
 *     &lt;enumeration value="IT_EQPMNT_ENERGY_BILL"/>
 *     &lt;enumeration value="CALC_COOLING_ENERGY"/>
 *     &lt;enumeration value="CALC_COOLING_ENERGY_BILL"/>
 *     &lt;enumeration value="MNGED_NODES_PWR"/>
 *     &lt;enumeration value="IT_EQPMNT_PWR"/>
 *     &lt;enumeration value="MAX_AVG_IT_EQPMNT_PWR"/>
 *     &lt;enumeration value="CALC_COOLING_PWR"/>
 *     &lt;enumeration value="AVG_PWR_PER_DIMENSION"/>
 *     &lt;enumeration value="DERATED_PWR"/>
 *     &lt;enumeration value="INLET_TEMPERATURE_SPAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "metricType")
@XmlEnum
public enum MetricType {

    MNGED_NODES_ENERGY,
    MNGED_NODES_ENERGY_BILL,
    IT_EQPMNT_ENERGY,
    IT_EQPMNT_ENERGY_BILL,
    CALC_COOLING_ENERGY,
    CALC_COOLING_ENERGY_BILL,
    MNGED_NODES_PWR,
    IT_EQPMNT_PWR,
    MAX_AVG_IT_EQPMNT_PWR,
    CALC_COOLING_PWR,
    AVG_PWR_PER_DIMENSION,
    DERATED_PWR,
    INLET_TEMPERATURE_SPAN;

    public String value() {
        return name();
    }

    public static MetricType fromValue(String v) {
        return valueOf(v);
    }

}
