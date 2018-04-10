
package com.sunyard.core.S040030100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CrdNoBndInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CrdNoBndInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SerialNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}OwnBankFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctTp1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}CNAPSBnkNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SprEbnkBnkNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndAcctNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SignDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SignTellerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}MntnDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}MntnTlrNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}UnwindDate1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}UnwindTellerNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}RsrvFld" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrdNoBndInfoType", propOrder = {
    "serialNo",
    "ownBankFlag",
    "acctTp1",
    "cnapsBnkNo",
    "sprEbnkBnkNo",
    "bndAcctNo",
    "acctName",
    "signDate",
    "signTellerNo",
    "mntnDate",
    "mntnTlrNo",
    "unwindDate1",
    "unwindTellerNo",
    "rsrvFld"
})
public class CrdNoBndInfoType {

    @XmlElement(name = "SerialNo")
    protected String serialNo;
    @XmlElement(name = "OwnBankFlag")
    protected String ownBankFlag;
    @XmlElement(name = "AcctTp1")
    protected String acctTp1;
    @XmlElement(name = "CNAPSBnkNo")
    protected String cnapsBnkNo;
    @XmlElement(name = "SprEbnkBnkNo")
    protected String sprEbnkBnkNo;
    @XmlElement(name = "BndAcctNo")
    protected String bndAcctNo;
    @XmlElement(name = "AcctName")
    protected String acctName;
    @XmlElement(name = "SignDate")
    protected String signDate;
    @XmlElement(name = "SignTellerNo")
    protected String signTellerNo;
    @XmlElement(name = "MntnDate")
    protected String mntnDate;
    @XmlElement(name = "MntnTlrNo")
    protected String mntnTlrNo;
    @XmlElement(name = "UnwindDate1")
    protected String unwindDate1;
    @XmlElement(name = "UnwindTellerNo")
    protected String unwindTellerNo;
    @XmlElement(name = "RsrvFld")
    protected String rsrvFld;

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
     * 获取ownBankFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnBankFlag() {
        return ownBankFlag;
    }

    /**
     * 设置ownBankFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnBankFlag(String value) {
        this.ownBankFlag = value;
    }

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
     * 获取cnapsBnkNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAPSBnkNo() {
        return cnapsBnkNo;
    }

    /**
     * 设置cnapsBnkNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAPSBnkNo(String value) {
        this.cnapsBnkNo = value;
    }

    /**
     * 获取sprEbnkBnkNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSprEbnkBnkNo() {
        return sprEbnkBnkNo;
    }

    /**
     * 设置sprEbnkBnkNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSprEbnkBnkNo(String value) {
        this.sprEbnkBnkNo = value;
    }

    /**
     * 获取bndAcctNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBndAcctNo() {
        return bndAcctNo;
    }

    /**
     * 设置bndAcctNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBndAcctNo(String value) {
        this.bndAcctNo = value;
    }

    /**
     * 获取acctName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 设置acctName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * 获取signDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * 设置signDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
        this.signDate = value;
    }

    /**
     * 获取signTellerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignTellerNo() {
        return signTellerNo;
    }

    /**
     * 设置signTellerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignTellerNo(String value) {
        this.signTellerNo = value;
    }

    /**
     * 获取mntnDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntnDate() {
        return mntnDate;
    }

    /**
     * 设置mntnDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntnDate(String value) {
        this.mntnDate = value;
    }

    /**
     * 获取mntnTlrNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntnTlrNo() {
        return mntnTlrNo;
    }

    /**
     * 设置mntnTlrNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntnTlrNo(String value) {
        this.mntnTlrNo = value;
    }

    /**
     * 获取unwindDate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnwindDate1() {
        return unwindDate1;
    }

    /**
     * 设置unwindDate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnwindDate1(String value) {
        this.unwindDate1 = value;
    }

    /**
     * 获取unwindTellerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnwindTellerNo() {
        return unwindTellerNo;
    }

    /**
     * 设置unwindTellerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnwindTellerNo(String value) {
        this.unwindTellerNo = value;
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
