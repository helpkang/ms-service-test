//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product
 * 
 * <p>Java class for TravelProductInformationTypeI_133014S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_133014S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductDateTimeTypeI_192985C" minOccurs="0"/>
 *         &lt;element name="boardpointDetail" type="{http://xml.amadeus.com/PNRACC_13_2_1A}LocationTypeI_192814C" minOccurs="0"/>
 *         &lt;element name="offpointDetail" type="{http://xml.amadeus.com/PNRACC_13_2_1A}LocationTypeI_192814C" minOccurs="0"/>
 *         &lt;element name="companyDetail" type="{http://xml.amadeus.com/PNRACC_13_2_1A}CompanyIdentificationTypeI_192810C" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductIdentificationDetailsTypeI_192811C" minOccurs="0"/>
 *         &lt;element name="typeDetail" type="{http://xml.amadeus.com/PNRACC_13_2_1A}ProductTypeDetailsTypeI_192984C" minOccurs="0"/>
 *         &lt;element name="processingIndicator" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_133014S", propOrder = {
    "product",
    "boardpointDetail",
    "offpointDetail",
    "companyDetail",
    "productDetails",
    "typeDetail",
    "processingIndicator"
})
public class TravelProductInformationTypeI133014S {

    protected ProductDateTimeTypeI192985C product;
    protected LocationTypeI192814C boardpointDetail;
    protected LocationTypeI192814C offpointDetail;
    protected CompanyIdentificationTypeI192810C companyDetail;
    protected ProductIdentificationDetailsTypeI192811C productDetails;
    protected ProductTypeDetailsTypeI192984C typeDetail;
    protected String processingIndicator;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI192985C }
     *     
     */
    public ProductDateTimeTypeI192985C getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI192985C }
     *     
     */
    public void setProduct(ProductDateTimeTypeI192985C value) {
        this.product = value;
    }

    /**
     * Gets the value of the boardpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI192814C }
     *     
     */
    public LocationTypeI192814C getBoardpointDetail() {
        return boardpointDetail;
    }

    /**
     * Sets the value of the boardpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI192814C }
     *     
     */
    public void setBoardpointDetail(LocationTypeI192814C value) {
        this.boardpointDetail = value;
    }

    /**
     * Gets the value of the offpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI192814C }
     *     
     */
    public LocationTypeI192814C getOffpointDetail() {
        return offpointDetail;
    }

    /**
     * Sets the value of the offpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI192814C }
     *     
     */
    public void setOffpointDetail(LocationTypeI192814C value) {
        this.offpointDetail = value;
    }

    /**
     * Gets the value of the companyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI192810C }
     *     
     */
    public CompanyIdentificationTypeI192810C getCompanyDetail() {
        return companyDetail;
    }

    /**
     * Sets the value of the companyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI192810C }
     *     
     */
    public void setCompanyDetail(CompanyIdentificationTypeI192810C value) {
        this.companyDetail = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI192811C }
     *     
     */
    public ProductIdentificationDetailsTypeI192811C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI192811C }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeI192811C value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI192984C }
     *     
     */
    public ProductTypeDetailsTypeI192984C getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI192984C }
     *     
     */
    public void setTypeDetail(ProductTypeDetailsTypeI192984C value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the processingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /**
     * Sets the value of the processingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingIndicator(String value) {
        this.processingIndicator = value;
    }

}
