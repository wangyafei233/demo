
package demo.ax.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removePolicyHastily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removePolicyHastily">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePolicyHastily", propOrder = {
    "policyId"
})
public class RemovePolicyHastily {

    protected int policyId;

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

}
