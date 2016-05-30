
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for upsOutputSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="upsOutputSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="BYPASS"/>
 *     &lt;enumeration value="BATTERY"/>
 *     &lt;enumeration value="BOOSTER"/>
 *     &lt;enumeration value="REDUCER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "upsOutputSource")
@XmlEnum
public enum UpsOutputSource {

    OTHER,
    NONE,
    NORMAL,
    BYPASS,
    BATTERY,
    BOOSTER,
    REDUCER;

    public String value() {
        return name();
    }

    public static UpsOutputSource fromValue(String v) {
        return valueOf(v);
    }

}
