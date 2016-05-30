
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNextData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNextData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumerationHandle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNextData", propOrder = {
    "enumerationHandle"
})
public class GetNextData {

    protected int enumerationHandle;

    /**
     * Gets the value of the enumerationHandle property.
     * 
     */
    public int getEnumerationHandle() {
        return enumerationHandle;
    }

    /**
     * Sets the value of the enumerationHandle property.
     * 
     */
    public void setEnumerationHandle(int value) {
        this.enumerationHandle = value;
    }

}
