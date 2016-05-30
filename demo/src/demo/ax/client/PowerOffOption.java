
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerOffOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="powerOffOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOFT_OFF"/>
 *     &lt;enumeration value="HARD_OFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "powerOffOption")
@XmlEnum
public enum PowerOffOption {

    SOFT_OFF,
    HARD_OFF;

    public String value() {
        return name();
    }

    public static PowerOffOption fromValue(String v) {
        return valueOf(v);
    }

}
