
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realTimeUpsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realTimeUpsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bypassTable" type="{http://wsdl.intf.dcm.intel.com/}upsBypassEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inputTable" type="{http://wsdl.intf.dcm.intel.com/}upsInputEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputTable" type="{http://wsdl.intf.dcm.intel.com/}upsOutputEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UPSBypassFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UPSEstimatedChargeRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UPSEstimatedMinutesRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UPSOutputFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UPSOutputSource" type="{http://wsdl.intf.dcm.intel.com/}upsOutputSource" minOccurs="0"/>
 *         &lt;element name="UPSSecondsOnBattery" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upsBatterytemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upsMaxLoad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realTimeUpsData", propOrder = {
    "bypassTable",
    "inputTable",
    "outputTable",
    "upsBypassFrequency",
    "upsEstimatedChargeRemaining",
    "upsEstimatedMinutesRemaining",
    "upsOutputFrequency",
    "upsOutputSource",
    "upsSecondsOnBattery",
    "upsBatterytemperature",
    "upsMaxLoad"
})
public class RealTimeUpsData {

    @XmlElement(nillable = true)
    protected List<UpsBypassEntry> bypassTable;
    @XmlElement(nillable = true)
    protected List<UpsInputEntry> inputTable;
    @XmlElement(nillable = true)
    protected List<UpsOutputEntry> outputTable;
    @XmlElement(name = "UPSBypassFrequency")
    protected int upsBypassFrequency;
    @XmlElement(name = "UPSEstimatedChargeRemaining")
    protected int upsEstimatedChargeRemaining;
    @XmlElement(name = "UPSEstimatedMinutesRemaining")
    protected int upsEstimatedMinutesRemaining;
    @XmlElement(name = "UPSOutputFrequency")
    protected int upsOutputFrequency;
    @XmlElement(name = "UPSOutputSource")
    protected UpsOutputSource upsOutputSource;
    @XmlElement(name = "UPSSecondsOnBattery")
    protected int upsSecondsOnBattery;
    protected int upsBatterytemperature;
    protected int upsMaxLoad;

    /**
     * Gets the value of the bypassTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bypassTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBypassTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpsBypassEntry }
     * 
     * 
     */
    public List<UpsBypassEntry> getBypassTable() {
        if (bypassTable == null) {
            bypassTable = new ArrayList<UpsBypassEntry>();
        }
        return this.bypassTable;
    }

    /**
     * Gets the value of the inputTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpsInputEntry }
     * 
     * 
     */
    public List<UpsInputEntry> getInputTable() {
        if (inputTable == null) {
            inputTable = new ArrayList<UpsInputEntry>();
        }
        return this.inputTable;
    }

    /**
     * Gets the value of the outputTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpsOutputEntry }
     * 
     * 
     */
    public List<UpsOutputEntry> getOutputTable() {
        if (outputTable == null) {
            outputTable = new ArrayList<UpsOutputEntry>();
        }
        return this.outputTable;
    }

    /**
     * Gets the value of the upsBypassFrequency property.
     * 
     */
    public int getUPSBypassFrequency() {
        return upsBypassFrequency;
    }

    /**
     * Sets the value of the upsBypassFrequency property.
     * 
     */
    public void setUPSBypassFrequency(int value) {
        this.upsBypassFrequency = value;
    }

    /**
     * Gets the value of the upsEstimatedChargeRemaining property.
     * 
     */
    public int getUPSEstimatedChargeRemaining() {
        return upsEstimatedChargeRemaining;
    }

    /**
     * Sets the value of the upsEstimatedChargeRemaining property.
     * 
     */
    public void setUPSEstimatedChargeRemaining(int value) {
        this.upsEstimatedChargeRemaining = value;
    }

    /**
     * Gets the value of the upsEstimatedMinutesRemaining property.
     * 
     */
    public int getUPSEstimatedMinutesRemaining() {
        return upsEstimatedMinutesRemaining;
    }

    /**
     * Sets the value of the upsEstimatedMinutesRemaining property.
     * 
     */
    public void setUPSEstimatedMinutesRemaining(int value) {
        this.upsEstimatedMinutesRemaining = value;
    }

    /**
     * Gets the value of the upsOutputFrequency property.
     * 
     */
    public int getUPSOutputFrequency() {
        return upsOutputFrequency;
    }

    /**
     * Sets the value of the upsOutputFrequency property.
     * 
     */
    public void setUPSOutputFrequency(int value) {
        this.upsOutputFrequency = value;
    }

    /**
     * Gets the value of the upsOutputSource property.
     * 
     * @return
     *     possible object is
     *     {@link UpsOutputSource }
     *     
     */
    public UpsOutputSource getUPSOutputSource() {
        return upsOutputSource;
    }

    /**
     * Sets the value of the upsOutputSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpsOutputSource }
     *     
     */
    public void setUPSOutputSource(UpsOutputSource value) {
        this.upsOutputSource = value;
    }

    /**
     * Gets the value of the upsSecondsOnBattery property.
     * 
     */
    public int getUPSSecondsOnBattery() {
        return upsSecondsOnBattery;
    }

    /**
     * Sets the value of the upsSecondsOnBattery property.
     * 
     */
    public void setUPSSecondsOnBattery(int value) {
        this.upsSecondsOnBattery = value;
    }

    /**
     * Gets the value of the upsBatterytemperature property.
     * 
     */
    public int getUpsBatterytemperature() {
        return upsBatterytemperature;
    }

    /**
     * Sets the value of the upsBatterytemperature property.
     * 
     */
    public void setUpsBatterytemperature(int value) {
        this.upsBatterytemperature = value;
    }

    /**
     * Gets the value of the upsMaxLoad property.
     * 
     */
    public int getUpsMaxLoad() {
        return upsMaxLoad;
    }

    /**
     * Sets the value of the upsMaxLoad property.
     * 
     */
    public void setUpsMaxLoad(int value) {
        this.upsMaxLoad = value;
    }

}
