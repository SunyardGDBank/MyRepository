
package com.sunyard.core.S070030011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqIdvExgQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqIdvExgQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S070030011}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartNum1"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}QueryNum1"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AplChannel" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}TranStatus"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ClientNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PrpsCtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PrpsCtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartDate"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}EndDate"/&gt;
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
@XmlType(name = "ReqIdvExgQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqIdvExgQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartNum1"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}QueryNum1"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AplChannel" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}TranStatus"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ClientNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PrpsCtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PrpsCtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartDate"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}EndDate"/&gt;
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
        "startNum1",
        "queryNum1",
        "aplChannel",
        "bussType",
        "tranStatus",
        "clientNo",
        "prpsCtfType",
        "prpsCtfId",
        "startDate",
        "endDate"
    })
    public static class SvcBody {

        @XmlElement(name = "StartNum1")
        protected int startNum1;
        @XmlElement(name = "QueryNum1")
        protected int queryNum1;
        @XmlElement(name = "AplChannel")
        protected String aplChannel;
        @XmlElement(name = "BussType", required = true)
        protected String bussType;
        @XmlElement(name = "TranStatus", required = true)
        protected String tranStatus;
        @XmlElement(name = "ClientNo", required = true)
        protected String clientNo;
        @XmlElement(name = "PrpsCtfType")
        protected String prpsCtfType;
        @XmlElement(name = "PrpsCtfId")
        protected String prpsCtfId;
        @XmlElement(name = "StartDate", required = true)
        protected String startDate;
        @XmlElement(name = "EndDate", required = true)
        protected String endDate;

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
         * 获取aplChannel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAplChannel() {
            return aplChannel;
        }

        /**
         * 设置aplChannel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAplChannel(String value) {
            this.aplChannel = value;
        }

        /**
         * 获取bussType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBussType() {
            return bussType;
        }

        /**
         * 设置bussType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBussType(String value) {
            this.bussType = value;
        }

        /**
         * 获取tranStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranStatus() {
            return tranStatus;
        }

        /**
         * 设置tranStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranStatus(String value) {
            this.tranStatus = value;
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
         * 获取prpsCtfType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrpsCtfType() {
            return prpsCtfType;
        }

        /**
         * 设置prpsCtfType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrpsCtfType(String value) {
            this.prpsCtfType = value;
        }

        /**
         * 获取prpsCtfId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrpsCtfId() {
            return prpsCtfId;
        }

        /**
         * 设置prpsCtfId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrpsCtfId(String value) {
            this.prpsCtfId = value;
        }

        /**
         * 获取startDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * 设置startDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * 获取endDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * 设置endDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

    }

}
