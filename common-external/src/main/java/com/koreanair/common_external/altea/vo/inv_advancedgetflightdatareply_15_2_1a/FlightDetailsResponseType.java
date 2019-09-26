//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.10 at 06:01:13 ���� KST 
//


package com.koreanair.common_external.altea.vo.inv_advancedgetflightdatareply_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate a flight for a given date in a reply.
 * 
 * <p>Java class for FlightDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineInformation" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}OutboundCarrierDetailsTypeI"/>
 *         &lt;element name="flightReference" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}OutboundFlightNumberDetailstypeI"/>
 *         &lt;element name="departureDate" type="{http://xml.amadeus.com/IFLIRR_15_2_1A}Date_DDMMYY"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsResponseType", propOrder = {
    "airlineInformation",
    "flightReference",
    "departureDate"
})
public class FlightDetailsResponseType {

    @XmlElement(required = true)
    protected OutboundCarrierDetailsTypeI airlineInformation;
    @XmlElement(required = true)
    protected OutboundFlightNumberDetailstypeI flightReference;
    @XmlElement(required = true)
    protected String departureDate;

    /**
     * Gets the value of the airlineInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundCarrierDetailsTypeI }
     *     
     */
    public OutboundCarrierDetailsTypeI getAirlineInformation() {
        return airlineInformation;
    }

    /**
     * Sets the value of the airlineInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundCarrierDetailsTypeI }
     *     
     */
    public void setAirlineInformation(OutboundCarrierDetailsTypeI value) {
        this.airlineInformation = value;
    }

    /**
     * Gets the value of the flightReference property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundFlightNumberDetailstypeI }
     *     
     */
    public OutboundFlightNumberDetailstypeI getFlightReference() {
        return flightReference;
    }

    /**
     * Sets the value of the flightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundFlightNumberDetailstypeI }
     *     
     */
    public void setFlightReference(OutboundFlightNumberDetailstypeI value) {
        this.flightReference = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

}
