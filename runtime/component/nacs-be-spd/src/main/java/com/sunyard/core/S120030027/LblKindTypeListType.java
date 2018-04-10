
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LblKindTypeListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LblKindTypeListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}LblKind" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}LblType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LblKindTypeListType", propOrder = {
    "lblKind",
    "lblType"
})
public class LblKindTypeListType {

    @XmlElement(name = "LblKind")
    protected String lblKind;
    @XmlElement(name = "LblType")
    protected String lblType;

    /**
     * 获取lblKind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblKind() {
        return lblKind;
    }

    /**
     * 设置lblKind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblKind(String value) {
        this.lblKind = value;
    }

    /**
     * 获取lblType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblType() {
        return lblType;
    }

    /**
     * 设置lblType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblType(String value) {
        this.lblType = value;
    }

}
