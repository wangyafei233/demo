
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IPMI"/>
 *     &lt;enumeration value="SNMPv1v2c"/>
 *     &lt;enumeration value="SNMPv3"/>
 *     &lt;enumeration value="WS_MAN"/>
 *     &lt;enumeration value="SSH"/>
 *     &lt;enumeration value="INBAND_PROTOCOL"/>
 *     &lt;enumeration value="HTTPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "protocolType")
@XmlEnum
public enum ProtocolType {

    IPMI("IPMI"),
    @XmlEnumValue("SNMPv1v2c")
    SNM_PV_1_V_2_C("SNMPv1v2c"),
    @XmlEnumValue("SNMPv3")
    SNM_PV_3("SNMPv3"),
    WS_MAN("WS_MAN"),
    SSH("SSH"),
    INBAND_PROTOCOL("INBAND_PROTOCOL"),
    HTTPS("HTTPS");
    private final String value;

    ProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolType fromValue(String v) {
        for (ProtocolType c: ProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
