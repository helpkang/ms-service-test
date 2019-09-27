//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}AdditionalProductTypeI" minOccurs="0"/>
 *         &lt;element name="departureStationInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalStationInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="mileageTimeDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}MileageTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="travellerTimeDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}TravellerTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="facilitiesInformation" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ProductFacilitiesTypeI" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI", propOrder = {
    "legDetails",
    "departureStationInfo",
    "arrivalStationInfo",
    "mileageTimeDetails",
    "travellerTimeDetails",
    "facilitiesInformation"
})
public class AdditionalProductDetailsTypeI {

    protected AdditionalProductTypeI legDetails;
    protected StationInformationTypeI departureStationInfo;
    protected StationInformationTypeI arrivalStationInfo;
    protected MileageTimeDetailsTypeI mileageTimeDetails;
    protected TravellerTimeDetailsTypeI travellerTimeDetails;
    protected List<ProductFacilitiesTypeI> facilitiesInformation;

    /**
     * Gets the value of the legDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getLegDetails() {
        return legDetails;
    }

    /**
     * Sets the value of the legDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setLegDetails(AdditionalProductTypeI value) {
        this.legDetails = value;
    }

    /**
     * Gets the value of the departureStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getDepartureStationInfo() {
        return departureStationInfo;
    }

    /**
     * Sets the value of the departureStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setDepartureStationInfo(StationInformationTypeI value) {
        this.departureStationInfo = value;
    }

    /**
     * Gets the value of the arrivalStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getArrivalStationInfo() {
        return arrivalStationInfo;
    }

    /**
     * Sets the value of the arrivalStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setArrivalStationInfo(StationInformationTypeI value) {
        this.arrivalStationInfo = value;
    }

    /**
     * Gets the value of the mileageTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public MileageTimeDetailsTypeI getMileageTimeDetails() {
        return mileageTimeDetails;
    }

    /**
     * Sets the value of the mileageTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public void setMileageTimeDetails(MileageTimeDetailsTypeI value) {
        this.mileageTimeDetails = value;
    }

    /**
     * Gets the value of the travellerTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public TravellerTimeDetailsTypeI getTravellerTimeDetails() {
        return travellerTimeDetails;
    }

    /**
     * Sets the value of the travellerTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public void setTravellerTimeDetails(TravellerTimeDetailsTypeI value) {
        this.travellerTimeDetails = value;
    }

    /**
     * Gets the value of the facilitiesInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilitiesInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilitiesInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFacilitiesTypeI }
     * 
     * 
     */
    public List<ProductFacilitiesTypeI> getFacilitiesInformation() {
        if (facilitiesInformation == null) {
            facilitiesInformation = new ArrayList<ProductFacilitiesTypeI>();
        }
        return this.facilitiesInformation;
    }

}
