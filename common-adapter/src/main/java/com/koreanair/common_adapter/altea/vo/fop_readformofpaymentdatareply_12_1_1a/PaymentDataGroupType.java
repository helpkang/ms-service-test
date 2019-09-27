//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:46 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_readformofpaymentdatareply_12_1_1a;

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
 *         &lt;element name="merchantInformation" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}CompanyInformationType_68665S"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}MonetaryInformationType_141915S" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}ItemReferencesAndVersionsType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="extendedPaymentInfo" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}FrequencyTypeU" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}StructuredDateTimeInformationType_68632S" minOccurs="0"/>
 *         &lt;element name="expirationPeriod" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}QuantityType" minOccurs="0"/>
 *         &lt;element name="distributionChannelInformation" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}TerminalIdentificationDescriptionType" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}FreeTextInformationType_68651S" minOccurs="0"/>
 *         &lt;element name="association" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}ReferenceInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="fraudScreeningData" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}FraudScreeningGroupType" minOccurs="0"/>
 *         &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}AttributeType_125922S" maxOccurs="99" minOccurs="0"/>
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
    "expirationPeriod",
    "distributionChannelInformation",
    "purchaseDescription",
    "association",
    "fraudScreeningData",
    "paymentDataMap"
})
public class PaymentDataGroupType {

    @XmlElement(required = true)
    protected CompanyInformationType68665S merchantInformation;
    protected List<MonetaryInformationType141915S> monetaryInformation;
    protected List<ItemReferencesAndVersionsType> paymentId;
    protected FrequencyTypeU extendedPaymentInfo;
    protected StructuredDateTimeInformationType68632S transactionDateTime;
    protected QuantityType expirationPeriod;
    protected TerminalIdentificationDescriptionType distributionChannelInformation;
    protected FreeTextInformationType68651S purchaseDescription;
    protected List<ReferenceInfoType> association;
    protected FraudScreeningGroupType fraudScreeningData;
    protected List<AttributeType125922S> paymentDataMap;

    /**
     * Gets the value of the merchantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType68665S }
     *     
     */
    public CompanyInformationType68665S getMerchantInformation() {
        return merchantInformation;
    }

    /**
     * Sets the value of the merchantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType68665S }
     *     
     */
    public void setMerchantInformation(CompanyInformationType68665S value) {
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
     * {@link MonetaryInformationType141915S }
     * 
     * 
     */
    public List<MonetaryInformationType141915S> getMonetaryInformation() {
        if (monetaryInformation == null) {
            monetaryInformation = new ArrayList<MonetaryInformationType141915S>();
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
     *     {@link StructuredDateTimeInformationType68632S }
     *     
     */
    public StructuredDateTimeInformationType68632S getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType68632S }
     *     
     */
    public void setTransactionDateTime(StructuredDateTimeInformationType68632S value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the expirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Sets the value of the expirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setExpirationPeriod(QuantityType value) {
        this.expirationPeriod = value;
    }

    /**
     * Gets the value of the distributionChannelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public TerminalIdentificationDescriptionType getDistributionChannelInformation() {
        return distributionChannelInformation;
    }

    /**
     * Sets the value of the distributionChannelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentificationDescriptionType }
     *     
     */
    public void setDistributionChannelInformation(TerminalIdentificationDescriptionType value) {
        this.distributionChannelInformation = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType68651S }
     *     
     */
    public FreeTextInformationType68651S getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType68651S }
     *     
     */
    public void setPurchaseDescription(FreeTextInformationType68651S value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType }
     * 
     * 
     */
    public List<ReferenceInfoType> getAssociation() {
        if (association == null) {
            association = new ArrayList<ReferenceInfoType>();
        }
        return this.association;
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

    /**
     * Gets the value of the paymentDataMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDataMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDataMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType125922S }
     * 
     * 
     */
    public List<AttributeType125922S> getPaymentDataMap() {
        if (paymentDataMap == null) {
            paymentDataMap = new ArrayList<AttributeType125922S>();
        }
        return this.paymentDataMap;
    }

}
