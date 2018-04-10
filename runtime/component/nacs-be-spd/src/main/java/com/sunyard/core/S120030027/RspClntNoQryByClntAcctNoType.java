
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspClntNoQryByClntAcctNoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspClntNoQryByClntAcctNoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S120030027}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientName"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenBranchId"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ComphEstLevel"/&gt;
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
@XmlType(name = "RspClntNoQryByClntAcctNoType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspClntNoQryByClntAcctNoType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientName"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}OpenBranchId"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ComphEstLevel"/&gt;
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
        "clientName",
        "openBranchId",
        "comphEstLevel"
    })
    public static class SvcBody {

        @XmlElement(name = "ClientNo", required = true)
        protected String clientNo;
        @XmlElement(name = "ClientName", required = true)
        protected String clientName;
        @XmlElement(name = "OpenBranchId", required = true)
        protected String openBranchId;
        @XmlElement(name = "ComphEstLevel", required = true)
        protected String comphEstLevel;

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
         * 获取clientName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientName() {
            return clientName;
        }

        /**
         * 设置clientName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientName(String value) {
            this.clientName = value;
        }

        /**
         * 获取openBranchId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpenBranchId() {
            return openBranchId;
        }

        /**
         * 设置openBranchId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpenBranchId(String value) {
            this.openBranchId = value;
        }

        /**
         * 获取comphEstLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComphEstLevel() {
            return comphEstLevel;
        }

        /**
         * 设置comphEstLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComphEstLevel(String value) {
            this.comphEstLevel = value;
        }

    }

}
