
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LevelInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LevelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientLevelNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientLevelDsc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstInstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstUserNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AdlInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevelInfoType", propOrder = {
    "clientLevelNo",
    "ecifClientNo",
    "clientLevel",
    "clientLevelDsc",
    "estInstName",
    "estUserNo",
    "estDate",
    "startTimep",
    "endTimep",
    "activeFlag",
    "adlInfo"
})
public class LevelInfoType {

    @XmlElement(name = "ClientLevelNo")
    protected String clientLevelNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "ClientLevel")
    protected String clientLevel;
    @XmlElement(name = "ClientLevelDsc")
    protected String clientLevelDsc;
    @XmlElement(name = "EstInstName")
    protected String estInstName;
    @XmlElement(name = "EstUserNo")
    protected String estUserNo;
    @XmlElement(name = "EstDate")
    protected String estDate;
    @XmlElement(name = "StartTimep")
    protected String startTimep;
    @XmlElement(name = "EndTimep")
    protected String endTimep;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "AdlInfo")
    protected String adlInfo;

    /**
     * 获取clientLevelNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLevelNo() {
        return clientLevelNo;
    }

    /**
     * 设置clientLevelNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLevelNo(String value) {
        this.clientLevelNo = value;
    }

    /**
     * 获取ecifClientNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECIFClientNo() {
        return ecifClientNo;
    }

    /**
     * 设置ecifClientNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECIFClientNo(String value) {
        this.ecifClientNo = value;
    }

    /**
     * 获取clientLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLevel() {
        return clientLevel;
    }

    /**
     * 设置clientLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLevel(String value) {
        this.clientLevel = value;
    }

    /**
     * 获取clientLevelDsc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLevelDsc() {
        return clientLevelDsc;
    }

    /**
     * 设置clientLevelDsc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLevelDsc(String value) {
        this.clientLevelDsc = value;
    }

    /**
     * 获取estInstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstInstName() {
        return estInstName;
    }

    /**
     * 设置estInstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstInstName(String value) {
        this.estInstName = value;
    }

    /**
     * 获取estUserNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstUserNo() {
        return estUserNo;
    }

    /**
     * 设置estUserNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstUserNo(String value) {
        this.estUserNo = value;
    }

    /**
     * 获取estDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstDate() {
        return estDate;
    }

    /**
     * 设置estDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstDate(String value) {
        this.estDate = value;
    }

    /**
     * 获取startTimep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimep() {
        return startTimep;
    }

    /**
     * 设置startTimep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimep(String value) {
        this.startTimep = value;
    }

    /**
     * 获取endTimep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimep() {
        return endTimep;
    }

    /**
     * 设置endTimep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimep(String value) {
        this.endTimep = value;
    }

    /**
     * 获取activeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * 设置activeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * 获取adlInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdlInfo() {
        return adlInfo;
    }

    /**
     * 设置adlInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdlInfo(String value) {
        this.adlInfo = value;
    }

}
