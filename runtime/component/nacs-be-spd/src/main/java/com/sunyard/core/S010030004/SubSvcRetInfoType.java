
package com.sunyard.core.S010030004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubSvcRetInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SubSvcRetInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SubSvcSysId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SubSvcId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SubSvcRetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}SubSvcRetMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RsrvContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubSvcRetInfoType", propOrder = {
    "subSvcSysId",
    "subSvcId",
    "subSvcRetCode",
    "subSvcRetMsg",
    "rsrvContent"
})
public class SubSvcRetInfoType {

    @XmlElement(name = "SubSvcSysId")
    protected String subSvcSysId;
    @XmlElement(name = "SubSvcId")
    protected String subSvcId;
    @XmlElement(name = "SubSvcRetCode")
    protected String subSvcRetCode;
    @XmlElement(name = "SubSvcRetMsg")
    protected String subSvcRetMsg;
    @XmlElement(name = "RsrvContent")
    protected String rsrvContent;

    /**
     * 获取subSvcSysId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSvcSysId() {
        return subSvcSysId;
    }

    /**
     * 设置subSvcSysId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSvcSysId(String value) {
        this.subSvcSysId = value;
    }

    /**
     * 获取subSvcId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSvcId() {
        return subSvcId;
    }

    /**
     * 设置subSvcId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSvcId(String value) {
        this.subSvcId = value;
    }

    /**
     * 获取subSvcRetCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSvcRetCode() {
        return subSvcRetCode;
    }

    /**
     * 设置subSvcRetCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSvcRetCode(String value) {
        this.subSvcRetCode = value;
    }

    /**
     * 获取subSvcRetMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSvcRetMsg() {
        return subSvcRetMsg;
    }

    /**
     * 设置subSvcRetMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSvcRetMsg(String value) {
        this.subSvcRetMsg = value;
    }

    /**
     * 获取rsrvContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrvContent() {
        return rsrvContent;
    }

    /**
     * 设置rsrvContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrvContent(String value) {
        this.rsrvContent = value;
    }

}
