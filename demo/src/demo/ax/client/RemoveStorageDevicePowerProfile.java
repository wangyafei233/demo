
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeStorageDevicePowerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeStorageDevicePowerProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeStorageDevicePowerProfile", propOrder = {
    "profileId"
})
public class RemoveStorageDevicePowerProfile {

    protected int profileId;

    /**
     * Gets the value of the profileId property.
     * 
     */
    public int getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     */
    public void setProfileId(int value) {
        this.profileId = value;
    }

}
