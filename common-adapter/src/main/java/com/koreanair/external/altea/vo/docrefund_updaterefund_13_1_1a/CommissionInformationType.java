//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:41:56 ���� KST 
//


package com.koreanair.external.altea.vo.docrefund_updaterefund_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about a commission.
 * 
 * <p>Java class for CommissionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDetails" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}CommissionDetailsType"/>
 *         &lt;element name="otherComDetails" type="{http://xml.amadeus.com/TRFUUQ_13_1_1A}CommissionDetailsType" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInformationType", propOrder = {
    "commissionDetails",
    "otherComDetails"
})
public class CommissionInformationType {

    @XmlElement(required = true)
    protected CommissionDetailsType commissionDetails;
    protected List<CommissionDetailsType> otherComDetails;

    /**
     * Gets the value of the commissionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailsType }
     *     
     */
    public CommissionDetailsType getCommissionDetails() {
        return commissionDetails;
    }

    /**
     * Sets the value of the commissionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailsType }
     *     
     */
    public void setCommissionDetails(CommissionDetailsType value) {
        this.commissionDetails = value;
    }

    /**
     * Gets the value of the otherComDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherComDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherComDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionDetailsType }
     * 
     * 
     */
    public List<CommissionDetailsType> getOtherComDetails() {
        if (otherComDetails == null) {
            otherComDetails = new ArrayList<CommissionDetailsType>();
        }
        return this.otherComDetails;
    }

}
