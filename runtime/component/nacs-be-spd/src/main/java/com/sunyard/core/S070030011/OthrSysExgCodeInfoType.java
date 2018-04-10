
package com.sunyard.core.S070030011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OthrSysExgCodeInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OthrSysExgCodeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}XfundPrjCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StatCgy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}XfundPrjNm" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}InstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}RecordStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OthrSysExgCodeInfoType", propOrder = {
    "bussType",
    "xfundPrjCd",
    "statCgy",
    "xfundPrjNm",
    "instName",
    "recordStatus"
})
public class OthrSysExgCodeInfoType {

    @XmlElement(name = "BussType")
    protected String bussType;
    @XmlElement(name = "XfundPrjCd")
    protected String xfundPrjCd;
    @XmlElement(name = "StatCgy")
    protected String statCgy;
    @XmlElement(name = "XfundPrjNm")
    protected String xfundPrjNm;
    @XmlElement(name = "InstName")
    protected String instName;
    @XmlElement(name = "RecordStatus")
    protected String recordStatus;

    /**
     * 获取bussType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussType() {
        return bussType;
    }

    /**
     * 设置bussType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussType(String value) {
        this.bussType = value;
    }

    /**
     * 获取xfundPrjCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfundPrjCd() {
        return xfundPrjCd;
    }

    /**
     * 设置xfundPrjCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfundPrjCd(String value) {
        this.xfundPrjCd = value;
    }

    /**
     * 获取statCgy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatCgy() {
        return statCgy;
    }

    /**
     * 设置statCgy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatCgy(String value) {
        this.statCgy = value;
    }

    /**
     * 获取xfundPrjNm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfundPrjNm() {
        return xfundPrjNm;
    }

    /**
     * 设置xfundPrjNm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfundPrjNm(String value) {
        this.xfundPrjNm = value;
    }

    /**
     * 获取instName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstName() {
        return instName;
    }

    /**
     * 设置instName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstName(String value) {
        this.instName = value;
    }

    /**
     * 获取recordStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置recordStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatus(String value) {
        this.recordStatus = value;
    }

}
