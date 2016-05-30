
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEventHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEventHandler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="handlerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEventHandler", propOrder = {
    "handlerId"
})
public class GetEventHandler {

    protected int handlerId;

    /**
     * Gets the value of the handlerId property.
     * 
     */
    public int getHandlerId() {
        return handlerId;
    }

    /**
     * Sets the value of the handlerId property.
     * 
     */
    public void setHandlerId(int value) {
        this.handlerId = value;
    }

}
