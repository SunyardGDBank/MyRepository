
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CtfInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CtfInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfInfoNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfAdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CheckDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ExpiredDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfIssuAreaCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfIssuInstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}IssuedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfImgFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfImgInstId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfImgDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfImgNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenAcctCtfFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RsrvField" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RsrvField1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfSerialNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CtfInfoType", propOrder = {
    "ctfInfoNo",
    "ecifClientNo",
    "ctfType",
    "ctfId",
    "ctfAdr",
    "checkDate",
    "startDate",
    "expiredDate",
    "ctfIssuAreaCode",
    "ctfIssuInstName",
    "issuedDate",
    "ctfImgFlag",
    "ctfImgInstId",
    "ctfImgDate",
    "ctfImgNo",
    "openAcctCtfFlag",
    "rsrvField",
    "rsrvField1",
    "ctfSerialNo",
    "activeFlag"
})
public class CtfInfoType {

    @XmlElement(name = "CtfInfoNo")
    protected String ctfInfoNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "CtfType", required = true)
    protected String ctfType;
    @XmlElement(name = "CtfId", required = true)
    protected String ctfId;
    @XmlElement(name = "CtfAdr")
    protected String ctfAdr;
    @XmlElement(name = "CheckDate")
    protected String checkDate;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "ExpiredDate")
    protected String expiredDate;
    @XmlElement(name = "CtfIssuAreaCode")
    protected String ctfIssuAreaCode;
    @XmlElement(name = "CtfIssuInstName")
    protected String ctfIssuInstName;
    @XmlElement(name = "IssuedDate")
    protected String issuedDate;
    @XmlElement(name = "CtfImgFlag")
    protected String ctfImgFlag;
    @XmlElement(name = "CtfImgInstId")
    protected String ctfImgInstId;
    @XmlElement(name = "CtfImgDate")
    protected String ctfImgDate;
    @XmlElement(name = "CtfImgNo")
    protected String ctfImgNo;
    @XmlElement(name = "OpenAcctCtfFlag")
    protected String openAcctCtfFlag;
    @XmlElement(name = "RsrvField")
    protected String rsrvField;
    @XmlElement(name = "RsrvField1")
    protected String rsrvField1;
    @XmlElement(name = "CtfSerialNo")
    protected String ctfSerialNo;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;

    /**
     * 获取ctfInfoNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfInfoNo() {
        return ctfInfoNo;
    }

    /**
     * 设置ctfInfoNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfInfoNo(String value) {
        this.ctfInfoNo = value;
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
     * 获取ctfType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfType() {
        return ctfType;
    }

    /**
     * 设置ctfType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfType(String value) {
        this.ctfType = value;
    }

    /**
     * 获取ctfId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfId() {
        return ctfId;
    }

    /**
     * 设置ctfId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfId(String value) {
        this.ctfId = value;
    }

    /**
     * 获取ctfAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfAdr() {
        return ctfAdr;
    }

    /**
     * 设置ctfAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfAdr(String value) {
        this.ctfAdr = value;
    }

    /**
     * 获取checkDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * 设置checkDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDate(String value) {
        this.checkDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * 获取expiredDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredDate() {
        return expiredDate;
    }

    /**
     * 设置expiredDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredDate(String value) {
        this.expiredDate = value;
    }

    /**
     * 获取ctfIssuAreaCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfIssuAreaCode() {
        return ctfIssuAreaCode;
    }

    /**
     * 设置ctfIssuAreaCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfIssuAreaCode(String value) {
        this.ctfIssuAreaCode = value;
    }

    /**
     * 获取ctfIssuInstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfIssuInstName() {
        return ctfIssuInstName;
    }

    /**
     * 设置ctfIssuInstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfIssuInstName(String value) {
        this.ctfIssuInstName = value;
    }

    /**
     * 获取issuedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * 设置issuedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedDate(String value) {
        this.issuedDate = value;
    }

    /**
     * 获取ctfImgFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfImgFlag() {
        return ctfImgFlag;
    }

    /**
     * 设置ctfImgFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfImgFlag(String value) {
        this.ctfImgFlag = value;
    }

    /**
     * 获取ctfImgInstId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfImgInstId() {
        return ctfImgInstId;
    }

    /**
     * 设置ctfImgInstId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfImgInstId(String value) {
        this.ctfImgInstId = value;
    }

    /**
     * 获取ctfImgDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfImgDate() {
        return ctfImgDate;
    }

    /**
     * 设置ctfImgDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfImgDate(String value) {
        this.ctfImgDate = value;
    }

    /**
     * 获取ctfImgNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfImgNo() {
        return ctfImgNo;
    }

    /**
     * 设置ctfImgNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfImgNo(String value) {
        this.ctfImgNo = value;
    }

    /**
     * 获取openAcctCtfFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAcctCtfFlag() {
        return openAcctCtfFlag;
    }

    /**
     * 设置openAcctCtfFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAcctCtfFlag(String value) {
        this.openAcctCtfFlag = value;
    }

    /**
     * 获取rsrvField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrvField() {
        return rsrvField;
    }

    /**
     * 设置rsrvField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrvField(String value) {
        this.rsrvField = value;
    }

    /**
     * 获取rsrvField1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrvField1() {
        return rsrvField1;
    }

    /**
     * 设置rsrvField1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrvField1(String value) {
        this.rsrvField1 = value;
    }

    /**
     * 获取ctfSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtfSerialNo() {
        return ctfSerialNo;
    }

    /**
     * 设置ctfSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtfSerialNo(String value) {
        this.ctfSerialNo = value;
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

}
