
package com.sunyard.core.S010010086;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspLcyFcyDmdSvgCashTllyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspLcyFcyDmdSvgCashTllyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S010010086}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctCHNName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranAmt" minOccurs="0"/&gt;
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
@XmlType(name = "RspLcyFcyDmdSvgCashTllyType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspLcyFcyDmdSvgCashTllyType {

    @XmlElement(name = "RspSvcHeader", required = true)
    protected RspSvcHeaderType rspSvcHeader;
    @XmlElement(name = "SvcBody")
    protected SvcBody svcBody;

    /**
     * 获取rspSvcHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RspSvcHeaderType }
     *     
     */
    public RspSvcHeaderType getRspSvcHeader() {
        return rspSvcHeader;
    }

    /**
     * 设置rspSvcHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RspSvcHeaderType }
     *     
     */
    public void setRspSvcHeader(RspSvcHeaderType value) {
        this.rspSvcHeader = value;
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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctCHNName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}ClientAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}AcctBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010010086}TranAmt" minOccurs="0"/&gt;
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
        "clientNo",
        "acctCHNName",
        "acctType",
        "clientAcctNo",
        "acctBal",
        "tranAmt"
    })
    public static class SvcBody {

        @XmlElement(name = "ClientNo")
        protected String clientNo;
        @XmlElement(name = "AcctCHNName")
        protected String acctCHNName;
        @XmlElement(name = "AcctType")
        protected String acctType;
        @XmlElement(name = "ClientAcctNo")
        protected String clientAcctNo;
        @XmlElement(name = "AcctBal")
        protected BigDecimal acctBal;
        @XmlElement(name = "TranAmt")
        protected BigDecimal tranAmt;

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
         * 获取acctCHNName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctCHNName() {
            return acctCHNName;
        }

        /**
         * 设置acctCHNName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctCHNName(String value) {
            this.acctCHNName = value;
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

    }

}
