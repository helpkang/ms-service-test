//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 11:45:39 AM KST 
//


package com.koreanair.common_external.altea.vo.service_priceserviceinstandardmode_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * <p>Java class for SpecificDataInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificDataInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataTypeInformation" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}DataTypeInformationType_159331C"/>
 *         &lt;element name="dataInformation" type="{http://xml.amadeus.com/TPSSGQ_11_1_1A}DataInformationType_159332C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificDataInformationType", propOrder = {
    "dataTypeInformation",
    "dataInformation"
})
public class SpecificDataInformationType {

    @XmlElement(required = true)
    protected DataTypeInformationType159331C dataTypeInformation;
    protected List<DataInformationType159332C> dataInformation;

    /**
     * Gets the value of the dataTypeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeInformationType159331C }
     *     
     */
    public DataTypeInformationType159331C getDataTypeInformation() {
        return dataTypeInformation;
    }

    /**
     * Sets the value of the dataTypeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeInformationType159331C }
     *     
     */
    public void setDataTypeInformation(DataTypeInformationType159331C value) {
        this.dataTypeInformation = value;
    }

    /**
     * Gets the value of the dataInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInformationType159332C }
     * 
     * 
     */
    public List<DataInformationType159332C> getDataInformation() {
        if (dataInformation == null) {
            dataInformation = new ArrayList<DataInformationType159332C>();
        }
        return this.dataInformation;
    }

}
