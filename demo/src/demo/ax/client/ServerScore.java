
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverScore", propOrder = {
    "score",
    "serverId"
})
public class ServerScore {

    protected double score;
    protected int serverId;

    /**
     * Gets the value of the score property.
     * 
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(double value) {
        this.score = value;
    }

    /**
     * Gets the value of the serverId property.
     * 
     */
    public int getServerId() {
        return serverId;
    }

    /**
     * Sets the value of the serverId property.
     * 
     */
    public void setServerId(int value) {
        this.serverId = value;
    }

}
