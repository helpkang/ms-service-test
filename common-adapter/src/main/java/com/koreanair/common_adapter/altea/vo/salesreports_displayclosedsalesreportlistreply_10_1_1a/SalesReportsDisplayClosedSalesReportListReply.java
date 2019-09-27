//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:09:14 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displayclosedsalesreportlistreply_10_1_1a;

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
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="listReportDataDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}AdditionalBusinessSourceInformationTypeI"/>
 *                   &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StructuredDateTimeInformationType"/>
 *                   &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
 *                   &lt;element name="reportGroup" maxOccurs="5000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ItemNumberTypeI"/>
 *                             &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StructuredPeriodInformationType"/>
 *                             &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}CurrenciesTypeU"/>
 *                             &lt;element name="salesReportStatus" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StatusType"/>
 *                             &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
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
    "listReportDataDetails"
})
@XmlRootElement(name = "SalesReports_DisplayClosedSalesReportListReply")
public class SalesReportsDisplayClosedSalesReportListReply {

    protected ErrorGroupType errorGroup;
    protected SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails listReportDataDetails;

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
     * Gets the value of the listReportDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails }
     *     
     */
    public SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails getListReportDataDetails() {
        return listReportDataDetails;
    }

    /**
     * Sets the value of the listReportDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails }
     *     
     */
    public void setListReportDataDetails(SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails value) {
        this.listReportDataDetails = value;
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
     *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}AdditionalBusinessSourceInformationTypeI"/>
     *         &lt;element name="dateDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StructuredDateTimeInformationType"/>
     *         &lt;element name="actionDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ActionDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
     *         &lt;element name="reportGroup" maxOccurs="5000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ItemNumberTypeI"/>
     *                   &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StructuredPeriodInformationType"/>
     *                   &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}CurrenciesTypeU"/>
     *                   &lt;element name="salesReportStatus" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StatusType"/>
     *                   &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
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
        "actionDetails",
        "agentDetails",
        "reportGroup"
    })
    public static class ListReportDataDetails {

        @XmlElement(required = true)
        protected AdditionalBusinessSourceInformationTypeI agencyDetails;
        @XmlElement(required = true)
        protected StructuredDateTimeInformationType dateDetails;
        protected ActionDetailsTypeI actionDetails;
        protected UserIdentificationType agentDetails;
        @XmlElement(required = true)
        protected List<SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails.ReportGroup> reportGroup;

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
         * Gets the value of the reportGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails.ReportGroup }
         * 
         * 
         */
        public List<SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails.ReportGroup> getReportGroup() {
            if (reportGroup == null) {
                reportGroup = new ArrayList<SalesReportsDisplayClosedSalesReportListReply.ListReportDataDetails.ReportGroup>();
            }
            return this.reportGroup;
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
         *         &lt;element name="salesReportIdentification" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}ItemNumberTypeI"/>
         *         &lt;element name="salesPeriodDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StructuredPeriodInformationType"/>
         *         &lt;element name="currencyInfo" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}CurrenciesTypeU"/>
         *         &lt;element name="salesReportStatus" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}StatusType"/>
         *         &lt;element name="agentDetails" type="{http://xml.amadeus.com/TSRLRR_10_1_1A}UserIdentificationType" minOccurs="0"/>
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
            "salesPeriodDetails",
            "currencyInfo",
            "salesReportStatus",
            "agentDetails"
        })
        public static class ReportGroup {

            @XmlElement(required = true)
            protected ItemNumberTypeI salesReportIdentification;
            @XmlElement(required = true)
            protected StructuredPeriodInformationType salesPeriodDetails;
            @XmlElement(required = true)
            protected CurrenciesTypeU currencyInfo;
            @XmlElement(required = true)
            protected StatusType salesReportStatus;
            protected UserIdentificationType agentDetails;

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
             * Gets the value of the salesReportStatus property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType }
             *     
             */
            public StatusType getSalesReportStatus() {
                return salesReportStatus;
            }

            /**
             * Sets the value of the salesReportStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType }
             *     
             */
            public void setSalesReportStatus(StatusType value) {
                this.salesReportStatus = value;
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

        }

    }

}
