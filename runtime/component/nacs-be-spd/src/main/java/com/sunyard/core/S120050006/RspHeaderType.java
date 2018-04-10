
package com.sunyard.core.S120050006;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MacOrgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TargetSysId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RelatedMsgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAdr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RspHeaderType", namespace = "http://esb.spdbbiz.com/metadata", propOrder = {
    "mac",
    "macOrgId",
    "msgId",
    "targetSysId",
    "relatedMsgId",
    "serviceAdr",
    "serviceAction",
    "extendContent"
})
public class RspHeaderType {

    @XmlElement(name = "Mac", required = true)
    protected String mac;
    @XmlElement(name = "MacOrgId", required = true)
    protected String macOrgId;
    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "TargetSysId", required = true)
    protected String targetSysId;
    @XmlElement(name = "RelatedMsgId")
    protected String relatedMsgId;
    @XmlElement(name = "ServiceAdr")
    protected String serviceAdr;
    @XmlElement(name = "ServiceAction")
    protected String serviceAction;
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
     * 获取targetSysId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSysId() {
        return targetSysId;
    }

    /**
     * 设置targetSysId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSysId(String value) {
        this.targetSysId = value;
    }

    /**
     * 获取relatedMsgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedMsgId() {
        return relatedMsgId;
    }

    /**
     * 设置relatedMsgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedMsgId(String value) {
        this.relatedMsgId = value;
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
