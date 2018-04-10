
package com.sunyard.core.S040030100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqCrdBndngRltnpQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqCrdBndngRltnpQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S040030100}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientAcctNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}QueryType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}CtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}PymtCd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}TranPwd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SerialNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}StartNum2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}QueryNum2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}RsrvFld" minOccurs="0"/&gt;
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
@XmlType(name = "ReqCrdBndngRltnpQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqCrdBndngRltnpQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientAcctNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}QueryType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}CtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}PymtCd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}TranPwd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SerialNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}StartNum2" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}QueryNum2" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "acctType",
        "clientAcctNo",
        "queryType",
        "ctfType",
        "ctfId",
        "pymtCd",
        "tranPwd",
        "serialNo",
        "startNum2",
        "queryNum2",
        "rsrvFld"
    })
    public static class SvcBody {

        @XmlElement(name = "AcctType", required = true)
        protected String acctType;
        @XmlElement(name = "ClientAcctNo", required = true)
        protected String clientAcctNo;
        @XmlElement(name = "QueryType", required = true)
        protected String queryType;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CtfId")
        protected String ctfId;
        @XmlElement(name = "PymtCd")
        protected String pymtCd;
        @XmlElement(name = "TranPwd")
        protected String tranPwd;
        @XmlElement(name = "SerialNo")
        protected String serialNo;
        @XmlElement(name = "StartNum2")
        protected String startNum2;
        @XmlElement(name = "QueryNum2")
        protected String queryNum2;
        @XmlElement(name = "RsrvFld")
        protected String rsrvFld;

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
         * 获取startNum2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartNum2() {
            return startNum2;
        }

        /**
         * 设置startNum2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartNum2(String value) {
            this.startNum2 = value;
        }

        /**
         * 获取queryNum2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryNum2() {
            return queryNum2;
        }

        /**
         * 设置queryNum2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryNum2(String value) {
            this.queryNum2 = value;
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

}
