//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:15:49 ���� KST 
//


package com.koreanair.common_external.altea.vo.salesreports_displaytransactionreportreply_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FOPRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOPRepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopDescription" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}FormOfPaymentTypeI"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/TSRTRR_11_1_1A}MonetaryInformationTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOPRepresentationType", propOrder = {
    "fopDescription",
    "monetaryInfo"
})
public class FOPRepresentationType {

    @XmlElement(required = true)
    protected FormOfPaymentTypeI fopDescription;
    @XmlElement(required = true)
    protected MonetaryInformationTypeI monetaryInfo;

    /**
     * Gets the value of the fopDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getFopDescription() {
        return fopDescription;
    }

    /**
     * Sets the value of the fopDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setFopDescription(FormOfPaymentTypeI value) {
        this.fopDescription = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public MonetaryInformationTypeI getMonetaryInfo() {
        return monetaryInfo;
    }

    /**
     * Sets the value of the monetaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI }
     *     
     */
    public void setMonetaryInfo(MonetaryInformationTypeI value) {
        this.monetaryInfo = value;
    }

}
