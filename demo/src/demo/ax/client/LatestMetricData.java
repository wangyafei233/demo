
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for latestMetricData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="latestMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metricType" type="{http://wsdl.intf.dcm.intel.com/}metricType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://wsdl.intf.dcm.intel.com/}rawPtData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "latestMetricData", propOrder = {
    "entityId",
    "metricType",
    "value"
})
public class LatestMetricData {

    protected int entityId;
    protected MetricType metricType;
    protected RawPtData value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link RawPtData }
     *     
     */
    public RawPtData getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawPtData }
     *     
     */
    public void setValue(RawPtData value) {
        this.value = value;
    }

}
