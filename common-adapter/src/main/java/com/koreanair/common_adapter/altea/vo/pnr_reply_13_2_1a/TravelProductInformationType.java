//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDate" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductDateTimeTypeI_186908C"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}LocationTypeI_186910C"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}LocationTypeI_186910C"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}CompanyIdentificationTypeI_186905C" minOccurs="0"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductIdentificationDetailsType_186906C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "productDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification"
})
public class TravelProductInformationType {

    @XmlElement(required = true)
    protected ProductDateTimeTypeI186908C productDate;
    @XmlElement(required = true)
    protected LocationTypeI186910C boardPointDetails;
    @XmlElement(required = true)
    protected LocationTypeI186910C offpointDetails;
    protected CompanyIdentificationTypeI186905C companyDetails;
    protected ProductIdentificationDetailsType186906C flightIdentification;

    /**
     * Gets the value of the productDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI186908C }
     *     
     */
    public ProductDateTimeTypeI186908C getProductDate() {
        return productDate;
    }

    /**
     * Sets the value of the productDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI186908C }
     *     
     */
    public void setProductDate(ProductDateTimeTypeI186908C value) {
        this.productDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI186910C }
     *     
     */
    public LocationTypeI186910C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI186910C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI186910C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI186910C }
     *     
     */
    public LocationTypeI186910C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI186910C }
     *     
     */
    public void setOffpointDetails(LocationTypeI186910C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI186905C }
     *     
     */
    public CompanyIdentificationTypeI186905C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI186905C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI186905C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType186906C }
     *     
     */
    public ProductIdentificationDetailsType186906C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType186906C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType186906C value) {
        this.flightIdentification = value;
    }

}
