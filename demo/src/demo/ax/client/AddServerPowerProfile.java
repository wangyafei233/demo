
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addServerPowerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addServerPowerProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverPowerProfile" type="{http://wsdl.intf.dcm.intel.com/}serverPowerProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addServerPowerProfile", propOrder = {
    "serverPowerProfile"
})
public class AddServerPowerProfile {

    protected ServerPowerProfile serverPowerProfile;

    /**
     * Gets the value of the serverPowerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ServerPowerProfile }
     *     
     */
    public ServerPowerProfile getServerPowerProfile() {
        return serverPowerProfile;
    }

    /**
     * Sets the value of the serverPowerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerPowerProfile }
     *     
     */
    public void setServerPowerProfile(ServerPowerProfile value) {
        this.serverPowerProfile = value;
    }

}
