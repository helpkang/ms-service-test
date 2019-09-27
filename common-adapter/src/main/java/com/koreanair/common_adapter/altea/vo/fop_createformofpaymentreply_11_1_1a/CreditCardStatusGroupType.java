//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_createformofpaymentreply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all the detailed payment status related to credit Card
 * 
 * <p>Java class for CreditCardStatusGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardStatusGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorisationSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}SpecificVisaLinkCreditCardInformationType"/>
 *         &lt;element name="approvalDetails" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}GenericAuthorisationResultType" minOccurs="0"/>
 *         &lt;element name="localDateTime" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}StructuredDateTimeInformationType_78487S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="authorisationInformation" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}TransactionInformationForTicketingType" minOccurs="0"/>
 *         &lt;element name="browserData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="browserProperties" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}BrowserInformationType"/>
 *                   &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FreeTextInformationType_68642S" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tdsInformation" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ThreeDomainSecureGroupType" minOccurs="0"/>
 *         &lt;element name="cardSupplementaryData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AttributeType_84807S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ErrorGroupType_87954G" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardStatusGroupType", propOrder = {
    "authorisationSupplementaryData",
    "approvalDetails",
    "localDateTime",
    "authorisationInformation",
    "browserData",
    "tdsInformation",
    "cardSupplementaryData",
    "transactionStatus"
})
public class CreditCardStatusGroupType {

    @XmlElement(required = true)
    protected SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData;
    protected GenericAuthorisationResultType approvalDetails;
    protected List<StructuredDateTimeInformationType78487S> localDateTime;
    protected TransactionInformationForTicketingType authorisationInformation;
    protected CreditCardStatusGroupType.BrowserData browserData;
    protected ThreeDomainSecureGroupType tdsInformation;
    protected List<AttributeType84807S> cardSupplementaryData;
    protected List<ErrorGroupType87954G> transactionStatus;

    /**
     * Gets the value of the authorisationSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public SpecificVisaLinkCreditCardInformationType getAuthorisationSupplementaryData() {
        return authorisationSupplementaryData;
    }

    /**
     * Sets the value of the authorisationSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificVisaLinkCreditCardInformationType }
     *     
     */
    public void setAuthorisationSupplementaryData(SpecificVisaLinkCreditCardInformationType value) {
        this.authorisationSupplementaryData = value;
    }

    /**
     * Gets the value of the approvalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public GenericAuthorisationResultType getApprovalDetails() {
        return approvalDetails;
    }

    /**
     * Sets the value of the approvalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericAuthorisationResultType }
     *     
     */
    public void setApprovalDetails(GenericAuthorisationResultType value) {
        this.approvalDetails = value;
    }

    /**
     * Gets the value of the localDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformationType78487S }
     * 
     * 
     */
    public List<StructuredDateTimeInformationType78487S> getLocalDateTime() {
        if (localDateTime == null) {
            localDateTime = new ArrayList<StructuredDateTimeInformationType78487S>();
        }
        return this.localDateTime;
    }

    /**
     * Gets the value of the authorisationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public TransactionInformationForTicketingType getAuthorisationInformation() {
        return authorisationInformation;
    }

    /**
     * Sets the value of the authorisationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationForTicketingType }
     *     
     */
    public void setAuthorisationInformation(TransactionInformationForTicketingType value) {
        this.authorisationInformation = value;
    }

    /**
     * Gets the value of the browserData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public CreditCardStatusGroupType.BrowserData getBrowserData() {
        return browserData;
    }

    /**
     * Sets the value of the browserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType.BrowserData }
     *     
     */
    public void setBrowserData(CreditCardStatusGroupType.BrowserData value) {
        this.browserData = value;
    }

    /**
     * Gets the value of the tdsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public ThreeDomainSecureGroupType getTdsInformation() {
        return tdsInformation;
    }

    /**
     * Sets the value of the tdsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDomainSecureGroupType }
     *     
     */
    public void setTdsInformation(ThreeDomainSecureGroupType value) {
        this.tdsInformation = value;
    }

    /**
     * Gets the value of the cardSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType84807S }
     * 
     * 
     */
    public List<AttributeType84807S> getCardSupplementaryData() {
        if (cardSupplementaryData == null) {
            cardSupplementaryData = new ArrayList<AttributeType84807S>();
        }
        return this.cardSupplementaryData;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType87954G }
     * 
     * 
     */
    public List<ErrorGroupType87954G> getTransactionStatus() {
        if (transactionStatus == null) {
            transactionStatus = new ArrayList<ErrorGroupType87954G>();
        }
        return this.transactionStatus;
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
     *         &lt;element name="browserProperties" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}BrowserInformationType"/>
     *         &lt;element name="freeFlowBrowserData" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}FreeTextInformationType_68642S" maxOccurs="2" minOccurs="0"/>
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
        "browserProperties",
        "freeFlowBrowserData"
    })
    public static class BrowserData {

        @XmlElement(required = true)
        protected BrowserInformationType browserProperties;
        protected List<FreeTextInformationType68642S> freeFlowBrowserData;

        /**
         * Gets the value of the browserProperties property.
         * 
         * @return
         *     possible object is
         *     {@link BrowserInformationType }
         *     
         */
        public BrowserInformationType getBrowserProperties() {
            return browserProperties;
        }

        /**
         * Sets the value of the browserProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link BrowserInformationType }
         *     
         */
        public void setBrowserProperties(BrowserInformationType value) {
            this.browserProperties = value;
        }

        /**
         * Gets the value of the freeFlowBrowserData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFlowBrowserData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFlowBrowserData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeTextInformationType68642S }
         * 
         * 
         */
        public List<FreeTextInformationType68642S> getFreeFlowBrowserData() {
            if (freeFlowBrowserData == null) {
                freeFlowBrowserData = new ArrayList<FreeTextInformationType68642S>();
            }
            return this.freeFlowBrowserData;
        }

    }

}
