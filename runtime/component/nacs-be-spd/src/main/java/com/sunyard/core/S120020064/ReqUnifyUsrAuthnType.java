
package com.sunyard.core.S120020064;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqUnifyUsrAuthnType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqUnifyUsrAuthnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqSvcHeader" type="{http://esb.spdbbiz.com/services/S120020064}ReqSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}AppId" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrDmn" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrName" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrPwd" minOccurs="0"/&gt;
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
@XmlType(name = "ReqUnifyUsrAuthnType", propOrder = {
    "reqSvcHeader",
    "svcBody"
})
public class ReqUnifyUsrAuthnType {

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
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}AppId" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrDmn" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrName" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}ToVrfyUsrPwd" minOccurs="0"/&gt;
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
        "appId",
        "toVrfyUsrDmn",
        "toVrfyUsrName",
        "toVrfyUsrPwd"
    })
    public static class SvcBody {

        @XmlElement(name = "AppId")
        protected String appId;
        @XmlElement(name = "ToVrfyUsrDmn")
        protected String toVrfyUsrDmn;
        @XmlElement(name = "ToVrfyUsrName")
        protected String toVrfyUsrName;
        @XmlElement(name = "ToVrfyUsrPwd")
        protected String toVrfyUsrPwd;

        /**
         * 获取appId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppId() {
            return appId;
        }

        /**
         * 设置appId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppId(String value) {
            this.appId = value;
        }

        /**
         * 获取toVrfyUsrDmn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToVrfyUsrDmn() {
            return toVrfyUsrDmn;
        }

        /**
         * 设置toVrfyUsrDmn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToVrfyUsrDmn(String value) {
            this.toVrfyUsrDmn = value;
        }

        /**
         * 获取toVrfyUsrName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToVrfyUsrName() {
            return toVrfyUsrName;
        }

        /**
         * 设置toVrfyUsrName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToVrfyUsrName(String value) {
            this.toVrfyUsrName = value;
        }

        /**
         * 获取toVrfyUsrPwd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToVrfyUsrPwd() {
            return toVrfyUsrPwd;
        }

        /**
         * 设置toVrfyUsrPwd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToVrfyUsrPwd(String value) {
            this.toVrfyUsrPwd = value;
        }

    }

}
