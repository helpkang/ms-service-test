//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_3_1a;

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
 *         &lt;element name="fareComponentSegmentInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}TravellerInsuranceInformationType_67600S"/>
 *         &lt;element name="fareComponentFareRulesInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}FareRulesInformationTypeI" minOccurs="0"/>
 *         &lt;element name="fareComponentRuleNumberInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}ReferenceInfoType" minOccurs="0"/>
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
    protected TravellerInsuranceInformationType67600S fareComponentSegmentInfo;
    protected FareRulesInformationTypeI fareComponentFareRulesInfo;
    protected ReferenceInfoType fareComponentRuleNumberInfo;

    /**
     * Gets the value of the fareComponentSegmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInsuranceInformationType67600S }
     *     
     */
    public TravellerInsuranceInformationType67600S getFareComponentSegmentInfo() {
        return fareComponentSegmentInfo;
    }

    /**
     * Sets the value of the fareComponentSegmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInsuranceInformationType67600S }
     *     
     */
    public void setFareComponentSegmentInfo(TravellerInsuranceInformationType67600S value) {
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
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getFareComponentRuleNumberInfo() {
        return fareComponentRuleNumberInfo;
    }

    /**
     * Sets the value of the fareComponentRuleNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setFareComponentRuleNumberInfo(ReferenceInfoType value) {
        this.fareComponentRuleNumberInfo = value;
    }

}
