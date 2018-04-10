
package com.sunyard.core.S010030004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqCrnAcctBalQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqCrnAcctBalQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S010030004}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryPwd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CardNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}StartNum1"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryNum1"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctChar"/&gt;
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
@XmlType(name = "ReqCrnAcctBalQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqCrnAcctBalQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ClientNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryPwd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CardNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CurrencyId"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CashRateFlag"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}StartNum1"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}QueryNum1"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctChar"/&gt;
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
        "queryType",
        "acctType",
        "clientNo",
        "queryPwd",
        "cardNo",
        "currencyId",
        "cashRateFlag",
        "startNum1",
        "queryNum1",
        "acctChar"
    })
    public static class SvcBody {

        @XmlElement(name = "QueryType", required = true)
        protected String queryType;
        @XmlElement(name = "AcctType", required = true)
        protected String acctType;
        @XmlElement(name = "ClientNo", required = true)
        protected String clientNo;
        @XmlElement(name = "QueryPwd")
        protected String queryPwd;
        @XmlElement(name = "CardNo", required = true)
        protected String cardNo;
        @XmlElement(name = "CurrencyId", required = true)
        protected String currencyId;
        @XmlElement(name = "CashRateFlag", required = true)
        protected String cashRateFlag;
        @XmlElement(name = "StartNum1")
        protected int startNum1;
        @XmlElement(name = "QueryNum1")
        protected int queryNum1;
        @XmlElement(name = "AcctChar", required = true)
        protected String acctChar;

        /**
         * 获取queryType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryType() {
            return queryType;
        }

        /**
         * 设置queryType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryType(String value) {
            this.queryType = value;
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
         * 获取queryPwd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryPwd() {
            return queryPwd;
        }

        /**
         * 设置queryPwd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryPwd(String value) {
            this.queryPwd = value;
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
         * 获取startNum1属性的值。
         * 
         */
        public int getStartNum1() {
            return startNum1;
        }

        /**
         * 设置startNum1属性的值。
         * 
         */
        public void setStartNum1(int value) {
            this.startNum1 = value;
        }

        /**
         * 获取queryNum1属性的值。
         * 
         */
        public int getQueryNum1() {
            return queryNum1;
        }

        /**
         * 设置queryNum1属性的值。
         * 
         */
        public void setQueryNum1(int value) {
            this.queryNum1 = value;
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

    }

}
