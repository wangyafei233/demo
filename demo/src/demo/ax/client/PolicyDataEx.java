
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policyDataEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyDataEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="days" type="{http://wsdl.intf.dcm.intel.com/}day" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyType" type="{http://wsdl.intf.dcm.intel.com/}policyType" minOccurs="0"/>
 *         &lt;element name="priorityList" type="{http://wsdl.intf.dcm.intel.com/}entityPriority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reserveBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyDataEx", propOrder = {
    "days",
    "endHour",
    "endTime",
    "entityId",
    "policyDescription",
    "policyType",
    "priorityList",
    "reserveBudget",
    "startHour",
    "startTime",
    "threshold"
})
public class PolicyDataEx {

    @XmlElement(nillable = true)
    protected List<Day> days;
    protected int endHour;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected int entityId;
    protected String policyDescription;
    protected PolicyType policyType;
    @XmlElement(nillable = true)
    protected List<EntityPriority> priorityList;
    protected int reserveBudget;
    protected int startHour;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected int threshold;

    /**
     * Gets the value of the days property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the days property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Day }
     * 
     * 
     */
    public List<Day> getDays() {
        if (days == null) {
            days = new ArrayList<Day>();
        }
        return this.days;
    }

    /**
     * Gets the value of the endHour property.
     * 
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     */
    public void setEndHour(int value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

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
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setPolicyType(PolicyType value) {
        this.policyType = value;
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
     * Gets the value of the startHour property.
     * 
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     */
    public void setStartHour(int value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
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

}
