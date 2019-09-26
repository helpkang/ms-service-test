//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:12:02 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displaydailyorsummarizedreportreply_11_1_1a;

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
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="dailySummaryReportDataDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}ItemNumberTypeI"/>
 *                   &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
 *                   &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}CurrenciesTypeU"/>
 *                   &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}AdditionalBusinessSourceInformationTypeI"/>
 *                   &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *                   &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
 *                   &lt;element name="sectionGroup" maxOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sectionType" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}CodedAttributeType"/>
 *                             &lt;element name="fopSectionGroup" maxOccurs="3">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
 *                                       &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FormOfPaymentTypeI_54063S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dummy" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="formOfPaymentGroup" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FOPRepresentationType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="volumeDetails" maxOccurs="19" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="transactionData" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}TransactionInformationForTicketingType"/>
 *                             &lt;element name="quantity" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}QuantityType" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
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
    "dailySummaryReportDataDetails"
})
@XmlRootElement(name = "SalesReports_DisplayDailyOrSummarizedReportReply")
public class SalesReportsDisplayDailyOrSummarizedReportReply {

    protected ErrorGroupType errorGroup;
    protected DailySummaryReportDataDetails dailySummaryReportDataDetails;

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
     * Gets the value of the dailySummaryReportDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryReportDataDetails }
     *     
     */
    public DailySummaryReportDataDetails getDailySummaryReportDataDetails() {
        return dailySummaryReportDataDetails;
    }

    /**
     * Sets the value of the dailySummaryReportDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryReportDataDetails }
     *     
     */
    public void setDailySummaryReportDataDetails(DailySummaryReportDataDetails value) {
        this.dailySummaryReportDataDetails = value;
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
     *         &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}ItemNumberTypeI"/>
     *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}StructuredDateTimeInformationType" maxOccurs="2"/>
     *         &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}CurrenciesTypeU"/>
     *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}AdditionalBusinessSourceInformationTypeI"/>
     *         &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
     *         &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}UserIdentificationType" minOccurs="0"/>
     *         &lt;element name="sectionGroup" maxOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sectionType" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}CodedAttributeType"/>
     *                   &lt;element name="fopSectionGroup" maxOccurs="3">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
     *                             &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FormOfPaymentTypeI_54063S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dummy" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="formOfPaymentGroup" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FOPRepresentationType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="volumeDetails" maxOccurs="19" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="transactionData" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}TransactionInformationForTicketingType"/>
     *                   &lt;element name="quantity" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}QuantityType" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
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
        "salesReportIdentification",
        "dateDetails",
        "currencyInfo",
        "agencyDetails",
        "salesPeriodDetails",
        "agentDetails",
        "sectionGroup",
        "volumeDetails"
    })
    public static class DailySummaryReportDataDetails {

        @XmlElement(required = true)
        protected ItemNumberTypeI salesReportIdentification;
        @XmlElement(required = true)
        protected List<StructuredDateTimeInformationType> dateDetails;
        @XmlElement(required = true)
        protected CurrenciesTypeU currencyInfo;
        @XmlElement(required = true)
        protected AdditionalBusinessSourceInformationTypeI agencyDetails;
        protected StructuredPeriodInformationType salesPeriodDetails;
        protected UserIdentificationType agentDetails;
        @XmlElement(required = true)
        protected List<SectionGroup> sectionGroup;
        protected List<VolumeDetails> volumeDetails;

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
         * Gets the value of the sectionGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SectionGroup }
         * 
         * 
         */
        public List<SectionGroup> getSectionGroup() {
            if (sectionGroup == null) {
                sectionGroup = new ArrayList<SectionGroup>();
            }
            return this.sectionGroup;
        }

        /**
         * Gets the value of the volumeDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the volumeDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVolumeDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VolumeDetails }
         * 
         * 
         */
        public List<VolumeDetails> getVolumeDetails() {
            if (volumeDetails == null) {
                volumeDetails = new ArrayList<VolumeDetails>();
            }
            return this.volumeDetails;
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
         *         &lt;element name="sectionType" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}CodedAttributeType"/>
         *         &lt;element name="fopSectionGroup" maxOccurs="3">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
         *                   &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FormOfPaymentTypeI_54063S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dummy" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="formOfPaymentGroup" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FOPRepresentationType" maxOccurs="99"/>
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
            "sectionType",
            "fopSectionGroup",
            "dummy",
            "formOfPaymentGroup"
        })
        public static class SectionGroup {

            @XmlElement(required = true)
            protected CodedAttributeType sectionType;
            @XmlElement(required = true)
            protected List<FopSectionGroup> fopSectionGroup;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummy;
            @XmlElement(required = true)
            protected List<FOPRepresentationType> formOfPaymentGroup;

            /**
             * Gets the value of the sectionType property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType }
             *     
             */
            public CodedAttributeType getSectionType() {
                return sectionType;
            }

            /**
             * Sets the value of the sectionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType }
             *     
             */
            public void setSectionType(CodedAttributeType value) {
                this.sectionType = value;
            }

            /**
             * Gets the value of the fopSectionGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fopSectionGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFopSectionGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FopSectionGroup }
             * 
             * 
             */
            public List<FopSectionGroup> getFopSectionGroup() {
                if (fopSectionGroup == null) {
                    fopSectionGroup = new ArrayList<FopSectionGroup>();
                }
                return this.fopSectionGroup;
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
             * Gets the value of the formOfPaymentGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the formOfPaymentGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFormOfPaymentGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FOPRepresentationType }
             * 
             * 
             */
            public List<FOPRepresentationType> getFormOfPaymentGroup() {
                if (formOfPaymentGroup == null) {
                    formOfPaymentGroup = new ArrayList<FOPRepresentationType>();
                }
                return this.formOfPaymentGroup;
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
             *         &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
             *         &lt;element name="formOfPaymentDetails" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}FormOfPaymentTypeI_54063S" minOccurs="0"/>
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
                "monetaryAmount",
                "formOfPaymentDetails"
            })
            public static class FopSectionGroup {

                @XmlElement(required = true)
                protected MonetaryInformationTypeI monetaryAmount;
                protected FormOfPaymentTypeI54063S formOfPaymentDetails;

                /**
                 * Gets the value of the monetaryAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public MonetaryInformationTypeI getMonetaryAmount() {
                    return monetaryAmount;
                }

                /**
                 * Sets the value of the monetaryAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI }
                 *     
                 */
                public void setMonetaryAmount(MonetaryInformationTypeI value) {
                    this.monetaryAmount = value;
                }

                /**
                 * Gets the value of the formOfPaymentDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormOfPaymentTypeI54063S }
                 *     
                 */
                public FormOfPaymentTypeI54063S getFormOfPaymentDetails() {
                    return formOfPaymentDetails;
                }

                /**
                 * Sets the value of the formOfPaymentDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormOfPaymentTypeI54063S }
                 *     
                 */
                public void setFormOfPaymentDetails(FormOfPaymentTypeI54063S value) {
                    this.formOfPaymentDetails = value;
                }

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
         *         &lt;element name="transactionData" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}TransactionInformationForTicketingType"/>
         *         &lt;element name="quantity" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}QuantityType" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="monetaryAmount" type="{http://xml.amadeus.com/TSRSRR_11_1_1A}MonetaryInformationTypeI"/>
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
            "transactionData",
            "quantity",
            "monetaryAmount"
        })
        public static class VolumeDetails {

            @XmlElement(required = true)
            protected TransactionInformationForTicketingType transactionData;
            protected List<QuantityType> quantity;
            @XmlElement(required = true)
            protected MonetaryInformationTypeI monetaryAmount;

            /**
             * Gets the value of the transactionData property.
             * 
             * @return
             *     possible object is
             *     {@link TransactionInformationForTicketingType }
             *     
             */
            public TransactionInformationForTicketingType getTransactionData() {
                return transactionData;
            }

            /**
             * Sets the value of the transactionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransactionInformationForTicketingType }
             *     
             */
            public void setTransactionData(TransactionInformationForTicketingType value) {
                this.transactionData = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the quantity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQuantity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QuantityType }
             * 
             * 
             */
            public List<QuantityType> getQuantity() {
                if (quantity == null) {
                    quantity = new ArrayList<QuantityType>();
                }
                return this.quantity;
            }

            /**
             * Gets the value of the monetaryAmount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getMonetaryAmount() {
                return monetaryAmount;
            }

            /**
             * Sets the value of the monetaryAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setMonetaryAmount(MonetaryInformationTypeI value) {
                this.monetaryAmount = value;
            }

        }

    }

}
