//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.25 at 10:42:25 AM KST 
//


package com.koreanair.common_external.altea.vo.service_standalonepricingreply_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentRuleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentRuleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareComponentSegmentInfo" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}TravellerInsuranceInformationType_163226S"/>
 *         &lt;element name="fareComponentFareRulesInfo" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}FareRulesInformationTypeI" minOccurs="0"/>
 *         &lt;element name="fareComponentRuleNumberInfo" type="{http://xml.amadeus.com/TPSSGR_15_1_1A}ReferenceInfoType_163228S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentRuleInfoType", propOrder = {
    "fareComponentSegmentInfo",
    "fareComponentFareRulesInfo",
    "fareComponentRuleNumberInfo"
})
public class FareComponentRuleInfoType {

    @XmlElement(required = true)
    protected TravellerInsuranceInformationType163226S fareComponentSegmentInfo;
    protected FareRulesInformationTypeI fareComponentFareRulesInfo;
    protected ReferenceInfoType163228S fareComponentRuleNumberInfo;

    /**
     * Gets the value of the fareComponentSegmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInsuranceInformationType163226S }
     *     
     */
    public TravellerInsuranceInformationType163226S getFareComponentSegmentInfo() {
        return fareComponentSegmentInfo;
    }

    /**
     * Sets the value of the fareComponentSegmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInsuranceInformationType163226S }
     *     
     */
    public void setFareComponentSegmentInfo(TravellerInsuranceInformationType163226S value) {
        this.fareComponentSegmentInfo = value;
    }

    /**
     * Gets the value of the fareComponentFareRulesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesInformationTypeI }
     *     
     */
    public FareRulesInformationTypeI getFareComponentFareRulesInfo() {
        return fareComponentFareRulesInfo;
    }

    /**
     * Sets the value of the fareComponentFareRulesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesInformationTypeI }
     *     
     */
    public void setFareComponentFareRulesInfo(FareRulesInformationTypeI value) {
        this.fareComponentFareRulesInfo = value;
    }

    /**
     * Gets the value of the fareComponentRuleNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType163228S }
     *     
     */
    public ReferenceInfoType163228S getFareComponentRuleNumberInfo() {
        return fareComponentRuleNumberInfo;
    }

    /**
     * Sets the value of the fareComponentRuleNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType163228S }
     *     
     */
    public void setFareComponentRuleNumberInfo(ReferenceInfoType163228S value) {
        this.fareComponentRuleNumberInfo = value;
    }

}
