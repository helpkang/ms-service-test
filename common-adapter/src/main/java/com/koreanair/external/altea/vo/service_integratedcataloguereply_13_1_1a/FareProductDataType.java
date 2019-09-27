//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_integratedcataloguereply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FareProductDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalAndIdInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}SegmentRepetitionControlType"/>
 *         &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TPICGR_13_1_1A}SpecificTravellerTypeI" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="passengerTypeInfoGroup" type="{http://xml.amadeus.com/TPICGR_13_1_1A}PassengerDetailsInfoType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareProductDataType", propOrder = {
    "generalAndIdInfo",
    "specificTravellerDetails",
    "passengerTypeInfoGroup"
})
public class FareProductDataType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlType generalAndIdInfo;
    protected List<SpecificTravellerTypeI> specificTravellerDetails;
    protected List<PassengerDetailsInfoType> passengerTypeInfoGroup;

    /**
     * Gets the value of the generalAndIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public SegmentRepetitionControlType getGeneralAndIdInfo() {
        return generalAndIdInfo;
    }

    /**
     * Sets the value of the generalAndIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public void setGeneralAndIdInfo(SegmentRepetitionControlType value) {
        this.generalAndIdInfo = value;
    }

    /**
     * Gets the value of the specificTravellerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificTravellerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificTravellerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificTravellerTypeI }
     * 
     * 
     */
    public List<SpecificTravellerTypeI> getSpecificTravellerDetails() {
        if (specificTravellerDetails == null) {
            specificTravellerDetails = new ArrayList<SpecificTravellerTypeI>();
        }
        return this.specificTravellerDetails;
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
     * {@link PassengerDetailsInfoType }
     * 
     * 
     */
    public List<PassengerDetailsInfoType> getPassengerTypeInfoGroup() {
        if (passengerTypeInfoGroup == null) {
            passengerTypeInfoGroup = new ArrayList<PassengerDetailsInfoType>();
        }
        return this.passengerTypeInfoGroup;
    }

}
