//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dates and times relevant to a traveller.
 * 
 * <p>Java class for TravellerTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerTimeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkinTime" type="{http://xml.amadeus.com/PNRACC_13_2_1A}Time24_HHMM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerTimeDetailsTypeI", propOrder = {
    "checkinTime"
})
public class TravellerTimeDetailsTypeI {

    protected String checkinTime;

    /**
     * Gets the value of the checkinTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckinTime() {
        return checkinTime;
    }

    /**
     * Sets the value of the checkinTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckinTime(String value) {
        this.checkinTime = value;
    }

}
