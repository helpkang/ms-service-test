//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_addmultielements_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey full reference for a rail seat.
 * 
 * <p>Java class for RailSeatReferenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSeatReferenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="railSeatReferenceDetails" type="{http://xml.amadeus.com/PNRADD_13_2_1A}SeatReferenceInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSeatReferenceInformationType", propOrder = {
    "railSeatReferenceDetails"
})
public class RailSeatReferenceInformationType {

    protected SeatReferenceInformationType railSeatReferenceDetails;

    /**
     * Gets the value of the railSeatReferenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatReferenceInformationType }
     *     
     */
    public SeatReferenceInformationType getRailSeatReferenceDetails() {
        return railSeatReferenceDetails;
    }

    /**
     * Sets the value of the railSeatReferenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatReferenceInformationType }
     *     
     */
    public void setRailSeatReferenceDetails(SeatReferenceInformationType value) {
        this.railSeatReferenceDetails = value;
    }

}
