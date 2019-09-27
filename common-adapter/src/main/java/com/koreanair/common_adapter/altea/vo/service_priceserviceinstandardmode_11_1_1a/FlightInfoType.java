//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelProductInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}TravelProductInformationType_67568S"/>
 *         &lt;element name="relatedProductInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}RelatedProductInformationType" minOccurs="0"/>
 *         &lt;element name="additionalProductDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="pricingTicketingDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PricingTicketingDetailsType_67548S" minOccurs="0"/>
 *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}FareQualifierDetailsType_67539S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}MonetaryInformationType_67522S" minOccurs="0"/>
 *         &lt;element name="discountAndPenaltyInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}DiscountAndPenaltyInformationType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="parameterValueInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}NumberOfUnitsTypeI" minOccurs="0"/>
 *         &lt;element name="seatRequestParameters" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SeatRequestParametersTypeI" minOccurs="0"/>
 *         &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}DateAndTimeInformationTypeI_67562S" minOccurs="0"/>
 *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
 *         &lt;element name="segmentPricingInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}SegmentPricingInfoType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="bookingClassInfoGroup" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}BookingClassInfoType_86938G" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="pricePsgByFareBasisInfo" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}PassengerFareBasisType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoType", propOrder = {
    "travelProductInfo",
    "relatedProductInfo",
    "additionalProductDetails",
    "pricingTicketingDetails",
    "fareQualifierDetails",
    "monetaryInfo",
    "discountAndPenaltyInfo",
    "parameterValueInfo",
    "seatRequestParameters",
    "dateAndTimeInfo",
    "referenceInfo",
    "segmentPricingInfoGroup",
    "bookingClassInfoGroup",
    "pricePsgByFareBasisInfo"
})
public class FlightInfoType {

    @XmlElement(required = true)
    protected TravelProductInformationType67568S travelProductInfo;
    protected RelatedProductInformationType relatedProductInfo;
    protected AdditionalProductDetailsTypeI additionalProductDetails;
    protected PricingTicketingDetailsType67548S pricingTicketingDetails;
    protected List<FareQualifierDetailsType67539S> fareQualifierDetails;
    protected MonetaryInformationType67522S monetaryInfo;
    protected List<DiscountAndPenaltyInformationType> discountAndPenaltyInfo;
    protected NumberOfUnitsTypeI parameterValueInfo;
    protected SeatRequestParametersTypeI seatRequestParameters;
    protected DateAndTimeInformationTypeI67562S dateAndTimeInfo;
    protected ReferenceInformationTypeI referenceInfo;
    protected List<SegmentPricingInfoType> segmentPricingInfoGroup;
    protected List<BookingClassInfoType86938G> bookingClassInfoGroup;
    protected List<PassengerFareBasisType> pricePsgByFareBasisInfo;

    /**
     * Gets the value of the travelProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType67568S }
     *     
     */
    public TravelProductInformationType67568S getTravelProductInfo() {
        return travelProductInfo;
    }

    /**
     * Sets the value of the travelProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType67568S }
     *     
     */
    public void setTravelProductInfo(TravelProductInformationType67568S value) {
        this.travelProductInfo = value;
    }

    /**
     * Gets the value of the relatedProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedProductInformationType }
     *     
     */
    public RelatedProductInformationType getRelatedProductInfo() {
        return relatedProductInfo;
    }

    /**
     * Sets the value of the relatedProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedProductInformationType }
     *     
     */
    public void setRelatedProductInfo(RelatedProductInformationType value) {
        this.relatedProductInfo = value;
    }

    /**
     * Gets the value of the additionalProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public AdditionalProductDetailsTypeI getAdditionalProductDetails() {
        return additionalProductDetails;
    }

    /**
     * Sets the value of the additionalProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public void setAdditionalProductDetails(AdditionalProductDetailsTypeI value) {
        this.additionalProductDetails = value;
    }

    /**
     * Gets the value of the pricingTicketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsType67548S }
     *     
     */
    public PricingTicketingDetailsType67548S getPricingTicketingDetails() {
        return pricingTicketingDetails;
    }

    /**
     * Sets the value of the pricingTicketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsType67548S }
     *     
     */
    public void setPricingTicketingDetails(PricingTicketingDetailsType67548S value) {
        this.pricingTicketingDetails = value;
    }

    /**
     * Gets the value of the fareQualifierDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareQualifierDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareQualifierDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareQualifierDetailsType67539S }
     * 
     * 
     */
    public List<FareQualifierDetailsType67539S> getFareQualifierDetails() {
        if (fareQualifierDetails == null) {
            fareQualifierDetails = new ArrayList<FareQualifierDetailsType67539S>();
        }
        return this.fareQualifierDetails;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67522S }
     *     
     */
    public MonetaryInformationType67522S getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67522S }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType67522S value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the discountAndPenaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountAndPenaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountAndPenaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountAndPenaltyInformationType }
     * 
     * 
     */
    public List<DiscountAndPenaltyInformationType> getDiscountAndPenaltyInfo() {
        if (discountAndPenaltyInfo == null) {
            discountAndPenaltyInfo = new ArrayList<DiscountAndPenaltyInformationType>();
        }
        return this.discountAndPenaltyInfo;
    }

    /**
     * Gets the value of the parameterValueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public NumberOfUnitsTypeI getParameterValueInfo() {
        return parameterValueInfo;
    }

    /**
     * Sets the value of the parameterValueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public void setParameterValueInfo(NumberOfUnitsTypeI value) {
        this.parameterValueInfo = value;
    }

    /**
     * Gets the value of the seatRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public SeatRequestParametersTypeI getSeatRequestParameters() {
        return seatRequestParameters;
    }

    /**
     * Sets the value of the seatRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestParametersTypeI }
     *     
     */
    public void setSeatRequestParameters(SeatRequestParametersTypeI value) {
        this.seatRequestParameters = value;
    }

    /**
     * Gets the value of the dateAndTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationTypeI67562S }
     *     
     */
    public DateAndTimeInformationTypeI67562S getDateAndTimeInfo() {
        return dateAndTimeInfo;
    }

    /**
     * Sets the value of the dateAndTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationTypeI67562S }
     *     
     */
    public void setDateAndTimeInfo(DateAndTimeInformationTypeI67562S value) {
        this.dateAndTimeInfo = value;
    }

    /**
     * Gets the value of the referenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public ReferenceInformationTypeI getReferenceInfo() {
        return referenceInfo;
    }

    /**
     * Sets the value of the referenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI }
     *     
     */
    public void setReferenceInfo(ReferenceInformationTypeI value) {
        this.referenceInfo = value;
    }

    /**
     * Gets the value of the segmentPricingInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentPricingInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentPricingInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentPricingInfoType }
     * 
     * 
     */
    public List<SegmentPricingInfoType> getSegmentPricingInfoGroup() {
        if (segmentPricingInfoGroup == null) {
            segmentPricingInfoGroup = new ArrayList<SegmentPricingInfoType>();
        }
        return this.segmentPricingInfoGroup;
    }

    /**
     * Gets the value of the bookingClassInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingClassInfoType86938G }
     * 
     * 
     */
    public List<BookingClassInfoType86938G> getBookingClassInfoGroup() {
        if (bookingClassInfoGroup == null) {
            bookingClassInfoGroup = new ArrayList<BookingClassInfoType86938G>();
        }
        return this.bookingClassInfoGroup;
    }

    /**
     * Gets the value of the pricePsgByFareBasisInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricePsgByFareBasisInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricePsgByFareBasisInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerFareBasisType }
     * 
     * 
     */
    public List<PassengerFareBasisType> getPricePsgByFareBasisInfo() {
        if (pricePsgByFareBasisInfo == null) {
            pricePsgByFareBasisInfo = new ArrayList<PassengerFareBasisType>();
        }
        return this.pricePsgByFareBasisInfo;
    }

}
