//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:42:03 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.docrefund_updaterefundreply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The segment is used to communicate priority information.
 * 
 * <p>Java class for PriorityTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priorityDetails" type="{http://xml.amadeus.com/TRFUUR_13_1_1A}PriorityDetailsTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityTypeU", propOrder = {
    "priorityDetails"
})
public class PriorityTypeU {

    protected PriorityDetailsTypeU priorityDetails;

    /**
     * Gets the value of the priorityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDetailsTypeU }
     *     
     */
    public PriorityDetailsTypeU getPriorityDetails() {
        return priorityDetails;
    }

    /**
     * Sets the value of the priorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDetailsTypeU }
     *     
     */
    public void setPriorityDetails(PriorityDetailsTypeU value) {
        this.priorityDetails = value;
    }

}
