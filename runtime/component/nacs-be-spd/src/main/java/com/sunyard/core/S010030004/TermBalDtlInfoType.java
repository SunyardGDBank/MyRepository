
package com.sunyard.core.S010030004;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TermBalDtlInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TermBalDtlInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}InrAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SerialNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}DepositType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}OpenAcctAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RsrvBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CntlBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FreezeBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}BussBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}OpenAcctDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ExpiredDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}DepositTerm" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}IntRate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ValidDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FloatAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}StartIntDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RecordStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RenewDepFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermBalDtlInfoType", propOrder = {
    "clientAcctNo",
    "inrAcctNo",
    "serialNo",
    "depositType",
    "currencyId",
    "acctBal",
    "openAcctAmt",
    "rsrvBal",
    "cntlBal",
    "freezeBal",
    "bussBranchId",
    "openAcctDate",
    "expiredDate",
    "depositTerm",
    "intRate",
    "floatMode",
    "validDate",
    "floatType",
    "floatAmt",
    "cashRateFlag",
    "startIntDate",
    "recordStatus",
    "acctType",
    "renewDepFlag"
})
public class TermBalDtlInfoType {

    @XmlElement(name = "ClientAcctNo")
    protected String clientAcctNo;
    @XmlElement(name = "InrAcctNo")
    protected String inrAcctNo;
    @XmlElement(name = "SerialNo")
    protected String serialNo;
    @XmlElement(name = "DepositType")
    protected String depositType;
    @XmlElement(name = "CurrencyId")
    protected String currencyId;
    @XmlElement(name = "AcctBal")
    protected BigDecimal acctBal;
    @XmlElement(name = "OpenAcctAmt")
    protected BigDecimal openAcctAmt;
    @XmlElement(name = "RsrvBal")
    protected BigDecimal rsrvBal;
    @XmlElement(name = "CntlBal")
    protected BigDecimal cntlBal;
    @XmlElement(name = "FreezeBal")
    protected BigDecimal freezeBal;
    @XmlElement(name = "BussBranchId")
    protected String bussBranchId;
    @XmlElement(name = "OpenAcctDate")
    protected String openAcctDate;
    @XmlElement(name = "ExpiredDate")
    protected String expiredDate;
    @XmlElement(name = "DepositTerm")
    protected String depositTerm;
    @XmlElement(name = "IntRate")
    protected BigDecimal intRate;
    @XmlElement(name = "FloatMode")
    protected String floatMode;
    @XmlElement(name = "ValidDate")
    protected String validDate;
    @XmlElement(name = "FloatType")
    protected String floatType;
    @XmlElement(name = "FloatAmt")
    protected BigDecimal floatAmt;
    @XmlElement(name = "CashRateFlag")
    protected String cashRateFlag;
    @XmlElement(name = "StartIntDate")
    protected String startIntDate;
    @XmlElement(name = "RecordStatus")
    protected String recordStatus;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "RenewDepFlag")
    protected String renewDepFlag;

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
     * 获取inrAcctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInrAcctNo() {
        return inrAcctNo;
    }

    /**
     * 设置inrAcctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInrAcctNo(String value) {
        this.inrAcctNo = value;
    }

    /**
     * 获取serialNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 设置serialNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * 获取depositType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * 设置depositType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
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
     * 获取openAcctAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAcctAmt() {
        return openAcctAmt;
    }

    /**
     * 设置openAcctAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAcctAmt(BigDecimal value) {
        this.openAcctAmt = value;
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
     * 获取openAcctDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAcctDate() {
        return openAcctDate;
    }

    /**
     * 设置openAcctDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAcctDate(String value) {
        this.openAcctDate = value;
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
     * 获取depositTerm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositTerm() {
        return depositTerm;
    }

    /**
     * 设置depositTerm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositTerm(String value) {
        this.depositTerm = value;
    }

    /**
     * 获取intRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntRate() {
        return intRate;
    }

    /**
     * 设置intRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntRate(BigDecimal value) {
        this.intRate = value;
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
     * 获取startIntDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIntDate() {
        return startIntDate;
    }

    /**
     * 设置startIntDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIntDate(String value) {
        this.startIntDate = value;
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
     * 获取renewDepFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewDepFlag() {
        return renewDepFlag;
    }

    /**
     * 设置renewDepFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewDepFlag(String value) {
        this.renewDepFlag = value;
    }

}
