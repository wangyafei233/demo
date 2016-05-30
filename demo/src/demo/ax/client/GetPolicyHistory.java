
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getPolicyHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPolicyHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="historyType" type="{http://wsdl.intf.dcm.intel.com/}historyType" minOccurs="0"/>
 *         &lt;element name="aggregationLevel" type="{http://wsdl.intf.dcm.intel.com/}aggregationLevel" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPolicyHistory", propOrder = {
    "entityId",
    "historyType",
    "aggregationLevel",
    "startTime",
    "endTime"
})
public class GetPolicyHistory {

    protected int entityId;
    protected HistoryType historyType;
    protected AggregationLevel aggregationLevel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;

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
     * Gets the value of the historyType property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryType }
     *     
     */
    public HistoryType getHistoryType() {
        return historyType;
    }

    /**
     * Sets the value of the historyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryType }
     *     
     */
    public void setHistoryType(HistoryType value) {
        this.historyType = value;
    }

    /**
     * Gets the value of the aggregationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationLevel }
     *     
     */
    public AggregationLevel getAggregationLevel() {
        return aggregationLevel;
    }

    /**
     * Sets the value of the aggregationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationLevel }
     *     
     */
    public void setAggregationLevel(AggregationLevel value) {
        this.aggregationLevel = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

}
