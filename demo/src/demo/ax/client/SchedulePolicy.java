
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
 * <p>Java class for schedulePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedulePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="days" type="{http://wsdl.intf.dcm.intel.com/}day" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedulePolicy", propOrder = {
    "policyId",
    "startTime",
    "endTime",
    "startHour",
    "endHour",
    "days"
})
public class SchedulePolicy {

    protected int policyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected int startHour;
    protected int endHour;
    @XmlElement(nillable = true)
    protected List<Day> days;

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

}
