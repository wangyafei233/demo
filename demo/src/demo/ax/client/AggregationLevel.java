
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aggregationLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="aggregationLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SELF"/>
 *     &lt;enumeration value="NODE"/>
 *     &lt;enumeration value="ENCLOSURE"/>
 *     &lt;enumeration value="RACK"/>
 *     &lt;enumeration value="ROW"/>
 *     &lt;enumeration value="ROOM"/>
 *     &lt;enumeration value="DATACENTER"/>
 *     &lt;enumeration value="DCM_SERVER"/>
 *     &lt;enumeration value="IMMEDIATE_CHILDREN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "aggregationLevel")
@XmlEnum
public enum AggregationLevel {

    SELF,
    NODE,
    ENCLOSURE,
    RACK,
    ROW,
    ROOM,
    DATACENTER,
    DCM_SERVER,
    IMMEDIATE_CHILDREN;

    public String value() {
        return name();
    }

    public static AggregationLevel fromValue(String v) {
        return valueOf(v);
    }

}
