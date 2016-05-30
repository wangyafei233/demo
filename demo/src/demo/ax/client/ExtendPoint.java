
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extendPoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extendPoint">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NODE_MGMT"/>
 *     &lt;enumeration value="ENCLOSURE_MGMT"/>
 *     &lt;enumeration value="DCM_SERVER_MGMT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extendPoint")
@XmlEnum
public enum ExtendPoint {

    NODE_MGMT,
    ENCLOSURE_MGMT,
    DCM_SERVER_MGMT;

    public String value() {
        return name();
    }

    public static ExtendPoint fromValue(String v) {
        return valueOf(v);
    }

}
