//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.06 at 08:48:53 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.docrefund_initrefund_13_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys ticket stock range information. A stock range is identified by a stock type, a range number and an allocation status.
 * 
 * <p>Java class for StockRangeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockRangeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockTypeCode" type="{http://xml.amadeus.com/TRFSRQ_13_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="stockProvider" type="{http://xml.amadeus.com/TRFSRQ_13_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockRangeInformationType", propOrder = {
    "stockTypeCode",
    "stockProvider"
})
public class StockRangeInformationType {

    protected String stockTypeCode;
    protected String stockProvider;

    /**
     * Gets the value of the stockTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockTypeCode() {
        return stockTypeCode;
    }

    /**
     * Sets the value of the stockTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockTypeCode(String value) {
        this.stockTypeCode = value;
    }

    /**
     * Gets the value of the stockProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockProvider() {
        return stockProvider;
    }

    /**
     * Sets the value of the stockProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockProvider(String value) {
        this.stockProvider = value;
    }

}
