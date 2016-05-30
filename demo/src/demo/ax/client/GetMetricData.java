
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getMetricData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metricType" type="{http://wsdl.intf.dcm.intel.com/}metricType" minOccurs="0"/>
 *         &lt;element name="aggregationLevel" type="{http://wsdl.intf.dcm.intel.com/}aggregationLevel" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="aggPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMetricData", propOrder = {
    "entityId",
    "metricType",
    "aggregationLevel",
    "startTime",
    "endTime",
    "aggPeriod"
})
public class GetMetricData {

    protected int entityId;
    protected MetricType metricType;
    protected AggregationLevel aggregationLevel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected int aggPeriod;

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
     * Gets the value of the metricType property.
     * 
     * @return
     *     possible object is
     *     {@link MetricType }
     *     
     */
    public MetricType getMetricType() {
        return metricType;
    }

    /**
     * Sets the value of the metricType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetricType }
     *     
     */
    public void setMetricType(MetricType value) {
        this.metricType = value;
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

    /**
     * Gets the value of the aggPeriod property.
     * 
     */
    public int getAggPeriod() {
        return aggPeriod;
    }

    /**
     * Sets the value of the aggPeriod property.
     * 
     */
    public void setAggPeriod(int value) {
        this.aggPeriod = value;
    }

}
