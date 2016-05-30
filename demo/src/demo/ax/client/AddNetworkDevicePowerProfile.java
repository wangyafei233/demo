
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addNetworkDevicePowerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNetworkDevicePowerProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkDevicePowerProfile" type="{http://wsdl.intf.dcm.intel.com/}networkDevicePowerProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNetworkDevicePowerProfile", propOrder = {
    "networkDevicePowerProfile"
})
public class AddNetworkDevicePowerProfile {

    protected NetworkDevicePowerProfile networkDevicePowerProfile;

    /**
     * Gets the value of the networkDevicePowerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkDevicePowerProfile }
     *     
     */
    public NetworkDevicePowerProfile getNetworkDevicePowerProfile() {
        return networkDevicePowerProfile;
    }

    /**
     * Sets the value of the networkDevicePowerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkDevicePowerProfile }
     *     
     */
    public void setNetworkDevicePowerProfile(NetworkDevicePowerProfile value) {
        this.networkDevicePowerProfile = value;
    }

}
