//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:52 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.fop_updateformofpayment_12_1_1a;

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
 *         &lt;element name="invoiceInformation" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="accountSupplementaryData" type="{http://xml.amadeus.com/TFOPUQ_12_1_1A}AttributeType" maxOccurs="99" minOccurs="0"/>
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
    "accountSupplementaryData"
})
public class InvoiceFopGroupType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI invoiceInformation;
    protected List<AttributeType> accountSupplementaryData;

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

}
