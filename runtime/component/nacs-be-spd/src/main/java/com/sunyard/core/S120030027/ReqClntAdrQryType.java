
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqClntAdrQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqClntAdrQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S120030027}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EcifHeader" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsName" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsRole" minOccurs="0"/&gt;
 *                             &lt;element name="QueryHeader" type="{http://esb.spdbbiz.com/services/S120030027}QueryHeaderType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNoType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AdrType" minOccurs="0"/&gt;
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
@XmlType(name = "ReqClntAdrQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqClntAdrQryType {

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
     *         &lt;element name="EcifHeader" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsName" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsRole" minOccurs="0"/&gt;
     *                   &lt;element name="QueryHeader" type="{http://esb.spdbbiz.com/services/S120030027}QueryHeaderType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNoType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AdrType" minOccurs="0"/&gt;
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
        "ecifHeader",
        "clientNo",
        "clientNoType",
        "adrType"
    })
    public static class SvcBody {

        @XmlElement(name = "EcifHeader")
        protected EcifHeader ecifHeader;
        @XmlElement(name = "ClientNo", required = true)
        protected String clientNo;
        @XmlElement(name = "ClientNoType")
        protected String clientNoType;
        @XmlElement(name = "AdrType")
        protected String adrType;

        /**
         * 获取ecifHeader属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EcifHeader }
         *     
         */
        public EcifHeader getEcifHeader() {
            return ecifHeader;
        }

        /**
         * 设置ecifHeader属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EcifHeader }
         *     
         */
        public void setEcifHeader(EcifHeader value) {
            this.ecifHeader = value;
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
         * 获取clientNoType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientNoType() {
            return clientNoType;
        }

        /**
         * 设置clientNoType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientNoType(String value) {
            this.clientNoType = value;
        }

        /**
         * 获取adrType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdrType() {
            return adrType;
        }

        /**
         * 设置adrType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdrType(String value) {
            this.adrType = value;
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
         *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsName" minOccurs="0"/&gt;
         *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsRole" minOccurs="0"/&gt;
         *         &lt;element name="QueryHeader" type="{http://esb.spdbbiz.com/services/S120030027}QueryHeaderType" minOccurs="0"/&gt;
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
            "rqsName",
            "rqsRole",
            "queryHeader"
        })
        public static class EcifHeader {

            @XmlElement(name = "RqsName")
            protected String rqsName;
            @XmlElement(name = "RqsRole")
            protected String rqsRole;
            @XmlElement(name = "QueryHeader")
            protected QueryHeaderType queryHeader;

            /**
             * 获取rqsName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRqsName() {
                return rqsName;
            }

            /**
             * 设置rqsName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRqsName(String value) {
                this.rqsName = value;
            }

            /**
             * 获取rqsRole属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRqsRole() {
                return rqsRole;
            }

            /**
             * 设置rqsRole属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRqsRole(String value) {
                this.rqsRole = value;
            }

            /**
             * 获取queryHeader属性的值。
             * 
             * @return
             *     possible object is
             *     {@link QueryHeaderType }
             *     
             */
            public QueryHeaderType getQueryHeader() {
                return queryHeader;
            }

            /**
             * 设置queryHeader属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link QueryHeaderType }
             *     
             */
            public void setQueryHeader(QueryHeaderType value) {
                this.queryHeader = value;
            }

        }

    }

}
