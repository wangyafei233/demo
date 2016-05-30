
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverPowerProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverPowerProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chips" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cpuDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpuFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idlePower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peakPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="threads" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverPowerProfile", propOrder = {
    "chips",
    "cores",
    "cpuDescription",
    "cpuFrequency",
    "id",
    "idlePower",
    "memory",
    "model",
    "nodes",
    "peakPower",
    "threads",
    "vendor"
})
public class ServerPowerProfile {

    protected int chips;
    protected int cores;
    protected String cpuDescription;
    protected int cpuFrequency;
    protected int id;
    protected int idlePower;
    protected int memory;
    protected String model;
    protected int nodes;
    protected int peakPower;
    protected int threads;
    protected String vendor;

    /**
     * Gets the value of the chips property.
     * 
     */
    public int getChips() {
        return chips;
    }

    /**
     * Sets the value of the chips property.
     * 
     */
    public void setChips(int value) {
        this.chips = value;
    }

    /**
     * Gets the value of the cores property.
     * 
     */
    public int getCores() {
        return cores;
    }

    /**
     * Sets the value of the cores property.
     * 
     */
    public void setCores(int value) {
        this.cores = value;
    }

    /**
     * Gets the value of the cpuDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpuDescription() {
        return cpuDescription;
    }

    /**
     * Sets the value of the cpuDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpuDescription(String value) {
        this.cpuDescription = value;
    }

    /**
     * Gets the value of the cpuFrequency property.
     * 
     */
    public int getCpuFrequency() {
        return cpuFrequency;
    }

    /**
     * Sets the value of the cpuFrequency property.
     * 
     */
    public void setCpuFrequency(int value) {
        this.cpuFrequency = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the idlePower property.
     * 
     */
    public int getIdlePower() {
        return idlePower;
    }

    /**
     * Sets the value of the idlePower property.
     * 
     */
    public void setIdlePower(int value) {
        this.idlePower = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     */
    public void setMemory(int value) {
        this.memory = value;
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
     * Gets the value of the nodes property.
     * 
     */
    public int getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     */
    public void setNodes(int value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the peakPower property.
     * 
     */
    public int getPeakPower() {
        return peakPower;
    }

    /**
     * Sets the value of the peakPower property.
     * 
     */
    public void setPeakPower(int value) {
        this.peakPower = value;
    }

    /**
     * Gets the value of the threads property.
     * 
     */
    public int getThreads() {
        return threads;
    }

    /**
     * Sets the value of the threads property.
     * 
     */
    public void setThreads(int value) {
        this.threads = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

}
