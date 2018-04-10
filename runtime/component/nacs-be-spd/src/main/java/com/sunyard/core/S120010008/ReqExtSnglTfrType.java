
package com.sunyard.core.S120010008;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqExtSnglTfrType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqExtSnglTfrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S120010008}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AgentBussNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctChar"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}PwdCheckType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranPwd"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctChar"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}VchrNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Ccy"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}CashRateFlag"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranAmt"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AbstractCode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Track2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Track3" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}CashTranFlag"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ThirdPartyAdr" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ThirdPartyUserNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ProductNo" minOccurs="0"/&gt;
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
@XmlType(name = "ReqExtSnglTfrType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqExtSnglTfrType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AgentBussNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctChar"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}PwdCheckType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranPwd"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctChar"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}VchrNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Ccy"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}CashRateFlag"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}TranAmt"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}AbstractCode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Track2" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}Track3" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}CashTranFlag"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ThirdPartyAdr" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ThirdPartyUserNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}ProductNo" minOccurs="0"/&gt;
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
        "agentBussNo",
        "outAcctType",
        "outAcctNo",
        "outAcctChar",
        "pwdCheckType",
        "tranPwd",
        "inAcctType",
        "inAcctNo",
        "inAcctChar",
        "vchrNo",
        "ccy",
        "cashRateFlag",
        "tranAmt",
        "abstractCode",
        "track2",
        "track3",
        "cashTranFlag",
        "thirdPartyAdr",
        "thirdPartyUserNo",
        "productNo"
    })
    public static class SvcBody {

        @XmlElement(name = "AgentBussNo", required = true)
        protected String agentBussNo;
        @XmlElement(name = "OutAcctType", required = true)
        protected String outAcctType;
        @XmlElement(name = "OutAcctNo", required = true)
        protected String outAcctNo;
        @XmlElement(name = "OutAcctChar", required = true)
        protected String outAcctChar;
        @XmlElement(name = "PwdCheckType", required = true)
        protected String pwdCheckType;
        @XmlElement(name = "TranPwd", required = true)
        protected String tranPwd;
        @XmlElement(name = "InAcctType", required = true)
        protected String inAcctType;
        @XmlElement(name = "InAcctNo", required = true)
        protected String inAcctNo;
        @XmlElement(name = "InAcctChar", required = true)
        protected String inAcctChar;
        @XmlElement(name = "VchrNo")
        protected String vchrNo;
        @XmlElement(name = "Ccy", required = true)
        protected String ccy;
        @XmlElement(name = "CashRateFlag", required = true)
        protected String cashRateFlag;
        @XmlElement(name = "TranAmt", required = true)
        protected BigDecimal tranAmt;
        @XmlElement(name = "AbstractCode")
        protected String abstractCode;
        @XmlElement(name = "Track2")
        protected String track2;
        @XmlElement(name = "Track3")
        protected String track3;
        @XmlElement(name = "CashTranFlag", required = true)
        protected String cashTranFlag;
        @XmlElement(name = "ThirdPartyAdr")
        protected String thirdPartyAdr;
        @XmlElement(name = "ThirdPartyUserNo")
        protected String thirdPartyUserNo;
        @XmlElement(name = "ProductNo")
        protected String productNo;

        /**
         * 获取agentBussNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentBussNo() {
            return agentBussNo;
        }

        /**
         * 设置agentBussNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentBussNo(String value) {
            this.agentBussNo = value;
        }

        /**
         * 获取outAcctType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutAcctType() {
            return outAcctType;
        }

        /**
         * 设置outAcctType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutAcctType(String value) {
            this.outAcctType = value;
        }

        /**
         * 获取outAcctNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutAcctNo() {
            return outAcctNo;
        }

        /**
         * 设置outAcctNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutAcctNo(String value) {
            this.outAcctNo = value;
        }

        /**
         * 获取outAcctChar属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutAcctChar() {
            return outAcctChar;
        }

        /**
         * 设置outAcctChar属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutAcctChar(String value) {
            this.outAcctChar = value;
        }

        /**
         * 获取pwdCheckType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPwdCheckType() {
            return pwdCheckType;
        }

        /**
         * 设置pwdCheckType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPwdCheckType(String value) {
            this.pwdCheckType = value;
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
         * 获取inAcctType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInAcctType() {
            return inAcctType;
        }

        /**
         * 设置inAcctType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInAcctType(String value) {
            this.inAcctType = value;
        }

        /**
         * 获取inAcctNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInAcctNo() {
            return inAcctNo;
        }

        /**
         * 设置inAcctNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInAcctNo(String value) {
            this.inAcctNo = value;
        }

        /**
         * 获取inAcctChar属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInAcctChar() {
            return inAcctChar;
        }

        /**
         * 设置inAcctChar属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInAcctChar(String value) {
            this.inAcctChar = value;
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
         * 获取ccy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcy() {
            return ccy;
        }

        /**
         * 设置ccy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcy(String value) {
            this.ccy = value;
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
         * 获取track3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrack3() {
            return track3;
        }

        /**
         * 设置track3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrack3(String value) {
            this.track3 = value;
        }

        /**
         * 获取cashTranFlag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashTranFlag() {
            return cashTranFlag;
        }

        /**
         * 设置cashTranFlag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashTranFlag(String value) {
            this.cashTranFlag = value;
        }

        /**
         * 获取thirdPartyAdr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThirdPartyAdr() {
            return thirdPartyAdr;
        }

        /**
         * 设置thirdPartyAdr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThirdPartyAdr(String value) {
            this.thirdPartyAdr = value;
        }

        /**
         * 获取thirdPartyUserNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThirdPartyUserNo() {
            return thirdPartyUserNo;
        }

        /**
         * 设置thirdPartyUserNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThirdPartyUserNo(String value) {
            this.thirdPartyUserNo = value;
        }

        /**
         * 获取productNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductNo() {
            return productNo;
        }

        /**
         * 设置productNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductNo(String value) {
            this.productNo = value;
        }

    }

}
