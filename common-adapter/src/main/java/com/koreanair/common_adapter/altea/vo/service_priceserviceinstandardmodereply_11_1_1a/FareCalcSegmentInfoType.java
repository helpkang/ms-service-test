//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_adapter.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for FareCalcSegmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCalcSegmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}FareCalculationCodeDetailsType"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}MonetaryInformationType_67627S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCalcSegmentInfoType", propOrder = {
    "fareCalculationCodeDetails",
    "monetaryInfo"
})
public class FareCalcSegmentInfoType {

    @XmlElement(required = true)
    protected FareCalculationCodeDetailsType fareCalculationCodeDetails;
    protected MonetaryInformationType67627S monetaryInfo;

    /**
     * Gets the value of the fareCalculationCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public FareCalculationCodeDetailsType getFareCalculationCodeDetails() {
        return fareCalculationCodeDetails;
    }

    /**
     * Sets the value of the fareCalculationCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCalculationCodeDetailsType }
     *     
     */
    public void setFareCalculationCodeDetails(FareCalculationCodeDetailsType value) {
        this.fareCalculationCodeDetails = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67627S }
     *     
     */
    public MonetaryInformationType67627S getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67627S }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationType67627S value) {
        this.monetaryInfo = value;
    }

}
