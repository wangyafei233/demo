
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bladeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bladeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slotName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MACAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dnsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterSlotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="slotNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subSlotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distinguishedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bladeInfo", propOrder = {
    "serviceTag",
    "generation",
    "slotName",
    "ipAddress",
    "macAddress",
    "model",
    "hostName",
    "dnsName",
    "masterSlotNumber",
    "slotNumber",
    "subSlotNumber",
    "distinguishedName",
    "nodeID"
})
public class BladeInfo {

    protected String serviceTag;
    protected String generation;
    protected String slotName;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "MACAddress")
    protected String macAddress;
    protected String model;
    protected String hostName;
    protected String dnsName;
    protected int masterSlotNumber;
    @XmlElement(nillable = true)
    protected List<Integer> slotNumber;
    protected String subSlotNumber;
    protected String distinguishedName;
    protected String nodeID;

    /**
     * Gets the value of the serviceTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTag() {
        return serviceTag;
    }

    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneration(String value) {
        this.generation = value;
    }

    /**
     * Gets the value of the slotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotName() {
        return slotName;
    }

    /**
     * Sets the value of the slotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotName(String value) {
        this.slotName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the dnsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnsName() {
        return dnsName;
    }

    /**
     * Sets the value of the dnsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnsName(String value) {
        this.dnsName = value;
    }

    /**
     * Gets the value of the masterSlotNumber property.
     * 
     */
    public int getMasterSlotNumber() {
        return masterSlotNumber;
    }

    /**
     * Sets the value of the masterSlotNumber property.
     * 
     */
    public void setMasterSlotNumber(int value) {
        this.masterSlotNumber = value;
    }

    /**
     * Gets the value of the slotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSlotNumber() {
        if (slotNumber == null) {
            slotNumber = new ArrayList<Integer>();
        }
        return this.slotNumber;
    }

    /**
     * Gets the value of the subSlotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSlotNumber() {
        return subSlotNumber;
    }

    /**
     * Sets the value of the subSlotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSlotNumber(String value) {
        this.subSlotNumber = value;
    }

    /**
     * Gets the value of the distinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     * Sets the value of the distinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinguishedName(String value) {
        this.distinguishedName = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

}
