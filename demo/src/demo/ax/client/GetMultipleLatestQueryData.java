
package demo.ax.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMultipleLatestQueryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMultipleLatestQueryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entityIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queryTypes" type="{http://wsdl.intf.dcm.intel.com/}queryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMultipleLatestQueryData", propOrder = {
    "entityIds",
    "queryTypes"
})
public class GetMultipleLatestQueryData {

    @XmlElement(nillable = true)
    protected List<Integer> entityIds;
    @XmlElement(nillable = true)
    protected List<QueryType> queryTypes;

    /**
     * Gets the value of the entityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEntityIds() {
        if (entityIds == null) {
            entityIds = new ArrayList<Integer>();
        }
        return this.entityIds;
    }

    /**
     * Gets the value of the queryTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryType }
     * 
     * 
     */
    public List<QueryType> getQueryTypes() {
        if (queryTypes == null) {
            queryTypes = new ArrayList<QueryType>();
        }
        return this.queryTypes;
    }

}
