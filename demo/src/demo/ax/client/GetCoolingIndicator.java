
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCoolingIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCoolingIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allowedTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recommendedTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoolingIndicator", propOrder = {
    "groupId",
    "allowedTemperature",
    "recommendedTemperature"
})
public class GetCoolingIndicator {

    protected int groupId;
    protected int allowedTemperature;
    protected int recommendedTemperature;

    /**
     * Gets the value of the groupId property.
     * 
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(int value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the allowedTemperature property.
     * 
     */
    public int getAllowedTemperature() {
        return allowedTemperature;
    }

    /**
     * Sets the value of the allowedTemperature property.
     * 
     */
    public void setAllowedTemperature(int value) {
        this.allowedTemperature = value;
    }

    /**
     * Gets the value of the recommendedTemperature property.
     * 
     */
    public int getRecommendedTemperature() {
        return recommendedTemperature;
    }

    /**
     * Sets the value of the recommendedTemperature property.
     * 
     */
    public void setRecommendedTemperature(int value) {
        this.recommendedTemperature = value;
    }

}
