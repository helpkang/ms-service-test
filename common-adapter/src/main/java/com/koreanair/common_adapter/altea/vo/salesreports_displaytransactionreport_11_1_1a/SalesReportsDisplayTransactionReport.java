//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:15:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.salesreports_displaytransactionreport_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/TSRTRQ_11_1_1A}TicketNumberTypeI" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/TSRTRQ_11_1_1A}ItemNumberTypeI" minOccurs="0"/>
 *         &lt;element name="agencyDetails" type="{http://xml.amadeus.com/TSRTRQ_11_1_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
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
    "documentNumber",
    "sequenceNumber",
    "agencyDetails"
})
@XmlRootElement(name = "SalesReports_DisplayTransactionReport")
public class SalesReportsDisplayTransactionReport {

    protected TicketNumberTypeI documentNumber;
    protected ItemNumberTypeI sequenceNumber;
    protected AdditionalBusinessSourceInformationTypeI agencyDetails;

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberTypeI }
     *     
     */
    public TicketNumberTypeI getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberTypeI }
     *     
     */
    public void setDocumentNumber(TicketNumberTypeI value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public ItemNumberTypeI getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberTypeI }
     *     
     */
    public void setSequenceNumber(ItemNumberTypeI value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the agencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public AdditionalBusinessSourceInformationTypeI getAgencyDetails() {
        return agencyDetails;
    }

    /**
     * Sets the value of the agencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBusinessSourceInformationTypeI }
     *     
     */
    public void setAgencyDetails(AdditionalBusinessSourceInformationTypeI value) {
        this.agencyDetails = value;
    }

}
