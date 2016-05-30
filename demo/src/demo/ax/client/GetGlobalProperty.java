
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGlobalProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGlobalProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://wsdl.intf.dcm.intel.com/}globalProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGlobalProperty", propOrder = {
    "property"
})
public class GetGlobalProperty {

    protected GlobalProperty property;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalProperty }
     *     
     */
    public GlobalProperty getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalProperty }
     *     
     */
    public void setProperty(GlobalProperty value) {
        this.property = value;
    }

}
