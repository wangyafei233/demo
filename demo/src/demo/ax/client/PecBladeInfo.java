
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pecBladeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pecBladeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chassisServiceTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pecBladeInfo", propOrder = {
    "slotNumber",
    "chassisServiceTag"
})
public class PecBladeInfo {

    protected int slotNumber;
    protected String chassisServiceTag;

    /**
     * Gets the value of the slotNumber property.
     * 
     */
    public int getSlotNumber() {
        return slotNumber;
    }

    /**
     * Sets the value of the slotNumber property.
     * 
     */
    public void setSlotNumber(int value) {
        this.slotNumber = value;
    }

    /**
     * Gets the value of the chassisServiceTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisServiceTag() {
        return chassisServiceTag;
    }

    /**
     * Sets the value of the chassisServiceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisServiceTag(String value) {
        this.chassisServiceTag = value;
    }

}
