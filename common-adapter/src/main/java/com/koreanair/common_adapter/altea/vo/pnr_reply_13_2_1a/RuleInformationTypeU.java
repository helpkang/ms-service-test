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
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RuleDetailsTypeU"/>
 *         &lt;element name="ruleStatusDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RuleStatusTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformationTypeU", propOrder = {
    "ruleDetails",
    "ruleStatusDetails"
})
public class RuleInformationTypeU {

    @XmlElement(required = true)
    protected RuleDetailsTypeU ruleDetails;
    protected RuleStatusTypeU ruleStatusDetails;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public RuleDetailsTypeU getRuleDetails() {
        return ruleDetails;
    }

    /**
     * Sets the value of the ruleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public void setRuleDetails(RuleDetailsTypeU value) {
        this.ruleDetails = value;
    }

    /**
     * Gets the value of the ruleStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public RuleStatusTypeU getRuleStatusDetails() {
        return ruleStatusDetails;
    }

    /**
     * Sets the value of the ruleStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public void setRuleStatusDetails(RuleStatusTypeU value) {
        this.ruleStatusDetails = value;
    }

}
