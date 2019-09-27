//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:26 ���� KST 
//


package com.koreanair.external.altea.vo.fop_createformofpayment_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all data needed to prevent the fraud on the payment
 * 
 * <p>Java class for FraudScreeningGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudScreeningGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraudScreening" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}StatusType_68675S"/>
 *         &lt;element name="ipAdress" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}DeviceControlDetailsType" minOccurs="0"/>
 *         &lt;element name="merchantURL" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}CommunicationContactType" minOccurs="0"/>
 *         &lt;element name="payerPhoneOrEmail" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}PhoneAndEmailAddressType_77738S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="shopperSession" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}SystemDetailsInfoType" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}TravellerInformationType_77742S" minOccurs="0"/>
 *         &lt;element name="payerDateOfBirth" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}StructuredDateTimeInformationType_77740S" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}AddressType" minOccurs="0"/>
 *         &lt;element name="formOfIdDetails" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}ReferenceInfoType_84714S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="travelShopper" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="shopperDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="shopperID" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}UserIdentificationType"/>
 *                   &lt;element name="shopperLogged" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}StatusType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="securityCode" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="securityType" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}SecurityScreeningType"/>
 *                   &lt;element name="securityKey" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}BinaryDataType"/>
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
@XmlType(name = "FraudScreeningGroupType", propOrder = {
    "fraudScreening",
    "ipAdress",
    "merchantURL",
    "payerPhoneOrEmail",
    "shopperSession",
    "payerName",
    "payerDateOfBirth",
    "billingAddress",
    "formOfIdDetails",
    "travelShopper",
    "shopperDetails",
    "securityCode"
})
public class FraudScreeningGroupType {

    @XmlElement(required = true)
    protected StatusType68675S fraudScreening;
    protected DeviceControlDetailsType ipAdress;
    protected CommunicationContactType merchantURL;
    protected List<PhoneAndEmailAddressType77738S> payerPhoneOrEmail;
    protected SystemDetailsInfoType shopperSession;
    protected TravellerInformationType77742S payerName;
    protected StructuredDateTimeInformationType77740S payerDateOfBirth;
    protected AddressType billingAddress;
    protected List<ReferenceInfoType84714S> formOfIdDetails;
    protected StatusType travelShopper;
    protected FraudScreeningGroupType.ShopperDetails shopperDetails;
    protected List<FraudScreeningGroupType.SecurityCode> securityCode;

    /**
     * Gets the value of the fraudScreening property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType68675S }
     *     
     */
    public StatusType68675S getFraudScreening() {
        return fraudScreening;
    }

    /**
     * Sets the value of the fraudScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType68675S }
     *     
     */
    public void setFraudScreening(StatusType68675S value) {
        this.fraudScreening = value;
    }

    /**
     * Gets the value of the ipAdress property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlDetailsType }
     *     
     */
    public DeviceControlDetailsType getIpAdress() {
        return ipAdress;
    }

    /**
     * Sets the value of the ipAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlDetailsType }
     *     
     */
    public void setIpAdress(DeviceControlDetailsType value) {
        this.ipAdress = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactType }
     *     
     */
    public CommunicationContactType getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactType }
     *     
     */
    public void setMerchantURL(CommunicationContactType value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the payerPhoneOrEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerPhoneOrEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerPhoneOrEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneAndEmailAddressType77738S }
     * 
     * 
     */
    public List<PhoneAndEmailAddressType77738S> getPayerPhoneOrEmail() {
        if (payerPhoneOrEmail == null) {
            payerPhoneOrEmail = new ArrayList<PhoneAndEmailAddressType77738S>();
        }
        return this.payerPhoneOrEmail;
    }

    /**
     * Gets the value of the shopperSession property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public SystemDetailsInfoType getShopperSession() {
        return shopperSession;
    }

    /**
     * Sets the value of the shopperSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public void setShopperSession(SystemDetailsInfoType value) {
        this.shopperSession = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType77742S }
     *     
     */
    public TravellerInformationType77742S getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType77742S }
     *     
     */
    public void setPayerName(TravellerInformationType77742S value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType77740S }
     *     
     */
    public StructuredDateTimeInformationType77740S getPayerDateOfBirth() {
        return payerDateOfBirth;
    }

    /**
     * Sets the value of the payerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType77740S }
     *     
     */
    public void setPayerDateOfBirth(StructuredDateTimeInformationType77740S value) {
        this.payerDateOfBirth = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the formOfIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType84714S }
     * 
     * 
     */
    public List<ReferenceInfoType84714S> getFormOfIdDetails() {
        if (formOfIdDetails == null) {
            formOfIdDetails = new ArrayList<ReferenceInfoType84714S>();
        }
        return this.formOfIdDetails;
    }

    /**
     * Gets the value of the travelShopper property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getTravelShopper() {
        return travelShopper;
    }

    /**
     * Sets the value of the travelShopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setTravelShopper(StatusType value) {
        this.travelShopper = value;
    }

    /**
     * Gets the value of the shopperDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType.ShopperDetails }
     *     
     */
    public FraudScreeningGroupType.ShopperDetails getShopperDetails() {
        return shopperDetails;
    }

    /**
     * Sets the value of the shopperDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType.ShopperDetails }
     *     
     */
    public void setShopperDetails(FraudScreeningGroupType.ShopperDetails value) {
        this.shopperDetails = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FraudScreeningGroupType.SecurityCode }
     * 
     * 
     */
    public List<FraudScreeningGroupType.SecurityCode> getSecurityCode() {
        if (securityCode == null) {
            securityCode = new ArrayList<FraudScreeningGroupType.SecurityCode>();
        }
        return this.securityCode;
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
     *         &lt;element name="securityType" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}SecurityScreeningType"/>
     *         &lt;element name="securityKey" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}BinaryDataType"/>
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
        "securityType",
        "securityKey"
    })
    public static class SecurityCode {

        @XmlElement(required = true)
        protected SecurityScreeningType securityType;
        @XmlElement(required = true)
        protected BinaryDataType securityKey;

        /**
         * Gets the value of the securityType property.
         * 
         * @return
         *     possible object is
         *     {@link SecurityScreeningType }
         *     
         */
        public SecurityScreeningType getSecurityType() {
            return securityType;
        }

        /**
         * Sets the value of the securityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityScreeningType }
         *     
         */
        public void setSecurityType(SecurityScreeningType value) {
            this.securityType = value;
        }

        /**
         * Gets the value of the securityKey property.
         * 
         * @return
         *     possible object is
         *     {@link BinaryDataType }
         *     
         */
        public BinaryDataType getSecurityKey() {
            return securityKey;
        }

        /**
         * Sets the value of the securityKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link BinaryDataType }
         *     
         */
        public void setSecurityKey(BinaryDataType value) {
            this.securityKey = value;
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
     *         &lt;element name="shopperID" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}UserIdentificationType"/>
     *         &lt;element name="shopperLogged" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}StatusType" minOccurs="0"/>
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
        "shopperID",
        "shopperLogged"
    })
    public static class ShopperDetails {

        @XmlElement(required = true)
        protected UserIdentificationType shopperID;
        protected StatusType shopperLogged;

        /**
         * Gets the value of the shopperID property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType }
         *     
         */
        public UserIdentificationType getShopperID() {
            return shopperID;
        }

        /**
         * Sets the value of the shopperID property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType }
         *     
         */
        public void setShopperID(UserIdentificationType value) {
            this.shopperID = value;
        }

        /**
         * Gets the value of the shopperLogged property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getShopperLogged() {
            return shopperLogged;
        }

        /**
         * Sets the value of the shopperLogged property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setShopperLogged(StatusType value) {
            this.shopperLogged = value;
        }

    }

}
