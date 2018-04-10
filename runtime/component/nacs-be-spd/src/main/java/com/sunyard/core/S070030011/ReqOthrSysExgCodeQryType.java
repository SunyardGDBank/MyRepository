
package com.sunyard.core.S070030011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqOthrSysExgCodeQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqOthrSysExgCodeQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S070030011}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}IsFlag" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}XfundPrjCd" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StatCgy" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartNum2" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}QueryNum2" minOccurs="0"/&gt;
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
@XmlType(name = "ReqOthrSysExgCodeQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqOthrSysExgCodeQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}BussType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}IsFlag" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}XfundPrjCd" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StatCgy" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}StartNum2" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}QueryNum2" minOccurs="0"/&gt;
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
        "bussType",
        "isFlag",
        "xfundPrjCd",
        "statCgy",
        "startNum2",
        "queryNum2"
    })
    public static class SvcBody {

        @XmlElement(name = "BussType")
        protected String bussType;
        @XmlElement(name = "IsFlag")
        protected String isFlag;
        @XmlElement(name = "XfundPrjCd")
        protected String xfundPrjCd;
        @XmlElement(name = "StatCgy")
        protected String statCgy;
        @XmlElement(name = "StartNum2")
        protected String startNum2;
        @XmlElement(name = "QueryNum2")
        protected String queryNum2;

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
         * 获取isFlag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsFlag() {
            return isFlag;
        }

        /**
         * 设置isFlag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsFlag(String value) {
            this.isFlag = value;
        }

        /**
         * 获取xfundPrjCd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXfundPrjCd() {
            return xfundPrjCd;
        }

        /**
         * 设置xfundPrjCd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXfundPrjCd(String value) {
            this.xfundPrjCd = value;
        }

        /**
         * 获取statCgy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatCgy() {
            return statCgy;
        }

        /**
         * 设置statCgy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatCgy(String value) {
            this.statCgy = value;
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

    }

}
