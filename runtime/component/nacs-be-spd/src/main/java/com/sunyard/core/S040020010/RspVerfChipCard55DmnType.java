
package com.sunyard.core.S040020010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspVerfChipCard55DmnType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspVerfChipCard55DmnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S040020010}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}BankCode"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}TranSource"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardSerialNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}FiftyFiveFldLen"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}FrstPartCntnt"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ScdPartCntnt"/&gt;
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
@XmlType(name = "RspVerfChipCard55DmnType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspVerfChipCard55DmnType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}BankCode"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}TranSource"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}CardSerialNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}FiftyFiveFldLen"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}FrstPartCntnt"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040020010}ScdPartCntnt"/&gt;
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
        "bankCode",
        "tranSource",
        "cardNo",
        "cardSerialNo",
        "fiftyFiveFldLen",
        "frstPartCntnt",
        "scdPartCntnt"
    })
    public static class SvcBody {

        @XmlElement(name = "BankCode", required = true)
        protected String bankCode;
        @XmlElement(name = "TranSource", required = true)
        protected String tranSource;
        @XmlElement(name = "CardNo", required = true)
        protected String cardNo;
        @XmlElement(name = "CardSerialNo", required = true)
        protected String cardSerialNo;
        @XmlElement(name = "FiftyFiveFldLen")
        protected int fiftyFiveFldLen;
        @XmlElement(name = "FrstPartCntnt", required = true)
        protected String frstPartCntnt;
        @XmlElement(name = "ScdPartCntnt", required = true)
        protected String scdPartCntnt;

        /**
         * 获取bankCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * 设置bankCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCode(String value) {
            this.bankCode = value;
        }

        /**
         * 获取tranSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranSource() {
            return tranSource;
        }

        /**
         * 设置tranSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranSource(String value) {
            this.tranSource = value;
        }

        /**
         * 获取cardNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNo() {
            return cardNo;
        }

        /**
         * 设置cardNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNo(String value) {
            this.cardNo = value;
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
         * 获取fiftyFiveFldLen属性的值。
         * 
         */
        public int getFiftyFiveFldLen() {
            return fiftyFiveFldLen;
        }

        /**
         * 设置fiftyFiveFldLen属性的值。
         * 
         */
        public void setFiftyFiveFldLen(int value) {
            this.fiftyFiveFldLen = value;
        }

        /**
         * 获取frstPartCntnt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrstPartCntnt() {
            return frstPartCntnt;
        }

        /**
         * 设置frstPartCntnt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrstPartCntnt(String value) {
            this.frstPartCntnt = value;
        }

        /**
         * 获取scdPartCntnt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScdPartCntnt() {
            return scdPartCntnt;
        }

        /**
         * 设置scdPartCntnt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScdPartCntnt(String value) {
            this.scdPartCntnt = value;
        }

    }

}
