//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey Web Account detailed payment data
 * 
 * <p>Java class for WebAccountSuppDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebAccountSuppDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pspIndicator" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}StatusType_68646S"/>
 *         &lt;element name="uatpCard" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CreditCardDataType" minOccurs="0"/>
 *         &lt;element name="paypalParameters" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}StatusType_84988S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="pspUrl" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CommunicationContactType_84973S" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AddressType_68644S" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}TravellerInformationType" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ReferenceInfoType" minOccurs="0"/>
 *         &lt;element name="merchantSiteDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countryData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CountryInformationTypeU"/>
 *                   &lt;element name="cppPspColor" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FreeTextInformationType_68651S" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="urls" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CommunicationContactType_84973S" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="errorDescription" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="severityCodeType" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ResponseAnalysisDetailsType_84985S"/>
 *                   &lt;element name="paymentError" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ErrorGroupType" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebAccountSuppDataGroupType", propOrder = {
    "pspIndicator",
    "uatpCard",
    "paypalParameters",
    "pspUrl",
    "shippingAddress",
    "payerName",
    "accountNumber",
    "merchantSiteDetails",
    "errorDescription"
})
public class WebAccountSuppDataGroupType {

    @XmlElement(required = true)
    protected StatusType68646S pspIndicator;
    protected CreditCardDataType uatpCard;
    protected List<StatusType84988S> paypalParameters;
    protected CommunicationContactType84973S pspUrl;
    protected AddressType68644S shippingAddress;
    protected TravellerInformationType payerName;
    protected ReferenceInfoType accountNumber;
    protected MerchantSiteDetails merchantSiteDetails;
    protected List<ErrorDescription> errorDescription;

    /**
     * Gets the value of the pspIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType68646S }
     *     
     */
    public StatusType68646S getPspIndicator() {
        return pspIndicator;
    }

    /**
     * Sets the value of the pspIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType68646S }
     *     
     */
    public void setPspIndicator(StatusType68646S value) {
        this.pspIndicator = value;
    }

    /**
     * Gets the value of the uatpCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getUatpCard() {
        return uatpCard;
    }

    /**
     * Sets the value of the uatpCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setUatpCard(CreditCardDataType value) {
        this.uatpCard = value;
    }

    /**
     * Gets the value of the paypalParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paypalParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaypalParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType84988S }
     * 
     * 
     */
    public List<StatusType84988S> getPaypalParameters() {
        if (paypalParameters == null) {
            paypalParameters = new ArrayList<StatusType84988S>();
        }
        return this.paypalParameters;
    }

    /**
     * Gets the value of the pspUrl property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType84973S }
     *     
     */
    public CommunicationContactType84973S getPspUrl() {
        return pspUrl;
    }

    /**
     * Sets the value of the pspUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType84973S }
     *     
     */
    public void setPspUrl(CommunicationContactType84973S value) {
        this.pspUrl = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType68644S }
     *     
     */
    public AddressType68644S getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType68644S }
     *     
     */
    public void setShippingAddress(AddressType68644S value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType }
     *     
     */
    public TravellerInformationType getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType }
     *     
     */
    public void setPayerName(TravellerInformationType value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType }
     *     
     */
    public ReferenceInfoType getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType }
     *     
     */
    public void setAccountNumber(ReferenceInfoType value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the merchantSiteDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantSiteDetails }
     *     
     */
    public MerchantSiteDetails getMerchantSiteDetails() {
        return merchantSiteDetails;
    }

    /**
     * Sets the value of the merchantSiteDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantSiteDetails }
     *     
     */
    public void setMerchantSiteDetails(MerchantSiteDetails value) {
        this.merchantSiteDetails = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDescription }
     * 
     * 
     */
    public List<ErrorDescription> getErrorDescription() {
        if (errorDescription == null) {
            errorDescription = new ArrayList<ErrorDescription>();
        }
        return this.errorDescription;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="severityCodeType" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ResponseAnalysisDetailsType_84985S"/>
     *         &lt;element name="paymentError" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ErrorGroupType" maxOccurs="2" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "severityCodeType",
        "paymentError"
    })
    public static class ErrorDescription {

        @XmlElement(required = true)
        protected ResponseAnalysisDetailsType84985S severityCodeType;
        protected List<ErrorGroupType> paymentError;

        /**
         * Gets the value of the severityCodeType property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseAnalysisDetailsType84985S }
         *     
         */
        public ResponseAnalysisDetailsType84985S getSeverityCodeType() {
            return severityCodeType;
        }

        /**
         * Sets the value of the severityCodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseAnalysisDetailsType84985S }
         *     
         */
        public void setSeverityCodeType(ResponseAnalysisDetailsType84985S value) {
            this.severityCodeType = value;
        }

        /**
         * Gets the value of the paymentError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorGroupType }
         * 
         * 
         */
        public List<ErrorGroupType> getPaymentError() {
            if (paymentError == null) {
                paymentError = new ArrayList<ErrorGroupType>();
            }
            return this.paymentError;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="countryData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CountryInformationTypeU"/>
     *         &lt;element name="cppPspColor" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FreeTextInformationType_68651S" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="urls" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CommunicationContactType_84973S" maxOccurs="3" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "countryData",
        "cppPspColor",
        "urls"
    })
    public static class MerchantSiteDetails {

        @XmlElement(required = true)
        protected CountryInformationTypeU countryData;
        protected List<FreeTextInformationType68651S> cppPspColor;
        protected List<CommunicationContactType84973S> urls;

        /**
         * Gets the value of the countryData property.
         * 
         * @return
         *     possible object is
         *     {@link CountryInformationTypeU }
         *     
         */
        public CountryInformationTypeU getCountryData() {
            return countryData;
        }

        /**
         * Sets the value of the countryData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryInformationTypeU }
         *     
         */
        public void setCountryData(CountryInformationTypeU value) {
            this.countryData = value;
        }

        /**
         * Gets the value of the cppPspColor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cppPspColor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCppPspColor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType68651S }
         * 
         * 
         */
        public List<FreeTextInformationType68651S> getCppPspColor() {
            if (cppPspColor == null) {
                cppPspColor = new ArrayList<FreeTextInformationType68651S>();
            }
            return this.cppPspColor;
        }

        /**
         * Gets the value of the urls property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the urls property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUrls().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommunicationContactType84973S }
         * 
         * 
         */
        public List<CommunicationContactType84973S> getUrls() {
            if (urls == null) {
                urls = new ArrayList<CommunicationContactType84973S>();
            }
            return this.urls;
        }

    }

}
