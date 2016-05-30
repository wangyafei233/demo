
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setNotificationState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setNotificationState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setNotificationState", propOrder = {
    "notificationId",
    "enable"
})
public class SetNotificationState {

    protected int notificationId;
    protected boolean enable;

    /**
     * Gets the value of the notificationId property.
     * 
     */
    public int getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     */
    public void setNotificationId(int value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the enable property.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Sets the value of the enable property.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

}
