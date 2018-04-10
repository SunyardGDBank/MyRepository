
package com.sunyard.core.S120020064;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VrfyRsltInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VrfyRsltInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120020064}AuthnVrfyRslt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VrfyRsltInfoType", propOrder = {
    "authnVrfyRslt"
})
public class VrfyRsltInfoType {

    @XmlElement(name = "AuthnVrfyRslt")
    protected String authnVrfyRslt;

    /**
     * 获取authnVrfyRslt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthnVrfyRslt() {
        return authnVrfyRslt;
    }

    /**
     * 设置authnVrfyRslt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthnVrfyRslt(String value) {
        this.authnVrfyRslt = value;
    }

}
