
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEntitiesWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEntitiesWithDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://wsdl.intf.dcm.intel.com/}entityProperty" minOccurs="0"/>
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEntitiesWithDetails", propOrder = {
    "property",
    "searchString",
    "fullMatch"
})
public class FindEntitiesWithDetails {

    protected EntityProperty property;
    protected String searchString;
    protected boolean fullMatch;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link EntityProperty }
     *     
     */
    public EntityProperty getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityProperty }
     *     
     */
    public void setProperty(EntityProperty value) {
        this.property = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

    /**
     * Gets the value of the fullMatch property.
     * 
     */
    public boolean isFullMatch() {
        return fullMatch;
    }

    /**
     * Sets the value of the fullMatch property.
     * 
     */
    public void setFullMatch(boolean value) {
        this.fullMatch = value;
    }

}
