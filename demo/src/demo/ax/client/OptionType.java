
package demo.ax.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for optionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="optionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESS_MODE"/>
 *     &lt;enumeration value="MANDATORY"/>
 *     &lt;enumeration value="HIDDEN"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="SELECTION"/>
 *     &lt;enumeration value="UNIQUE"/>
 *     &lt;enumeration value="INTERNAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "optionType")
@XmlEnum
public enum OptionType {

    ACCESS_MODE,
    MANDATORY,
    HIDDEN,
    DEFAULT,
    SELECTION,
    UNIQUE,
    INTERNAL;

    public String value() {
        return name();
    }

    public static OptionType fromValue(String v) {
        return valueOf(v);
    }

}
