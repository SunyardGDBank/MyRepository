
package com.sunyard.core.S070030011;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExgInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ApplyNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}TranDate1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ExecExgRt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BuyCcy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}SellCcy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BuyAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}SellAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CashRateFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AplChannel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}Abstract" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}RecordStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}FailRsnDsc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}XfundPrjCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExgInfoType", propOrder = {
    "applyNo",
    "tranDate1",
    "bussType",
    "acctNo",
    "execExgRt",
    "buyCcy",
    "sellCcy",
    "buyAmt",
    "sellAmt",
    "cashRateFlag",
    "aplChannel",
    "_abstract",
    "recordStatus",
    "failRsnDsc",
    "xfundPrjCd",
    "bussId"
})
public class ExgInfoType {

    @XmlElement(name = "ApplyNo")
    protected String applyNo;
    @XmlElement(name = "TranDate1")
    protected String tranDate1;
    @XmlElement(name = "BussType")
    protected String bussType;
    @XmlElement(name = "AcctNo")
    protected String acctNo;
    @XmlElement(name = "ExecExgRt")
    protected BigDecimal execExgRt;
    @XmlElement(name = "BuyCcy")
    protected String buyCcy;
    @XmlElement(name = "SellCcy")
    protected String sellCcy;
    @XmlElement(name = "BuyAmt")
    protected BigDecimal buyAmt;
    @XmlElement(name = "SellAmt")
    protected BigDecimal sellAmt;
    @XmlElement(name = "CashRateFlag")
    protected String cashRateFlag;
    @XmlElement(name = "AplChannel")
    protected String aplChannel;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "RecordStatus")
    protected String recordStatus;
    @XmlElement(name = "FailRsnDsc")
    protected String failRsnDsc;
    @XmlElement(name = "XfundPrjCd")
    protected String xfundPrjCd;
    @XmlElement(name = "BussId")
    protected String bussId;

    /**
     * 获取applyNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * 设置applyNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyNo(String value) {
        this.applyNo = value;
    }

    /**
     * 获取tranDate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranDate1() {
        return tranDate1;
    }

    /**
     * 设置tranDate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranDate1(String value) {
        this.tranDate1 = value;
    }

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
     * 获取acctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * 设置acctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * 获取execExgRt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExecExgRt() {
        return execExgRt;
    }

    /**
     * 设置execExgRt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExecExgRt(BigDecimal value) {
        this.execExgRt = value;
    }

    /**
     * 获取buyCcy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyCcy() {
        return buyCcy;
    }

    /**
     * 设置buyCcy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyCcy(String value) {
        this.buyCcy = value;
    }

    /**
     * 获取sellCcy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellCcy() {
        return sellCcy;
    }

    /**
     * 设置sellCcy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellCcy(String value) {
        this.sellCcy = value;
    }

    /**
     * 获取buyAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBuyAmt() {
        return buyAmt;
    }

    /**
     * 设置buyAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBuyAmt(BigDecimal value) {
        this.buyAmt = value;
    }

    /**
     * 获取sellAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellAmt() {
        return sellAmt;
    }

    /**
     * 设置sellAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellAmt(BigDecimal value) {
        this.sellAmt = value;
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
     * 获取aplChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplChannel() {
        return aplChannel;
    }

    /**
     * 设置aplChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplChannel(String value) {
        this.aplChannel = value;
    }

    /**
     * 获取abstract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * 设置abstract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
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
     * 获取failRsnDsc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailRsnDsc() {
        return failRsnDsc;
    }

    /**
     * 设置failRsnDsc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailRsnDsc(String value) {
        this.failRsnDsc = value;
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
     * 获取bussId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBussId() {
        return bussId;
    }

    /**
     * 设置bussId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBussId(String value) {
        this.bussId = value;
    }

}
