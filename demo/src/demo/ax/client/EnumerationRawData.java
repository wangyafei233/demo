
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
 * <p>Java class for enumerationRawData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enumerationRawData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumerationHandle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="queryData" type="{http://wsdl.intf.dcm.intel.com/}rawPtData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumerationRawData", propOrder = {
    "enumerationHandle",
    "expirationDate",
    "queryData"
})
public class EnumerationRawData {

    protected int enumerationHandle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(nillable = true)
    protected List<RawPtData> queryData;

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

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the queryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawPtData }
     * 
     * 
     */
    public List<RawPtData> getQueryData() {
        if (queryData == null) {
            queryData = new ArrayList<RawPtData>();
        }
        return this.queryData;
    }

}
