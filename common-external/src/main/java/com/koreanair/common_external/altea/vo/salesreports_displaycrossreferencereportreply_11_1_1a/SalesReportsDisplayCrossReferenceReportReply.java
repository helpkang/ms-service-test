//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:11:27 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displaycrossreferencereportreply_11_1_1a;

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
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="crossReferenceReportDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}AdditionalBusinessSourceInformationTypeI"/>
 *                   &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
 *                   &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}CurrenciesTypeU"/>
 *                   &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *                   &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
 *                   &lt;element name="documentGroup" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TicketNumberTypeI"/>
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}MonetaryInformationTypeI"/>
 *                             &lt;element name="stockDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StockInformationType" minOccurs="0"/>
 *                             &lt;element name="invoice" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}DocumentInformationDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TravellerInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
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
    "crossReferenceReportDetails"
})
@XmlRootElement(name = "SalesReports_DisplayCrossReferenceReportReply")
public class SalesReportsDisplayCrossReferenceReportReply {

    protected ErrorGroupType errorGroup;
    protected CrossReferenceReportDetails crossReferenceReportDetails;

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
     * Gets the value of the crossReferenceReportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CrossReferenceReportDetails }
     *     
     */
    public CrossReferenceReportDetails getCrossReferenceReportDetails() {
        return crossReferenceReportDetails;
    }

    /**
     * Sets the value of the crossReferenceReportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossReferenceReportDetails }
     *     
     */
    public void setCrossReferenceReportDetails(CrossReferenceReportDetails value) {
        this.crossReferenceReportDetails = value;
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
     *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}AdditionalBusinessSourceInformationTypeI"/>
     *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
     *         &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}CurrenciesTypeU"/>
     *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ActionDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
     *         &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
     *         &lt;element name="documentGroup" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TicketNumberTypeI"/>
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}MonetaryInformationTypeI"/>
     *                   &lt;element name="stockDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StockInformationType" minOccurs="0"/>
     *                   &lt;element name="invoice" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}DocumentInformationDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TravellerInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
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
        "agencyDetails",
        "dateDetails",
        "currencyInfo",
        "actionDetails",
        "salesPeriodDetails",
        "agentUserDetails",
        "documentGroup"
    })
    public static class CrossReferenceReportDetails {

        @XmlElement(required = true)
        protected AdditionalBusinessSourceInformationTypeI agencyDetails;
        @XmlElement(required = true)
        protected List<StructuredDateTimeInformationType> dateDetails;
        @XmlElement(required = true)
        protected CurrenciesTypeU currencyInfo;
        protected ActionDetailsTypeI actionDetails;
        protected StructuredPeriodInformationType salesPeriodDetails;
        protected UserIdentificationType agentUserDetails;
        protected List<DocumentGroup> documentGroup;

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
         * Gets the value of the documentGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentGroup }
         * 
         * 
         */
        public List<DocumentGroup> getDocumentGroup() {
            if (documentGroup == null) {
                documentGroup = new ArrayList<DocumentGroup>();
            }
            return this.documentGroup;
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
         *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TicketNumberTypeI"/>
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}MonetaryInformationTypeI"/>
         *         &lt;element name="stockDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}StockInformationType" minOccurs="0"/>
         *         &lt;element name="invoice" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}DocumentInformationDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="passengerName" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}TravellerInformationTypeI" minOccurs="0"/>
         *         &lt;element name="reservationInformation" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
         *         &lt;element name="agentUserDetails" type="{http://xml.amadeus.com/TSRXRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
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
            "documentNumber",
            "monetaryInformation",
            "stockDetails",
            "invoice",
            "passengerName",
            "reservationInformation",
            "agentUserDetails"
        })
        public static class DocumentGroup {

            @XmlElement(required = true)
            protected TicketNumberTypeI documentNumber;
            @XmlElement(required = true)
            protected MonetaryInformationTypeI monetaryInformation;
            protected StockInformationType stockDetails;
            protected DocumentInformationDetailsTypeI invoice;
            protected TravellerInformationTypeI passengerName;
            protected ReservationControlInformationTypeI reservationInformation;
            protected UserIdentificationType agentUserDetails;

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
             * Gets the value of the stockDetails property.
             * 
             * @return
             *     possible object is
             *     {@link StockInformationType }
             *     
             */
            public StockInformationType getStockDetails() {
                return stockDetails;
            }

            /**
             * Sets the value of the stockDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link StockInformationType }
             *     
             */
            public void setStockDetails(StockInformationType value) {
                this.stockDetails = value;
            }

            /**
             * Gets the value of the invoice property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentInformationDetailsTypeI }
             *     
             */
            public DocumentInformationDetailsTypeI getInvoice() {
                return invoice;
            }

            /**
             * Sets the value of the invoice property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentInformationDetailsTypeI }
             *     
             */
            public void setInvoice(DocumentInformationDetailsTypeI value) {
                this.invoice = value;
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

        }

    }

}
