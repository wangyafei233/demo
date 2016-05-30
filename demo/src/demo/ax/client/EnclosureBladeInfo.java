
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enclosureBladeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enclosureBladeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slotNumberinChassis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="blades" type="{http://wsdl.intf.dcm.intel.com/}bladeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enclosureBladeInfo", propOrder = {
    "slotNumberinChassis",
    "blades"
})
public class EnclosureBladeInfo {

    protected int slotNumberinChassis;
    @XmlElement(nillable = true)
    protected List<BladeInfo> blades;

    /**
     * Gets the value of the slotNumberinChassis property.
     * 
     */
    public int getSlotNumberinChassis() {
        return slotNumberinChassis;
    }

    /**
     * Sets the value of the slotNumberinChassis property.
     * 
     */
    public void setSlotNumberinChassis(int value) {
        this.slotNumberinChassis = value;
    }

    /**
     * Gets the value of the blades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BladeInfo }
     * 
     * 
     */
    public List<BladeInfo> getBlades() {
        if (blades == null) {
            blades = new ArrayList<BladeInfo>();
        }
        return this.blades;
    }

}
