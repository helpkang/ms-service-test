//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI_99931C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI_99931C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingCompany" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI_99931C", propOrder = {
    "marketingCompany"
})
public class CompanyIdentificationTypeI99931C {

    protected String marketingCompany;

    /**
     * Gets the value of the marketingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCompany() {
        return marketingCompany;
    }

    /**
     * Sets the value of the marketingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCompany(String value) {
        this.marketingCompany = value;
    }

}
