//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:26 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_createformofpayment_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes communication channel
 * 
 * <p>Java class for CommunicationContactType_84973S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactType_84973S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communication" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}CommunicationContactDetailsTypeU_129344C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactType_84973S", propOrder = {
    "communication"
})
public class CommunicationContactType84973S {

    @XmlElement(required = true)
    protected CommunicationContactDetailsTypeU129344C communication;

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsTypeU129344C }
     *     
     */
    public CommunicationContactDetailsTypeU129344C getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsTypeU129344C }
     *     
     */
    public void setCommunication(CommunicationContactDetailsTypeU129344C value) {
        this.communication = value;
    }

}
