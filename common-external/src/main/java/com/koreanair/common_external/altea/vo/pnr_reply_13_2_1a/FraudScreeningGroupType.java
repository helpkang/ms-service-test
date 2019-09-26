//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

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
 *         &lt;element name="fraudScreening" type="{http://xml.amadeus.com/PNRACC_13_2_1A}StatusType_94568S"/>
 *         &lt;element name="ipAdress" type="{http://xml.amadeus.com/PNRACC_13_2_1A}DeviceControlDetailsType" minOccurs="0"/>
 *         &lt;element name="merchantURL" type="{http://xml.amadeus.com/PNRACC_13_2_1A}CommunicationContactType" minOccurs="0"/>
 *         &lt;element name="payerPhoneOrEmail" type="{http://xml.amadeus.com/PNRACC_13_2_1A}PhoneAndEmailAddressType_94565S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="shopperSession" type="{http://xml.amadeus.com/PNRACC_13_2_1A}SystemDetailsInfoType_94569S" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/PNRACC_13_2_1A}TravellerInformationType_94570S" minOccurs="0"/>
 *         &lt;element name="payerDateOfBirth" type="{http://xml.amadeus.com/PNRACC_13_2_1A}StructuredDateTimeInformationType_94567S" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AddressType_94501S" minOccurs="0"/>
 *         &lt;element name="formOfIdDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ReferenceInfoType_94566S" maxOccurs="3" minOccurs="0"/>
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
    "formOfIdDetails"
})
public class FraudScreeningGroupType {

    @XmlElement(required = true)
    protected StatusType94568S fraudScreening;
    protected DeviceControlDetailsType ipAdress;
    protected CommunicationContactType merchantURL;
    protected List<PhoneAndEmailAddressType94565S> payerPhoneOrEmail;
    protected SystemDetailsInfoType94569S shopperSession;
    protected TravellerInformationType94570S payerName;
    protected StructuredDateTimeInformationType94567S payerDateOfBirth;
    protected AddressType94501S billingAddress;
    protected List<ReferenceInfoType94566S> formOfIdDetails;

    /**
     * Gets the value of the fraudScreening property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType94568S }
     *     
     */
    public StatusType94568S getFraudScreening() {
        return fraudScreening;
    }

    /**
     * Sets the value of the fraudScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType94568S }
     *     
     */
    public void setFraudScreening(StatusType94568S value) {
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
     * {@link PhoneAndEmailAddressType94565S }
     * 
     * 
     */
    public List<PhoneAndEmailAddressType94565S> getPayerPhoneOrEmail() {
        if (payerPhoneOrEmail == null) {
            payerPhoneOrEmail = new ArrayList<PhoneAndEmailAddressType94565S>();
        }
        return this.payerPhoneOrEmail;
    }

    /**
     * Gets the value of the shopperSession property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType94569S }
     *     
     */
    public SystemDetailsInfoType94569S getShopperSession() {
        return shopperSession;
    }

    /**
     * Sets the value of the shopperSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType94569S }
     *     
     */
    public void setShopperSession(SystemDetailsInfoType94569S value) {
        this.shopperSession = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformationType94570S }
     *     
     */
    public TravellerInformationType94570S getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformationType94570S }
     *     
     */
    public void setPayerName(TravellerInformationType94570S value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType94567S }
     *     
     */
    public StructuredDateTimeInformationType94567S getPayerDateOfBirth() {
        return payerDateOfBirth;
    }

    /**
     * Sets the value of the payerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType94567S }
     *     
     */
    public void setPayerDateOfBirth(StructuredDateTimeInformationType94567S value) {
        this.payerDateOfBirth = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType94501S }
     *     
     */
    public AddressType94501S getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType94501S }
     *     
     */
    public void setBillingAddress(AddressType94501S value) {
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
     * {@link ReferenceInfoType94566S }
     * 
     * 
     */
    public List<ReferenceInfoType94566S> getFormOfIdDetails() {
        if (formOfIdDetails == null) {
            formOfIdDetails = new ArrayList<ReferenceInfoType94566S>();
        }
        return this.formOfIdDetails;
    }

}
