//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:46 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_readformofpaymentdatareply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the error occuring during the transaction
 * 
 * <p>Java class for PaymentErrorGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentErrorGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorOrWarningCodeDetails" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}ApplicationErrorInformationType_68655S"/>
 *         &lt;element name="errorWarningDescription" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}FreeTextInformationType_68636S" minOccurs="0"/>
 *         &lt;element name="errorSupplementaryData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}AttributeType_68657S"/>
 *                   &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}StructuredDateTimeInformationType_68658S" minOccurs="0"/>
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
@XmlType(name = "PaymentErrorGroupType", propOrder = {
    "errorOrWarningCodeDetails",
    "errorWarningDescription",
    "errorSupplementaryData"
})
public class PaymentErrorGroupType {

    @XmlElement(required = true)
    protected ApplicationErrorInformationType68655S errorOrWarningCodeDetails;
    protected FreeTextInformationType68636S errorWarningDescription;
    protected ErrorSupplementaryData errorSupplementaryData;

    /**
     * Gets the value of the errorOrWarningCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationType68655S }
     *     
     */
    public ApplicationErrorInformationType68655S getErrorOrWarningCodeDetails() {
        return errorOrWarningCodeDetails;
    }

    /**
     * Sets the value of the errorOrWarningCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationType68655S }
     *     
     */
    public void setErrorOrWarningCodeDetails(ApplicationErrorInformationType68655S value) {
        this.errorOrWarningCodeDetails = value;
    }

    /**
     * Gets the value of the errorWarningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType68636S }
     *     
     */
    public FreeTextInformationType68636S getErrorWarningDescription() {
        return errorWarningDescription;
    }

    /**
     * Sets the value of the errorWarningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType68636S }
     *     
     */
    public void setErrorWarningDescription(FreeTextInformationType68636S value) {
        this.errorWarningDescription = value;
    }

    /**
     * Gets the value of the errorSupplementaryData property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorSupplementaryData }
     *     
     */
    public ErrorSupplementaryData getErrorSupplementaryData() {
        return errorSupplementaryData;
    }

    /**
     * Sets the value of the errorSupplementaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorSupplementaryData }
     *     
     */
    public void setErrorSupplementaryData(ErrorSupplementaryData value) {
        this.errorSupplementaryData = value;
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
     *         &lt;element name="errorSupplementaryMessages" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}AttributeType_68657S"/>
     *         &lt;element name="expirationDate" type="{http://xml.amadeus.com/TFOPRR_12_1_1A}StructuredDateTimeInformationType_68658S" minOccurs="0"/>
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
        "errorSupplementaryMessages",
        "expirationDate"
    })
    public static class ErrorSupplementaryData {

        @XmlElement(required = true)
        protected AttributeType68657S errorSupplementaryMessages;
        protected StructuredDateTimeInformationType68658S expirationDate;

        /**
         * Gets the value of the errorSupplementaryMessages property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType68657S }
         *     
         */
        public AttributeType68657S getErrorSupplementaryMessages() {
            return errorSupplementaryMessages;
        }

        /**
         * Sets the value of the errorSupplementaryMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType68657S }
         *     
         */
        public void setErrorSupplementaryMessages(AttributeType68657S value) {
            this.errorSupplementaryMessages = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType68658S }
         *     
         */
        public StructuredDateTimeInformationType68658S getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType68658S }
         *     
         */
        public void setExpirationDate(StructuredDateTimeInformationType68658S value) {
            this.expirationDate = value;
        }

    }

}
