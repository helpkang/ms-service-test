//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentIdent" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SegmentRepetitionControlType"/>
 *         &lt;element name="segmentFareInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareInformationType_67521S" minOccurs="0"/>
 *         &lt;element name="segmentAmountInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}MonetaryInformationType_67522S" minOccurs="0"/>
 *         &lt;element name="segmentFareCalcCodeDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFlightInfoType", propOrder = {
    "segmentIdent",
    "segmentFareInfo",
    "segmentAmountInfo",
    "segmentFareCalcCodeDetails"
})
public class PassengerFlightInfoType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlType segmentIdent;
    protected FareInformationType67521S segmentFareInfo;
    protected MonetaryInformationType67522S segmentAmountInfo;
    protected FareCalculationCodeDetailsType segmentFareCalcCodeDetails;

    /**
     * Gets the value of the segmentIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public SegmentRepetitionControlType getSegmentIdent() {
        return segmentIdent;
    }

    /**
     * Sets the value of the segmentIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public void setSegmentIdent(SegmentRepetitionControlType value) {
        this.segmentIdent = value;
    }

    /**
     * Gets the value of the segmentFareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationType67521S }
     *     
     */
    public FareInformationType67521S getSegmentFareInfo() {
        return segmentFareInfo;
    }

    /**
     * Sets the value of the segmentFareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationType67521S }
     *     
     */
    public void setSegmentFareInfo(FareInformationType67521S value) {
        this.segmentFareInfo = value;
    }

    /**
     * Gets the value of the segmentAmountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67522S }
     *     
     */
    public MonetaryInformationType67522S getSegmentAmountInfo() {
        return segmentAmountInfo;
    }

    /**
     * Sets the value of the segmentAmountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67522S }
     *     
     */
    public void setSegmentAmountInfo(MonetaryInformationType67522S value) {
        this.segmentAmountInfo = value;
    }

    /**
     * Gets the value of the segmentFareCalcCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public FareCalculationCodeDetailsType getSegmentFareCalcCodeDetails() {
        return segmentFareCalcCodeDetails;
    }

    /**
     * Sets the value of the segmentFareCalcCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public void setSegmentFareCalcCodeDetails(FareCalculationCodeDetailsType value) {
        this.segmentFareCalcCodeDetails = value;
    }

}
