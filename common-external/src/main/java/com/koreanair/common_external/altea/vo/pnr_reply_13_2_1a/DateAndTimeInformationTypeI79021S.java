//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide date and time details relative to flight movements.
 * 
 * <p>Java class for DateAndTimeInformationTypeI_79021S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationTypeI_79021S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateAndTimeDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DateAndTimeDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationTypeI_79021S", propOrder = {
    "dateAndTimeDetails"
})
public class DateAndTimeInformationTypeI79021S {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI dateAndTimeDetails;

    /**
     * Gets the value of the dateAndTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public DateAndTimeDetailsTypeI getDateAndTimeDetails() {
        return dateAndTimeDetails;
    }

    /**
     * Sets the value of the dateAndTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public void setDateAndTimeDetails(DateAndTimeDetailsTypeI value) {
        this.dateAndTimeDetails = value;
    }

}
