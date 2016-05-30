
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for discoverEntities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discoverEntities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolType" type="{http://wsdl.intf.dcm.intel.com/}protocolType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://wsdl.intf.dcm.intel.com/}property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discoverEntities", propOrder = {
    "startIP",
    "endIP",
    "netMask",
    "protocolType",
    "properties"
})
public class DiscoverEntities {

    protected String startIP;
    protected String endIP;
    protected String netMask;
    protected ProtocolType protocolType;
    @XmlElement(nillable = true)
    protected List<Property> properties;

    /**
     * Gets the value of the startIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIP() {
        return startIP;
    }

    /**
     * Sets the value of the startIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIP(String value) {
        this.startIP = value;
    }

    /**
     * Gets the value of the endIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIP() {
        return endIP;
    }

    /**
     * Sets the value of the endIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIP(String value) {
        this.endIP = value;
    }

    /**
     * Gets the value of the netMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetMask() {
        return netMask;
    }

    /**
     * Sets the value of the netMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetMask(String value) {
        this.netMask = value;
    }

    /**
     * Gets the value of the protocolType property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolType }
     *     
     */
    public ProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * Sets the value of the protocolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolType }
     *     
     */
    public void setProtocolType(ProtocolType value) {
        this.protocolType = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperties() {
        if (properties == null) {
            properties = new ArrayList<Property>();
        }
        return this.properties;
    }

}
