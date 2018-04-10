
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpclListInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpclListInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SpclListNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EntityName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EntityNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SpclListType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SourceSysId1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SrcBussCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CreateReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CreateBranchId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CreateTellerNo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpclListInfoType", propOrder = {
    "spclListNo",
    "entityName",
    "entityNo",
    "spclListType",
    "sourceSysId1",
    "srcBussCode",
    "startTimep",
    "endTimep",
    "activeFlag",
    "createReason",
    "endReason",
    "createBranchId",
    "createTellerNo"
})
public class SpclListInfoType {

    @XmlElement(name = "SpclListNo")
    protected String spclListNo;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "EntityNo")
    protected String entityNo;
    @XmlElement(name = "SpclListType")
    protected String spclListType;
    @XmlElement(name = "SourceSysId1")
    protected String sourceSysId1;
    @XmlElement(name = "SrcBussCode")
    protected String srcBussCode;
    @XmlElement(name = "StartTimep")
    protected String startTimep;
    @XmlElement(name = "EndTimep")
    protected String endTimep;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "CreateReason")
    protected String createReason;
    @XmlElement(name = "EndReason")
    protected String endReason;
    @XmlElement(name = "CreateBranchId")
    protected String createBranchId;
    @XmlElement(name = "CreateTellerNo")
    protected String createTellerNo;

    /**
     * 获取spclListNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpclListNo() {
        return spclListNo;
    }

    /**
     * 设置spclListNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpclListNo(String value) {
        this.spclListNo = value;
    }

    /**
     * 获取entityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * 设置entityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * 获取entityNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityNo() {
        return entityNo;
    }

    /**
     * 设置entityNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityNo(String value) {
        this.entityNo = value;
    }

    /**
     * 获取spclListType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpclListType() {
        return spclListType;
    }

    /**
     * 设置spclListType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpclListType(String value) {
        this.spclListType = value;
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
     * 获取srcBussCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcBussCode() {
        return srcBussCode;
    }

    /**
     * 设置srcBussCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcBussCode(String value) {
        this.srcBussCode = value;
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

    /**
     * 获取createReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateReason() {
        return createReason;
    }

    /**
     * 设置createReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateReason(String value) {
        this.createReason = value;
    }

    /**
     * 获取endReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndReason() {
        return endReason;
    }

    /**
     * 设置endReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndReason(String value) {
        this.endReason = value;
    }

    /**
     * 获取createBranchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateBranchId() {
        return createBranchId;
    }

    /**
     * 设置createBranchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateBranchId(String value) {
        this.createBranchId = value;
    }

    /**
     * 获取createTellerNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTellerNo() {
        return createTellerNo;
    }

    /**
     * 设置createTellerNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTellerNo(String value) {
        this.createTellerNo = value;
    }

}
