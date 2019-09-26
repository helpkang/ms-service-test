//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:32 ���� KST 
//


package com.koreanair.common_external.altea.vo.fop_createformofpaymentreply_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all credit card data needed for payment
 * 
 * <p>Java class for CreditCardDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditCardDetails" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}CreditCardDataType"/>
 *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}ReferenceInfoType_68624S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="cardHolderAddress" type="{http://xml.amadeus.com/TFOPCR_11_1_1A}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDataGroupType", propOrder = {
    "creditCardDetails",
    "fortknoxIds",
    "cardHolderAddress"
})
public class CreditCardDataGroupType {

    @XmlElement(required = true)
    protected CreditCardDataType creditCardDetails;
    protected List<ReferenceInfoType68624S> fortknoxIds;
    protected AddressType cardHolderAddress;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setCreditCardDetails(CreditCardDataType value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the fortknoxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFortknoxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfoType68624S }
     * 
     * 
     */
    public List<ReferenceInfoType68624S> getFortknoxIds() {
        if (fortknoxIds == null) {
            fortknoxIds = new ArrayList<ReferenceInfoType68624S>();
        }
        return this.fortknoxIds;
    }

    /**
     * Gets the value of the cardHolderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCardHolderAddress() {
        return cardHolderAddress;
    }

    /**
     * Sets the value of the cardHolderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCardHolderAddress(AddressType value) {
        this.cardHolderAddress = value;
    }

}
