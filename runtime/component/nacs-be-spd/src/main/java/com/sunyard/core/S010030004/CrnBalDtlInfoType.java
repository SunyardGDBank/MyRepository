
package com.sunyard.core.S010030004;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CrnBalDtlInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CrnBalDtlInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CardNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctChar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientCHNName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}OpenBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RsrvBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FreezeBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CntlBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ActualBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ValidDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RecordStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrnBalDtlInfoType", propOrder = {
    "clientNo",
    "cardNo",
    "clientAcctNo",
    "currencyId",
    "cashRateFlag",
    "acctChar",
    "clientCHNName",
    "openBranchId",
    "acctType",
    "acctBal",
    "rsrvBal",
    "freezeBal",
    "cntlBal",
    "actualBal",
    "floatMode",
    "validDate",
    "floatType",
    "floatAmt",
    "recordStatus"
})
public class CrnBalDtlInfoType {

    @XmlElement(name = "ClientNo")
    protected String clientNo;
    @XmlElement(name = "CardNo")
    protected String cardNo;
    @XmlElement(name = "ClientAcctNo")
    protected String clientAcctNo;
    @XmlElement(name = "CurrencyId")
    protected String currencyId;
    @XmlElement(name = "CashRateFlag")
    protected String cashRateFlag;
    @XmlElement(name = "AcctChar")
    protected String acctChar;
    @XmlElement(name = "ClientCHNName")
    protected String clientCHNName;
    @XmlElement(name = "OpenBranchId")
    protected String openBranchId;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "AcctBal")
    protected BigDecimal acctBal;
    @XmlElement(name = "RsrvBal")
    protected BigDecimal rsrvBal;
    @XmlElement(name = "FreezeBal")
    protected BigDecimal freezeBal;
    @XmlElement(name = "CntlBal")
    protected BigDecimal cntlBal;
    @XmlElement(name = "ActualBal")
    protected BigDecimal actualBal;
    @XmlElement(name = "FloatMode")
    protected String floatMode;
    @XmlElement(name = "ValidDate")
    protected String validDate;
    @XmlElement(name = "FloatType")
    protected String floatType;
    @XmlElement(name = "FloatAmt")
    protected BigDecimal floatAmt;
    @XmlElement(name = "RecordStatus")
    protected String recordStatus;

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
     * 获取cardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置cardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
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
     * 获取currencyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * 设置currencyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * 获取cashRateFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashRateFlag() {
        return cashRateFlag;
    }

    /**
     * 设置cashRateFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashRateFlag(String value) {
        this.cashRateFlag = value;
    }

    /**
     * 获取acctChar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctChar() {
        return acctChar;
    }

    /**
     * 设置acctChar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctChar(String value) {
        this.acctChar = value;
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
     * 获取openBranchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBranchId() {
        return openBranchId;
    }

    /**
     * 设置openBranchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBranchId(String value) {
        this.openBranchId = value;
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
     * 获取acctBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctBal() {
        return acctBal;
    }

    /**
     * 设置acctBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctBal(BigDecimal value) {
        this.acctBal = value;
    }

    /**
     * 获取rsrvBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsrvBal() {
        return rsrvBal;
    }

    /**
     * 设置rsrvBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRsrvBal(BigDecimal value) {
        this.rsrvBal = value;
    }

    /**
     * 获取freezeBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreezeBal() {
        return freezeBal;
    }

    /**
     * 设置freezeBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreezeBal(BigDecimal value) {
        this.freezeBal = value;
    }

    /**
     * 获取cntlBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntlBal() {
        return cntlBal;
    }

    /**
     * 设置cntlBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCntlBal(BigDecimal value) {
        this.cntlBal = value;
    }

    /**
     * 获取actualBal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualBal() {
        return actualBal;
    }

    /**
     * 设置actualBal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualBal(BigDecimal value) {
        this.actualBal = value;
    }

    /**
     * 获取floatMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatMode() {
        return floatMode;
    }

    /**
     * 设置floatMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatMode(String value) {
        this.floatMode = value;
    }

    /**
     * 获取validDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * 设置validDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * 获取floatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloatType() {
        return floatType;
    }

    /**
     * 设置floatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloatType(String value) {
        this.floatType = value;
    }

    /**
     * 获取floatAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFloatAmt() {
        return floatAmt;
    }

    /**
     * 设置floatAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFloatAmt(BigDecimal value) {
        this.floatAmt = value;
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
