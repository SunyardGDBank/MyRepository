
package com.sunyard.core.S010030004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspSvcHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspSvcHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranDate"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranTime"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}BackendSeqNo"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}BackendSysId"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ReturnCode"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ReturnMsg"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}GlobalSeqNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}LangCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}PIN" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}KeyVersionNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TargetAdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SourceAdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}MsgEndFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}MsgSeqNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}LinkTranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranSerialNo" minOccurs="0"/&gt;
 *         &lt;element name="SubSvcRetInfo" type="{http://esb.spdbbiz.com/services/S010030004}SubSvcRetInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RspSvcHeaderType", propOrder = {
    "tranDate",
    "tranTime",
    "backendSeqNo",
    "backendSysId",
    "returnCode",
    "returnMsg",
    "globalSeqNo",
    "langCode",
    "tranCode",
    "pin",
    "keyVersionNo",
    "targetAdr",
    "sourceAdr",
    "msgEndFlag",
    "msgSeqNo",
    "linkTranCode",
    "tranSerialNo",
    "subSvcRetInfo"
})
public class RspSvcHeaderType {

    @XmlElement(name = "TranDate", required = true)
    protected String tranDate;
    @XmlElement(name = "TranTime", required = true)
    protected String tranTime;
    @XmlElement(name = "BackendSeqNo", required = true)
    protected String backendSeqNo;
    @XmlElement(name = "BackendSysId", required = true)
    protected String backendSysId;
    @XmlElement(name = "ReturnCode", required = true)
    protected String returnCode;
    @XmlElement(name = "ReturnMsg", required = true)
    protected String returnMsg;
    @XmlElement(name = "GlobalSeqNo")
    protected String globalSeqNo;
    @XmlElement(name = "LangCode")
    protected String langCode;
    @XmlElement(name = "TranCode")
    protected String tranCode;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "KeyVersionNo")
    protected String keyVersionNo;
    @XmlElement(name = "TargetAdr")
    protected String targetAdr;
    @XmlElement(name = "SourceAdr")
    protected String sourceAdr;
    @XmlElement(name = "MsgEndFlag")
    protected String msgEndFlag;
    @XmlElement(name = "MsgSeqNo")
    protected String msgSeqNo;
    @XmlElement(name = "LinkTranCode")
    protected String linkTranCode;
    @XmlElement(name = "TranSerialNo")
    protected String tranSerialNo;
    @XmlElement(name = "SubSvcRetInfo")
    protected List<SubSvcRetInfoType> subSvcRetInfo;

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
     * 获取backendSeqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackendSeqNo() {
        return backendSeqNo;
    }

    /**
     * 设置backendSeqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackendSeqNo(String value) {
        this.backendSeqNo = value;
    }

    /**
     * 获取backendSysId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackendSysId() {
        return backendSysId;
    }

    /**
     * 设置backendSysId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackendSysId(String value) {
        this.backendSysId = value;
    }

    /**
     * 获取returnCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 设置returnCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * 获取returnMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * 设置returnMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMsg(String value) {
        this.returnMsg = value;
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
     * 获取linkTranCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTranCode() {
        return linkTranCode;
    }

    /**
     * 设置linkTranCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTranCode(String value) {
        this.linkTranCode = value;
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

    /**
     * Gets the value of the subSvcRetInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSvcRetInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSvcRetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubSvcRetInfoType }
     * 
     * 
     */
    public List<SubSvcRetInfoType> getSubSvcRetInfo() {
        if (subSvcRetInfo == null) {
            subSvcRetInfo = new ArrayList<SubSvcRetInfoType>();
        }
        return this.subSvcRetInfo;
    }

}
