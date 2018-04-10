
package com.sunyard.core.S120030027;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EcifHeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EcifHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://esb.spdbbiz.com/services/S120030027}RqsRole" minOccurs="0"/&gt;
 *         &lt;element name="QueryHeader" type="{http://esb.spdbbiz.com/services/S120030027}QueryHeaderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcifHeaderType", propOrder = {
    "rqsName",
    "rqsRole",
    "queryHeader"
})
public class EcifHeaderType {

    @XmlElement(name = "RqsName")
    protected String rqsName;
    @XmlElement(name = "RqsRole")
    protected String rqsRole;
    @XmlElement(name = "QueryHeader")
    protected QueryHeaderType queryHeader;

    /**
     * 获取rqsName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqsName() {
        return rqsName;
    }

    /**
     * 设置rqsName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqsName(String value) {
        this.rqsName = value;
    }

    /**
     * 获取rqsRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqsRole() {
        return rqsRole;
    }

    /**
     * 设置rqsRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqsRole(String value) {
        this.rqsRole = value;
    }

    /**
     * 获取queryHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QueryHeaderType }
     *     
     */
    public QueryHeaderType getQueryHeader() {
        return queryHeader;
    }

    /**
     * 设置queryHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QueryHeaderType }
     *     
     */
    public void setQueryHeader(QueryHeaderType value) {
        this.queryHeader = value;
    }

}
