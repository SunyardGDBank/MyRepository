
package com.sunyard.core.S010010086;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqLcyFcyDmdSvgCashTllyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqLcyFcyDmdSvgCashTllyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S010010086}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AgnclBussId"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}RcvPyFlag"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}IputMode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientAcctNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctChar" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}PymtCd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranPwd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}VchrNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CurrencyId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CashRateFlag" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranAmt" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AbstractCode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}Track2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TrackThrd" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqLcyFcyDmdSvgCashTllyType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqLcyFcyDmdSvgCashTllyType {

    @XmlElement(name = "ReqSvcHeader", required = true)
    protected ReqSvcHeaderType reqSvcHeader;
    @XmlElement(name = "SvcBody")
    protected SvcBody svcBody;

    /**
     * 获取reqSvcHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReqSvcHeaderType }
     *     
     */
    public ReqSvcHeaderType getReqSvcHeader() {
        return reqSvcHeader;
    }

    /**
     * 设置reqSvcHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReqSvcHeaderType }
     *     
     */
    public void setReqSvcHeader(ReqSvcHeaderType value) {
        this.reqSvcHeader = value;
    }

    /**
     * 获取svcBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SvcBody }
     *     
     */
    public SvcBody getSvcBody() {
        return svcBody;
    }

    /**
     * 设置svcBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SvcBody }
     *     
     */
    public void setSvcBody(SvcBody value) {
        this.svcBody = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AgnclBussId"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}RcvPyFlag"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}IputMode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientAcctNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctChar" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}PymtCd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranPwd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}VchrNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CurrencyId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CashRateFlag" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranAmt" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}CtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AbstractCode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}Track2" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TrackThrd" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agnclBussId",
        "rcvPyFlag",
        "iputMode",
        "acctType",
        "clientAcctNo",
        "acctChar",
        "pymtCd",
        "tranPwd",
        "vchrNo",
        "currencyId",
        "cashRateFlag",
        "tranAmt",
        "ctfType",
        "ctfId",
        "abstractCode",
        "track2",
        "trackThrd"
    })
    public static class SvcBody {

        @XmlElement(name = "AgnclBussId", required = true)
        protected String agnclBussId;
        @XmlElement(name = "RcvPyFlag", required = true)
        protected String rcvPyFlag;
        @XmlElement(name = "IputMode")
        protected String iputMode;
        @XmlElement(name = "AcctType", required = true)
        protected String acctType;
        @XmlElement(name = "ClientAcctNo", required = true)
        protected String clientAcctNo;
        @XmlElement(name = "AcctChar")
        protected String acctChar;
        @XmlElement(name = "PymtCd")
        protected String pymtCd;
        @XmlElement(name = "TranPwd")
        protected String tranPwd;
        @XmlElement(name = "VchrNo")
        protected String vchrNo;
        @XmlElement(name = "CurrencyId")
        protected String currencyId;
        @XmlElement(name = "CashRateFlag")
        protected String cashRateFlag;
        @XmlElement(name = "TranAmt")
        protected BigDecimal tranAmt;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CtfId")
        protected String ctfId;
        @XmlElement(name = "AbstractCode")
        protected String abstractCode;
        @XmlElement(name = "Track2")
        protected String track2;
        @XmlElement(name = "TrackThrd")
        protected String trackThrd;

        /**
         * 获取agnclBussId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgnclBussId() {
            return agnclBussId;
        }

        /**
         * 设置agnclBussId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgnclBussId(String value) {
            this.agnclBussId = value;
        }

        /**
         * 获取rcvPyFlag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRcvPyFlag() {
            return rcvPyFlag;
        }

        /**
         * 设置rcvPyFlag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRcvPyFlag(String value) {
            this.rcvPyFlag = value;
        }

        /**
         * 获取iputMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIputMode() {
            return iputMode;
        }

        /**
         * 设置iputMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIputMode(String value) {
            this.iputMode = value;
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
         * 获取pymtCd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPymtCd() {
            return pymtCd;
        }

        /**
         * 设置pymtCd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPymtCd(String value) {
            this.pymtCd = value;
        }

        /**
         * 获取tranPwd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranPwd() {
            return tranPwd;
        }

        /**
         * 设置tranPwd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranPwd(String value) {
            this.tranPwd = value;
        }

        /**
         * 获取vchrNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVchrNo() {
            return vchrNo;
        }

        /**
         * 设置vchrNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVchrNo(String value) {
            this.vchrNo = value;
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
         * 获取tranAmt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTranAmt() {
            return tranAmt;
        }

        /**
         * 设置tranAmt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTranAmt(BigDecimal value) {
            this.tranAmt = value;
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
         * 获取abstractCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbstractCode() {
            return abstractCode;
        }

        /**
         * 设置abstractCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbstractCode(String value) {
            this.abstractCode = value;
        }

        /**
         * 获取track2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrack2() {
            return track2;
        }

        /**
         * 设置track2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrack2(String value) {
            this.track2 = value;
        }

        /**
         * 获取trackThrd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrackThrd() {
            return trackThrd;
        }

        /**
         * 设置trackThrd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrackThrd(String value) {
            this.trackThrd = value;
        }

    }

}
