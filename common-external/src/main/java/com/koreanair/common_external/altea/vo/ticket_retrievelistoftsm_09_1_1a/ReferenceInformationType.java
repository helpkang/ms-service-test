//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.03 at 11:00:07 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_retrievelistoftsm_09_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey the passenger references.
 * 
 * <p>Java class for ReferenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TTSLRQ_09_1_1A}ReferencingDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationType", propOrder = {
    "passengerReference"
})
public class ReferenceInformationType {

    @XmlElement(required = true)
    protected ReferencingDetailsTypeI passengerReference;

    /**
     * Gets the value of the passengerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI }
     *     
     */
    public ReferencingDetailsTypeI getPassengerReference() {
        return passengerReference;
    }

    /**
     * Sets the value of the passengerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI }
     *     
     */
    public void setPassengerReference(ReferencingDetailsTypeI value) {
        this.passengerReference = value;
    }

}
