
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
 * <p>Java class for sensorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpuTempMarginSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cpuTempSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iohTempMarginSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iohTempSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memTempMarginSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memTempSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outletTempSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pchTempSensorData" type="{http://wsdl.intf.dcm.intel.com/}sensorRawData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "sensorData", propOrder = {
    "cpuTempMarginSensorData",
    "cpuTempSensorData",
    "iohTempMarginSensorData",
    "iohTempSensorData",
    "memTempMarginSensorData",
    "memTempSensorData",
    "outletTempSensorData",
    "pchTempSensorData",
    "period",
    "time"
})
public class SensorData {

    @XmlElement(nillable = true)
    protected List<SensorRawData> cpuTempMarginSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> cpuTempSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> iohTempMarginSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> iohTempSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> memTempMarginSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> memTempSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> outletTempSensorData;
    @XmlElement(nillable = true)
    protected List<SensorRawData> pchTempSensorData;
    protected int period;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the cpuTempMarginSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuTempMarginSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpuTempMarginSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getCpuTempMarginSensorData() {
        if (cpuTempMarginSensorData == null) {
            cpuTempMarginSensorData = new ArrayList<SensorRawData>();
        }
        return this.cpuTempMarginSensorData;
    }

    /**
     * Gets the value of the cpuTempSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuTempSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpuTempSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getCpuTempSensorData() {
        if (cpuTempSensorData == null) {
            cpuTempSensorData = new ArrayList<SensorRawData>();
        }
        return this.cpuTempSensorData;
    }

    /**
     * Gets the value of the iohTempMarginSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iohTempMarginSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIohTempMarginSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getIohTempMarginSensorData() {
        if (iohTempMarginSensorData == null) {
            iohTempMarginSensorData = new ArrayList<SensorRawData>();
        }
        return this.iohTempMarginSensorData;
    }

    /**
     * Gets the value of the iohTempSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iohTempSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIohTempSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getIohTempSensorData() {
        if (iohTempSensorData == null) {
            iohTempSensorData = new ArrayList<SensorRawData>();
        }
        return this.iohTempSensorData;
    }

    /**
     * Gets the value of the memTempMarginSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memTempMarginSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemTempMarginSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getMemTempMarginSensorData() {
        if (memTempMarginSensorData == null) {
            memTempMarginSensorData = new ArrayList<SensorRawData>();
        }
        return this.memTempMarginSensorData;
    }

    /**
     * Gets the value of the memTempSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memTempSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemTempSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getMemTempSensorData() {
        if (memTempSensorData == null) {
            memTempSensorData = new ArrayList<SensorRawData>();
        }
        return this.memTempSensorData;
    }

    /**
     * Gets the value of the outletTempSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outletTempSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutletTempSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getOutletTempSensorData() {
        if (outletTempSensorData == null) {
            outletTempSensorData = new ArrayList<SensorRawData>();
        }
        return this.outletTempSensorData;
    }

    /**
     * Gets the value of the pchTempSensorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pchTempSensorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPchTempSensorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorRawData }
     * 
     * 
     */
    public List<SensorRawData> getPchTempSensorData() {
        if (pchTempSensorData == null) {
            pchTempSensorData = new ArrayList<SensorRawData>();
        }
        return this.pchTempSensorData;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
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
