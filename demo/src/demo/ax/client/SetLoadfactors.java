
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLoadfactors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLoadfactors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loadfactors" type="{http://wsdl.intf.dcm.intel.com/}loadfactors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLoadfactors", propOrder = {
    "entityId",
    "loadfactors"
})
public class SetLoadfactors {

    protected int entityId;
    protected Loadfactors loadfactors;

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
     * Gets the value of the loadfactors property.
     * 
     * @return
     *     possible object is
     *     {@link Loadfactors }
     *     
     */
    public Loadfactors getLoadfactors() {
        return loadfactors;
    }

    /**
     * Sets the value of the loadfactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loadfactors }
     *     
     */
    public void setLoadfactors(Loadfactors value) {
        this.loadfactors = value;
    }

}
