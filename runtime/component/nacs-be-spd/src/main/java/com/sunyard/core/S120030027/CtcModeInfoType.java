
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CtcModeInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CtcModeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtcMethodNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtcInfoType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtcInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SourceSysId1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}PrefFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClntAttrId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Remark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SgnPdTpCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtcModeInfoType", propOrder = {
    "ctcMethodNo",
    "ecifClientNo",
    "ctcInfoType",
    "ctcInfo",
    "sourceSysId1",
    "prefFlag",
    "startTimep",
    "endTimep",
    "startTime",
    "endTime",
    "clntAttrId",
    "remark",
    "activeFlag",
    "sgnPdTpCode"
})
public class CtcModeInfoType {

    @XmlElement(name = "CtcMethodNo")
    protected String ctcMethodNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "CtcInfoType")
    protected String ctcInfoType;
    @XmlElement(name = "CtcInfo")
    protected String ctcInfo;
    @XmlElement(name = "SourceSysId1")
    protected String sourceSysId1;
    @XmlElement(name = "PrefFlag")
    protected String prefFlag;
    @XmlElement(name = "StartTimep")
    protected String startTimep;
    @XmlElement(name = "EndTimep")
    protected String endTimep;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "ClntAttrId")
    protected String clntAttrId;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "SgnPdTpCode")
    protected String sgnPdTpCode;

    /**
     * 获取ctcMethodNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcMethodNo() {
        return ctcMethodNo;
    }

    /**
     * 设置ctcMethodNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcMethodNo(String value) {
        this.ctcMethodNo = value;
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
     * 获取ctcInfoType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcInfoType() {
        return ctcInfoType;
    }

    /**
     * 设置ctcInfoType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcInfoType(String value) {
        this.ctcInfoType = value;
    }

    /**
     * 获取ctcInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcInfo() {
        return ctcInfo;
    }

    /**
     * 设置ctcInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcInfo(String value) {
        this.ctcInfo = value;
    }

    /**
     * 获取sourceSysId1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId1() {
        return sourceSysId1;
    }

    /**
     * 设置sourceSysId1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId1(String value) {
        this.sourceSysId1 = value;
    }

    /**
     * 获取prefFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefFlag() {
        return prefFlag;
    }

    /**
     * 设置prefFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefFlag(String value) {
        this.prefFlag = value;
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
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取clntAttrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAttrId() {
        return clntAttrId;
    }

    /**
     * 设置clntAttrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntAttrId(String value) {
        this.clntAttrId = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
     * 获取sgnPdTpCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgnPdTpCode() {
        return sgnPdTpCode;
    }

    /**
     * 设置sgnPdTpCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgnPdTpCode(String value) {
        this.sgnPdTpCode = value;
    }

}
