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
 * To provide free form or coded long text information.
 * 
 * <p>Java class for LongFreeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongFreeTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freetextDetail" type="{http://xml.amadeus.com/PNRADD_13_2_1A}FreeTextQualificationType" minOccurs="0"/>
 *         &lt;element name="longFreetext" type="{http://xml.amadeus.com/PNRADD_13_2_1A}AlphaNumericString_Length1To199" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongFreeTextType", propOrder = {
    "freetextDetail",
    "longFreetext"
})
public class LongFreeTextType {

    protected FreeTextQualificationType freetextDetail;
    protected String longFreetext;

    /**
     * Gets the value of the freetextDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationType }
     *     
     */
    public FreeTextQualificationType getFreetextDetail() {
        return freetextDetail;
    }

    /**
     * Sets the value of the freetextDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationType }
     *     
     */
    public void setFreetextDetail(FreeTextQualificationType value) {
        this.freetextDetail = value;
    }

    /**
     * Gets the value of the longFreetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongFreetext() {
        return longFreetext;
    }

    /**
     * Sets the value of the longFreetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongFreetext(String value) {
        this.longFreetext = value;
    }

}
