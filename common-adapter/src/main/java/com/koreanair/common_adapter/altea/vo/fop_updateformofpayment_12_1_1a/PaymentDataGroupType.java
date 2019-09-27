//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:52 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_updateformofpayment_12_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * it will conveys all payment data
 * 
 * <p>Java class for PaymentDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantInformation" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}CompanyInformationType"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}MonetaryInformationType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}ItemReferencesAndVersionsType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="extendedPaymentInfo" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}FrequencyTypeU" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}StructuredDateTimeInformationType_130745S" minOccurs="0"/>
 *         &lt;element name="fraudScreeningData" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}FraudScreeningGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataGroupType", propOrder = {
    "merchantInformation",
    "monetaryInformation",
    "paymentId",
    "extendedPaymentInfo",
    "transactionDateTime",
    "fraudScreeningData"
})
public class PaymentDataGroupType {

    @XmlElement(required = true)
    protected CompanyInformationType merchantInformation;
    protected List<MonetaryInformationType> monetaryInformation;
    protected List<ItemReferencesAndVersionsType> paymentId;
    protected FrequencyTypeU extendedPaymentInfo;
    protected StructuredDateTimeInformationType130745S transactionDateTime;
    protected FraudScreeningGroupType fraudScreeningData;

    /**
     * Gets the value of the merchantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType }
     *     
     */
    public CompanyInformationType getMerchantInformation() {
        return merchantInformation;
    }

    /**
     * Sets the value of the merchantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType }
     *     
     */
    public void setMerchantInformation(CompanyInformationType value) {
        this.merchantInformation = value;
    }

    /**
     * Gets the value of the monetaryInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType }
     * 
     * 
     */
    public List<MonetaryInformationType> getMonetaryInformation() {
        if (monetaryInformation == null) {
            monetaryInformation = new ArrayList<MonetaryInformationType>();
        }
        return this.monetaryInformation;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReferencesAndVersionsType }
     * 
     * 
     */
    public List<ItemReferencesAndVersionsType> getPaymentId() {
        if (paymentId == null) {
            paymentId = new ArrayList<ItemReferencesAndVersionsType>();
        }
        return this.paymentId;
    }

    /**
     * Gets the value of the extendedPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTypeU }
     *     
     */
    public FrequencyTypeU getExtendedPaymentInfo() {
        return extendedPaymentInfo;
    }

    /**
     * Sets the value of the extendedPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTypeU }
     *     
     */
    public void setExtendedPaymentInfo(FrequencyTypeU value) {
        this.extendedPaymentInfo = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType130745S }
     *     
     */
    public StructuredDateTimeInformationType130745S getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType130745S }
     *     
     */
    public void setTransactionDateTime(StructuredDateTimeInformationType130745S value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the fraudScreeningData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public FraudScreeningGroupType getFraudScreeningData() {
        return fraudScreeningData;
    }

    /**
     * Sets the value of the fraudScreeningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public void setFraudScreeningData(FraudScreeningGroupType value) {
        this.fraudScreeningData = value;
    }

}
