
package com.sunyard.core.S120010008_test;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspExtSnglTfrType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspExtSnglTfrType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S120010008}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}HostSeqNo" minOccurs="0"/&gt;
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
@XmlType(name = "RspExtSnglTfrType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspExtSnglTfrType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}OutAcctBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}InAcctBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120010008}HostSeqNo" minOccurs="0"/&gt;
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
        "outAcctNo",
        "outAcctName",
        "outAcctBal",
        "inAcctNo",
        "inAcctName",
        "inAcctBal",
        "hostSeqNo"
    })
    public static class SvcBody {

        @XmlElement(name = "OutAcctNo")
        protected String outAcctNo;
        @XmlElement(name = "OutAcctName")
        protected String outAcctName;
        @XmlElement(name = "OutAcctBal")
        protected BigDecimal outAcctBal;
        @XmlElement(name = "InAcctNo")
        protected String inAcctNo;
        @XmlElement(name = "InAcctName")
        protected String inAcctName;
        @XmlElement(name = "InAcctBal")
        protected BigDecimal inAcctBal;
        @XmlElement(name = "HostSeqNo")
        protected String hostSeqNo;

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
         * 获取outAcctName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutAcctName() {
            return outAcctName;
        }

        /**
         * 设置outAcctName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutAcctName(String value) {
            this.outAcctName = value;
        }

        /**
         * 获取outAcctBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOutAcctBal() {
            return outAcctBal;
        }

        /**
         * 设置outAcctBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOutAcctBal(BigDecimal value) {
            this.outAcctBal = value;
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
         * 获取inAcctName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInAcctName() {
            return inAcctName;
        }

        /**
         * 设置inAcctName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInAcctName(String value) {
            this.inAcctName = value;
        }

        /**
         * 获取inAcctBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInAcctBal() {
            return inAcctBal;
        }

        /**
         * 设置inAcctBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInAcctBal(BigDecimal value) {
            this.inAcctBal = value;
        }

        /**
         * 获取hostSeqNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostSeqNo() {
            return hostSeqNo;
        }

        /**
         * 设置hostSeqNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostSeqNo(String value) {
            this.hostSeqNo = value;
        }

    }

}
