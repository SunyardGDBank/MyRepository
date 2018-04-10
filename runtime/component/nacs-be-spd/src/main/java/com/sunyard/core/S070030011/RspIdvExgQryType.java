
package com.sunyard.core.S070030011;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspIdvExgQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspIdvExgQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S070030011}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}TotalNum1" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CountryCode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PropoerName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ContactAdr" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CtfType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CtfId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AplNum" minOccurs="0"/&gt;
 *                   &lt;element name="ExgInfo" type="{http://esb.spdbbiz.com/services/S070030011}ExgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RspIdvExgQryType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspIdvExgQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}TotalNum1" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CountryCode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}PropoerName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}ContactAdr" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CtfType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}CtfId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S070030011}AplNum" minOccurs="0"/&gt;
     *         &lt;element name="ExgInfo" type="{http://esb.spdbbiz.com/services/S070030011}ExgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "totalNum1",
        "countryCode",
        "propoerName",
        "contactAdr",
        "ctfType",
        "ctfId",
        "aplNum",
        "exgInfo"
    })
    public static class SvcBody {

        @XmlElement(name = "TotalNum1")
        protected Integer totalNum1;
        @XmlElement(name = "CountryCode")
        protected String countryCode;
        @XmlElement(name = "PropoerName")
        protected String propoerName;
        @XmlElement(name = "ContactAdr")
        protected String contactAdr;
        @XmlElement(name = "CtfType")
        protected String ctfType;
        @XmlElement(name = "CtfId")
        protected String ctfId;
        @XmlElement(name = "AplNum")
        protected Integer aplNum;
        @XmlElement(name = "ExgInfo")
        protected List<ExgInfoType> exgInfo;

        /**
         * 获取totalNum1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotalNum1() {
            return totalNum1;
        }

        /**
         * 设置totalNum1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotalNum1(Integer value) {
            this.totalNum1 = value;
        }

        /**
         * 获取countryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * 设置countryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * 获取propoerName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropoerName() {
            return propoerName;
        }

        /**
         * 设置propoerName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropoerName(String value) {
            this.propoerName = value;
        }

        /**
         * 获取contactAdr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactAdr() {
            return contactAdr;
        }

        /**
         * 设置contactAdr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactAdr(String value) {
            this.contactAdr = value;
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
         * 获取aplNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAplNum() {
            return aplNum;
        }

        /**
         * 设置aplNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAplNum(Integer value) {
            this.aplNum = value;
        }

        /**
         * Gets the value of the exgInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exgInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExgInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExgInfoType }
         * 
         * 
         */
        public List<ExgInfoType> getExgInfo() {
            if (exgInfo == null) {
                exgInfo = new ArrayList<ExgInfoType>();
            }
            return this.exgInfo;
        }

    }

}
