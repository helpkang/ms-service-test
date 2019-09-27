//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a segment of an itinerary and related details.
 * 
 * <p>Java class for TravelItineraryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelItineraryInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unticketedPointTime" type="{http://xml.amadeus.com/TACRES_12_1_1A}ProductDateTimeTypeI_99956C" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length3To3" maxOccurs="15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelItineraryInformationTypeI", propOrder = {
    "unticketedPointTime",
    "location"
})
public class TravelItineraryInformationTypeI {

    protected ProductDateTimeTypeI99956C unticketedPointTime;
    protected List<String> location;

    /**
     * Gets the value of the unticketedPointTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI99956C }
     *     
     */
    public ProductDateTimeTypeI99956C getUnticketedPointTime() {
        return unticketedPointTime;
    }

    /**
     * Sets the value of the unticketedPointTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI99956C }
     *     
     */
    public void setUnticketedPointTime(ProductDateTimeTypeI99956C value) {
        this.unticketedPointTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocation() {
        if (location == null) {
            location = new ArrayList<String>();
        }
        return this.location;
    }

}
