//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 06:12:58 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceviacataloguereply_12_3_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by importexport 02/10/2002 16:43
 * 
 * <p>Java class for GeneralTaxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralTaxInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="computedTaxListInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}TaxDetailsType_107483S"/>
 *         &lt;element name="computedDiscountAndPenaltyInfo" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *         &lt;element name="computedTaxSubDetails" type="{http://xml.amadeus.com/TPSCGR_12_3_1A}MonetaryInformationType_67627S" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralTaxInfoType", propOrder = {
    "computedTaxListInfo",
    "computedDiscountAndPenaltyInfo",
    "computedTaxSubDetails"
})
public class GeneralTaxInfoType {

    @XmlElement(required = true)
    protected TaxDetailsType107483S computedTaxListInfo;
    protected DiscountAndPenaltyInformationType computedDiscountAndPenaltyInfo;
    protected List<MonetaryInformationType67627S> computedTaxSubDetails;

    /**
     * Gets the value of the computedTaxListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType107483S }
     *     
     */
    public TaxDetailsType107483S getComputedTaxListInfo() {
        return computedTaxListInfo;
    }

    /**
     * Sets the value of the computedTaxListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType107483S }
     *     
     */
    public void setComputedTaxListInfo(TaxDetailsType107483S value) {
        this.computedTaxListInfo = value;
    }

    /**
     * Gets the value of the computedDiscountAndPenaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public DiscountAndPenaltyInformationType getComputedDiscountAndPenaltyInfo() {
        return computedDiscountAndPenaltyInfo;
    }

    /**
     * Sets the value of the computedDiscountAndPenaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAndPenaltyInformationType }
     *     
     */
    public void setComputedDiscountAndPenaltyInfo(DiscountAndPenaltyInformationType value) {
        this.computedDiscountAndPenaltyInfo = value;
    }

    /**
     * Gets the value of the computedTaxSubDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computedTaxSubDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputedTaxSubDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationType67627S }
     * 
     * 
     */
    public List<MonetaryInformationType67627S> getComputedTaxSubDetails() {
        if (computedTaxSubDetails == null) {
            computedTaxSubDetails = new ArrayList<MonetaryInformationType67627S>();
        }
        return this.computedTaxSubDetails;
    }

}
