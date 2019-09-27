//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 02:19:18 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displayqueryreportreply_10_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="queryReportDataDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}CurrenciesTypeU"/>
 *                   &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
 *                   &lt;element name="queryReportDataOfficeGroup" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requestorAgencyDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}AdditionalBusinessSourceInformationTypeI"/>
 *                             &lt;element name="documentData" maxOccurs="5000">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sequenceIdentification" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ItemNumberTypeI"/>
 *                                       &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TicketNumberTypeI"/>
 *                                       &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}MonetaryInformationTypeI"/>
 *                                       &lt;element name="bookingAgent" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType"/>
 *                                       &lt;element name="transactionDataDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TransactionInformationForTicketingType"/>
 *                                       &lt;element name="fopDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}GeneralFopRepresentationType"/>
 *                                       &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TravellerInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
 *                   &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "errorGroup",
    "queryReportDataDetails"
})
@XmlRootElement(name = "SalesReports_DisplayQueryReportReply")
public class SalesReportsDisplayQueryReportReply {

    protected ErrorGroupType errorGroup;
    protected SalesReportsDisplayQueryReportReply.QueryReportDataDetails queryReportDataDetails;

    /**
     * Gets the value of the errorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType }
     *     
     */
    public ErrorGroupType getErrorGroup() {
        return errorGroup;
    }

    /**
     * Sets the value of the errorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType }
     *     
     */
    public void setErrorGroup(ErrorGroupType value) {
        this.errorGroup = value;
    }

    /**
     * Gets the value of the queryReportDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SalesReportsDisplayQueryReportReply.QueryReportDataDetails }
     *     
     */
    public SalesReportsDisplayQueryReportReply.QueryReportDataDetails getQueryReportDataDetails() {
        return queryReportDataDetails;
    }

    /**
     * Sets the value of the queryReportDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesReportsDisplayQueryReportReply.QueryReportDataDetails }
     *     
     */
    public void setQueryReportDataDetails(SalesReportsDisplayQueryReportReply.QueryReportDataDetails value) {
        this.queryReportDataDetails = value;
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
     *         &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}CurrenciesTypeU"/>
     *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
     *         &lt;element name="queryReportDataOfficeGroup" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requestorAgencyDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}AdditionalBusinessSourceInformationTypeI"/>
     *                   &lt;element name="documentData" maxOccurs="5000">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sequenceIdentification" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ItemNumberTypeI"/>
     *                             &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TicketNumberTypeI"/>
     *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}MonetaryInformationTypeI"/>
     *                             &lt;element name="bookingAgent" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType"/>
     *                             &lt;element name="transactionDataDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TransactionInformationForTicketingType"/>
     *                             &lt;element name="fopDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}GeneralFopRepresentationType"/>
     *                             &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TravellerInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
     *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ActionDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
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
        "currencyInfo",
        "dateDetails",
        "queryReportDataOfficeGroup",
        "agentDetails",
        "actionDetails",
        "salesPeriodDetails"
    })
    public static class QueryReportDataDetails {

        @XmlElement(required = true)
        protected CurrenciesTypeU currencyInfo;
        @XmlElement(required = true)
        protected List<StructuredDateTimeInformationType> dateDetails;
        @XmlElement(required = true)
        protected List<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup> queryReportDataOfficeGroup;
        protected UserIdentificationType agentDetails;
        protected ActionDetailsTypeI actionDetails;
        protected StructuredPeriodInformationType salesPeriodDetails;

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
         * Gets the value of the dateDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dateDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDateDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDateDetails() {
            if (dateDetails == null) {
                dateDetails = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dateDetails;
        }

        /**
         * Gets the value of the queryReportDataOfficeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queryReportDataOfficeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueryReportDataOfficeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup }
         * 
         * 
         */
        public List<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup> getQueryReportDataOfficeGroup() {
            if (queryReportDataOfficeGroup == null) {
                queryReportDataOfficeGroup = new ArrayList<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup>();
            }
            return this.queryReportDataOfficeGroup;
        }

        /**
         * Gets the value of the agentDetails property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType }
         *     
         */
        public UserIdentificationType getAgentDetails() {
            return agentDetails;
        }

        /**
         * Sets the value of the agentDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType }
         *     
         */
        public void setAgentDetails(UserIdentificationType value) {
            this.agentDetails = value;
        }

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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="requestorAgencyDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}AdditionalBusinessSourceInformationTypeI"/>
         *         &lt;element name="documentData" maxOccurs="5000">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sequenceIdentification" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ItemNumberTypeI"/>
         *                   &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TicketNumberTypeI"/>
         *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}MonetaryInformationTypeI"/>
         *                   &lt;element name="bookingAgent" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType"/>
         *                   &lt;element name="transactionDataDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TransactionInformationForTicketingType"/>
         *                   &lt;element name="fopDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}GeneralFopRepresentationType"/>
         *                   &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TravellerInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "requestorAgencyDetails",
            "documentData"
        })
        public static class QueryReportDataOfficeGroup {

            @XmlElement(required = true)
            protected AdditionalBusinessSourceInformationTypeI requestorAgencyDetails;
            @XmlElement(required = true)
            protected List<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup.DocumentData> documentData;

            /**
             * Gets the value of the requestorAgencyDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalBusinessSourceInformationTypeI }
             *     
             */
            public AdditionalBusinessSourceInformationTypeI getRequestorAgencyDetails() {
                return requestorAgencyDetails;
            }

            /**
             * Sets the value of the requestorAgencyDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalBusinessSourceInformationTypeI }
             *     
             */
            public void setRequestorAgencyDetails(AdditionalBusinessSourceInformationTypeI value) {
                this.requestorAgencyDetails = value;
            }

            /**
             * Gets the value of the documentData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the documentData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocumentData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup.DocumentData }
             * 
             * 
             */
            public List<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup.DocumentData> getDocumentData() {
                if (documentData == null) {
                    documentData = new ArrayList<SalesReportsDisplayQueryReportReply.QueryReportDataDetails.QueryReportDataOfficeGroup.DocumentData>();
                }
                return this.documentData;
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
             *         &lt;element name="sequenceIdentification" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ItemNumberTypeI"/>
             *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TicketNumberTypeI"/>
             *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}MonetaryInformationTypeI"/>
             *         &lt;element name="bookingAgent" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}UserIdentificationType"/>
             *         &lt;element name="transactionDataDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TransactionInformationForTicketingType"/>
             *         &lt;element name="fopDetails" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}GeneralFopRepresentationType"/>
             *         &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}TravellerInformationTypeI" minOccurs="0"/>
             *         &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRQRR_10_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
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
                "sequenceIdentification",
                "documentNumber",
                "monetaryInformation",
                "bookingAgent",
                "transactionDataDetails",
                "fopDetails",
                "passengerName",
                "reservationInformation"
            })
            public static class DocumentData {

                @XmlElement(required = true)
                protected ItemNumberTypeI sequenceIdentification;
                @XmlElement(required = true)
                protected TicketNumberTypeI documentNumber;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI monetaryInformation;
                @XmlElement(required = true)
                protected UserIdentificationType bookingAgent;
                @XmlElement(required = true)
                protected TransactionInformationForTicketingType transactionDataDetails;
                @XmlElement(required = true)
                protected GeneralFopRepresentationType fopDetails;
                protected TravellerInformationTypeI passengerName;
                protected ReservationControlInformationTypeI reservationInformation;

                /**
                 * Gets the value of the sequenceIdentification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberTypeI }
                 *     
                 */
                public ItemNumberTypeI getSequenceIdentification() {
                    return sequenceIdentification;
                }

                /**
                 * Sets the value of the sequenceIdentification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberTypeI }
                 *     
                 */
                public void setSequenceIdentification(ItemNumberTypeI value) {
                    this.sequenceIdentification = value;
                }

                /**
                 * Gets the value of the documentNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public TicketNumberTypeI getDocumentNumber() {
                    return documentNumber;
                }

                /**
                 * Sets the value of the documentNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public void setDocumentNumber(TicketNumberTypeI value) {
                    this.documentNumber = value;
                }

                /**
                 * Gets the value of the monetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public MonetaryInformationTypeI getMonetaryInformation() {
                    return monetaryInformation;
                }

                /**
                 * Sets the value of the monetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public void setMonetaryInformation(MonetaryInformationTypeI value) {
                    this.monetaryInformation = value;
                }

                /**
                 * Gets the value of the bookingAgent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserIdentificationType }
                 *     
                 */
                public UserIdentificationType getBookingAgent() {
                    return bookingAgent;
                }

                /**
                 * Sets the value of the bookingAgent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserIdentificationType }
                 *     
                 */
                public void setBookingAgent(UserIdentificationType value) {
                    this.bookingAgent = value;
                }

                /**
                 * Gets the value of the transactionDataDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransactionInformationForTicketingType }
                 *     
                 */
                public TransactionInformationForTicketingType getTransactionDataDetails() {
                    return transactionDataDetails;
                }

                /**
                 * Sets the value of the transactionDataDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransactionInformationForTicketingType }
                 *     
                 */
                public void setTransactionDataDetails(TransactionInformationForTicketingType value) {
                    this.transactionDataDetails = value;
                }

                /**
                 * Gets the value of the fopDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GeneralFopRepresentationType }
                 *     
                 */
                public GeneralFopRepresentationType getFopDetails() {
                    return fopDetails;
                }

                /**
                 * Sets the value of the fopDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GeneralFopRepresentationType }
                 *     
                 */
                public void setFopDetails(GeneralFopRepresentationType value) {
                    this.fopDetails = value;
                }

                /**
                 * Gets the value of the passengerName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerInformationTypeI }
                 *     
                 */
                public TravellerInformationTypeI getPassengerName() {
                    return passengerName;
                }

                /**
                 * Sets the value of the passengerName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerInformationTypeI }
                 *     
                 */
                public void setPassengerName(TravellerInformationTypeI value) {
                    this.passengerName = value;
                }

                /**
                 * Gets the value of the reservationInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public ReservationControlInformationTypeI getReservationInformation() {
                    return reservationInformation;
                }

                /**
                 * Sets the value of the reservationInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public void setReservationInformation(ReservationControlInformationTypeI value) {
                    this.reservationInformation = value;
                }

            }

        }

    }

}
