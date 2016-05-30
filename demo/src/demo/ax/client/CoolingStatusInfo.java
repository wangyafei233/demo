
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coolingStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coolingStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggressiveChillerPowerSavingEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aggressiveChillerPowerSavingPercentageEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aggressiveTemperatureRaise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="benefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chillerPowerEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conservativeChillerPowerSavingEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conservativeChillerPowerSavingPercentageEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conservativeTemperatureRaise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="htaChillerPowerSavingEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="htaChillerPowerSavingPercentageEstimated" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="htaTemperatureRaise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="possibleActions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prominentData" type="{http://wsdl.intf.dcm.intel.com/}ptData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://wsdl.intf.dcm.intel.com/}coolingStatusSeverity" minOccurs="0"/>
 *         &lt;element name="status" type="{http://wsdl.intf.dcm.intel.com/}coolingStatus" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coolingStatusInfo", propOrder = {
    "aggressiveChillerPowerSavingEstimated",
    "aggressiveChillerPowerSavingPercentageEstimated",
    "aggressiveTemperatureRaise",
    "benefits",
    "chillerPowerEstimated",
    "conservativeChillerPowerSavingEstimated",
    "conservativeChillerPowerSavingPercentageEstimated",
    "conservativeTemperatureRaise",
    "htaChillerPowerSavingEstimated",
    "htaChillerPowerSavingPercentageEstimated",
    "htaTemperatureRaise",
    "possibleActions",
    "prominentData",
    "severity",
    "status",
    "statusDescription",
    "suggestion"
})
public class CoolingStatusInfo {

    protected double aggressiveChillerPowerSavingEstimated;
    protected double aggressiveChillerPowerSavingPercentageEstimated;
    protected int aggressiveTemperatureRaise;
    protected String benefits;
    protected double chillerPowerEstimated;
    protected double conservativeChillerPowerSavingEstimated;
    protected double conservativeChillerPowerSavingPercentageEstimated;
    protected int conservativeTemperatureRaise;
    protected double htaChillerPowerSavingEstimated;
    protected double htaChillerPowerSavingPercentageEstimated;
    protected int htaTemperatureRaise;
    protected String possibleActions;
    @XmlElement(nillable = true)
    protected List<PtData> prominentData;
    protected CoolingStatusSeverity severity;
    protected CoolingStatus status;
    protected String statusDescription;
    protected String suggestion;

    /**
     * Gets the value of the aggressiveChillerPowerSavingEstimated property.
     * 
     */
    public double getAggressiveChillerPowerSavingEstimated() {
        return aggressiveChillerPowerSavingEstimated;
    }

    /**
     * Sets the value of the aggressiveChillerPowerSavingEstimated property.
     * 
     */
    public void setAggressiveChillerPowerSavingEstimated(double value) {
        this.aggressiveChillerPowerSavingEstimated = value;
    }

    /**
     * Gets the value of the aggressiveChillerPowerSavingPercentageEstimated property.
     * 
     */
    public double getAggressiveChillerPowerSavingPercentageEstimated() {
        return aggressiveChillerPowerSavingPercentageEstimated;
    }

    /**
     * Sets the value of the aggressiveChillerPowerSavingPercentageEstimated property.
     * 
     */
    public void setAggressiveChillerPowerSavingPercentageEstimated(double value) {
        this.aggressiveChillerPowerSavingPercentageEstimated = value;
    }

    /**
     * Gets the value of the aggressiveTemperatureRaise property.
     * 
     */
    public int getAggressiveTemperatureRaise() {
        return aggressiveTemperatureRaise;
    }

    /**
     * Sets the value of the aggressiveTemperatureRaise property.
     * 
     */
    public void setAggressiveTemperatureRaise(int value) {
        this.aggressiveTemperatureRaise = value;
    }

    /**
     * Gets the value of the benefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefits() {
        return benefits;
    }

    /**
     * Sets the value of the benefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefits(String value) {
        this.benefits = value;
    }

    /**
     * Gets the value of the chillerPowerEstimated property.
     * 
     */
    public double getChillerPowerEstimated() {
        return chillerPowerEstimated;
    }

    /**
     * Sets the value of the chillerPowerEstimated property.
     * 
     */
    public void setChillerPowerEstimated(double value) {
        this.chillerPowerEstimated = value;
    }

    /**
     * Gets the value of the conservativeChillerPowerSavingEstimated property.
     * 
     */
    public double getConservativeChillerPowerSavingEstimated() {
        return conservativeChillerPowerSavingEstimated;
    }

    /**
     * Sets the value of the conservativeChillerPowerSavingEstimated property.
     * 
     */
    public void setConservativeChillerPowerSavingEstimated(double value) {
        this.conservativeChillerPowerSavingEstimated = value;
    }

    /**
     * Gets the value of the conservativeChillerPowerSavingPercentageEstimated property.
     * 
     */
    public double getConservativeChillerPowerSavingPercentageEstimated() {
        return conservativeChillerPowerSavingPercentageEstimated;
    }

    /**
     * Sets the value of the conservativeChillerPowerSavingPercentageEstimated property.
     * 
     */
    public void setConservativeChillerPowerSavingPercentageEstimated(double value) {
        this.conservativeChillerPowerSavingPercentageEstimated = value;
    }

    /**
     * Gets the value of the conservativeTemperatureRaise property.
     * 
     */
    public int getConservativeTemperatureRaise() {
        return conservativeTemperatureRaise;
    }

    /**
     * Sets the value of the conservativeTemperatureRaise property.
     * 
     */
    public void setConservativeTemperatureRaise(int value) {
        this.conservativeTemperatureRaise = value;
    }

    /**
     * Gets the value of the htaChillerPowerSavingEstimated property.
     * 
     */
    public double getHtaChillerPowerSavingEstimated() {
        return htaChillerPowerSavingEstimated;
    }

    /**
     * Sets the value of the htaChillerPowerSavingEstimated property.
     * 
     */
    public void setHtaChillerPowerSavingEstimated(double value) {
        this.htaChillerPowerSavingEstimated = value;
    }

    /**
     * Gets the value of the htaChillerPowerSavingPercentageEstimated property.
     * 
     */
    public double getHtaChillerPowerSavingPercentageEstimated() {
        return htaChillerPowerSavingPercentageEstimated;
    }

    /**
     * Sets the value of the htaChillerPowerSavingPercentageEstimated property.
     * 
     */
    public void setHtaChillerPowerSavingPercentageEstimated(double value) {
        this.htaChillerPowerSavingPercentageEstimated = value;
    }

    /**
     * Gets the value of the htaTemperatureRaise property.
     * 
     */
    public int getHtaTemperatureRaise() {
        return htaTemperatureRaise;
    }

    /**
     * Sets the value of the htaTemperatureRaise property.
     * 
     */
    public void setHtaTemperatureRaise(int value) {
        this.htaTemperatureRaise = value;
    }

    /**
     * Gets the value of the possibleActions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibleActions() {
        return possibleActions;
    }

    /**
     * Sets the value of the possibleActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossibleActions(String value) {
        this.possibleActions = value;
    }

    /**
     * Gets the value of the prominentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prominentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProminentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtData }
     * 
     * 
     */
    public List<PtData> getProminentData() {
        if (prominentData == null) {
            prominentData = new ArrayList<PtData>();
        }
        return this.prominentData;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CoolingStatusSeverity }
     *     
     */
    public CoolingStatusSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoolingStatusSeverity }
     *     
     */
    public void setSeverity(CoolingStatusSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CoolingStatus }
     *     
     */
    public CoolingStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoolingStatus }
     *     
     */
    public void setStatus(CoolingStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the suggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * Sets the value of the suggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestion(String value) {
        this.suggestion = value;
    }

}
