
package com.sunyard.core.S040030101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspCrdAcctClQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspCrdAcctClQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S040030101}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}ClientNo" minOccurs="0"/&gt;
 *                   &lt;element name="CrdAcctInfo" type="{http://esb.spdbbiz.com/services/S040030101}CrdAcctInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}Unvsl40Char1" minOccurs="0"/&gt;
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
@XmlType(name = "RspCrdAcctClQryType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspCrdAcctClQryType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}ClientNo" minOccurs="0"/&gt;
     *         &lt;element name="CrdAcctInfo" type="{http://esb.spdbbiz.com/services/S040030101}CrdAcctInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S040030101}Unvsl40Char1" minOccurs="0"/&gt;
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
        "crdAcctInfo",
        "unvsl40Char1"
    })
    public static class SvcBody {

        @XmlElement(name = "ClientNo")
        protected String clientNo;
        @XmlElement(name = "CrdAcctInfo")
        protected List<CrdAcctInfoType> crdAcctInfo;
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
         * Gets the value of the crdAcctInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crdAcctInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrdAcctInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CrdAcctInfoType }
         * 
         * 
         */
        public List<CrdAcctInfoType> getCrdAcctInfo() {
            if (crdAcctInfo == null) {
                crdAcctInfo = new ArrayList<CrdAcctInfoType>();
            }
            return this.crdAcctInfo;
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
