//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:45 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmodereply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}SpecificDataInformationType"/>
 *         &lt;element name="descriptionInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}InteractiveFreeTextType" minOccurs="0"/>
 *         &lt;element name="amountsInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}MonetaryInformationType_67623S" minOccurs="0"/>
 *         &lt;element name="formOfPaymentInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}FormOfPaymentType_67621S" minOccurs="0"/>
 *         &lt;element name="taxesDetailsInfo" type="{http://xml.amadeus.com/TPSSGR_11_1_1A}TaxDetailsType_67625S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsInfoType", propOrder = {
    "feeInfo",
    "descriptionInfo",
    "amountsInfo",
    "formOfPaymentInfo",
    "taxesDetailsInfo"
})
public class FeeDetailsInfoType {

    @XmlElement(required = true)
    protected SpecificDataInformationType feeInfo;
    protected InteractiveFreeTextType descriptionInfo;
    protected MonetaryInformationType67623S amountsInfo;
    protected FormOfPaymentType67621S formOfPaymentInfo;
    protected TaxDetailsType67625S taxesDetailsInfo;

    /**
     * Gets the value of the feeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public SpecificDataInformationType getFeeInfo() {
        return feeInfo;
    }

    /**
     * Sets the value of the feeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationType }
     *     
     */
    public void setFeeInfo(SpecificDataInformationType value) {
        this.feeInfo = value;
    }

    /**
     * Gets the value of the descriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public InteractiveFreeTextType getDescriptionInfo() {
        return descriptionInfo;
    }

    /**
     * Sets the value of the descriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextType }
     *     
     */
    public void setDescriptionInfo(InteractiveFreeTextType value) {
        this.descriptionInfo = value;
    }

    /**
     * Gets the value of the amountsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType67623S }
     *     
     */
    public MonetaryInformationType67623S getAmountsInfo() {
        return amountsInfo;
    }

    /**
     * Sets the value of the amountsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType67623S }
     *     
     */
    public void setAmountsInfo(MonetaryInformationType67623S value) {
        this.amountsInfo = value;
    }

    /**
     * Gets the value of the formOfPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentType67621S }
     *     
     */
    public FormOfPaymentType67621S getFormOfPaymentInfo() {
        return formOfPaymentInfo;
    }

    /**
     * Sets the value of the formOfPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentType67621S }
     *     
     */
    public void setFormOfPaymentInfo(FormOfPaymentType67621S value) {
        this.formOfPaymentInfo = value;
    }

    /**
     * Gets the value of the taxesDetailsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType67625S }
     *     
     */
    public TaxDetailsType67625S getTaxesDetailsInfo() {
        return taxesDetailsInfo;
    }

    /**
     * Sets the value of the taxesDetailsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType67625S }
     *     
     */
    public void setTaxesDetailsInfo(TaxDetailsType67625S value) {
        this.taxesDetailsInfo = value;
    }

}
