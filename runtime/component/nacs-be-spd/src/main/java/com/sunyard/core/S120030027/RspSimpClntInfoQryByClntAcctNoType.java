
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspSimpClntInfoQryByClntAcctNoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspSimpClntInfoQryByClntAcctNoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S120030027}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientCHNName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenBranchId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenTellerNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenAcctDate" minOccurs="0"/&gt;
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
@XmlType(name = "RspSimpClntInfoQryByClntAcctNoType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspSimpClntInfoQryByClntAcctNoType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientCHNName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenBranchId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenTellerNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenAcctDate" minOccurs="0"/&gt;
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
        "clientCHNName",
        "ctfType",
        "ctfId",
        "openBranchId",
        "openTellerNo",
        "openAcctDate"
    })
    public static class SvcBody {

        @XmlElement(name = "ClientNo")
        protected String clientNo;
        @XmlElement(name = "ClientCHNName")
        protected String clientCHNName;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CtfId")
        protected String ctfId;
        @XmlElement(name = "OpenBranchId")
        protected String openBranchId;
        @XmlElement(name = "OpenTellerNo")
        protected String openTellerNo;
        @XmlElement(name = "OpenAcctDate")
        protected String openAcctDate;

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
         * 获取clientCHNName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientCHNName() {
            return clientCHNName;
        }

        /**
         * 设置clientCHNName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientCHNName(String value) {
            this.clientCHNName = value;
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
         * 获取openBranchId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenBranchId() {
            return openBranchId;
        }

        /**
         * 设置openBranchId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenBranchId(String value) {
            this.openBranchId = value;
        }

        /**
         * 获取openTellerNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenTellerNo() {
            return openTellerNo;
        }

        /**
         * 设置openTellerNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenTellerNo(String value) {
            this.openTellerNo = value;
        }

        /**
         * 获取openAcctDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenAcctDate() {
            return openAcctDate;
        }

        /**
         * 设置openAcctDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenAcctDate(String value) {
            this.openAcctDate = value;
        }

    }

}
