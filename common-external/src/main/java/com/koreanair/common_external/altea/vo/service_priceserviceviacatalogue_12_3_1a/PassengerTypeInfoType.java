//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassengerTypeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerTypeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generalAndIdInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}SegmentRepetitionControlType"/>
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareInformationType" minOccurs="0"/>
 *         &lt;element name="fareComponentsInfoGroup" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareComponentsInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerTypeInfoType", propOrder = {
    "generalAndIdInfo",
    "fareInfo",
    "fareComponentsInfoGroup"
})
public class PassengerTypeInfoType {

    @XmlElement(required = true)
    protected SegmentRepetitionControlType generalAndIdInfo;
    protected FareInformationType fareInfo;
    protected FareComponentsInfoType fareComponentsInfoGroup;

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
     * Gets the value of the fareComponentsInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentsInfoType }
     *     
     */
    public FareComponentsInfoType getFareComponentsInfoGroup() {
        return fareComponentsInfoGroup;
    }

    /**
     * Sets the value of the fareComponentsInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentsInfoType }
     *     
     */
    public void setFareComponentsInfoGroup(FareComponentsInfoType value) {
        this.fareComponentsInfoGroup = value;
    }

}
