//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the hotel room information
 * 
 * <p>Java class for HotelRoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomRateIdentifier" type="{http://xml.amadeus.com/PNRACC_13_2_1A}HotelRoomRateInformationType" minOccurs="0"/>
 *         &lt;element name="bookingCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="guestCountDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}NumberOfUnitDetailsTypeI_18670C"/>
 *         &lt;element name="roomTypeOverride" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomType", propOrder = {
    "roomRateIdentifier",
    "bookingCode",
    "guestCountDetails",
    "roomTypeOverride"
})
public class HotelRoomType {

    protected HotelRoomRateInformationType roomRateIdentifier;
    protected String bookingCode;
    @XmlElement(required = true)
    protected NumberOfUnitDetailsTypeI18670C guestCountDetails;
    protected String roomTypeOverride;

    /**
     * Gets the value of the roomRateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomRateInformationType }
     *     
     */
    public HotelRoomRateInformationType getRoomRateIdentifier() {
        return roomRateIdentifier;
    }

    /**
     * Sets the value of the roomRateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomRateInformationType }
     *     
     */
    public void setRoomRateIdentifier(HotelRoomRateInformationType value) {
        this.roomRateIdentifier = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the guestCountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsTypeI18670C }
     *     
     */
    public NumberOfUnitDetailsTypeI18670C getGuestCountDetails() {
        return guestCountDetails;
    }

    /**
     * Sets the value of the guestCountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsTypeI18670C }
     *     
     */
    public void setGuestCountDetails(NumberOfUnitDetailsTypeI18670C value) {
        this.guestCountDetails = value;
    }

    /**
     * Gets the value of the roomTypeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeOverride() {
        return roomTypeOverride;
    }

    /**
     * Sets the value of the roomTypeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeOverride(String value) {
        this.roomTypeOverride = value;
    }

}
