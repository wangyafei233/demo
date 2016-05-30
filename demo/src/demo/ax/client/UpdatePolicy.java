
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatePriorityLists" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lowPriorityList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="highPriorityList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePolicy", propOrder = {
    "policyId",
    "threshold",
    "policyDescription",
    "updatePriorityLists",
    "lowPriorityList",
    "highPriorityList"
})
public class UpdatePolicy {

    protected int policyId;
    protected int threshold;
    protected String policyDescription;
    protected boolean updatePriorityLists;
    @XmlElement(nillable = true)
    protected List<Integer> lowPriorityList;
    @XmlElement(nillable = true)
    protected List<Integer> highPriorityList;

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
     * Gets the value of the lowPriorityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowPriorityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowPriorityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLowPriorityList() {
        if (lowPriorityList == null) {
            lowPriorityList = new ArrayList<Integer>();
        }
        return this.lowPriorityList;
    }

    /**
     * Gets the value of the highPriorityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the highPriorityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHighPriorityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getHighPriorityList() {
        if (highPriorityList == null) {
            highPriorityList = new ArrayList<Integer>();
        }
        return this.highPriorityList;
    }

}
