
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlikeClntInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlikeClntInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AlikeLvl"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientNo"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ClientName"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfType"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CtfId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlikeClntInfoType", propOrder = {
    "alikeLvl",
    "clientNo",
    "clientName",
    "ctfType",
    "ctfId"
})
public class AlikeClntInfoType {

    @XmlElement(name = "AlikeLvl", required = true)
    protected String alikeLvl;
    @XmlElement(name = "ClientNo", required = true)
    protected String clientNo;
    @XmlElement(name = "ClientName", required = true)
    protected String clientName;
    @XmlElement(name = "CtfType", required = true)
    protected String ctfType;
    @XmlElement(name = "CtfId", required = true)
    protected String ctfId;

    /**
     * 获取alikeLvl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlikeLvl() {
        return alikeLvl;
    }

    /**
     * 设置alikeLvl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlikeLvl(String value) {
        this.alikeLvl = value;
    }

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

}
