//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceintegratemode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerFaresInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerFaresInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}SegmentRepetitionControlType"/>
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FareInformationType" minOccurs="0"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="fareCalcConvertInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ConversionRateType_67496S" minOccurs="0"/>
 *         &lt;element name="taxesDetailsInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TaxType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}InteractiveFreeTextType" minOccurs="0"/>
 *         &lt;element name="ticketInfoGroup" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}GeneralTicketInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="issuePaymentInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FormOfPaymentType" minOccurs="0"/>
 *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}TourInformationType" minOccurs="0"/>
 *         &lt;element name="issueFeeBreakInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}FeeBreakdownType" minOccurs="0"/>
 *         &lt;element name="issueStorageInfo" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}BinaryDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerFaresInfoType", propOrder = {
    "segmentRepetitionControl",
    "fareInfo",
    "monetaryInfo",
    "fareCalcConvertInfo",
    "taxesDetailsInfo",
    "interactiveFreeText",
    "ticketInfoGroup",
    "issuePaymentInfo",
    "tourInfo",
    "issueFeeBreakInfo",
    "issueStorageInfo"
})
public class PassengerFaresInfoType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlType segmentRepetitionControl;
    protected FareInformationType fareInfo;
    protected MonetaryInformationType monetaryInfo;
    protected ConversionRateType67496S fareCalcConvertInfo;
    protected List<TaxType> taxesDetailsInfo;
    protected InteractiveFreeTextType interactiveFreeText;
    protected List<GeneralTicketInfoType> ticketInfoGroup;
    protected FormOfPaymentType issuePaymentInfo;
    protected TourInformationType tourInfo;
    protected FeeBreakdownType issueFeeBreakInfo;
    protected BinaryDataType issueStorageInfo;

    /**
     * Gets the value of the segmentRepetitionControl property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public SegmentRepetitionControlType getSegmentRepetitionControl() {
        return segmentRepetitionControl;
    }

    /**
     * Sets the value of the segmentRepetitionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentRepetitionControlType }
     *     
     */
    public void setSegmentRepetitionControl(SegmentRepetitionControlType value) {
        this.segmentRepetitionControl = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationType }
     *     
     */
    public FareInformationType getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationType }
     *     
     */
    public void setFareInfo(FareInformationType value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType value) {
        this.monetaryInfo = value;
    }

    /**
     * Gets the value of the fareCalcConvertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public ConversionRateType67496S getFareCalcConvertInfo() {
        return fareCalcConvertInfo;
    }

    /**
     * Sets the value of the fareCalcConvertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateType67496S }
     *     
     */
    public void setFareCalcConvertInfo(ConversionRateType67496S value) {
        this.fareCalcConvertInfo = value;
    }

    /**
     * Gets the value of the taxesDetailsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxesDetailsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxesDetailsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTaxesDetailsInfo() {
        if (taxesDetailsInfo == null) {
            taxesDetailsInfo = new ArrayList<TaxType>();
        }
        return this.taxesDetailsInfo;
    }

    /**
     * Gets the value of the interactiveFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public InteractiveFreeTextType getInteractiveFreeText() {
        return interactiveFreeText;
    }

    /**
     * Sets the value of the interactiveFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public void setInteractiveFreeText(InteractiveFreeTextType value) {
        this.interactiveFreeText = value;
    }

    /**
     * Gets the value of the ticketInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralTicketInfoType }
     * 
     * 
     */
    public List<GeneralTicketInfoType> getTicketInfoGroup() {
        if (ticketInfoGroup == null) {
            ticketInfoGroup = new ArrayList<GeneralTicketInfoType>();
        }
        return this.ticketInfoGroup;
    }

    /**
     * Gets the value of the issuePaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getIssuePaymentInfo() {
        return issuePaymentInfo;
    }

    /**
     * Sets the value of the issuePaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setIssuePaymentInfo(FormOfPaymentType value) {
        this.issuePaymentInfo = value;
    }

    /**
     * Gets the value of the tourInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TourInformationType }
     *     
     */
    public TourInformationType getTourInfo() {
        return tourInfo;
    }

    /**
     * Sets the value of the tourInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourInformationType }
     *     
     */
    public void setTourInfo(TourInformationType value) {
        this.tourInfo = value;
    }

    /**
     * Gets the value of the issueFeeBreakInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeeBreakdownType }
     *     
     */
    public FeeBreakdownType getIssueFeeBreakInfo() {
        return issueFeeBreakInfo;
    }

    /**
     * Sets the value of the issueFeeBreakInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeBreakdownType }
     *     
     */
    public void setIssueFeeBreakInfo(FeeBreakdownType value) {
        this.issueFeeBreakInfo = value;
    }

    /**
     * Gets the value of the issueStorageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataType }
     *     
     */
    public BinaryDataType getIssueStorageInfo() {
        return issueStorageInfo;
    }

    /**
     * Sets the value of the issueStorageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataType }
     *     
     */
    public void setIssueStorageInfo(BinaryDataType value) {
        this.issueStorageInfo = value;
    }

}
