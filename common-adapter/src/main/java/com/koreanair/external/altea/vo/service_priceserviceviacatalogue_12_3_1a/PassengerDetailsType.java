//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:38 ���� KST 
//


package com.koreanair.external.altea.vo.service_priceserviceviacatalogue_12_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for PassengerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FareInformationType_67521S"/>
 *         &lt;element name="dateDiscountInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}DateAndTimeInformationType" minOccurs="0"/>
 *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}FormOfPaymentType" minOccurs="0"/>
 *         &lt;element name="segmentDiscountInfo" type="{http://xml.amadeus.com/TPSCGQ_12_3_1A}ActionDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetailsType", propOrder = {
    "fareInfo",
    "dateDiscountInfo",
    "formOfPayment",
    "segmentDiscountInfo"
})
public class PassengerDetailsType {

    @XmlElement(required = true)
    protected FareInformationType67521S fareInfo;
    protected DateAndTimeInformationType dateDiscountInfo;
    protected FormOfPaymentType formOfPayment;
    protected ActionDetailsType segmentDiscountInfo;

    /**
     * Gets the value of the fareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformationType67521S }
     *     
     */
    public FareInformationType67521S getFareInfo() {
        return fareInfo;
    }

    /**
     * Sets the value of the fareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformationType67521S }
     *     
     */
    public void setFareInfo(FareInformationType67521S value) {
        this.fareInfo = value;
    }

    /**
     * Gets the value of the dateDiscountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public DateAndTimeInformationType getDateDiscountInfo() {
        return dateDiscountInfo;
    }

    /**
     * Sets the value of the dateDiscountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeInformationType }
     *     
     */
    public void setDateDiscountInfo(DateAndTimeInformationType value) {
        this.dateDiscountInfo = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFormOfPayment(FormOfPaymentType value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the segmentDiscountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsType }
     *     
     */
    public ActionDetailsType getSegmentDiscountInfo() {
        return segmentDiscountInfo;
    }

    /**
     * Sets the value of the segmentDiscountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsType }
     *     
     */
    public void setSegmentDiscountInfo(ActionDetailsType value) {
        this.segmentDiscountInfo = value;
    }

}
