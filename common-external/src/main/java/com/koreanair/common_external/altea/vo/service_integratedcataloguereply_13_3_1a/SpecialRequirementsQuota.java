//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_3_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or services quota information related to a fligth.
 * 
 * <p>Java class for SpecialRequirementsQuota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsQuota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotaInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}QuotaRelatedInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsQuota", propOrder = {
    "quotaInfo"
})
public class SpecialRequirementsQuota {

    @XmlElement(required = true)
    protected QuotaRelatedInformationType quotaInfo;

    /**
     * Gets the value of the quotaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaRelatedInformationType }
     *     
     */
    public QuotaRelatedInformationType getQuotaInfo() {
        return quotaInfo;
    }

    /**
     * Sets the value of the quotaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaRelatedInformationType }
     *     
     */
    public void setQuotaInfo(QuotaRelatedInformationType value) {
        this.quotaInfo = value;
    }

}
