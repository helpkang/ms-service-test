//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.10 at 07:17:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.ticket_processedocairportcontrolreply_12_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the tariff, fare supplier, and paragraph number for a fare rule.
 * 
 * <p>Java class for FareRulesInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRulesInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffClassId" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TACRES_12_1_1A}CompanyIdentificationTypeI_99931C" minOccurs="0"/>
 *         &lt;element name="ruleSectionId" type="{http://xml.amadeus.com/TACRES_12_1_1A}AlphaNumericString_Length1To7" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRulesInformationTypeI", propOrder = {
    "tariffClassId",
    "companyDetails",
    "ruleSectionId"
})
public class FareRulesInformationTypeI {

    protected String tariffClassId;
    protected CompanyIdentificationTypeI99931C companyDetails;
    protected List<String> ruleSectionId;

    /**
     * Gets the value of the tariffClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffClassId() {
        return tariffClassId;
    }

    /**
     * Sets the value of the tariffClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffClassId(String value) {
        this.tariffClassId = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI99931C }
     *     
     */
    public CompanyIdentificationTypeI99931C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI99931C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI99931C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the ruleSectionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleSectionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleSectionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRuleSectionId() {
        if (ruleSectionId == null) {
            ruleSectionId = new ArrayList<String>();
        }
        return this.ruleSectionId;
    }

}
