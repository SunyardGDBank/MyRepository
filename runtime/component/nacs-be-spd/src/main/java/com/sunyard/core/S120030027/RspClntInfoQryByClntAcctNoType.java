
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspClntInfoQryByClntAcctNoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspClntInfoQryByClntAcctNoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S120030027}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientCHNName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfAdr" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CardId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BussBranchId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}TranTellerNo2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RecordStatus" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpnBrId2" minOccurs="0"/&gt;
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
@XmlType(name = "RspClntInfoQryByClntAcctNoType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspClntInfoQryByClntAcctNoType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientCHNName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfAdr" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CardId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BussBranchId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}TranTellerNo2" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RecordStatus" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpnBrId2" minOccurs="0"/&gt;
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
        "clientNo",
        "clientCHNName",
        "ctfAdr",
        "ctfType",
        "cardId",
        "bussBranchId",
        "tranTellerNo2",
        "recordStatus",
        "opnBrId2"
    })
    public static class SvcBody {

        @XmlElement(name = "AcctType")
        protected String acctType;
        @XmlElement(name = "ClientAcctNo")
        protected String clientAcctNo;
        @XmlElement(name = "ClientNo")
        protected String clientNo;
        @XmlElement(name = "ClientCHNName")
        protected String clientCHNName;
        @XmlElement(name = "CtfAdr")
        protected String ctfAdr;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CardId")
        protected String cardId;
        @XmlElement(name = "BussBranchId")
        protected String bussBranchId;
        @XmlElement(name = "TranTellerNo2")
        protected String tranTellerNo2;
        @XmlElement(name = "RecordStatus")
        protected String recordStatus;
        @XmlElement(name = "OpnBrId2")
        protected String opnBrId2;

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
         * 获取ctfAdr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtfAdr() {
            return ctfAdr;
        }

        /**
         * 设置ctfAdr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtfAdr(String value) {
            this.ctfAdr = value;
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
         * 获取cardId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardId() {
            return cardId;
        }

        /**
         * 设置cardId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardId(String value) {
            this.cardId = value;
        }

        /**
         * 获取bussBranchId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBussBranchId() {
            return bussBranchId;
        }

        /**
         * 设置bussBranchId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBussBranchId(String value) {
            this.bussBranchId = value;
        }

        /**
         * 获取tranTellerNo2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranTellerNo2() {
            return tranTellerNo2;
        }

        /**
         * 设置tranTellerNo2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranTellerNo2(String value) {
            this.tranTellerNo2 = value;
        }

        /**
         * 获取recordStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordStatus() {
            return recordStatus;
        }

        /**
         * 设置recordStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordStatus(String value) {
            this.recordStatus = value;
        }

        /**
         * 获取opnBrId2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpnBrId2() {
            return opnBrId2;
        }

        /**
         * 设置opnBrId2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpnBrId2(String value) {
            this.opnBrId2 = value;
        }

    }

}
