
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="evalPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="notificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateNotification", propOrder = {
    "notificationId",
    "threshold",
    "evalPeriod",
    "notificationDescription"
})
public class UpdateNotification {

    protected int notificationId;
    protected int threshold;
    protected int evalPeriod;
    protected String notificationDescription;

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
     * Gets the value of the threshold property.
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the evalPeriod property.
     * 
     */
    public int getEvalPeriod() {
        return evalPeriod;
    }

    /**
     * Sets the value of the evalPeriod property.
     * 
     */
    public void setEvalPeriod(int value) {
        this.evalPeriod = value;
    }

    /**
     * Gets the value of the notificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationDescription() {
        return notificationDescription;
    }

    /**
     * Sets the value of the notificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationDescription(String value) {
        this.notificationDescription = value;
    }

}
