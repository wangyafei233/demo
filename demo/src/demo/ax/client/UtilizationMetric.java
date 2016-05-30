
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for utilizationMetric complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="utilizationMetric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percentileUtil" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sampleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "utilizationMetric", propOrder = {
    "averageUtil",
    "entityId",
    "percentileUtil",
    "sampleNumber"
})
public class UtilizationMetric {

    protected double averageUtil;
    protected int entityId;
    protected double percentileUtil;
    protected int sampleNumber;

    /**
     * Gets the value of the averageUtil property.
     * 
     */
    public double getAverageUtil() {
        return averageUtil;
    }

    /**
     * Sets the value of the averageUtil property.
     * 
     */
    public void setAverageUtil(double value) {
        this.averageUtil = value;
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
     * Gets the value of the percentileUtil property.
     * 
     */
    public double getPercentileUtil() {
        return percentileUtil;
    }

    /**
     * Sets the value of the percentileUtil property.
     * 
     */
    public void setPercentileUtil(double value) {
        this.percentileUtil = value;
    }

    /**
     * Gets the value of the sampleNumber property.
     * 
     */
    public int getSampleNumber() {
        return sampleNumber;
    }

    /**
     * Sets the value of the sampleNumber property.
     * 
     */
    public void setSampleNumber(int value) {
        this.sampleNumber = value;
    }

}
