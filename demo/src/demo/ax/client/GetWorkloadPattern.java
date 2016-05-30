
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWorkloadPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWorkloadPattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aggPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWorkloadPattern", propOrder = {
    "serverId",
    "aggPeriod"
})
public class GetWorkloadPattern {

    protected int serverId;
    protected int aggPeriod;

    /**
     * Gets the value of the serverId property.
     * 
     */
    public int getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     */
    public void setServerId(int value) {
        this.serverId = value;
    }

    /**
     * Gets the value of the aggPeriod property.
     * 
     */
    public int getAggPeriod() {
        return aggPeriod;
    }

    /**
     * Sets the value of the aggPeriod property.
     * 
     */
    public void setAggPeriod(int value) {
        this.aggPeriod = value;
    }

}
