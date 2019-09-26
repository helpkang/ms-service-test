//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:59 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_updateformofpaymentreply_12_1_1a;

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
 *         &lt;element name="invoiceInformation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}FormOfPaymentTypeI_68625S"/>
 *         &lt;element name="routing" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}RoutingInformationTypeI"/>
 *         &lt;element name="iruQualifier" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}StatusType_68646S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="fopInformationGroup" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType"/>
 *                   &lt;element name="fopInformationAmount" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}MonetaryInformationType_87804S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountSupplementaryData" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}AttributeType" maxOccurs="99" minOccurs="0"/>
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
    "routing",
    "iruQualifier",
    "fopInformationGroup",
    "accountSupplementaryData"
})
public class InvoiceFopGroupType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI68625S invoiceInformation;
    @XmlElement(required = true)
    protected RoutingInformationTypeI routing;
    protected List<StatusType68646S> iruQualifier;
    protected List<FopInformationGroup> fopInformationGroup;
    protected List<AttributeType> accountSupplementaryData;

    /**
     * Gets the value of the invoiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI68625S }
     *     
     */
    public FormOfPaymentTypeI68625S getInvoiceInformation() {
        return invoiceInformation;
    }

    /**
     * Sets the value of the invoiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI68625S }
     *     
     */
    public void setInvoiceInformation(FormOfPaymentTypeI68625S value) {
        this.invoiceInformation = value;
    }

    /**
     * Gets the value of the routing property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public RoutingInformationTypeI getRouting() {
        return routing;
    }

    /**
     * Sets the value of the routing property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingInformationTypeI }
     *     
     */
    public void setRouting(RoutingInformationTypeI value) {
        this.routing = value;
    }

    /**
     * Gets the value of the iruQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iruQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIruQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType68646S }
     * 
     * 
     */
    public List<StatusType68646S> getIruQualifier() {
        if (iruQualifier == null) {
            iruQualifier = new ArrayList<StatusType68646S>();
        }
        return this.iruQualifier;
    }

    /**
     * Gets the value of the fopInformationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fopInformationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFopInformationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FopInformationGroup }
     * 
     * 
     */
    public List<FopInformationGroup> getFopInformationGroup() {
        if (fopInformationGroup == null) {
            fopInformationGroup = new ArrayList<FopInformationGroup>();
        }
        return this.fopInformationGroup;
    }

    /**
     * Gets the value of the accountSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType }
     * 
     * 
     */
    public List<AttributeType> getAccountSupplementaryData() {
        if (accountSupplementaryData == null) {
            accountSupplementaryData = new ArrayList<AttributeType>();
        }
        return this.accountSupplementaryData;
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
     *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}TicketingFormOfPaymentType"/>
     *         &lt;element name="fopInformationAmount" type="{http://xml.amadeus.com/TFOPUR_12_1_1A}MonetaryInformationType_87804S"/>
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
        "fopInformation",
        "fopInformationAmount"
    })
    public static class FopInformationGroup {

        @XmlElement(required = true)
        protected TicketingFormOfPaymentType fopInformation;
        @XmlElement(required = true)
        protected MonetaryInformationType87804S fopInformationAmount;

        /**
         * Gets the value of the fopInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TicketingFormOfPaymentType }
         *     
         */
        public TicketingFormOfPaymentType getFopInformation() {
            return fopInformation;
        }

        /**
         * Sets the value of the fopInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingFormOfPaymentType }
         *     
         */
        public void setFopInformation(TicketingFormOfPaymentType value) {
            this.fopInformation = value;
        }

        /**
         * Gets the value of the fopInformationAmount property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType87804S }
         *     
         */
        public MonetaryInformationType87804S getFopInformationAmount() {
            return fopInformationAmount;
        }

        /**
         * Sets the value of the fopInformationAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType87804S }
         *     
         */
        public void setFopInformationAmount(MonetaryInformationType87804S value) {
            this.fopInformationAmount = value;
        }

    }

}
