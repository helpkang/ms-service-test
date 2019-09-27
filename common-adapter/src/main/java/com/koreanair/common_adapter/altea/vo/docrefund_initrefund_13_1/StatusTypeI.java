//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.06 at 08:48:53 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.docrefund_initrefund_13_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/TRFSRQ_13_1_1A}StatusDetailsTypeI"/>
 *         &lt;element name="otherDetails" type="{http://xml.amadeus.com/TRFSRQ_13_1_1A}StatusDetailsTypeI" maxOccurs="98" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI", propOrder = {
    "statusDetails",
    "otherDetails"
})
public class StatusTypeI {

    @XmlElement(required = true)
    protected StatusDetailsTypeI statusDetails;
    protected List<StatusDetailsTypeI> otherDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public StatusDetailsTypeI getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public void setStatusDetails(StatusDetailsTypeI value) {
        this.statusDetails = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusDetailsTypeI }
     * 
     * 
     */
    public List<StatusDetailsTypeI> getOtherDetails() {
        if (otherDetails == null) {
            otherDetails = new ArrayList<StatusDetailsTypeI>();
        }
        return this.otherDetails;
    }

}
