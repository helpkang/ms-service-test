//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_adapter.altea.vo.pnr_reply_13_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a deck
 * 
 * <p>Java class for DeckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deckId" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *         &lt;element name="deckCode" type="{http://xml.amadeus.com/PNRACC_13_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckType", propOrder = {
    "deckId",
    "deckCode"
})
public class DeckType {

    protected String deckId;
    protected String deckCode;

    /**
     * Gets the value of the deckId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckId() {
        return deckId;
    }

    /**
     * Sets the value of the deckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckId(String value) {
        this.deckId = value;
    }

    /**
     * Gets the value of the deckCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckCode() {
        return deckCode;
    }

    /**
     * Sets the value of the deckCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckCode(String value) {
        this.deckCode = value;
    }

}
