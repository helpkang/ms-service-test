//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 06:48:10 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_addmultielements_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To request a Hard Copy Print
 * 
 * <p>Java class for PrinterIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrinterIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifierDetail" type="{http://xml.amadeus.com/PNRADD_13_2_1A}PrinterIdentificationDetailsType" minOccurs="0"/>
 *         &lt;element name="office" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length9To9" minOccurs="0"/>
 *         &lt;element name="teletypeAddress" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length7To7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrinterIdentificationType", propOrder = {
    "identifierDetail",
    "office",
    "teletypeAddress"
})
public class PrinterIdentificationType {

    protected PrinterIdentificationDetailsType identifierDetail;
    protected String office;
    protected String teletypeAddress;

    /**
     * Gets the value of the identifierDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrinterIdentificationDetailsType }
     *     
     */
    public PrinterIdentificationDetailsType getIdentifierDetail() {
        return identifierDetail;
    }

    /**
     * Sets the value of the identifierDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrinterIdentificationDetailsType }
     *     
     */
    public void setIdentifierDetail(PrinterIdentificationDetailsType value) {
        this.identifierDetail = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the teletypeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeletypeAddress() {
        return teletypeAddress;
    }

    /**
     * Sets the value of the teletypeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeletypeAddress(String value) {
        this.teletypeAddress = value;
    }

}
