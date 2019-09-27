//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:46 ���� KST 
//


package com.koreanair.external.altea.vo.fop_readformofpaymentdatareply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey Mean Of Payment specific data
 * 
 * <p>Java class for MeanOfPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeanOfPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}FormOfPaymentType"/>
 *         &lt;element name="fundTransferData" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}WebFundTransferGroupType" minOccurs="0"/>
 *         &lt;element name="asyncDataGroup" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}AsynchPaymentGroupType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="invoiceDataGroup" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}InvoiceFopGroupType" minOccurs="0"/>
 *         &lt;element name="creditCardData" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}CreditCardDataGroupType" minOccurs="0"/>
 *         &lt;element name="webAccountData" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}WebAccountGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeanOfPaymentDataType", propOrder = {
    "fopInformation",
    "fundTransferData",
    "asyncDataGroup",
    "dummy",
    "invoiceDataGroup",
    "creditCardData",
    "webAccountData"
})
public class MeanOfPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentType fopInformation;
    protected WebFundTransferGroupType fundTransferData;
    protected AsynchPaymentGroupType asyncDataGroup;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected InvoiceFopGroupType invoiceDataGroup;
    protected CreditCardDataGroupType creditCardData;
    protected WebAccountGroupType webAccountData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType }
     *     
     */
    public FormOfPaymentType getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType }
     *     
     */
    public void setFopInformation(FormOfPaymentType value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the fundTransferData property.
     * 
     * @return
     *     possible object is
     *     {@link WebFundTransferGroupType }
     *     
     */
    public WebFundTransferGroupType getFundTransferData() {
        return fundTransferData;
    }

    /**
     * Sets the value of the fundTransferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFundTransferGroupType }
     *     
     */
    public void setFundTransferData(WebFundTransferGroupType value) {
        this.fundTransferData = value;
    }

    /**
     * Gets the value of the asyncDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchPaymentGroupType }
     *     
     */
    public AsynchPaymentGroupType getAsyncDataGroup() {
        return asyncDataGroup;
    }

    /**
     * Sets the value of the asyncDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchPaymentGroupType }
     *     
     */
    public void setAsyncDataGroup(AsynchPaymentGroupType value) {
        this.asyncDataGroup = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public DummySegmentTypeI getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegmentTypeI }
     *     
     */
    public void setDummy(DummySegmentTypeI value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the invoiceDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFopGroupType }
     *     
     */
    public InvoiceFopGroupType getInvoiceDataGroup() {
        return invoiceDataGroup;
    }

    /**
     * Sets the value of the invoiceDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFopGroupType }
     *     
     */
    public void setInvoiceDataGroup(InvoiceFopGroupType value) {
        this.invoiceDataGroup = value;
    }

    /**
     * Gets the value of the creditCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public CreditCardDataGroupType getCreditCardData() {
        return creditCardData;
    }

    /**
     * Sets the value of the creditCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataGroupType }
     *     
     */
    public void setCreditCardData(CreditCardDataGroupType value) {
        this.creditCardData = value;
    }

    /**
     * Gets the value of the webAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountGroupType }
     *     
     */
    public WebAccountGroupType getWebAccountData() {
        return webAccountData;
    }

    /**
     * Sets the value of the webAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountGroupType }
     *     
     */
    public void setWebAccountData(WebAccountGroupType value) {
        this.webAccountData = value;
    }

}
