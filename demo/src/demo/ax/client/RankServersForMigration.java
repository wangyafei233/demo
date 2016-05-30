
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rankServersForMigration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rankServersForMigration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scr" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "rankServersForMigration", propOrder = {
    "scr",
    "aggPeriod"
})
public class RankServersForMigration {

    protected int scr;
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
