//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareProductInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareProductInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="markerAllFares" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="passengerTypeInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PassengerTypeInfoType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductInfoType", propOrder = {
    "markerAllFares",
    "passengerTypeInfoGroup"
})
public class FareProductInfoType {

    @XmlElement(required = true)
    protected DummySegmentTypeI markerAllFares;
    protected List<PassengerTypeInfoType> passengerTypeInfoGroup;

    /**
     * Gets the value of the markerAllFares property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getMarkerAllFares() {
        return markerAllFares;
    }

    /**
     * Sets the value of the markerAllFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setMarkerAllFares(DummySegmentTypeI value) {
        this.markerAllFares = value;
    }

    /**
     * Gets the value of the passengerTypeInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerTypeInfoType }
     * 
     * 
     */
    public List<PassengerTypeInfoType> getPassengerTypeInfoGroup() {
        if (passengerTypeInfoGroup == null) {
            passengerTypeInfoGroup = new ArrayList<PassengerTypeInfoType>();
        }
        return this.passengerTypeInfoGroup;
    }

}
