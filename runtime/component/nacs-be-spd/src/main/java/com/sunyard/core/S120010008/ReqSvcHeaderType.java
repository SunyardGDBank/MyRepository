
package com.sunyard.core.S120010008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqSvcHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqSvcHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranDate"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranTime"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranTellerNo"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranSeqNo"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ConsumerId"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}GlobalSeqNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}SourceSysId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}BranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TerminalCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}CityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AuthrTellerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AuthrPwd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AuthrCardFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AuthrCardNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}LangCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}PIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}KeyVersionNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}SysOffset1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}SysOffset2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TargetAdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}SourceAdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}MsgEndFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}MsgSeqNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}SubTranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranSerialNo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqSvcHeaderType", propOrder = {
    "tranDate",
    "tranTime",
    "tranTellerNo",
    "tranSeqNo",
    "consumerId",
    "globalSeqNo",
    "sourceSysId",
    "branchId",
    "terminalCode",
    "cityCode",
    "authrTellerNo",
    "authrPwd",
    "authrCardFlag",
    "authrCardNo",
    "langCode",
    "tranCode",
    "pin",
    "keyVersionNo",
    "sysOffset1",
    "sysOffset2",
    "targetAdr",
    "sourceAdr",
    "msgEndFlag",
    "msgSeqNo",
    "subTranCode",
    "tranMode",
    "tranSerialNo"
})
public class ReqSvcHeaderType {

    @XmlElement(name = "TranDate", required = true)
    protected String tranDate;
    @XmlElement(name = "TranTime", required = true)
    protected String tranTime;
    @XmlElement(name = "TranTellerNo", required = true)
    protected String tranTellerNo;
    @XmlElement(name = "TranSeqNo", required = true)
    protected String tranSeqNo;
    @XmlElement(name = "ConsumerId", required = true)
    protected String consumerId;
    @XmlElement(name = "GlobalSeqNo")
    protected String globalSeqNo;
    @XmlElement(name = "SourceSysId")
    protected String sourceSysId;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "TerminalCode")
    protected String terminalCode;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "AuthrTellerNo")
    protected String authrTellerNo;
    @XmlElement(name = "AuthrPwd")
    protected String authrPwd;
    @XmlElement(name = "AuthrCardFlag")
    protected String authrCardFlag;
    @XmlElement(name = "AuthrCardNo")
    protected String authrCardNo;
    @XmlElement(name = "LangCode")
    protected String langCode;
    @XmlElement(name = "TranCode")
    protected String tranCode;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "KeyVersionNo")
    protected String keyVersionNo;
    @XmlElement(name = "SysOffset1")
    protected String sysOffset1;
    @XmlElement(name = "SysOffset2")
    protected String sysOffset2;
    @XmlElement(name = "TargetAdr")
    protected String targetAdr;
    @XmlElement(name = "SourceAdr")
    protected String sourceAdr;
    @XmlElement(name = "MsgEndFlag")
    protected String msgEndFlag;
    @XmlElement(name = "MsgSeqNo")
    protected String msgSeqNo;
    @XmlElement(name = "SubTranCode")
    protected String subTranCode;
    @XmlElement(name = "TranMode")
    protected String tranMode;
    @XmlElement(name = "TranSerialNo")
    protected String tranSerialNo;

    /**
     * 获取tranDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDate() {
        return tranDate;
    }

    /**
     * 设置tranDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDate(String value) {
        this.tranDate = value;
    }

    /**
     * 获取tranTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranTime() {
        return tranTime;
    }

    /**
     * 设置tranTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranTime(String value) {
        this.tranTime = value;
    }

    /**
     * 获取tranTellerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranTellerNo() {
        return tranTellerNo;
    }

    /**
     * 设置tranTellerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranTellerNo(String value) {
        this.tranTellerNo = value;
    }

    /**
     * 获取tranSeqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranSeqNo() {
        return tranSeqNo;
    }

    /**
     * 设置tranSeqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranSeqNo(String value) {
        this.tranSeqNo = value;
    }

    /**
     * 获取consumerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * 设置consumerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerId(String value) {
        this.consumerId = value;
    }

    /**
     * 获取globalSeqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalSeqNo() {
        return globalSeqNo;
    }

    /**
     * 设置globalSeqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalSeqNo(String value) {
        this.globalSeqNo = value;
    }

    /**
     * 获取sourceSysId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId() {
        return sourceSysId;
    }

    /**
     * 设置sourceSysId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId(String value) {
        this.sourceSysId = value;
    }

    /**
     * 获取branchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * 设置branchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * 获取terminalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCode() {
        return terminalCode;
    }

    /**
     * 设置terminalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCode(String value) {
        this.terminalCode = value;
    }

    /**
     * 获取cityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置cityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * 获取authrTellerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrTellerNo() {
        return authrTellerNo;
    }

    /**
     * 设置authrTellerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrTellerNo(String value) {
        this.authrTellerNo = value;
    }

    /**
     * 获取authrPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrPwd() {
        return authrPwd;
    }

    /**
     * 设置authrPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrPwd(String value) {
        this.authrPwd = value;
    }

    /**
     * 获取authrCardFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrCardFlag() {
        return authrCardFlag;
    }

    /**
     * 设置authrCardFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrCardFlag(String value) {
        this.authrCardFlag = value;
    }

    /**
     * 获取authrCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrCardNo() {
        return authrCardNo;
    }

    /**
     * 设置authrCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrCardNo(String value) {
        this.authrCardNo = value;
    }

    /**
     * 获取langCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * 设置langCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * 获取tranCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
     * 设置tranCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranCode(String value) {
        this.tranCode = value;
    }

    /**
     * 获取pin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * 设置pin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * 获取keyVersionNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVersionNo() {
        return keyVersionNo;
    }

    /**
     * 设置keyVersionNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyVersionNo(String value) {
        this.keyVersionNo = value;
    }

    /**
     * 获取sysOffset1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysOffset1() {
        return sysOffset1;
    }

    /**
     * 设置sysOffset1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysOffset1(String value) {
        this.sysOffset1 = value;
    }

    /**
     * 获取sysOffset2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysOffset2() {
        return sysOffset2;
    }

    /**
     * 设置sysOffset2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysOffset2(String value) {
        this.sysOffset2 = value;
    }

    /**
     * 获取targetAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAdr() {
        return targetAdr;
    }

    /**
     * 设置targetAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAdr(String value) {
        this.targetAdr = value;
    }

    /**
     * 获取sourceAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAdr() {
        return sourceAdr;
    }

    /**
     * 设置sourceAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAdr(String value) {
        this.sourceAdr = value;
    }

    /**
     * 获取msgEndFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgEndFlag() {
        return msgEndFlag;
    }

    /**
     * 设置msgEndFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgEndFlag(String value) {
        this.msgEndFlag = value;
    }

    /**
     * 获取msgSeqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNo() {
        return msgSeqNo;
    }

    /**
     * 设置msgSeqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSeqNo(String value) {
        this.msgSeqNo = value;
    }

    /**
     * 获取subTranCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTranCode() {
        return subTranCode;
    }

    /**
     * 设置subTranCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTranCode(String value) {
        this.subTranCode = value;
    }

    /**
     * 获取tranMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranMode() {
        return tranMode;
    }

    /**
     * 设置tranMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranMode(String value) {
        this.tranMode = value;
    }

    /**
     * 获取tranSerialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranSerialNo() {
        return tranSerialNo;
    }

    /**
     * 设置tranSerialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranSerialNo(String value) {
        this.tranSerialNo = value;
    }

}
