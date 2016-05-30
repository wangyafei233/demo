
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadfactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadfactors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPUVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MemVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StorageVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NetVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadfactors", propOrder = {
    "cpuVal",
    "memVal",
    "storageVal",
    "netVal"
})
public class Loadfactors {

    @XmlElement(name = "CPUVal")
    protected int cpuVal;
    @XmlElement(name = "MemVal")
    protected int memVal;
    @XmlElement(name = "StorageVal")
    protected int storageVal;
    @XmlElement(name = "NetVal")
    protected int netVal;

    /**
     * Gets the value of the cpuVal property.
     * 
     */
    public int getCPUVal() {
        return cpuVal;
    }

    /**
     * Sets the value of the cpuVal property.
     * 
     */
    public void setCPUVal(int value) {
        this.cpuVal = value;
    }

    /**
     * Gets the value of the memVal property.
     * 
     */
    public int getMemVal() {
        return memVal;
    }

    /**
     * Sets the value of the memVal property.
     * 
     */
    public void setMemVal(int value) {
        this.memVal = value;
    }

    /**
     * Gets the value of the storageVal property.
     * 
     */
    public int getStorageVal() {
        return storageVal;
    }

    /**
     * Sets the value of the storageVal property.
     * 
     */
    public void setStorageVal(int value) {
        this.storageVal = value;
    }

    /**
     * Gets the value of the netVal property.
     * 
     */
    public int getNetVal() {
        return netVal;
    }

    /**
     * Sets the value of the netVal property.
     * 
     */
    public void setNetVal(int value) {
        this.netVal = value;
    }

}
