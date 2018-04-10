
package com.sunyard.core.S120030027;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FncInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FncInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}FncInfoNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SourceSysId1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Ccy"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}BalType"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Amt1"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}UpdateDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FncInfoType", propOrder = {
    "fncInfoNo",
    "ecifClientNo",
    "sourceSysId1",
    "ccy",
    "balType",
    "amt1",
    "updateDate",
    "activeFlag"
})
public class FncInfoType {

    @XmlElement(name = "FncInfoNo")
    protected String fncInfoNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "SourceSysId1")
    protected String sourceSysId1;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "BalType", required = true)
    protected String balType;
    @XmlElement(name = "Amt1", required = true)
    protected BigDecimal amt1;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;

    /**
     * 获取fncInfoNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFncInfoNo() {
        return fncInfoNo;
    }

    /**
     * 设置fncInfoNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFncInfoNo(String value) {
        this.fncInfoNo = value;
    }

    /**
     * 获取ecifClientNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECIFClientNo() {
        return ecifClientNo;
    }

    /**
     * 设置ecifClientNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECIFClientNo(String value) {
        this.ecifClientNo = value;
    }

    /**
     * 获取sourceSysId1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId1() {
        return sourceSysId1;
    }

    /**
     * 设置sourceSysId1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId1(String value) {
        this.sourceSysId1 = value;
    }

    /**
     * 获取ccy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * 设置ccy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * 获取balType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalType() {
        return balType;
    }

    /**
     * 设置balType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalType(String value) {
        this.balType = value;
    }

    /**
     * 获取amt1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt1() {
        return amt1;
    }

    /**
     * 设置amt1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt1(BigDecimal value) {
        this.amt1 = value;
    }

    /**
     * 获取updateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置updateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * 获取activeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * 设置activeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

}
