
package com.sunyard.core.S010030004;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RspAcntgBalQryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RspAcntgBalQryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspSvcHeader" type="{http://esb.spdbbiz.com/services/S010030004}RspSvcHeaderType"/&gt;
 *         &lt;element name="SvcBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}BfrLastDayBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CntlBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FreezeBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RsrvBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ActualBal" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}Accrual" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RspAcntgBalQryType", propOrder = {
    "rspSvcHeader",
    "svcBody"
})
public class RspAcntgBalQryType {

    @XmlElement(name = "RspSvcHeader", required = true)
    protected RspSvcHeaderType rspSvcHeader;
    @XmlElement(name = "SvcBody")
    protected SvcBody svcBody;

    /**
     * 获取rspSvcHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RspSvcHeaderType }
     *     
     */
    public RspSvcHeaderType getRspSvcHeader() {
        return rspSvcHeader;
    }

    /**
     * 设置rspSvcHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RspSvcHeaderType }
     *     
     */
    public void setRspSvcHeader(RspSvcHeaderType value) {
        this.rspSvcHeader = value;
    }

    /**
     * 获取svcBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SvcBody }
     *     
     */
    public SvcBody getSvcBody() {
        return svcBody;
    }

    /**
     * 设置svcBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SvcBody }
     *     
     */
    public void setSvcBody(SvcBody value) {
        this.svcBody = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}AcctBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}BfrLastDayBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}CntlBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}FreezeBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}RsrvBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}ActualBal" minOccurs="0"/&gt;
     *         &lt;element ref="{http://esb.spdbbiz.com/services/S010030004}Accrual" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctBal",
        "bfrLastDayBal",
        "cntlBal",
        "freezeBal",
        "rsrvBal",
        "actualBal",
        "accrual"
    })
    public static class SvcBody {

        @XmlElement(name = "AcctBal")
        protected BigDecimal acctBal;
        @XmlElement(name = "BfrLastDayBal")
        protected BigDecimal bfrLastDayBal;
        @XmlElement(name = "CntlBal")
        protected BigDecimal cntlBal;
        @XmlElement(name = "FreezeBal")
        protected BigDecimal freezeBal;
        @XmlElement(name = "RsrvBal")
        protected BigDecimal rsrvBal;
        @XmlElement(name = "ActualBal")
        protected BigDecimal actualBal;
        @XmlElement(name = "Accrual")
        protected BigDecimal accrual;

        /**
         * 获取acctBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAcctBal() {
            return acctBal;
        }

        /**
         * 设置acctBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAcctBal(BigDecimal value) {
            this.acctBal = value;
        }

        /**
         * 获取bfrLastDayBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBfrLastDayBal() {
            return bfrLastDayBal;
        }

        /**
         * 设置bfrLastDayBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBfrLastDayBal(BigDecimal value) {
            this.bfrLastDayBal = value;
        }

        /**
         * 获取cntlBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCntlBal() {
            return cntlBal;
        }

        /**
         * 设置cntlBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCntlBal(BigDecimal value) {
            this.cntlBal = value;
        }

        /**
         * 获取freezeBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFreezeBal() {
            return freezeBal;
        }

        /**
         * 设置freezeBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFreezeBal(BigDecimal value) {
            this.freezeBal = value;
        }

        /**
         * 获取rsrvBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRsrvBal() {
            return rsrvBal;
        }

        /**
         * 设置rsrvBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRsrvBal(BigDecimal value) {
            this.rsrvBal = value;
        }

        /**
         * 获取actualBal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getActualBal() {
            return actualBal;
        }

        /**
         * 设置actualBal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setActualBal(BigDecimal value) {
            this.actualBal = value;
        }

        /**
         * 获取accrual属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccrual() {
            return accrual;
        }

        /**
         * 设置accrual属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAccrual(BigDecimal value) {
            this.accrual = value;
        }

    }

}
