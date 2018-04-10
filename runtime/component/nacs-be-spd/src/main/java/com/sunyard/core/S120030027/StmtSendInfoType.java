
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StmtSendInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StmtSendInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StmtType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}MedmType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RcvMsgBrBIC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}TranTellerNo2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientCHNName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ZipCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StmtDlvMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EffectDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BussBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctBranchId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmtSendInfoType", propOrder = {
    "stmtType",
    "medmType",
    "rcvMsgBrBIC",
    "tranTellerNo2",
    "clientNo",
    "acctType",
    "clientAcctNo",
    "address",
    "clientCHNName",
    "zipCode",
    "stmtDlvMode",
    "effectDate",
    "bussBranchId",
    "acctBranchId"
})
public class StmtSendInfoType {

    @XmlElement(name = "StmtType")
    protected String stmtType;
    @XmlElement(name = "MedmType")
    protected String medmType;
    @XmlElement(name = "RcvMsgBrBIC")
    protected String rcvMsgBrBIC;
    @XmlElement(name = "TranTellerNo2")
    protected String tranTellerNo2;
    @XmlElement(name = "ClientNo")
    protected String clientNo;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "ClientAcctNo")
    protected String clientAcctNo;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "ClientCHNName")
    protected String clientCHNName;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "StmtDlvMode")
    protected String stmtDlvMode;
    @XmlElement(name = "EffectDate")
    protected String effectDate;
    @XmlElement(name = "BussBranchId")
    protected String bussBranchId;
    @XmlElement(name = "AcctBranchId")
    protected String acctBranchId;

    /**
     * 获取stmtType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtType() {
        return stmtType;
    }

    /**
     * 设置stmtType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtType(String value) {
        this.stmtType = value;
    }

    /**
     * 获取medmType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedmType() {
        return medmType;
    }

    /**
     * 设置medmType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedmType(String value) {
        this.medmType = value;
    }

    /**
     * 获取rcvMsgBrBIC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvMsgBrBIC() {
        return rcvMsgBrBIC;
    }

    /**
     * 设置rcvMsgBrBIC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvMsgBrBIC(String value) {
        this.rcvMsgBrBIC = value;
    }

    /**
     * 获取tranTellerNo2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranTellerNo2() {
        return tranTellerNo2;
    }

    /**
     * 设置tranTellerNo2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranTellerNo2(String value) {
        this.tranTellerNo2 = value;
    }

    /**
     * 获取clientNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNo() {
        return clientNo;
    }

    /**
     * 设置clientNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNo(String value) {
        this.clientNo = value;
    }

    /**
     * 获取acctType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * 设置acctType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * 获取clientAcctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAcctNo() {
        return clientAcctNo;
    }

    /**
     * 设置clientAcctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAcctNo(String value) {
        this.clientAcctNo = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取clientCHNName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCHNName() {
        return clientCHNName;
    }

    /**
     * 设置clientCHNName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCHNName(String value) {
        this.clientCHNName = value;
    }

    /**
     * 获取zipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置zipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * 获取stmtDlvMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtDlvMode() {
        return stmtDlvMode;
    }

    /**
     * 设置stmtDlvMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtDlvMode(String value) {
        this.stmtDlvMode = value;
    }

    /**
     * 获取effectDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectDate() {
        return effectDate;
    }

    /**
     * 设置effectDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectDate(String value) {
        this.effectDate = value;
    }

    /**
     * 获取bussBranchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussBranchId() {
        return bussBranchId;
    }

    /**
     * 设置bussBranchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussBranchId(String value) {
        this.bussBranchId = value;
    }

    /**
     * 获取acctBranchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctBranchId() {
        return acctBranchId;
    }

    /**
     * 设置acctBranchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctBranchId(String value) {
        this.acctBranchId = value;
    }

}
