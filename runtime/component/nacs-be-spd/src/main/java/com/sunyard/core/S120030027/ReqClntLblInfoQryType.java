
package com.sunyard.core.S120030027;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqClntLblInfoQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqClntLblInfoQryType"&gt;
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
 *                   &lt;element name="LblKindTypeList" type="{http://esb.spdbbiz.com/services/S120030027}LblKindTypeListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BookAcctType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctNo" minOccurs="0"/&gt;
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
@XmlType(name = "ReqClntLblInfoQryType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqClntLblInfoQryType {

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
     *         &lt;element name="LblKindTypeList" type="{http://esb.spdbbiz.com/services/S120030027}LblKindTypeListType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BookAcctType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AcctNo" minOccurs="0"/&gt;
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
        "lblKindTypeList",
        "ctfType",
        "ctfId",
        "bookAcctType",
        "acctNo"
    })
    public static class SvcBody {

        @XmlElement(name = "EcifHeader")
        protected EcifHeader ecifHeader;
        @XmlElement(name = "ClientNo", required = true)
        protected String clientNo;
        @XmlElement(name = "LblKindTypeList")
        protected List<LblKindTypeListType> lblKindTypeList;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CtfId")
        protected String ctfId;
        @XmlElement(name = "BookAcctType")
        protected String bookAcctType;
        @XmlElement(name = "AcctNo")
        protected String acctNo;

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
         * Gets the value of the lblKindTypeList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lblKindTypeList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLblKindTypeList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LblKindTypeListType }
         * 
         * 
         */
        public List<LblKindTypeListType> getLblKindTypeList() {
            if (lblKindTypeList == null) {
                lblKindTypeList = new ArrayList<LblKindTypeListType>();
            }
            return this.lblKindTypeList;
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
         * 获取bookAcctType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookAcctType() {
            return bookAcctType;
        }

        /**
         * 设置bookAcctType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookAcctType(String value) {
            this.bookAcctType = value;
        }

        /**
         * 获取acctNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctNo() {
            return acctNo;
        }

        /**
         * 设置acctNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctNo(String value) {
            this.acctNo = value;
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
