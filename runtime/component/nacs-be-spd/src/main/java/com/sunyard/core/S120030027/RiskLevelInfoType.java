
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RiskLevelInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RiskLevelInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RiskInfoNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RiskLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RiskLevelDsc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstInstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstUserNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EstDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Remark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTimep" minOccurs="0"/&gt;
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
@XmlType(name = "RiskLevelInfoType", propOrder = {
    "riskInfoNo",
    "ecifClientNo",
    "riskLevel",
    "riskLevelDsc",
    "estInstName",
    "estUserNo",
    "estDate",
    "remark",
    "startTimep",
    "endTimep",
    "activeFlag"
})
public class RiskLevelInfoType {

    @XmlElement(name = "RiskInfoNo")
    protected String riskInfoNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "RiskLevel")
    protected String riskLevel;
    @XmlElement(name = "RiskLevelDsc")
    protected String riskLevelDsc;
    @XmlElement(name = "EstInstName")
    protected String estInstName;
    @XmlElement(name = "EstUserNo")
    protected String estUserNo;
    @XmlElement(name = "EstDate")
    protected String estDate;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "StartTimep")
    protected String startTimep;
    @XmlElement(name = "EndTimep")
    protected String endTimep;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;

    /**
     * 获取riskInfoNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskInfoNo() {
        return riskInfoNo;
    }

    /**
     * 设置riskInfoNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskInfoNo(String value) {
        this.riskInfoNo = value;
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
     * 获取riskLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * 设置riskLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

    /**
     * 获取riskLevelDsc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevelDsc() {
        return riskLevelDsc;
    }

    /**
     * 设置riskLevelDsc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevelDsc(String value) {
        this.riskLevelDsc = value;
    }

    /**
     * 获取estInstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstInstName() {
        return estInstName;
    }

    /**
     * 设置estInstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstInstName(String value) {
        this.estInstName = value;
    }

    /**
     * 获取estUserNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstUserNo() {
        return estUserNo;
    }

    /**
     * 设置estUserNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstUserNo(String value) {
        this.estUserNo = value;
    }

    /**
     * 获取estDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstDate() {
        return estDate;
    }

    /**
     * 设置estDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstDate(String value) {
        this.estDate = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取startTimep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimep() {
        return startTimep;
    }

    /**
     * 设置startTimep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimep(String value) {
        this.startTimep = value;
    }

    /**
     * 获取endTimep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimep() {
        return endTimep;
    }

    /**
     * 设置endTimep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimep(String value) {
        this.endTimep = value;
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
