
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pduOutletData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pduOutletData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="load" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outletLoadUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outletPowerUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outletVoltageUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "pduOutletData", propOrder = {
    "index",
    "load",
    "outletLoadUnitDivisor",
    "outletPowerUnitDivisor",
    "outletVoltageUnitDivisor",
    "power",
    "state",
    "voltage"
})
public class PduOutletData {

    protected int index;
    protected int load;
    protected int outletLoadUnitDivisor;
    protected int outletPowerUnitDivisor;
    protected int outletVoltageUnitDivisor;
    protected int power;
    protected String state;
    protected int voltage;

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
     * Gets the value of the load property.
     * 
     */
    public int getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     */
    public void setLoad(int value) {
        this.load = value;
    }

    /**
     * Gets the value of the outletLoadUnitDivisor property.
     * 
     */
    public int getOutletLoadUnitDivisor() {
        return outletLoadUnitDivisor;
    }

    /**
     * Sets the value of the outletLoadUnitDivisor property.
     * 
     */
    public void setOutletLoadUnitDivisor(int value) {
        this.outletLoadUnitDivisor = value;
    }

    /**
     * Gets the value of the outletPowerUnitDivisor property.
     * 
     */
    public int getOutletPowerUnitDivisor() {
        return outletPowerUnitDivisor;
    }

    /**
     * Sets the value of the outletPowerUnitDivisor property.
     * 
     */
    public void setOutletPowerUnitDivisor(int value) {
        this.outletPowerUnitDivisor = value;
    }

    /**
     * Gets the value of the outletVoltageUnitDivisor property.
     * 
     */
    public int getOutletVoltageUnitDivisor() {
        return outletVoltageUnitDivisor;
    }

    /**
     * Sets the value of the outletVoltageUnitDivisor property.
     * 
     */
    public void setOutletVoltageUnitDivisor(int value) {
        this.outletVoltageUnitDivisor = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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
