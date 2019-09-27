//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralTicketInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralTicketInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ticketDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TicketNumberType"/>
 *         &lt;element name="ticketSegmentInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TravelProductInformationType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ticketInformationDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PricingTicketingDetailsType" minOccurs="0"/>
 *         &lt;element name="pricingTicketingSubsequent" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
 *         &lt;element name="ticketServiceInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}SpecificDataInformationType_67504S" minOccurs="0"/>
 *         &lt;element name="issueSegSurchargeInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FareCalculationCodeDetailsType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="issueExtraBaggageInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ExcessBaggageType" minOccurs="0"/>
 *         &lt;element name="issueSegDateInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}DateAndTimeInformationType" minOccurs="0"/>
 *         &lt;element name="couponInformation" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}CouponInformationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralTicketInfoType", propOrder = {
    "ticketDetails",
    "ticketSegmentInfo",
    "ticketInformationDetails",
    "pricingTicketingSubsequent",
    "ticketServiceInfo",
    "issueSegSurchargeInfo",
    "issueExtraBaggageInfo",
    "issueSegDateInfo",
    "couponInformation"
})
public class GeneralTicketInfoType {

    @XmlElement(required = true)
    protected TicketNumberType ticketDetails;
    protected List<TravelProductInformationType> ticketSegmentInfo;
    protected PricingTicketingDetailsType ticketInformationDetails;
    protected PricingTicketingSubsequentTypeI pricingTicketingSubsequent;
    protected SpecificDataInformationType67504S ticketServiceInfo;
    protected List<FareCalculationCodeDetailsType> issueSegSurchargeInfo;
    protected ExcessBaggageType issueExtraBaggageInfo;
    protected DateAndTimeInformationType issueSegDateInfo;
    @XmlElement(required = true)
    protected CouponInformationTypeI couponInformation;

    /**
     * Gets the value of the ticketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberType }
     *     
     */
    public TicketNumberType getTicketDetails() {
        return ticketDetails;
    }

    /**
     * Sets the value of the ticketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberType }
     *     
     */
    public void setTicketDetails(TicketNumberType value) {
        this.ticketDetails = value;
    }

    /**
     * Gets the value of the ticketSegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketSegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelProductInformationType }
     * 
     * 
     */
    public List<TravelProductInformationType> getTicketSegmentInfo() {
        if (ticketSegmentInfo == null) {
            ticketSegmentInfo = new ArrayList<TravelProductInformationType>();
        }
        return this.ticketSegmentInfo;
    }

    /**
     * Gets the value of the ticketInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public PricingTicketingDetailsType getTicketInformationDetails() {
        return ticketInformationDetails;
    }

    /**
     * Sets the value of the ticketInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsType }
     *     
     */
    public void setTicketInformationDetails(PricingTicketingDetailsType value) {
        this.ticketInformationDetails = value;
    }

    /**
     * Gets the value of the pricingTicketingSubsequent property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public PricingTicketingSubsequentTypeI getPricingTicketingSubsequent() {
        return pricingTicketingSubsequent;
    }

    /**
     * Sets the value of the pricingTicketingSubsequent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingSubsequentTypeI }
     *     
     */
    public void setPricingTicketingSubsequent(PricingTicketingSubsequentTypeI value) {
        this.pricingTicketingSubsequent = value;
    }

    /**
     * Gets the value of the ticketServiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationType67504S }
     *     
     */
    public SpecificDataInformationType67504S getTicketServiceInfo() {
        return ticketServiceInfo;
    }

    /**
     * Sets the value of the ticketServiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationType67504S }
     *     
     */
    public void setTicketServiceInfo(SpecificDataInformationType67504S value) {
        this.ticketServiceInfo = value;
    }

    /**
     * Gets the value of the issueSegSurchargeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueSegSurchargeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueSegSurchargeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCalculationCodeDetailsType }
     * 
     * 
     */
    public List<FareCalculationCodeDetailsType> getIssueSegSurchargeInfo() {
        if (issueSegSurchargeInfo == null) {
            issueSegSurchargeInfo = new ArrayList<FareCalculationCodeDetailsType>();
        }
        return this.issueSegSurchargeInfo;
    }

    /**
     * Gets the value of the issueExtraBaggageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageType }
     *     
     */
    public ExcessBaggageType getIssueExtraBaggageInfo() {
        return issueExtraBaggageInfo;
    }

    /**
     * Sets the value of the issueExtraBaggageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageType }
     *     
     */
    public void setIssueExtraBaggageInfo(ExcessBaggageType value) {
        this.issueExtraBaggageInfo = value;
    }

    /**
     * Gets the value of the issueSegDateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public DateAndTimeInformationType getIssueSegDateInfo() {
        return issueSegDateInfo;
    }

    /**
     * Sets the value of the issueSegDateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public void setIssueSegDateInfo(DateAndTimeInformationType value) {
        this.issueSegDateInfo = value;
    }

    /**
     * Gets the value of the couponInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationTypeI }
     *     
     */
    public CouponInformationTypeI getCouponInformation() {
        return couponInformation;
    }

    /**
     * Sets the value of the couponInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationTypeI }
     *     
     */
    public void setCouponInformation(CouponInformationTypeI value) {
        this.couponInformation = value;
    }

}
