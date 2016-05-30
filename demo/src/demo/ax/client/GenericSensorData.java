
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericSensorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericSensorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sensorEntityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sensorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensorReading" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stateUnavailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sensorType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="readingType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericSensorData", propOrder = {
    "sensorEntityId",
    "sensorName",
    "sensorReading",
    "unit",
    "status",
    "stateUnavailable",
    "sensorType",
    "readingType"
})
public class GenericSensorData {

    protected int sensorEntityId;
    protected String sensorName;
    protected double sensorReading;
    protected String unit;
    protected int status;
    protected boolean stateUnavailable;
    protected int sensorType;
    protected int readingType;

    /**
     * Gets the value of the sensorEntityId property.
     * 
     */
    public int getSensorEntityId() {
        return sensorEntityId;
    }

    /**
     * Sets the value of the sensorEntityId property.
     * 
     */
    public void setSensorEntityId(int value) {
        this.sensorEntityId = value;
    }

    /**
     * Gets the value of the sensorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Sets the value of the sensorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorName(String value) {
        this.sensorName = value;
    }

    /**
     * Gets the value of the sensorReading property.
     * 
     */
    public double getSensorReading() {
        return sensorReading;
    }

    /**
     * Sets the value of the sensorReading property.
     * 
     */
    public void setSensorReading(double value) {
        this.sensorReading = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the stateUnavailable property.
     * 
     */
    public boolean isStateUnavailable() {
        return stateUnavailable;
    }

    /**
     * Sets the value of the stateUnavailable property.
     * 
     */
    public void setStateUnavailable(boolean value) {
        this.stateUnavailable = value;
    }

    /**
     * Gets the value of the sensorType property.
     * 
     */
    public int getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     */
    public void setSensorType(int value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the readingType property.
     * 
     */
    public int getReadingType() {
        return readingType;
    }

    /**
     * Sets the value of the readingType property.
     * 
     */
    public void setReadingType(int value) {
        this.readingType = value;
    }

}
