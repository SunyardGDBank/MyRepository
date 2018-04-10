
package com.sunyard.core.S010030004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqAcntgBalQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqAcntgBalQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S010030004}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientAcctNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctChar" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}PwdCheckType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranPwd" minOccurs="0"/&gt;
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
@XmlType(name = "ReqAcntgBalQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqAcntgBalQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientAcctNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctChar" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}PwdCheckType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}TranPwd" minOccurs="0"/&gt;
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
        "acctType",
        "clientAcctNo",
        "currencyId",
        "acctChar",
        "cashRateFlag",
        "pwdCheckType",
        "tranPwd"
    })
    public static class SvcBody {

        @XmlElement(name = "AcctType", required = true)
        protected String acctType;
        @XmlElement(name = "ClientAcctNo", required = true)
        protected String clientAcctNo;
        @XmlElement(name = "CurrencyId")
        protected String currencyId;
        @XmlElement(name = "AcctChar")
        protected String acctChar;
        @XmlElement(name = "CashRateFlag")
        protected String cashRateFlag;
        @XmlElement(name = "PwdCheckType", required = true)
        protected String pwdCheckType;
        @XmlElement(name = "TranPwd")
        protected String tranPwd;

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

    }

}
