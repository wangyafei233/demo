
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for realTimePduData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realTimePduData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="humiditySensorReading" type="{http://wsdl.intf.dcm.intel.com/}pduSensorData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outletData" type="{http://wsdl.intf.dcm.intel.com/}pduOutletData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outletNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phaseData" type="{http://wsdl.intf.dcm.intel.com/}pduPhaseData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="powerUnitDivisor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperatureSensorReading" type="{http://wsdl.intf.dcm.intel.com/}pduSensorData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realTimePduData", propOrder = {
    "humiditySensorReading",
    "outletData",
    "outletNumber",
    "phaseData",
    "power",
    "powerUnitDivisor",
    "temperatureSensorReading",
    "time"
})
public class RealTimePduData {

    @XmlElement(nillable = true)
    protected List<PduSensorData> humiditySensorReading;
    @XmlElement(nillable = true)
    protected List<PduOutletData> outletData;
    protected int outletNumber;
    @XmlElement(nillable = true)
    protected List<PduPhaseData> phaseData;
    protected int power;
    protected int powerUnitDivisor;
    @XmlElement(nillable = true)
    protected List<PduSensorData> temperatureSensorReading;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the humiditySensorReading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humiditySensorReading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumiditySensorReading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PduSensorData }
     * 
     * 
     */
    public List<PduSensorData> getHumiditySensorReading() {
        if (humiditySensorReading == null) {
            humiditySensorReading = new ArrayList<PduSensorData>();
        }
        return this.humiditySensorReading;
    }

    /**
     * Gets the value of the outletData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outletData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutletData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PduOutletData }
     * 
     * 
     */
    public List<PduOutletData> getOutletData() {
        if (outletData == null) {
            outletData = new ArrayList<PduOutletData>();
        }
        return this.outletData;
    }

    /**
     * Gets the value of the outletNumber property.
     * 
     */
    public int getOutletNumber() {
        return outletNumber;
    }

    /**
     * Sets the value of the outletNumber property.
     * 
     */
    public void setOutletNumber(int value) {
        this.outletNumber = value;
    }

    /**
     * Gets the value of the phaseData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phaseData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhaseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PduPhaseData }
     * 
     * 
     */
    public List<PduPhaseData> getPhaseData() {
        if (phaseData == null) {
            phaseData = new ArrayList<PduPhaseData>();
        }
        return this.phaseData;
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
     * Gets the value of the powerUnitDivisor property.
     * 
     */
    public int getPowerUnitDivisor() {
        return powerUnitDivisor;
    }

    /**
     * Sets the value of the powerUnitDivisor property.
     * 
     */
    public void setPowerUnitDivisor(int value) {
        this.powerUnitDivisor = value;
    }

    /**
     * Gets the value of the temperatureSensorReading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureSensorReading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatureSensorReading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PduSensorData }
     * 
     * 
     */
    public List<PduSensorData> getTemperatureSensorReading() {
        if (temperatureSensorReading == null) {
            temperatureSensorReading = new ArrayList<PduSensorData>();
        }
        return this.temperatureSensorReading;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
