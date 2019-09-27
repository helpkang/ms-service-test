//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 03:41:49 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.docrefund_processrefundreply_13_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents Invoice fop to validate.
 * 
 * <p>Java class for InvoiceFopGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFopGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceInformation" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="parentTicketGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentNumber" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}TicketNumberType"/>
 *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}MonetaryInformationType" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="eDocrecordLocator" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}ReservationControlInformationType" minOccurs="0"/>
 *                   &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}TravellerInformationType" minOccurs="0"/>
 *                   &lt;element name="dates" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
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
@XmlType(name = "InvoiceFopGroupType", propOrder = {
    "invoiceInformation",
    "parentTicketGroup"
})
public class InvoiceFopGroupType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI invoiceInformation;
    protected List<InvoiceFopGroupType.ParentTicketGroup> parentTicketGroup;

    /**
     * Gets the value of the invoiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getInvoiceInformation() {
        return invoiceInformation;
    }

    /**
     * Sets the value of the invoiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setInvoiceInformation(FormOfPaymentTypeI value) {
        this.invoiceInformation = value;
    }

    /**
     * Gets the value of the parentTicketGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentTicketGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentTicketGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFopGroupType.ParentTicketGroup }
     * 
     * 
     */
    public List<InvoiceFopGroupType.ParentTicketGroup> getParentTicketGroup() {
        if (parentTicketGroup == null) {
            parentTicketGroup = new ArrayList<InvoiceFopGroupType.ParentTicketGroup>();
        }
        return this.parentTicketGroup;
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
     *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}TicketNumberType"/>
     *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}MonetaryInformationType" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="eDocrecordLocator" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}ReservationControlInformationType" minOccurs="0"/>
     *         &lt;element name="recipientNameSurname" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}TravellerInformationType" minOccurs="0"/>
     *         &lt;element name="dates" type="{http://xml.amadeus.com/TRFPCR_13_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
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
        "eDocrecordLocator",
        "recipientNameSurname",
        "dates"
    })
    public static class ParentTicketGroup {

        @XmlElement(required = true)
        protected TicketNumberType documentNumber;
        protected List<MonetaryInformationType> monetaryInformation;
        protected ReservationControlInformationType eDocrecordLocator;
        protected TravellerInformationType recipientNameSurname;
        protected List<StructuredDateTimeInformationType> dates;

        /**
         * Gets the value of the documentNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberType }
         *     
         */
        public TicketNumberType getDocumentNumber() {
            return documentNumber;
        }

        /**
         * Sets the value of the documentNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberType }
         *     
         */
        public void setDocumentNumber(TicketNumberType value) {
            this.documentNumber = value;
        }

        /**
         * Gets the value of the monetaryInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMonetaryInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MonetaryInformationType }
         * 
         * 
         */
        public List<MonetaryInformationType> getMonetaryInformation() {
            if (monetaryInformation == null) {
                monetaryInformation = new ArrayList<MonetaryInformationType>();
            }
            return this.monetaryInformation;
        }

        /**
         * Gets the value of the eDocrecordLocator property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public ReservationControlInformationType getEDocrecordLocator() {
            return eDocrecordLocator;
        }

        /**
         * Sets the value of the eDocrecordLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public void setEDocrecordLocator(ReservationControlInformationType value) {
            this.eDocrecordLocator = value;
        }

        /**
         * Gets the value of the recipientNameSurname property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformationType }
         *     
         */
        public TravellerInformationType getRecipientNameSurname() {
            return recipientNameSurname;
        }

        /**
         * Sets the value of the recipientNameSurname property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformationType }
         *     
         */
        public void setRecipientNameSurname(TravellerInformationType value) {
            this.recipientNameSurname = value;
        }

        /**
         * Gets the value of the dates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getDates() {
            if (dates == null) {
                dates = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.dates;
        }

    }

}
