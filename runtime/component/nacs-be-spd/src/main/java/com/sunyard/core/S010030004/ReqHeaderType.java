
package com.sunyard.core.S010030004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReqHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReqHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MacOrgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SourceSysId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConsumerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceAdr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReplyAdr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqHeaderType", namespace = "http://esb.spdbbiz.com/metadata", propOrder = {
    "mac",
    "macOrgId",
    "msgId",
    "sourceSysId",
    "consumerId",
    "serviceAdr",
    "serviceAction",
    "replyAdr",
    "extendContent"
})
public class ReqHeaderType {

    @XmlElement(name = "Mac", required = true)
    protected String mac;
    @XmlElement(name = "MacOrgId", required = true)
    protected String macOrgId;
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "SourceSysId", required = true)
    protected String sourceSysId;
    @XmlElement(name = "ConsumerId", required = true)
    protected String consumerId;
    @XmlElement(name = "ServiceAdr", required = true)
    protected String serviceAdr;
    @XmlElement(name = "ServiceAction", required = true)
    protected String serviceAction;
    @XmlElement(name = "ReplyAdr")
    protected String replyAdr;
    @XmlElement(name = "ExtendContent")
    protected String extendContent;

    /**
     * 获取mac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置mac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * 获取macOrgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacOrgId() {
        return macOrgId;
    }

    /**
     * 设置macOrgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacOrgId(String value) {
        this.macOrgId = value;
    }

    /**
     * 获取msgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * 设置msgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * 获取sourceSysId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId() {
        return sourceSysId;
    }

    /**
     * 设置sourceSysId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId(String value) {
        this.sourceSysId = value;
    }

    /**
     * 获取consumerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * 设置consumerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerId(String value) {
        this.consumerId = value;
    }

    /**
     * 获取serviceAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAdr() {
        return serviceAdr;
    }

    /**
     * 设置serviceAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAdr(String value) {
        this.serviceAdr = value;
    }

    /**
     * 获取serviceAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAction() {
        return serviceAction;
    }

    /**
     * 设置serviceAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAction(String value) {
        this.serviceAction = value;
    }

    /**
     * 获取replyAdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAdr() {
        return replyAdr;
    }

    /**
     * 设置replyAdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAdr(String value) {
        this.replyAdr = value;
    }

    /**
     * 获取extendContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendContent() {
        return extendContent;
    }

    /**
     * 设置extendContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendContent(String value) {
        this.extendContent = value;
    }

}
