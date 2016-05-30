
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pduPhaseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pduPhaseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="load" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phaseLoadUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phaseVoltageUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "pduPhaseData", propOrder = {
    "load",
    "phaseLoadUnitDivisor",
    "phaseVoltageUnitDivisor",
    "voltage"
})
public class PduPhaseData {

    protected int load;
    protected int phaseLoadUnitDivisor;
    protected int phaseVoltageUnitDivisor;
    protected int voltage;

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
     * Gets the value of the phaseLoadUnitDivisor property.
     * 
     */
    public int getPhaseLoadUnitDivisor() {
        return phaseLoadUnitDivisor;
    }

    /**
     * Sets the value of the phaseLoadUnitDivisor property.
     * 
     */
    public void setPhaseLoadUnitDivisor(int value) {
        this.phaseLoadUnitDivisor = value;
    }

    /**
     * Gets the value of the phaseVoltageUnitDivisor property.
     * 
     */
    public int getPhaseVoltageUnitDivisor() {
        return phaseVoltageUnitDivisor;
    }

    /**
     * Sets the value of the phaseVoltageUnitDivisor property.
     * 
     */
    public void setPhaseVoltageUnitDivisor(int value) {
        this.phaseVoltageUnitDivisor = value;
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
