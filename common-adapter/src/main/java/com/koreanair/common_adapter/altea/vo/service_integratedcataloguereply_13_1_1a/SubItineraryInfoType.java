//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:38 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.service_integratedcataloguereply_13_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubItineraryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubItineraryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includedSegmentsInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}ActionDetailsType"/>
 *         &lt;element name="travelProductInfo" type="{http://xml.amadeus.com/TPICGR_13_1_1A}TravelProductInformationType_67641S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubItineraryInfoType", propOrder = {
    "includedSegmentsInfo",
    "travelProductInfo"
})
public class SubItineraryInfoType {

    @XmlElement(required = true)
    protected ActionDetailsType includedSegmentsInfo;
    protected TravelProductInformationType67641S travelProductInfo;

    /**
     * Gets the value of the includedSegmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getIncludedSegmentsInfo() {
        return includedSegmentsInfo;
    }

    /**
     * Sets the value of the includedSegmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setIncludedSegmentsInfo(ActionDetailsType value) {
        this.includedSegmentsInfo = value;
    }

    /**
     * Gets the value of the travelProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationType67641S }
     *     
     */
    public TravelProductInformationType67641S getTravelProductInfo() {
        return travelProductInfo;
    }

    /**
     * Sets the value of the travelProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationType67641S }
     *     
     */
    public void setTravelProductInfo(TravelProductInformationType67641S value) {
        this.travelProductInfo = value;
    }

}
