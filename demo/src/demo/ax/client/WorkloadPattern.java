
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workloadPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workloadPattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="avgCPUUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="avgIOUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="avgMemoryUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workloadPattern", propOrder = {
    "avgCPUUsed",
    "avgIOUsed",
    "avgMemoryUsed"
})
public class WorkloadPattern {

    protected int avgCPUUsed;
    protected int avgIOUsed;
    protected int avgMemoryUsed;

    /**
     * Gets the value of the avgCPUUsed property.
     * 
     */
    public int getAvgCPUUsed() {
        return avgCPUUsed;
    }

    /**
     * Sets the value of the avgCPUUsed property.
     * 
     */
    public void setAvgCPUUsed(int value) {
        this.avgCPUUsed = value;
    }

    /**
     * Gets the value of the avgIOUsed property.
     * 
     */
    public int getAvgIOUsed() {
        return avgIOUsed;
    }

    /**
     * Sets the value of the avgIOUsed property.
     * 
     */
    public void setAvgIOUsed(int value) {
        this.avgIOUsed = value;
    }

    /**
     * Gets the value of the avgMemoryUsed property.
     * 
     */
    public int getAvgMemoryUsed() {
        return avgMemoryUsed;
    }

    /**
     * Sets the value of the avgMemoryUsed property.
     * 
     */
    public void setAvgMemoryUsed(int value) {
        this.avgMemoryUsed = value;
    }

}
