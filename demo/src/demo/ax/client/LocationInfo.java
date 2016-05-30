
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aisleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rackName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chassisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rackSlot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationInfo", propOrder = {
    "dataCenterName",
    "roomName",
    "aisleName",
    "rackName",
    "chassisName",
    "rackSlot"
})
public class LocationInfo {

    protected String dataCenterName;
    protected String roomName;
    protected String aisleName;
    protected String rackName;
    protected String chassisName;
    protected int rackSlot;

    /**
     * Gets the value of the dataCenterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCenterName() {
        return dataCenterName;
    }

    /**
     * Sets the value of the dataCenterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCenterName(String value) {
        this.dataCenterName = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the aisleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAisleName() {
        return aisleName;
    }

    /**
     * Sets the value of the aisleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAisleName(String value) {
        this.aisleName = value;
    }

    /**
     * Gets the value of the rackName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRackName() {
        return rackName;
    }

    /**
     * Sets the value of the rackName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRackName(String value) {
        this.rackName = value;
    }

    /**
     * Gets the value of the chassisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisName() {
        return chassisName;
    }

    /**
     * Sets the value of the chassisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisName(String value) {
        this.chassisName = value;
    }

    /**
     * Gets the value of the rackSlot property.
     * 
     */
    public int getRackSlot() {
        return rackSlot;
    }

    /**
     * Sets the value of the rackSlot property.
     * 
     */
    public void setRackSlot(int value) {
        this.rackSlot = value;
    }

}
