
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staticCUPSData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staticCUPSData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPUCores_Threads" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CPUClockSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BaselineAvgCPUUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxCPU" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TotalMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BaselineAvgMemUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxMemory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BaselineAvgDiskUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxDisk" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BaselineAvgNetUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MaxNetwork" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staticCUPSData", propOrder = {
    "cpuCoresThreads",
    "cpuClockSpeed",
    "baselineAvgCPUUsed",
    "maxCPU",
    "totalMemory",
    "baselineAvgMemUsed",
    "maxMemory",
    "baselineAvgDiskUsed",
    "maxDisk",
    "baselineAvgNetUsed",
    "maxNetwork"
})
public class StaticCUPSData {

    @XmlElement(name = "CPUCores_Threads")
    protected int cpuCoresThreads;
    @XmlElement(name = "CPUClockSpeed")
    protected int cpuClockSpeed;
    @XmlElement(name = "BaselineAvgCPUUsed")
    protected long baselineAvgCPUUsed;
    @XmlElement(name = "MaxCPU")
    protected long maxCPU;
    @XmlElement(name = "TotalMemory")
    protected long totalMemory;
    @XmlElement(name = "BaselineAvgMemUsed")
    protected long baselineAvgMemUsed;
    @XmlElement(name = "MaxMemory")
    protected long maxMemory;
    @XmlElement(name = "BaselineAvgDiskUsed")
    protected long baselineAvgDiskUsed;
    @XmlElement(name = "MaxDisk")
    protected long maxDisk;
    @XmlElement(name = "BaselineAvgNetUsed")
    protected long baselineAvgNetUsed;
    @XmlElement(name = "MaxNetwork")
    protected long maxNetwork;

    /**
     * Gets the value of the cpuCoresThreads property.
     * 
     */
    public int getCPUCoresThreads() {
        return cpuCoresThreads;
    }

    /**
     * Sets the value of the cpuCoresThreads property.
     * 
     */
    public void setCPUCoresThreads(int value) {
        this.cpuCoresThreads = value;
    }

    /**
     * Gets the value of the cpuClockSpeed property.
     * 
     */
    public int getCPUClockSpeed() {
        return cpuClockSpeed;
    }

    /**
     * Sets the value of the cpuClockSpeed property.
     * 
     */
    public void setCPUClockSpeed(int value) {
        this.cpuClockSpeed = value;
    }

    /**
     * Gets the value of the baselineAvgCPUUsed property.
     * 
     */
    public long getBaselineAvgCPUUsed() {
        return baselineAvgCPUUsed;
    }

    /**
     * Sets the value of the baselineAvgCPUUsed property.
     * 
     */
    public void setBaselineAvgCPUUsed(long value) {
        this.baselineAvgCPUUsed = value;
    }

    /**
     * Gets the value of the maxCPU property.
     * 
     */
    public long getMaxCPU() {
        return maxCPU;
    }

    /**
     * Sets the value of the maxCPU property.
     * 
     */
    public void setMaxCPU(long value) {
        this.maxCPU = value;
    }

    /**
     * Gets the value of the totalMemory property.
     * 
     */
    public long getTotalMemory() {
        return totalMemory;
    }

    /**
     * Sets the value of the totalMemory property.
     * 
     */
    public void setTotalMemory(long value) {
        this.totalMemory = value;
    }

    /**
     * Gets the value of the baselineAvgMemUsed property.
     * 
     */
    public long getBaselineAvgMemUsed() {
        return baselineAvgMemUsed;
    }

    /**
     * Sets the value of the baselineAvgMemUsed property.
     * 
     */
    public void setBaselineAvgMemUsed(long value) {
        this.baselineAvgMemUsed = value;
    }

    /**
     * Gets the value of the maxMemory property.
     * 
     */
    public long getMaxMemory() {
        return maxMemory;
    }

    /**
     * Sets the value of the maxMemory property.
     * 
     */
    public void setMaxMemory(long value) {
        this.maxMemory = value;
    }

    /**
     * Gets the value of the baselineAvgDiskUsed property.
     * 
     */
    public long getBaselineAvgDiskUsed() {
        return baselineAvgDiskUsed;
    }

    /**
     * Sets the value of the baselineAvgDiskUsed property.
     * 
     */
    public void setBaselineAvgDiskUsed(long value) {
        this.baselineAvgDiskUsed = value;
    }

    /**
     * Gets the value of the maxDisk property.
     * 
     */
    public long getMaxDisk() {
        return maxDisk;
    }

    /**
     * Sets the value of the maxDisk property.
     * 
     */
    public void setMaxDisk(long value) {
        this.maxDisk = value;
    }

    /**
     * Gets the value of the baselineAvgNetUsed property.
     * 
     */
    public long getBaselineAvgNetUsed() {
        return baselineAvgNetUsed;
    }

    /**
     * Sets the value of the baselineAvgNetUsed property.
     * 
     */
    public void setBaselineAvgNetUsed(long value) {
        this.baselineAvgNetUsed = value;
    }

    /**
     * Gets the value of the maxNetwork property.
     * 
     */
    public long getMaxNetwork() {
        return maxNetwork;
    }

    /**
     * Sets the value of the maxNetwork property.
     * 
     */
    public void setMaxNetwork(long value) {
        this.maxNetwork = value;
    }

}
