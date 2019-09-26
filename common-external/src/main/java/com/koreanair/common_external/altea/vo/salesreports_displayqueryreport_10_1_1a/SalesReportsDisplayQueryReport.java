//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 02:09:37 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displayqueryreport_10_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}UserIdentificationType" minOccurs="0"/>
 *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *         &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}CurrenciesTypeU" minOccurs="0"/>
 *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *         &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *         &lt;element name="transactionData" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}TransactionInformationForTicketingType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}FormOfPaymentTypeI" minOccurs="0"/>
 *         &lt;element name="validatingCarrierDetails" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="requestOption" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="salesIndicator" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="fromSequenceDocumentNumber" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}ItemNumberTypeI" minOccurs="0"/>
 *         &lt;element name="attributeInfo" type="{http://xml.amadeus.com/TSRQRQ_10_1_1A}CodedAttributeType" minOccurs="0"/>
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
    "actionDetails",
    "agentUserDetails",
    "dateDetails",
    "currencyInfo",
    "agencyDetails",
    "salesPeriodDetails",
    "transactionData",
    "formOfPaymentDetails",
    "validatingCarrierDetails",
    "requestOption",
    "salesIndicator",
    "fromSequenceDocumentNumber",
    "attributeInfo"
})
@XmlRootElement(name = "SalesReports_DisplayQueryReport")
public class SalesReportsDisplayQueryReport {

    protected ActionDetailsTypeI actionDetails;
    protected UserIdentificationType agentUserDetails;
    protected StructuredDateTimeInformationType dateDetails;
    protected CurrenciesTypeU currencyInfo;
    protected AdditionalBusinessSourceInformationTypeI agencyDetails;
    protected StructuredPeriodInformationType salesPeriodDetails;
    protected List<TransactionInformationForTicketingType> transactionData;
    protected FormOfPaymentTypeI formOfPaymentDetails;
    protected TransportIdentifierType validatingCarrierDetails;
    protected SelectionDetailsTypeI requestOption;
    protected StatusType salesIndicator;
    protected ItemNumberTypeI fromSequenceDocumentNumber;
    protected CodedAttributeType attributeInfo;

    /**
     * Gets the value of the actionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getActionDetails() {
        return actionDetails;
    }

    /**
     * Sets the value of the actionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setActionDetails(ActionDetailsTypeI value) {
        this.actionDetails = value;
    }

    /**
     * Gets the value of the agentUserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType }
     *     
     */
    public UserIdentificationType getAgentUserDetails() {
        return agentUserDetails;
    }

    /**
     * Sets the value of the agentUserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType }
     *     
     */
    public void setAgentUserDetails(UserIdentificationType value) {
        this.agentUserDetails = value;
    }

    /**
     * Gets the value of the dateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public StructuredDateTimeInformationType getDateDetails() {
        return dateDetails;
    }

    /**
     * Sets the value of the dateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public void setDateDetails(StructuredDateTimeInformationType value) {
        this.dateDetails = value;
    }

    /**
     * Gets the value of the currencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrenciesTypeU }
     *     
     */
    public CurrenciesTypeU getCurrencyInfo() {
        return currencyInfo;
    }

    /**
     * Sets the value of the currencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrenciesTypeU }
     *     
     */
    public void setCurrencyInfo(CurrenciesTypeU value) {
        this.currencyInfo = value;
    }

    /**
     * Gets the value of the agencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public AdditionalBusinessSourceInformationTypeI getAgencyDetails() {
        return agencyDetails;
    }

    /**
     * Sets the value of the agencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public void setAgencyDetails(AdditionalBusinessSourceInformationTypeI value) {
        this.agencyDetails = value;
    }

    /**
     * Gets the value of the salesPeriodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public StructuredPeriodInformationType getSalesPeriodDetails() {
        return salesPeriodDetails;
    }

    /**
     * Sets the value of the salesPeriodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public void setSalesPeriodDetails(StructuredPeriodInformationType value) {
        this.salesPeriodDetails = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionInformationForTicketingType }
     * 
     * 
     */
    public List<TransactionInformationForTicketingType> getTransactionData() {
        if (transactionData == null) {
            transactionData = new ArrayList<TransactionInformationForTicketingType>();
        }
        return this.transactionData;
    }

    /**
     * Gets the value of the formOfPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFormOfPaymentDetails() {
        return formOfPaymentDetails;
    }

    /**
     * Sets the value of the formOfPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFormOfPaymentDetails(FormOfPaymentTypeI value) {
        this.formOfPaymentDetails = value;
    }

    /**
     * Gets the value of the validatingCarrierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType }
     *     
     */
    public TransportIdentifierType getValidatingCarrierDetails() {
        return validatingCarrierDetails;
    }

    /**
     * Sets the value of the validatingCarrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType }
     *     
     */
    public void setValidatingCarrierDetails(TransportIdentifierType value) {
        this.validatingCarrierDetails = value;
    }

    /**
     * Gets the value of the requestOption property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public SelectionDetailsTypeI getRequestOption() {
        return requestOption;
    }

    /**
     * Sets the value of the requestOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsTypeI }
     *     
     */
    public void setRequestOption(SelectionDetailsTypeI value) {
        this.requestOption = value;
    }

    /**
     * Gets the value of the salesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getSalesIndicator() {
        return salesIndicator;
    }

    /**
     * Sets the value of the salesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setSalesIndicator(StatusType value) {
        this.salesIndicator = value;
    }

    /**
     * Gets the value of the fromSequenceDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public ItemNumberTypeI getFromSequenceDocumentNumber() {
        return fromSequenceDocumentNumber;
    }

    /**
     * Sets the value of the fromSequenceDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public void setFromSequenceDocumentNumber(ItemNumberTypeI value) {
        this.fromSequenceDocumentNumber = value;
    }

    /**
     * Gets the value of the attributeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getAttributeInfo() {
        return attributeInfo;
    }

    /**
     * Sets the value of the attributeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setAttributeInfo(CodedAttributeType value) {
        this.attributeInfo = value;
    }

}
