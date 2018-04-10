
package com.sunyard.core.S040030101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CrdAcctInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CrdAcctInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}AcctTp1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}ClientAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}SettleAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}AcctClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}OpenAcctChlTpCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}FcToFcFlg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}StrtStpFlg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}UpDwnNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}BndFlg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}BndAcctNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}BndSrlNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}TranDate1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}DyDbTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}DyCrTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}TranMo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}MoAcrDbTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}MoAcrCrTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}Year" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}YrAcrDbTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}YrAcrCrTranAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}DyWhdrwAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}DyDepAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}YrWhdrwAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}YrDepAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}RsrvFld" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrdAcctInfoType", propOrder = {
    "acctTp1",
    "clientAcctNo",
    "settleAcctNo",
    "acctClass",
    "openAcctChlTpCd",
    "fcToFcFlg",
    "strtStpFlg",
    "upDwnNum",
    "bndFlg",
    "bndAcctNum",
    "bndSrlNo",
    "tranDate1",
    "dyDbTranAmt",
    "dyCrTranAmt",
    "tranMo",
    "moAcrDbTranAmt",
    "moAcrCrTranAmt",
    "year",
    "yrAcrDbTranAmt",
    "yrAcrCrTranAmt",
    "dyWhdrwAmt",
    "dyDepAmt",
    "yrWhdrwAmt",
    "yrDepAmt",
    "rsrvFld"
})
public class CrdAcctInfoType {

    @XmlElement(name = "AcctTp1")
    protected String acctTp1;
    @XmlElement(name = "ClientAcctNo")
    protected String clientAcctNo;
    @XmlElement(name = "SettleAcctNo")
    protected String settleAcctNo;
    @XmlElement(name = "AcctClass")
    protected String acctClass;
    @XmlElement(name = "OpenAcctChlTpCd")
    protected String openAcctChlTpCd;
    @XmlElement(name = "FcToFcFlg")
    protected String fcToFcFlg;
    @XmlElement(name = "StrtStpFlg")
    protected String strtStpFlg;
    @XmlElement(name = "UpDwnNum")
    protected String upDwnNum;
    @XmlElement(name = "BndFlg")
    protected String bndFlg;
    @XmlElement(name = "BndAcctNum")
    protected String bndAcctNum;
    @XmlElement(name = "BndSrlNo")
    protected String bndSrlNo;
    @XmlElement(name = "TranDate1")
    protected String tranDate1;
    @XmlElement(name = "DyDbTranAmt")
    protected String dyDbTranAmt;
    @XmlElement(name = "DyCrTranAmt")
    protected String dyCrTranAmt;
    @XmlElement(name = "TranMo")
    protected String tranMo;
    @XmlElement(name = "MoAcrDbTranAmt")
    protected String moAcrDbTranAmt;
    @XmlElement(name = "MoAcrCrTranAmt")
    protected String moAcrCrTranAmt;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "YrAcrDbTranAmt")
    protected String yrAcrDbTranAmt;
    @XmlElement(name = "YrAcrCrTranAmt")
    protected String yrAcrCrTranAmt;
    @XmlElement(name = "DyWhdrwAmt")
    protected String dyWhdrwAmt;
    @XmlElement(name = "DyDepAmt")
    protected String dyDepAmt;
    @XmlElement(name = "YrWhdrwAmt")
    protected String yrWhdrwAmt;
    @XmlElement(name = "YrDepAmt")
    protected String yrDepAmt;
    @XmlElement(name = "RsrvFld")
    protected String rsrvFld;

    /**
     * 获取acctTp1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTp1() {
        return acctTp1;
    }

    /**
     * 设置acctTp1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTp1(String value) {
        this.acctTp1 = value;
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
     * 获取settleAcctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleAcctNo() {
        return settleAcctNo;
    }

    /**
     * 设置settleAcctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleAcctNo(String value) {
        this.settleAcctNo = value;
    }

    /**
     * 获取acctClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClass() {
        return acctClass;
    }

    /**
     * 设置acctClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClass(String value) {
        this.acctClass = value;
    }

    /**
     * 获取openAcctChlTpCd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAcctChlTpCd() {
        return openAcctChlTpCd;
    }

    /**
     * 设置openAcctChlTpCd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAcctChlTpCd(String value) {
        this.openAcctChlTpCd = value;
    }

    /**
     * 获取fcToFcFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcToFcFlg() {
        return fcToFcFlg;
    }

    /**
     * 设置fcToFcFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcToFcFlg(String value) {
        this.fcToFcFlg = value;
    }

    /**
     * 获取strtStpFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtStpFlg() {
        return strtStpFlg;
    }

    /**
     * 设置strtStpFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtStpFlg(String value) {
        this.strtStpFlg = value;
    }

    /**
     * 获取upDwnNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpDwnNum() {
        return upDwnNum;
    }

    /**
     * 设置upDwnNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpDwnNum(String value) {
        this.upDwnNum = value;
    }

    /**
     * 获取bndFlg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBndFlg() {
        return bndFlg;
    }

    /**
     * 设置bndFlg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBndFlg(String value) {
        this.bndFlg = value;
    }

    /**
     * 获取bndAcctNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBndAcctNum() {
        return bndAcctNum;
    }

    /**
     * 设置bndAcctNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBndAcctNum(String value) {
        this.bndAcctNum = value;
    }

    /**
     * 获取bndSrlNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBndSrlNo() {
        return bndSrlNo;
    }

    /**
     * 设置bndSrlNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBndSrlNo(String value) {
        this.bndSrlNo = value;
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
     * 获取dyDbTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyDbTranAmt() {
        return dyDbTranAmt;
    }

    /**
     * 设置dyDbTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyDbTranAmt(String value) {
        this.dyDbTranAmt = value;
    }

    /**
     * 获取dyCrTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyCrTranAmt() {
        return dyCrTranAmt;
    }

    /**
     * 设置dyCrTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyCrTranAmt(String value) {
        this.dyCrTranAmt = value;
    }

    /**
     * 获取tranMo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranMo() {
        return tranMo;
    }

    /**
     * 设置tranMo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranMo(String value) {
        this.tranMo = value;
    }

    /**
     * 获取moAcrDbTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoAcrDbTranAmt() {
        return moAcrDbTranAmt;
    }

    /**
     * 设置moAcrDbTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoAcrDbTranAmt(String value) {
        this.moAcrDbTranAmt = value;
    }

    /**
     * 获取moAcrCrTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoAcrCrTranAmt() {
        return moAcrCrTranAmt;
    }

    /**
     * 设置moAcrCrTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoAcrCrTranAmt(String value) {
        this.moAcrCrTranAmt = value;
    }

    /**
     * 获取year属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * 获取yrAcrDbTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYrAcrDbTranAmt() {
        return yrAcrDbTranAmt;
    }

    /**
     * 设置yrAcrDbTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYrAcrDbTranAmt(String value) {
        this.yrAcrDbTranAmt = value;
    }

    /**
     * 获取yrAcrCrTranAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYrAcrCrTranAmt() {
        return yrAcrCrTranAmt;
    }

    /**
     * 设置yrAcrCrTranAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYrAcrCrTranAmt(String value) {
        this.yrAcrCrTranAmt = value;
    }

    /**
     * 获取dyWhdrwAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyWhdrwAmt() {
        return dyWhdrwAmt;
    }

    /**
     * 设置dyWhdrwAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyWhdrwAmt(String value) {
        this.dyWhdrwAmt = value;
    }

    /**
     * 获取dyDepAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyDepAmt() {
        return dyDepAmt;
    }

    /**
     * 设置dyDepAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyDepAmt(String value) {
        this.dyDepAmt = value;
    }

    /**
     * 获取yrWhdrwAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYrWhdrwAmt() {
        return yrWhdrwAmt;
    }

    /**
     * 设置yrWhdrwAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYrWhdrwAmt(String value) {
        this.yrWhdrwAmt = value;
    }

    /**
     * 获取yrDepAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYrDepAmt() {
        return yrDepAmt;
    }

    /**
     * 设置yrDepAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYrDepAmt(String value) {
        this.yrDepAmt = value;
    }

    /**
     * 获取rsrvFld属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrvFld() {
        return rsrvFld;
    }

    /**
     * 设置rsrvFld属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrvFld(String value) {
        this.rsrvFld = value;
    }

}
