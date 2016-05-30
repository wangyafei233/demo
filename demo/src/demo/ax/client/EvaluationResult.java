
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evaluationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evaluationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageUtilization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="evaluationScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ninetyNinePercentileUtilization" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluationResult", propOrder = {
    "averageUtilization",
    "evaluationScore",
    "ninetyNinePercentileUtilization"
})
public class EvaluationResult {

    protected double averageUtilization;
    protected double evaluationScore;
    protected double ninetyNinePercentileUtilization;

    /**
     * Gets the value of the averageUtilization property.
     * 
     */
    public double getAverageUtilization() {
        return averageUtilization;
    }

    /**
     * Sets the value of the averageUtilization property.
     * 
     */
    public void setAverageUtilization(double value) {
        this.averageUtilization = value;
    }

    /**
     * Gets the value of the evaluationScore property.
     * 
     */
    public double getEvaluationScore() {
        return evaluationScore;
    }

    /**
     * Sets the value of the evaluationScore property.
     * 
     */
    public void setEvaluationScore(double value) {
        this.evaluationScore = value;
    }

    /**
     * Gets the value of the ninetyNinePercentileUtilization property.
     * 
     */
    public double getNinetyNinePercentileUtilization() {
        return ninetyNinePercentileUtilization;
    }

    /**
     * Sets the value of the ninetyNinePercentileUtilization property.
     * 
     */
    public void setNinetyNinePercentileUtilization(double value) {
        this.ninetyNinePercentileUtilization = value;
    }

}
