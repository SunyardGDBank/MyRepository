
package com.sunyard.core.S040020010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspICCardDomainVerfType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspICCardDomainVerfType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S040020010}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ICCardVerfFlg" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ICCardNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardSerialNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}LenOf55FldCntnt" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CntntOf55Fld1" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CntntOf55Fld2" minOccurs="0"/&gt;
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
@XmlType(name = "RspICCardDomainVerfType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspICCardDomainVerfType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ICCardVerfFlg" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ICCardNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardSerialNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}LenOf55FldCntnt" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CntntOf55Fld1" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CntntOf55Fld2" minOccurs="0"/&gt;
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
        "icCardVerfFlg",
        "icCardNo",
        "cardSerialNo",
        "lenOf55FldCntnt",
        "cntntOf55Fld1",
        "cntntOf55Fld2"
    })
    public static class SvcBody {

        @XmlElement(name = "ICCardVerfFlg")
        protected String icCardVerfFlg;
        @XmlElement(name = "ICCardNo")
        protected String icCardNo;
        @XmlElement(name = "CardSerialNo")
        protected String cardSerialNo;
        @XmlElement(name = "LenOf55FldCntnt")
        protected String lenOf55FldCntnt;
        @XmlElement(name = "CntntOf55Fld1")
        protected String cntntOf55Fld1;
        @XmlElement(name = "CntntOf55Fld2")
        protected String cntntOf55Fld2;

        /**
         * 获取icCardVerfFlg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICCardVerfFlg() {
            return icCardVerfFlg;
        }

        /**
         * 设置icCardVerfFlg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICCardVerfFlg(String value) {
            this.icCardVerfFlg = value;
        }

        /**
         * 获取icCardNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICCardNo() {
            return icCardNo;
        }

        /**
         * 设置icCardNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICCardNo(String value) {
            this.icCardNo = value;
        }

        /**
         * 获取cardSerialNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardSerialNo() {
            return cardSerialNo;
        }

        /**
         * 设置cardSerialNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardSerialNo(String value) {
            this.cardSerialNo = value;
        }

        /**
         * 获取lenOf55FldCntnt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLenOf55FldCntnt() {
            return lenOf55FldCntnt;
        }

        /**
         * 设置lenOf55FldCntnt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLenOf55FldCntnt(String value) {
            this.lenOf55FldCntnt = value;
        }

        /**
         * 获取cntntOf55Fld1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCntntOf55Fld1() {
            return cntntOf55Fld1;
        }

        /**
         * 设置cntntOf55Fld1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCntntOf55Fld1(String value) {
            this.cntntOf55Fld1 = value;
        }

        /**
         * 获取cntntOf55Fld2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCntntOf55Fld2() {
            return cntntOf55Fld2;
        }

        /**
         * 设置cntntOf55Fld2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCntntOf55Fld2(String value) {
            this.cntntOf55Fld2 = value;
        }

    }

}
