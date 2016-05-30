
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStorageDevicePowerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStorageDevicePowerProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storageDevicePowerProfile" type="{http://wsdl.intf.dcm.intel.com/}storageDevicePowerProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStorageDevicePowerProfile", propOrder = {
    "storageDevicePowerProfile"
})
public class UpdateStorageDevicePowerProfile {

    protected StorageDevicePowerProfile storageDevicePowerProfile;

    /**
     * Gets the value of the storageDevicePowerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDevicePowerProfile }
     *     
     */
    public StorageDevicePowerProfile getStorageDevicePowerProfile() {
        return storageDevicePowerProfile;
    }

    /**
     * Sets the value of the storageDevicePowerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDevicePowerProfile }
     *     
     */
    public void setStorageDevicePowerProfile(StorageDevicePowerProfile value) {
        this.storageDevicePowerProfile = value;
    }

}
