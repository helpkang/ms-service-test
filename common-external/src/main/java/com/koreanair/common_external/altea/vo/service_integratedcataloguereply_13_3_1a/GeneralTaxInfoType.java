//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.26 at 05:10:35 ���� KST 
//


package com.koreanair.common_external.altea.vo.service_integratedcataloguereply_13_3_1a;

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
 *         &lt;element name="computedTaxListInfo" type="{http://xml.amadeus.com/TPICGR_13_3_1A}TaxDetailsType_153021S"/>
 *         &lt;element name="computedTaxSubDetails" type="{http://xml.amadeus.com/TPICGR_13_3_1A}MonetaryInformationType" maxOccurs="5" minOccurs="0"/>
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
    "computedTaxSubDetails"
})
public class GeneralTaxInfoType {

    @XmlElement(required = true)
    protected TaxDetailsType153021S computedTaxListInfo;
    protected List<MonetaryInformationType> computedTaxSubDetails;

    /**
     * Gets the value of the computedTaxListInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsType153021S }
     *     
     */
    public TaxDetailsType153021S getComputedTaxListInfo() {
        return computedTaxListInfo;
    }

    /**
     * Sets the value of the computedTaxListInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsType153021S }
     *     
     */
    public void setComputedTaxListInfo(TaxDetailsType153021S value) {
        this.computedTaxListInfo = value;
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
     * {@link MonetaryInformationType }
     * 
     * 
     */
    public List<MonetaryInformationType> getComputedTaxSubDetails() {
        if (computedTaxSubDetails == null) {
            computedTaxSubDetails = new ArrayList<MonetaryInformationType>();
        }
        return this.computedTaxSubDetails;
    }

}
