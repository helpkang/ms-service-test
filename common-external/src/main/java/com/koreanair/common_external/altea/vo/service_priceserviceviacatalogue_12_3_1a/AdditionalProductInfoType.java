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
 * <p>Java class for AdditionalProductInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalFlightInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}AdditionalProductDetailsTypeI"/>
 *         &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}DateAndTimeInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductInfoType", propOrder = {
    "additionalFlightInfo",
    "dateAndTimeInfo"
})
public class AdditionalProductInfoType {

    @XmlElement(required = true)
    protected AdditionalProductDetailsTypeI additionalFlightInfo;
    protected DateAndTimeInformationType dateAndTimeInfo;

    /**
     * Gets the value of the additionalFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public AdditionalProductDetailsTypeI getAdditionalFlightInfo() {
        return additionalFlightInfo;
    }

    /**
     * Sets the value of the additionalFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsTypeI }
     *     
     */
    public void setAdditionalFlightInfo(AdditionalProductDetailsTypeI value) {
        this.additionalFlightInfo = value;
    }

    /**
     * Gets the value of the dateAndTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public DateAndTimeInformationType getDateAndTimeInfo() {
        return dateAndTimeInfo;
    }

    /**
     * Sets the value of the dateAndTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public void setDateAndTimeInfo(DateAndTimeInformationType value) {
        this.dateAndTimeInfo = value;
    }

}
