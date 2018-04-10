
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AdrInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdrInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AdrNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ECIFClientNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Address"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ProvCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}CntyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ZipCode"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}AdrType"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTimep" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}SourceSysId1"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}StartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}EndTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}Remark" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}ActiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}PrefFlag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdrInfoType", propOrder = {
    "adrNo",
    "ecifClientNo",
    "address",
    "provCode",
    "cityCode",
    "cntyCode",
    "zipCode",
    "adrType",
    "startTimep",
    "endTimep",
    "sourceSysId1",
    "startTime",
    "endTime",
    "remark",
    "activeFlag",
    "prefFlag"
})
public class AdrInfoType {

    @XmlElement(name = "AdrNo")
    protected String adrNo;
    @XmlElement(name = "ECIFClientNo")
    protected String ecifClientNo;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "ProvCode")
    protected String provCode;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "CntyCode")
    protected String cntyCode;
    @XmlElement(name = "ZipCode", required = true)
    protected String zipCode;
    @XmlElement(name = "AdrType", required = true)
    protected String adrType;
    @XmlElement(name = "StartTimep")
    protected String startTimep;
    @XmlElement(name = "EndTimep")
    protected String endTimep;
    @XmlElement(name = "SourceSysId1", required = true)
    protected String sourceSysId1;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "ActiveFlag")
    protected String activeFlag;
    @XmlElement(name = "PrefFlag")
    protected String prefFlag;

    /**
     * 获取adrNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrNo() {
        return adrNo;
    }

    /**
     * 设置adrNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrNo(String value) {
        this.adrNo = value;
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
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取provCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvCode() {
        return provCode;
    }

    /**
     * 设置provCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvCode(String value) {
        this.provCode = value;
    }

    /**
     * 获取cityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置cityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * 获取cntyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * 设置cntyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntyCode(String value) {
        this.cntyCode = value;
    }

    /**
     * 获取zipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置zipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * 获取adrType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrType() {
        return adrType;
    }

    /**
     * 设置adrType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrType(String value) {
        this.adrType = value;
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
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
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
     * 获取prefFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefFlag() {
        return prefFlag;
    }

    /**
     * 设置prefFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefFlag(String value) {
        this.prefFlag = value;
    }

}
