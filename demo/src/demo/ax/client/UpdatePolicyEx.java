
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePolicyEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePolicyEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reserveBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatePriorityLists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priorityList" type="{http://wsdl.intf.dcm.intel.com/}entityPriority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePolicyEx", propOrder = {
    "policyId",
    "threshold",
    "reserveBudget",
    "policyDescription",
    "updatePriorityLists",
    "priorityList"
})
public class UpdatePolicyEx {

    protected int policyId;
    protected int threshold;
    protected int reserveBudget;
    protected String policyDescription;
    protected boolean updatePriorityLists;
    @XmlElement(nillable = true)
    protected List<EntityPriority> priorityList;

    /**
     * Gets the value of the policyId property.
     * 
     */
    public int getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     */
    public void setPolicyId(int value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     */
    public int getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     */
    public void setThreshold(int value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the reserveBudget property.
     * 
     */
    public int getReserveBudget() {
        return reserveBudget;
    }

    /**
     * Sets the value of the reserveBudget property.
     * 
     */
    public void setReserveBudget(int value) {
        this.reserveBudget = value;
    }

    /**
     * Gets the value of the policyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyDescription() {
        return policyDescription;
    }

    /**
     * Sets the value of the policyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyDescription(String value) {
        this.policyDescription = value;
    }

    /**
     * Gets the value of the updatePriorityLists property.
     * 
     */
    public boolean isUpdatePriorityLists() {
        return updatePriorityLists;
    }

    /**
     * Sets the value of the updatePriorityLists property.
     * 
     */
    public void setUpdatePriorityLists(boolean value) {
        this.updatePriorityLists = value;
    }

    /**
     * Gets the value of the priorityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityPriority }
     * 
     * 
     */
    public List<EntityPriority> getPriorityList() {
        if (priorityList == null) {
            priorityList = new ArrayList<EntityPriority>();
        }
        return this.priorityList;
    }

}
