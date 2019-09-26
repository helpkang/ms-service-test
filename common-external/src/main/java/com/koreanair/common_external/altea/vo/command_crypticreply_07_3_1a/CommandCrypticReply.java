//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.06 at 09:24:06 ���� KST 
//


package com.koreanair.common_external.altea.vo.command_crypticreply_07_3_1a;

import java.io.Serializable;
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
 *         &lt;element name="messageActionDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageFunctionDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="businessFunction" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="messageFunction">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="responseType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="longTextString">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="textStringDetails">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="9999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
    "messageActionDetails",
    "longTextString"
})
@XmlRootElement(name = "Command_CrypticReply")
public class CommandCrypticReply
    implements Serializable
{

    protected MessageActionDetails messageActionDetails;
    @XmlElement(required = true)
    protected CommandCrypticReply.LongTextString longTextString;

    /**
     * Gets the value of the messageActionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetails }
     *     
     */
    public MessageActionDetails getMessageActionDetails() {
        return messageActionDetails;
    }

    /**
     * Sets the value of the messageActionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetails }
     *     
     */
    public void setMessageActionDetails(MessageActionDetails value) {
        this.messageActionDetails = value;
    }

    /**
     * Gets the value of the longTextString property.
     * 
     * @return
     *     possible object is
     *     {@link LongTextString }
     *     
     */
    public LongTextString getLongTextString() {
        return longTextString;
    }

    /**
     * Sets the value of the longTextString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTextString }
     *     
     */
    public void setLongTextString(LongTextString value) {
        this.longTextString = value;
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
     *         &lt;element name="textStringDetails">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="9999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "textStringDetails"
    })
    public static class LongTextString
        implements Serializable
    {

        @XmlElement(required = true)
        protected String textStringDetails;

        /**
         * Gets the value of the textStringDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTextStringDetails() {
            return textStringDetails;
        }

        /**
         * Sets the value of the textStringDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTextStringDetails(String value) {
            this.textStringDetails = value;
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
     *         &lt;element name="messageFunctionDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="businessFunction" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="messageFunction">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="responseType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "messageFunctionDetails",
        "responseType"
    })
    public static class MessageActionDetails
        implements Serializable
    {

        @XmlElement(required = true)
        protected CommandCrypticReply.MessageActionDetails.MessageFunctionDetails messageFunctionDetails;
        protected String responseType;

        /**
         * Gets the value of the messageFunctionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link MessageFunctionDetails }
         *     
         */
        public MessageFunctionDetails getMessageFunctionDetails() {
            return messageFunctionDetails;
        }

        /**
         * Sets the value of the messageFunctionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageFunctionDetails }
         *     
         */
        public void setMessageFunctionDetails(MessageFunctionDetails value) {
            this.messageFunctionDetails = value;
        }

        /**
         * Gets the value of the responseType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseType() {
            return responseType;
        }

        /**
         * Sets the value of the responseType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseType(String value) {
            this.responseType = value;
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
         *         &lt;element name="businessFunction" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="messageFunction">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "businessFunction",
            "messageFunction"
        })
        public static class MessageFunctionDetails
            implements Serializable
        {

            protected String businessFunction;
            @XmlElement(required = true)
            protected String messageFunction;

            /**
             * Gets the value of the businessFunction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessFunction() {
                return businessFunction;
            }

            /**
             * Sets the value of the businessFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessFunction(String value) {
                this.businessFunction = value;
            }

            /**
             * Gets the value of the messageFunction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageFunction() {
                return messageFunction;
            }

            /**
             * Sets the value of the messageFunction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageFunction(String value) {
                this.messageFunction = value;
            }

        }

    }

}
