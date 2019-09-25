
package com.koreanair.eretail.pojo.air.commonin;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.koreanair.eretail.pojo.farecommon.travellercommon.DISCOUNTINFOType;


/**
 * 
 * 				Additional and specific information associated to a traveller
 * 			
 * 
 * <p>Java class for LIST_TRAVELLER_INFO_AirType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TRAVELLER_INFO_AirType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TRAVELLER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="IS_INFANT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DISCOUNT_INFO" type="{}DISCOUNT_INFO_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TRAVELLER_INFO_AirType", propOrder = {
    "travellerid",
    "isinfant",
    "discountinfo"
})
public class LISTTRAVELLERINFOAirType
    implements Serializable
{

    @XmlElement(name = "TRAVELLER_ID", required = true)
    protected BigInteger travellerid;
    @XmlElement(name = "IS_INFANT")
    protected Boolean isinfant;
    @XmlElement(name = "DISCOUNT_INFO")
    protected DISCOUNTINFOType discountinfo;

    /**
     * Gets the value of the travellerid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTRAVELLERID() {
        return travellerid;
    }

    /**
     * Sets the value of the travellerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTRAVELLERID(BigInteger value) {
        this.travellerid = value;
    }

    /**
     * Gets the value of the isinfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISINFANT() {
        return isinfant;
    }

    /**
     * Sets the value of the isinfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISINFANT(Boolean value) {
        this.isinfant = value;
    }

    /**
     * Gets the value of the discountinfo property.
     * 
     * @return
     *     possible object is
     *     {@link DISCOUNTINFOType }
     *     
     */
    public DISCOUNTINFOType getDISCOUNTINFO() {
        return discountinfo;
    }

    /**
     * Sets the value of the discountinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCOUNTINFOType }
     *     
     */
    public void setDISCOUNTINFO(DISCOUNTINFOType value) {
        this.discountinfo = value;
    }

}
