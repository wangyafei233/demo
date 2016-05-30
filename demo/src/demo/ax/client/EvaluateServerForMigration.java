
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evaluateServerForMigration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evaluateServerForMigration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dst" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "evaluateServerForMigration", propOrder = {
    "scr",
    "dst",
    "aggPeriod"
})
public class EvaluateServerForMigration {

    protected int scr;
    protected int dst;
    protected int aggPeriod;

    /**
     * Gets the value of the scr property.
     * 
     */
    public int getScr() {
        return scr;
    }

    /**
     * Sets the value of the scr property.
     * 
     */
    public void setScr(int value) {
        this.scr = value;
    }

    /**
     * Gets the value of the dst property.
     * 
     */
    public int getDst() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     */
    public void setDst(int value) {
        this.dst = value;
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
