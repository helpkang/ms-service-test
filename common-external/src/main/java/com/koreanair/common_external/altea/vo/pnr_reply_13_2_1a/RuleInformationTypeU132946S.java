//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 05:19:29 ���� KST 
//


package com.koreanair.common_external.altea.vo.pnr_reply_13_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformationTypeU_132946S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformationTypeU_132946S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RuleDetailsTypeU_192871C" maxOccurs="5"/>
 *         &lt;element name="ruleText" type="{http://xml.amadeus.com/PNRACC_13_2_1A}RuleTextTypeU_192872C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformationTypeU_132946S", propOrder = {
    "ruleDetails",
    "ruleText"
})
public class RuleInformationTypeU132946S {

    @XmlElement(required = true)
    protected List<RuleDetailsTypeU192871C> ruleDetails;
    protected RuleTextTypeU192872C ruleText;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleDetailsTypeU192871C }
     * 
     * 
     */
    public List<RuleDetailsTypeU192871C> getRuleDetails() {
        if (ruleDetails == null) {
            ruleDetails = new ArrayList<RuleDetailsTypeU192871C>();
        }
        return this.ruleDetails;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * @return
     *     possible object is
     *     {@link RuleTextTypeU192872C }
     *     
     */
    public RuleTextTypeU192872C getRuleText() {
        return ruleText;
    }

    /**
     * Sets the value of the ruleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleTextTypeU192872C }
     *     
     */
    public void setRuleText(RuleTextTypeU192872C value) {
        this.ruleText = value;
    }

}
