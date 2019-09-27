//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for RequestedSegmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedSegmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originAndDestinationDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}OriginAndDestinationDetailsTypeI"/>
 *         &lt;element name="flightSegmentInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FlightInfoType" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedSegmentInfoType", propOrder = {
    "originAndDestinationDetails",
    "flightSegmentInfoGroup"
})
public class RequestedSegmentInfoType {

    @XmlElement(required = true)
    protected OriginAndDestinationDetailsTypeI originAndDestinationDetails;
    protected List<FlightInfoType> flightSegmentInfoGroup;

    /**
     * Gets the value of the originAndDestinationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetailsTypeI }
     *     
     */
    public OriginAndDestinationDetailsTypeI getOriginAndDestinationDetails() {
        return originAndDestinationDetails;
    }

    /**
     * Sets the value of the originAndDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetailsTypeI }
     *     
     */
    public void setOriginAndDestinationDetails(OriginAndDestinationDetailsTypeI value) {
        this.originAndDestinationDetails = value;
    }

    /**
     * Gets the value of the flightSegmentInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfoType }
     * 
     * 
     */
    public List<FlightInfoType> getFlightSegmentInfoGroup() {
        if (flightSegmentInfoGroup == null) {
            flightSegmentInfoGroup = new ArrayList<FlightInfoType>();
        }
        return this.flightSegmentInfoGroup;
    }

}
