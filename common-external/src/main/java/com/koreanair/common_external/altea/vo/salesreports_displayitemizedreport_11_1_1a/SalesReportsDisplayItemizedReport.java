//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:13:21 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displayitemizedreport_11_1_1a;

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
 *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}ItemNumberTypeI" minOccurs="0"/>
 *         &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}UserIdentificationType" minOccurs="0"/>
 *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}CurrenciesTypeU" minOccurs="0"/>
 *         &lt;element name="requestOption" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="validatingCarrierDetails" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="salesIndicator" type="{http://xml.amadeus.com/TSRIRQ_11_1_1A}StatusType" minOccurs="0"/>
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
    "salesReportIdentification",
    "agentUserDetails",
    "agencyDetails",
    "currency",
    "requestOption",
    "validatingCarrierDetails",
    "salesIndicator"
})
@XmlRootElement(name = "SalesReports_DisplayItemizedReport")
public class SalesReportsDisplayItemizedReport {

    protected ActionDetailsTypeI actionDetails;
    protected ItemNumberTypeI salesReportIdentification;
    protected UserIdentificationType agentUserDetails;
    protected AdditionalBusinessSourceInformationTypeI agencyDetails;
    protected CurrenciesTypeU currency;
    protected SelectionDetailsTypeI requestOption;
    protected TransportIdentifierType validatingCarrierDetails;
    protected StatusType salesIndicator;

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
     * Gets the value of the salesReportIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public ItemNumberTypeI getSalesReportIdentification() {
        return salesReportIdentification;
    }

    /**
     * Sets the value of the salesReportIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public void setSalesReportIdentification(ItemNumberTypeI value) {
        this.salesReportIdentification = value;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrenciesTypeU }
     *     
     */
    public CurrenciesTypeU getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrenciesTypeU }
     *     
     */
    public void setCurrency(CurrenciesTypeU value) {
        this.currency = value;
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

}
