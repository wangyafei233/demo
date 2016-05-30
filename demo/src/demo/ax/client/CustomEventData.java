
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customEventData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customEventData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionOperator" type="{http://wsdl.intf.dcm.intel.com/}conditionOperator" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="evalPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://wsdl.intf.dcm.intel.com/}customEventType" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customEventData", propOrder = {
    "conditionOperator",
    "entityId",
    "evalPeriod",
    "eventDescription",
    "eventType",
    "threshold"
})
public class CustomEventData {

    protected ConditionOperator conditionOperator;
    protected int entityId;
    protected int evalPeriod;
    protected String eventDescription;
    protected CustomEventType eventType;
    protected int threshold;

    /**
     * Gets the value of the conditionOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionOperator }
     *     
     */
    public ConditionOperator getConditionOperator() {
        return conditionOperator;
    }

    /**
     * Sets the value of the conditionOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionOperator }
     *     
     */
    public void setConditionOperator(ConditionOperator value) {
        this.conditionOperator = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(int value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the evalPeriod property.
     * 
     */
    public int getEvalPeriod() {
        return evalPeriod;
    }

    /**
     * Sets the value of the evalPeriod property.
     * 
     */
    public void setEvalPeriod(int value) {
        this.evalPeriod = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomEventType }
     *     
     */
    public CustomEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomEventType }
     *     
     */
    public void setEventType(CustomEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

}
