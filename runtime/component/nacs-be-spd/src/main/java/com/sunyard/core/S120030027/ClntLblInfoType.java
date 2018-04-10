
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClntLblInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClntLblInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}LblKind"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}LblType"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}LblVal"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ExpDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClntLblInfoType", propOrder = {
    "lblKind",
    "lblType",
    "lblVal",
    "expDateTime"
})
public class ClntLblInfoType {

    @XmlElement(name = "LblKind", required = true)
    protected String lblKind;
    @XmlElement(name = "LblType", required = true)
    protected String lblType;
    @XmlElement(name = "LblVal", required = true)
    protected String lblVal;
    @XmlElement(name = "ExpDateTime")
    protected String expDateTime;

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

    /**
     * 获取lblVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLblVal() {
        return lblVal;
    }

    /**
     * 设置lblVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLblVal(String value) {
        this.lblVal = value;
    }

    /**
     * 获取expDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDateTime() {
        return expDateTime;
    }

    /**
     * 设置expDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDateTime(String value) {
        this.expDateTime = value;
    }

}
