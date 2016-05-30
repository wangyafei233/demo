
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerDistributionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerDistributionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerbound" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="proportion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="upperbound" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powerDistributionData", propOrder = {
    "lowerbound",
    "proportion",
    "upperbound"
})
public class PowerDistributionData {

    protected long lowerbound;
    protected double proportion;
    protected long upperbound;

    /**
     * Gets the value of the lowerbound property.
     * 
     */
    public long getLowerbound() {
        return lowerbound;
    }

    /**
     * Sets the value of the lowerbound property.
     * 
     */
    public void setLowerbound(long value) {
        this.lowerbound = value;
    }

    /**
     * Gets the value of the proportion property.
     * 
     */
    public double getProportion() {
        return proportion;
    }

    /**
     * Sets the value of the proportion property.
     * 
     */
    public void setProportion(double value) {
        this.proportion = value;
    }

    /**
     * Gets the value of the upperbound property.
     * 
     */
    public long getUpperbound() {
        return upperbound;
    }

    /**
     * Sets the value of the upperbound property.
     * 
     */
    public void setUpperbound(long value) {
        this.upperbound = value;
    }

}
