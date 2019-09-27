//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 09:58:52 AM KST 
//


package com.koreanair.external.altea.vo.service_priceintegratemode_11_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType_67536S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType_67536S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ProductDateTimeType" minOccurs="0"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}LocationType_105598C" minOccurs="0"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}LocationType_105598C" minOccurs="0"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}CompanyIdentificationType" minOccurs="0"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ProductIdentificationDetailsType_105594C" minOccurs="0"/>
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}ProductTypeDetailsType_105595C" minOccurs="0"/>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *         &lt;element name="specialSegment" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="marriageDetails" type="{http://xml.amadeus.com/TPISGQ_11_1_1A}MarriageControlDetailsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType_67536S", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails",
    "itemNumber",
    "specialSegment",
    "marriageDetails"
})
public class TravelProductInformationType67536S {

    protected ProductDateTimeType flightDate;
    protected LocationType105598C boardPointDetails;
    protected LocationType105598C offpointDetails;
    protected CompanyIdentificationType companyDetails;
    protected ProductIdentificationDetailsType105594C flightIdentification;
    protected ProductTypeDetailsType105595C flightTypeDetails;
    protected BigInteger itemNumber;
    protected String specialSegment;
    protected List<MarriageControlDetailsType> marriageDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType }
     *     
     */
    public ProductDateTimeType getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType }
     *     
     */
    public void setFlightDate(ProductDateTimeType value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType105598C }
     *     
     */
    public LocationType105598C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType105598C }
     *     
     */
    public void setBoardPointDetails(LocationType105598C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType105598C }
     *     
     */
    public LocationType105598C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType105598C }
     *     
     */
    public void setOffpointDetails(LocationType105598C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationType value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType105594C }
     *     
     */
    public ProductIdentificationDetailsType105594C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType105594C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType105594C value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType105595C }
     *     
     */
    public ProductTypeDetailsType105595C getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType105595C }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsType105595C value) {
        this.flightTypeDetails = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNumber(BigInteger value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the specialSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialSegment() {
        return specialSegment;
    }

    /**
     * Sets the value of the specialSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialSegment(String value) {
        this.specialSegment = value;
    }

    /**
     * Gets the value of the marriageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarriageControlDetailsType }
     * 
     * 
     */
    public List<MarriageControlDetailsType> getMarriageDetails() {
        if (marriageDetails == null) {
            marriageDetails = new ArrayList<MarriageControlDetailsType>();
        }
        return this.marriageDetails;
    }

}
