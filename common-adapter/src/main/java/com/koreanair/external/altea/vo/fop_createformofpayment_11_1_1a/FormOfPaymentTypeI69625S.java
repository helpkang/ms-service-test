//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:47:26 ���� KST 
//


package com.koreanair.external.altea.vo.fop_createformofpayment_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment.
 * 
 * <p>Java class for FormOfPaymentTypeI_69625S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentTypeI_69625S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/TFOPCQ_11_1_1A}FormOfPaymentDetailsTypeI_66014C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentTypeI_69625S", propOrder = {
    "formOfPayment"
})
public class FormOfPaymentTypeI69625S {

    @XmlElement(required = true)
    protected FormOfPaymentDetailsTypeI66014C formOfPayment;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentDetailsTypeI66014C }
     *     
     */
    public FormOfPaymentDetailsTypeI66014C getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentDetailsTypeI66014C }
     *     
     */
    public void setFormOfPayment(FormOfPaymentDetailsTypeI66014C value) {
        this.formOfPayment = value;
    }

}
