
package com.sunyard.core.S120030027;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartIdnx"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndIdnx"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AvlRsltNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RetAvlRsltNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHeaderType", propOrder = {
    "startIdnx",
    "endIdnx",
    "avlRsltNum",
    "retAvlRsltNum"
})
public class QueryHeaderType {

    @XmlElement(name = "StartIdnx", required = true)
    protected BigDecimal startIdnx;
    @XmlElement(name = "EndIdnx", required = true)
    protected BigDecimal endIdnx;
    @XmlElement(name = "AvlRsltNum")
    protected BigDecimal avlRsltNum;
    @XmlElement(name = "RetAvlRsltNum")
    protected BigDecimal retAvlRsltNum;

    /**
     * 获取startIdnx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartIdnx() {
        return startIdnx;
    }

    /**
     * 设置startIdnx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartIdnx(BigDecimal value) {
        this.startIdnx = value;
    }

    /**
     * 获取endIdnx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndIdnx() {
        return endIdnx;
    }

    /**
     * 设置endIdnx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndIdnx(BigDecimal value) {
        this.endIdnx = value;
    }

    /**
     * 获取avlRsltNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvlRsltNum() {
        return avlRsltNum;
    }

    /**
     * 设置avlRsltNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvlRsltNum(BigDecimal value) {
        this.avlRsltNum = value;
    }

    /**
     * 获取retAvlRsltNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetAvlRsltNum() {
        return retAvlRsltNum;
    }

    /**
     * 设置retAvlRsltNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetAvlRsltNum(BigDecimal value) {
        this.retAvlRsltNum = value;
    }

}
