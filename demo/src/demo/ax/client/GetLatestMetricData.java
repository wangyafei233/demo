
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLatestMetricData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLatestMetricData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metricType" type="{http://wsdl.intf.dcm.intel.com/}metricType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLatestMetricData", propOrder = {
    "entityId",
    "metricType"
})
public class GetLatestMetricData {

    protected int entityId;
    protected MetricType metricType;

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

}
