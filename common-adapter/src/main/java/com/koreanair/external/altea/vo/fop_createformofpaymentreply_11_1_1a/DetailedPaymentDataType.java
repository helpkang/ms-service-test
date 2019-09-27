//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the Detailed Payment Data associated to a MOP
 * 
 * <p>Java class for DetailedPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="fundTransferDetailledData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}DetailedWebFundTransferType" minOccurs="0"/>
 *         &lt;element name="asyncDetailledDataGroup" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AsynchPaymentStatusGroupType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}DummySegmentTypeI"/>
 *         &lt;element name="invoiceDetailedDataGroup" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}InvoiceValidationGroupType" minOccurs="0"/>
 *         &lt;element name="creditCardDetailedData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CreditCardStatusGroupType" minOccurs="0"/>
 *         &lt;element name="webAccountDetailledData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}WebAccountSuppDataGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPaymentDataType", propOrder = {
    "fopInformation",
    "fundTransferDetailledData",
    "asyncDetailledDataGroup",
    "dummy",
    "invoiceDetailedDataGroup",
    "creditCardDetailedData",
    "webAccountDetailledData"
})
public class DetailedPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI fopInformation;
    protected DetailedWebFundTransferType fundTransferDetailledData;
    protected AsynchPaymentStatusGroupType asyncDetailledDataGroup;
    @XmlElement(required = true)
    protected DummySegmentTypeI dummy;
    protected InvoiceValidationGroupType invoiceDetailedDataGroup;
    protected CreditCardStatusGroupType creditCardDetailedData;
    protected WebAccountSuppDataGroupType webAccountDetailledData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFopInformation(FormOfPaymentTypeI value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the fundTransferDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public DetailedWebFundTransferType getFundTransferDetailledData() {
        return fundTransferDetailledData;
    }

    /**
     * Sets the value of the fundTransferDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedWebFundTransferType }
     *     
     */
    public void setFundTransferDetailledData(DetailedWebFundTransferType value) {
        this.fundTransferDetailledData = value;
    }

    /**
     * Gets the value of the asyncDetailledDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public AsynchPaymentStatusGroupType getAsyncDetailledDataGroup() {
        return asyncDetailledDataGroup;
    }

    /**
     * Sets the value of the asyncDetailledDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsynchPaymentStatusGroupType }
     *     
     */
    public void setAsyncDetailledDataGroup(AsynchPaymentStatusGroupType value) {
        this.asyncDetailledDataGroup = value;
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
     * Gets the value of the invoiceDetailedDataGroup property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public InvoiceValidationGroupType getInvoiceDetailedDataGroup() {
        return invoiceDetailedDataGroup;
    }

    /**
     * Sets the value of the invoiceDetailedDataGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceValidationGroupType }
     *     
     */
    public void setInvoiceDetailedDataGroup(InvoiceValidationGroupType value) {
        this.invoiceDetailedDataGroup = value;
    }

    /**
     * Gets the value of the creditCardDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public CreditCardStatusGroupType getCreditCardDetailedData() {
        return creditCardDetailedData;
    }

    /**
     * Sets the value of the creditCardDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public void setCreditCardDetailedData(CreditCardStatusGroupType value) {
        this.creditCardDetailedData = value;
    }

    /**
     * Gets the value of the webAccountDetailledData property.
     * 
     * @return
     *     possible object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public WebAccountSuppDataGroupType getWebAccountDetailledData() {
        return webAccountDetailledData;
    }

    /**
     * Sets the value of the webAccountDetailledData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAccountSuppDataGroupType }
     *     
     */
    public void setWebAccountDetailledData(WebAccountSuppDataGroupType value) {
        this.webAccountDetailledData = value;
    }

}
