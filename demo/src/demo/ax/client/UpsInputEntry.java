
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for upsInputEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upsInputEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="voltage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upsInputEntry", propOrder = {
    "current",
    "frequency",
    "index",
    "power",
    "voltage"
})
public class UpsInputEntry {

    protected int current;
    protected int frequency;
    protected int index;
    protected int power;
    protected int voltage;

    /**
     * Gets the value of the current property.
     * 
     */
    public int getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(int value) {
        this.current = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(int value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the power property.
     * 
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     */
    public void setPower(int value) {
        this.power = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     */
    public void setVoltage(int value) {
        this.voltage = value;
    }

}
