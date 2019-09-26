//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for TicketingAdditionalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingAdditionalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pricingTicketingSubsequent" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}PricingOrTicketingSubsequentType"/>
 *         &lt;element name="fareQualifierDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="discountAndPenaltyInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
 *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}InteractiveFreeTextType" minOccurs="0"/>
 *         &lt;element name="tourCodeInformation" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TourInformationType" minOccurs="0"/>
 *         &lt;element name="carValueCodeInformation" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="validatingCxr" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TransportIdentifierTypeI" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingAdditionalInfoType", propOrder = {
    "pricingTicketingSubsequent",
    "fareQualifierDetails",
    "discountAndPenaltyInfo",
    "interactiveFreeText",
    "tourCodeInformation",
    "carValueCodeInformation",
    "validatingCxr"
})
public class TicketingAdditionalInfoType {

    @XmlElement(required = true)
    protected PricingOrTicketingSubsequentType pricingTicketingSubsequent;
    protected FareQualifierDetailsTypeI fareQualifierDetails;
    protected DiscountAndPenaltyInformationTypeI discountAndPenaltyInfo;
    protected InteractiveFreeTextType interactiveFreeText;
    protected TourInformationType tourCodeInformation;
    protected ReferenceInfoType carValueCodeInformation;
    protected List<TransportIdentifierTypeI> validatingCxr;

    /**
     * Gets the value of the pricingTicketingSubsequent property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public PricingOrTicketingSubsequentType getPricingTicketingSubsequent() {
        return pricingTicketingSubsequent;
    }

    /**
     * Sets the value of the pricingTicketingSubsequent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOrTicketingSubsequentType }
     *     
     */
    public void setPricingTicketingSubsequent(PricingOrTicketingSubsequentType value) {
        this.pricingTicketingSubsequent = value;
    }

    /**
     * Gets the value of the fareQualifierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareQualifierDetailsTypeI }
     *     
     */
    public FareQualifierDetailsTypeI getFareQualifierDetails() {
        return fareQualifierDetails;
    }

    /**
     * Sets the value of the fareQualifierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareQualifierDetailsTypeI }
     *     
     */
    public void setFareQualifierDetails(FareQualifierDetailsTypeI value) {
        this.fareQualifierDetails = value;
    }

    /**
     * Gets the value of the discountAndPenaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAndPenaltyInformationTypeI }
     *     
     */
    public DiscountAndPenaltyInformationTypeI getDiscountAndPenaltyInfo() {
        return discountAndPenaltyInfo;
    }

    /**
     * Sets the value of the discountAndPenaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAndPenaltyInformationTypeI }
     *     
     */
    public void setDiscountAndPenaltyInfo(DiscountAndPenaltyInformationTypeI value) {
        this.discountAndPenaltyInfo = value;
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
     * Gets the value of the tourCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TourInformationType }
     *     
     */
    public TourInformationType getTourCodeInformation() {
        return tourCodeInformation;
    }

    /**
     * Sets the value of the tourCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourInformationType }
     *     
     */
    public void setTourCodeInformation(TourInformationType value) {
        this.tourCodeInformation = value;
    }

    /**
     * Gets the value of the carValueCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getCarValueCodeInformation() {
        return carValueCodeInformation;
    }

    /**
     * Sets the value of the carValueCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setCarValueCodeInformation(ReferenceInfoType value) {
        this.carValueCodeInformation = value;
    }

    /**
     * Gets the value of the validatingCxr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validatingCxr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidatingCxr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportIdentifierTypeI }
     * 
     * 
     */
    public List<TransportIdentifierTypeI> getValidatingCxr() {
        if (validatingCxr == null) {
            validatingCxr = new ArrayList<TransportIdentifierTypeI>();
        }
        return this.validatingCxr;
    }

}
