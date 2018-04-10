
package com.sunyard.core.S040030100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspCrdBndngRltnpQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspCrdBndngRltnpQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S040030100}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BookAcctType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SettleAcctNo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctClass" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ChannelType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}FcToFcFlg" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}StrtStpFlg" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}UpDwnNum" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndFlg" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndAcctNum" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndSrlNo" minOccurs="0"/&gt;
 *                   &lt;element name="CrdNoBndInfo" type="{http://esb.spdbbiz.com/services/S040030100}CrdNoBndInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}Unvsl40Char1" minOccurs="0"/&gt;
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
@XmlType(name = "RspCrdBndngRltnpQryType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspCrdBndngRltnpQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BookAcctType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ClientAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}SettleAcctNo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}AcctClass" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}ChannelType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}FcToFcFlg" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}StrtStpFlg" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}UpDwnNum" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndFlg" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndAcctNum" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}BndSrlNo" minOccurs="0"/&gt;
     *         &lt;element name="CrdNoBndInfo" type="{http://esb.spdbbiz.com/services/S040030100}CrdNoBndInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030100}Unvsl40Char1" minOccurs="0"/&gt;
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
        "bookAcctType",
        "clientAcctNo",
        "settleAcctNo",
        "acctClass",
        "channelType",
        "fcToFcFlg",
        "strtStpFlg",
        "upDwnNum",
        "bndFlg",
        "bndAcctNum",
        "bndSrlNo",
        "crdNoBndInfo",
        "unvsl40Char1"
    })
    public static class SvcBody {

        @XmlElement(name = "ClientNo")
        protected String clientNo;
        @XmlElement(name = "BookAcctType")
        protected String bookAcctType;
        @XmlElement(name = "ClientAcctNo")
        protected String clientAcctNo;
        @XmlElement(name = "SettleAcctNo")
        protected String settleAcctNo;
        @XmlElement(name = "AcctClass")
        protected String acctClass;
        @XmlElement(name = "ChannelType")
        protected String channelType;
        @XmlElement(name = "FcToFcFlg")
        protected String fcToFcFlg;
        @XmlElement(name = "StrtStpFlg")
        protected String strtStpFlg;
        @XmlElement(name = "UpDwnNum")
        protected String upDwnNum;
        @XmlElement(name = "BndFlg")
        protected String bndFlg;
        @XmlElement(name = "BndAcctNum")
        protected String bndAcctNum;
        @XmlElement(name = "BndSrlNo")
        protected String bndSrlNo;
        @XmlElement(name = "CrdNoBndInfo")
        protected List<CrdNoBndInfoType> crdNoBndInfo;
        @XmlElement(name = "Unvsl40Char1")
        protected String unvsl40Char1;

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
         * 获取settleAcctNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettleAcctNo() {
            return settleAcctNo;
        }

        /**
         * 设置settleAcctNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettleAcctNo(String value) {
            this.settleAcctNo = value;
        }

        /**
         * 获取acctClass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcctClass() {
            return acctClass;
        }

        /**
         * 设置acctClass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcctClass(String value) {
            this.acctClass = value;
        }

        /**
         * 获取channelType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannelType() {
            return channelType;
        }

        /**
         * 设置channelType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannelType(String value) {
            this.channelType = value;
        }

        /**
         * 获取fcToFcFlg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcToFcFlg() {
            return fcToFcFlg;
        }

        /**
         * 设置fcToFcFlg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcToFcFlg(String value) {
            this.fcToFcFlg = value;
        }

        /**
         * 获取strtStpFlg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrtStpFlg() {
            return strtStpFlg;
        }

        /**
         * 设置strtStpFlg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrtStpFlg(String value) {
            this.strtStpFlg = value;
        }

        /**
         * 获取upDwnNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpDwnNum() {
            return upDwnNum;
        }

        /**
         * 设置upDwnNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpDwnNum(String value) {
            this.upDwnNum = value;
        }

        /**
         * 获取bndFlg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBndFlg() {
            return bndFlg;
        }

        /**
         * 设置bndFlg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBndFlg(String value) {
            this.bndFlg = value;
        }

        /**
         * 获取bndAcctNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBndAcctNum() {
            return bndAcctNum;
        }

        /**
         * 设置bndAcctNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBndAcctNum(String value) {
            this.bndAcctNum = value;
        }

        /**
         * 获取bndSrlNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBndSrlNo() {
            return bndSrlNo;
        }

        /**
         * 设置bndSrlNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBndSrlNo(String value) {
            this.bndSrlNo = value;
        }

        /**
         * Gets the value of the crdNoBndInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crdNoBndInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrdNoBndInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CrdNoBndInfoType }
         * 
         * 
         */
        public List<CrdNoBndInfoType> getCrdNoBndInfo() {
            if (crdNoBndInfo == null) {
                crdNoBndInfo = new ArrayList<CrdNoBndInfoType>();
            }
            return this.crdNoBndInfo;
        }

        /**
         * 获取unvsl40Char1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnvsl40Char1() {
            return unvsl40Char1;
        }

        /**
         * 设置unvsl40Char1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnvsl40Char1(String value) {
            this.unvsl40Char1 = value;
        }

    }

}
