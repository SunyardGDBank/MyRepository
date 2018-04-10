
package com.sunyard.core.S070030011;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunyard.core.S070030011 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReqHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ReqHeader");
    private final static QName _RspHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "RspHeader");
    private final static QName _TranDate_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranDate");
    private final static QName _TranTime_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranTime");
    private final static QName _TranTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranTellerNo");
    private final static QName _TranSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranSeqNo");
    private final static QName _ConsumerId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ConsumerId");
    private final static QName _GlobalSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "GlobalSeqNo");
    private final static QName _SourceSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SourceSysId");
    private final static QName _BranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BranchId");
    private final static QName _TerminalCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TerminalCode");
    private final static QName _CityCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "CityCode");
    private final static QName _AuthrTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AuthrTellerNo");
    private final static QName _AuthrPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AuthrPwd");
    private final static QName _AuthrCardFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AuthrCardFlag");
    private final static QName _AuthrCardNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AuthrCardNo");
    private final static QName _LangCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "LangCode");
    private final static QName _TranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranCode");
    private final static QName _PIN_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "PIN");
    private final static QName _KeyVersionNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "KeyVersionNo");
    private final static QName _SysOffset1_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SysOffset1");
    private final static QName _SysOffset2_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SysOffset2");
    private final static QName _TargetAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TargetAdr");
    private final static QName _SourceAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SourceAdr");
    private final static QName _MsgEndFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "MsgEndFlag");
    private final static QName _MsgSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "MsgSeqNo");
    private final static QName _SubTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SubTranCode");
    private final static QName _TranMode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranMode");
    private final static QName _TranSerialNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranSerialNo");
    private final static QName _BackendSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BackendSeqNo");
    private final static QName _BackendSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BackendSysId");
    private final static QName _ReturnCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ReturnCode");
    private final static QName _ReturnMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ReturnMsg");
    private final static QName _LinkTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "LinkTranCode");
    private final static QName _SubSvcSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SubSvcSysId");
    private final static QName _SubSvcId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SubSvcId");
    private final static QName _SubSvcRetCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SubSvcRetCode");
    private final static QName _SubSvcRetMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SubSvcRetMsg");
    private final static QName _RsrvContent_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "RsrvContent");
    private final static QName _ReqIdvExgQry_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ReqIdvExgQry");
    private final static QName _StartNum1_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "StartNum1");
    private final static QName _QueryNum1_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "QueryNum1");
    private final static QName _AplChannel_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AplChannel");
    private final static QName _BussType_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BussType");
    private final static QName _TranStatus_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranStatus");
    private final static QName _ClientNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ClientNo");
    private final static QName _PrpsCtfType_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "PrpsCtfType");
    private final static QName _PrpsCtfId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "PrpsCtfId");
    private final static QName _StartDate_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "StartDate");
    private final static QName _EndDate_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "EndDate");
    private final static QName _RspIdvExgQry_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "RspIdvExgQry");
    private final static QName _TotalNum1_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TotalNum1");
    private final static QName _CountryCode_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "CountryCode");
    private final static QName _PropoerName_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "PropoerName");
    private final static QName _ContactAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ContactAdr");
    private final static QName _CtfType_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "CtfType");
    private final static QName _CtfId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "CtfId");
    private final static QName _AplNum_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AplNum");
    private final static QName _ApplyNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ApplyNo");
    private final static QName _TranDate1_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "TranDate1");
    private final static QName _AcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "AcctNo");
    private final static QName _ExecExgRt_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ExecExgRt");
    private final static QName _BuyCcy_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BuyCcy");
    private final static QName _SellCcy_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SellCcy");
    private final static QName _BuyAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BuyAmt");
    private final static QName _SellAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SellAmt");
    private final static QName _CashRateFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "CashRateFlag");
    private final static QName _Abstract_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "Abstract");
    private final static QName _RecordStatus_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "RecordStatus");
    private final static QName _FailRsnDsc_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "FailRsnDsc");
    private final static QName _XfundPrjCd_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "XfundPrjCd");
    private final static QName _BussId_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "BussId");
    private final static QName _ReqOthrSysExgCodeQry_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "ReqOthrSysExgCodeQry");
    private final static QName _IsFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "IsFlag");
    private final static QName _StatCgy_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "StatCgy");
    private final static QName _StartNum2_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "StartNum2");
    private final static QName _QueryNum2_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "QueryNum2");
    private final static QName _RspOthrSysExgCodeQry_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "RspOthrSysExgCodeQry");
    private final static QName _SvcStatus_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "SvcStatus");
    private final static QName _XfundPrjNm_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "XfundPrjNm");
    private final static QName _InstName_QNAME = new QName("http://esb.spdbbiz.com/services/S070030011", "InstName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunyard.core.S070030011
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RspOthrSysExgCodeQryType }
     * 
     */
    public RspOthrSysExgCodeQryType createRspOthrSysExgCodeQryType() {
        return new RspOthrSysExgCodeQryType();
    }

    /**
     * Create an instance of {@link ReqOthrSysExgCodeQryType }
     * 
     */
    public ReqOthrSysExgCodeQryType createReqOthrSysExgCodeQryType() {
        return new ReqOthrSysExgCodeQryType();
    }

    /**
     * Create an instance of {@link RspIdvExgQryType }
     * 
     */
    public RspIdvExgQryType createRspIdvExgQryType() {
        return new RspIdvExgQryType();
    }

    /**
     * Create an instance of {@link ReqIdvExgQryType }
     * 
     */
    public ReqIdvExgQryType createReqIdvExgQryType() {
        return new ReqIdvExgQryType();
    }

    /**
     * Create an instance of {@link ReqHeaderType }
     * 
     */
    public ReqHeaderType createReqHeaderType() {
        return new ReqHeaderType();
    }

    /**
     * Create an instance of {@link RspHeaderType }
     * 
     */
    public RspHeaderType createRspHeaderType() {
        return new RspHeaderType();
    }

    /**
     * Create an instance of {@link ReqSvcHeaderType }
     * 
     */
    public ReqSvcHeaderType createReqSvcHeaderType() {
        return new ReqSvcHeaderType();
    }

    /**
     * Create an instance of {@link RspSvcHeaderType }
     * 
     */
    public RspSvcHeaderType createRspSvcHeaderType() {
        return new RspSvcHeaderType();
    }

    /**
     * Create an instance of {@link SubSvcRetInfoType }
     * 
     */
    public SubSvcRetInfoType createSubSvcRetInfoType() {
        return new SubSvcRetInfoType();
    }

    /**
     * Create an instance of {@link ExgInfoType }
     * 
     */
    public ExgInfoType createExgInfoType() {
        return new ExgInfoType();
    }

    /**
     * Create an instance of {@link OthrSysExgCodeInfoType }
     * 
     */
    public OthrSysExgCodeInfoType createOthrSysExgCodeInfoType() {
        return new OthrSysExgCodeInfoType();
    }

    /**
     * Create an instance of {@link RspOthrSysExgCodeQryType.SvcBody }
     * 
     */
    public RspOthrSysExgCodeQryType.SvcBody createRspOthrSysExgCodeQryTypeSvcBody() {
        return new RspOthrSysExgCodeQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqOthrSysExgCodeQryType.SvcBody }
     * 
     */
    public ReqOthrSysExgCodeQryType.SvcBody createReqOthrSysExgCodeQryTypeSvcBody() {
        return new ReqOthrSysExgCodeQryType.SvcBody();
    }

    /**
     * Create an instance of {@link RspIdvExgQryType.SvcBody }
     * 
     */
    public RspIdvExgQryType.SvcBody createRspIdvExgQryTypeSvcBody() {
        return new RspIdvExgQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqIdvExgQryType.SvcBody }
     * 
     */
    public ReqIdvExgQryType.SvcBody createReqIdvExgQryTypeSvcBody() {
        return new ReqIdvExgQryType.SvcBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ReqHeader")
    public JAXBElement<ReqHeaderType> createReqHeader(ReqHeaderType value) {
        return new JAXBElement<ReqHeaderType>(_ReqHeader_QNAME, ReqHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "RspHeader")
    public JAXBElement<RspHeaderType> createRspHeader(RspHeaderType value) {
        return new JAXBElement<RspHeaderType>(_RspHeader_QNAME, RspHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranDate")
    public JAXBElement<String> createTranDate(String value) {
        return new JAXBElement<String>(_TranDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranTime")
    public JAXBElement<String> createTranTime(String value) {
        return new JAXBElement<String>(_TranTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranTellerNo")
    public JAXBElement<String> createTranTellerNo(String value) {
        return new JAXBElement<String>(_TranTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranSeqNo")
    public JAXBElement<String> createTranSeqNo(String value) {
        return new JAXBElement<String>(_TranSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ConsumerId")
    public JAXBElement<String> createConsumerId(String value) {
        return new JAXBElement<String>(_ConsumerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "GlobalSeqNo")
    public JAXBElement<String> createGlobalSeqNo(String value) {
        return new JAXBElement<String>(_GlobalSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SourceSysId")
    public JAXBElement<String> createSourceSysId(String value) {
        return new JAXBElement<String>(_SourceSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BranchId")
    public JAXBElement<String> createBranchId(String value) {
        return new JAXBElement<String>(_BranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TerminalCode")
    public JAXBElement<String> createTerminalCode(String value) {
        return new JAXBElement<String>(_TerminalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "CityCode")
    public JAXBElement<String> createCityCode(String value) {
        return new JAXBElement<String>(_CityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AuthrTellerNo")
    public JAXBElement<String> createAuthrTellerNo(String value) {
        return new JAXBElement<String>(_AuthrTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AuthrPwd")
    public JAXBElement<String> createAuthrPwd(String value) {
        return new JAXBElement<String>(_AuthrPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AuthrCardFlag")
    public JAXBElement<String> createAuthrCardFlag(String value) {
        return new JAXBElement<String>(_AuthrCardFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AuthrCardNo")
    public JAXBElement<String> createAuthrCardNo(String value) {
        return new JAXBElement<String>(_AuthrCardNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "LangCode")
    public JAXBElement<String> createLangCode(String value) {
        return new JAXBElement<String>(_LangCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranCode")
    public JAXBElement<String> createTranCode(String value) {
        return new JAXBElement<String>(_TranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "KeyVersionNo")
    public JAXBElement<String> createKeyVersionNo(String value) {
        return new JAXBElement<String>(_KeyVersionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SysOffset1")
    public JAXBElement<String> createSysOffset1(String value) {
        return new JAXBElement<String>(_SysOffset1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SysOffset2")
    public JAXBElement<String> createSysOffset2(String value) {
        return new JAXBElement<String>(_SysOffset2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TargetAdr")
    public JAXBElement<String> createTargetAdr(String value) {
        return new JAXBElement<String>(_TargetAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SourceAdr")
    public JAXBElement<String> createSourceAdr(String value) {
        return new JAXBElement<String>(_SourceAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "MsgEndFlag")
    public JAXBElement<String> createMsgEndFlag(String value) {
        return new JAXBElement<String>(_MsgEndFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "MsgSeqNo")
    public JAXBElement<String> createMsgSeqNo(String value) {
        return new JAXBElement<String>(_MsgSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SubTranCode")
    public JAXBElement<String> createSubTranCode(String value) {
        return new JAXBElement<String>(_SubTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranMode")
    public JAXBElement<String> createTranMode(String value) {
        return new JAXBElement<String>(_TranMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranSerialNo")
    public JAXBElement<String> createTranSerialNo(String value) {
        return new JAXBElement<String>(_TranSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BackendSeqNo")
    public JAXBElement<String> createBackendSeqNo(String value) {
        return new JAXBElement<String>(_BackendSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BackendSysId")
    public JAXBElement<String> createBackendSysId(String value) {
        return new JAXBElement<String>(_BackendSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ReturnCode")
    public JAXBElement<String> createReturnCode(String value) {
        return new JAXBElement<String>(_ReturnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ReturnMsg")
    public JAXBElement<String> createReturnMsg(String value) {
        return new JAXBElement<String>(_ReturnMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "LinkTranCode")
    public JAXBElement<String> createLinkTranCode(String value) {
        return new JAXBElement<String>(_LinkTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SubSvcSysId")
    public JAXBElement<String> createSubSvcSysId(String value) {
        return new JAXBElement<String>(_SubSvcSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SubSvcId")
    public JAXBElement<String> createSubSvcId(String value) {
        return new JAXBElement<String>(_SubSvcId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SubSvcRetCode")
    public JAXBElement<String> createSubSvcRetCode(String value) {
        return new JAXBElement<String>(_SubSvcRetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SubSvcRetMsg")
    public JAXBElement<String> createSubSvcRetMsg(String value) {
        return new JAXBElement<String>(_SubSvcRetMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "RsrvContent")
    public JAXBElement<String> createRsrvContent(String value) {
        return new JAXBElement<String>(_RsrvContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqIdvExgQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ReqIdvExgQry")
    public JAXBElement<ReqIdvExgQryType> createReqIdvExgQry(ReqIdvExgQryType value) {
        return new JAXBElement<ReqIdvExgQryType>(_ReqIdvExgQry_QNAME, ReqIdvExgQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "StartNum1")
    public JAXBElement<Integer> createStartNum1(Integer value) {
        return new JAXBElement<Integer>(_StartNum1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "QueryNum1")
    public JAXBElement<Integer> createQueryNum1(Integer value) {
        return new JAXBElement<Integer>(_QueryNum1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AplChannel")
    public JAXBElement<String> createAplChannel(String value) {
        return new JAXBElement<String>(_AplChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BussType")
    public JAXBElement<String> createBussType(String value) {
        return new JAXBElement<String>(_BussType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranStatus")
    public JAXBElement<String> createTranStatus(String value) {
        return new JAXBElement<String>(_TranStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ClientNo")
    public JAXBElement<String> createClientNo(String value) {
        return new JAXBElement<String>(_ClientNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "PrpsCtfType")
    public JAXBElement<String> createPrpsCtfType(String value) {
        return new JAXBElement<String>(_PrpsCtfType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "PrpsCtfId")
    public JAXBElement<String> createPrpsCtfId(String value) {
        return new JAXBElement<String>(_PrpsCtfId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "StartDate")
    public JAXBElement<String> createStartDate(String value) {
        return new JAXBElement<String>(_StartDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "EndDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspIdvExgQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "RspIdvExgQry")
    public JAXBElement<RspIdvExgQryType> createRspIdvExgQry(RspIdvExgQryType value) {
        return new JAXBElement<RspIdvExgQryType>(_RspIdvExgQry_QNAME, RspIdvExgQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TotalNum1")
    public JAXBElement<Integer> createTotalNum1(Integer value) {
        return new JAXBElement<Integer>(_TotalNum1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "CountryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "PropoerName")
    public JAXBElement<String> createPropoerName(String value) {
        return new JAXBElement<String>(_PropoerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ContactAdr")
    public JAXBElement<String> createContactAdr(String value) {
        return new JAXBElement<String>(_ContactAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "CtfType")
    public JAXBElement<String> createCtfType(String value) {
        return new JAXBElement<String>(_CtfType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "CtfId")
    public JAXBElement<String> createCtfId(String value) {
        return new JAXBElement<String>(_CtfId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AplNum")
    public JAXBElement<Integer> createAplNum(Integer value) {
        return new JAXBElement<Integer>(_AplNum_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ApplyNo")
    public JAXBElement<String> createApplyNo(String value) {
        return new JAXBElement<String>(_ApplyNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "TranDate1")
    public JAXBElement<String> createTranDate1(String value) {
        return new JAXBElement<String>(_TranDate1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "AcctNo")
    public JAXBElement<String> createAcctNo(String value) {
        return new JAXBElement<String>(_AcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ExecExgRt")
    public JAXBElement<BigDecimal> createExecExgRt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExecExgRt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BuyCcy")
    public JAXBElement<String> createBuyCcy(String value) {
        return new JAXBElement<String>(_BuyCcy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SellCcy")
    public JAXBElement<String> createSellCcy(String value) {
        return new JAXBElement<String>(_SellCcy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BuyAmt")
    public JAXBElement<BigDecimal> createBuyAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BuyAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SellAmt")
    public JAXBElement<BigDecimal> createSellAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SellAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "CashRateFlag")
    public JAXBElement<String> createCashRateFlag(String value) {
        return new JAXBElement<String>(_CashRateFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "Abstract")
    public JAXBElement<String> createAbstract(String value) {
        return new JAXBElement<String>(_Abstract_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "RecordStatus")
    public JAXBElement<String> createRecordStatus(String value) {
        return new JAXBElement<String>(_RecordStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "FailRsnDsc")
    public JAXBElement<String> createFailRsnDsc(String value) {
        return new JAXBElement<String>(_FailRsnDsc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "XfundPrjCd")
    public JAXBElement<String> createXfundPrjCd(String value) {
        return new JAXBElement<String>(_XfundPrjCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "BussId")
    public JAXBElement<String> createBussId(String value) {
        return new JAXBElement<String>(_BussId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqOthrSysExgCodeQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "ReqOthrSysExgCodeQry")
    public JAXBElement<ReqOthrSysExgCodeQryType> createReqOthrSysExgCodeQry(ReqOthrSysExgCodeQryType value) {
        return new JAXBElement<ReqOthrSysExgCodeQryType>(_ReqOthrSysExgCodeQry_QNAME, ReqOthrSysExgCodeQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "IsFlag")
    public JAXBElement<String> createIsFlag(String value) {
        return new JAXBElement<String>(_IsFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "StatCgy")
    public JAXBElement<String> createStatCgy(String value) {
        return new JAXBElement<String>(_StatCgy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "StartNum2")
    public JAXBElement<String> createStartNum2(String value) {
        return new JAXBElement<String>(_StartNum2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "QueryNum2")
    public JAXBElement<String> createQueryNum2(String value) {
        return new JAXBElement<String>(_QueryNum2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspOthrSysExgCodeQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "RspOthrSysExgCodeQry")
    public JAXBElement<RspOthrSysExgCodeQryType> createRspOthrSysExgCodeQry(RspOthrSysExgCodeQryType value) {
        return new JAXBElement<RspOthrSysExgCodeQryType>(_RspOthrSysExgCodeQry_QNAME, RspOthrSysExgCodeQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "SvcStatus")
    public JAXBElement<String> createSvcStatus(String value) {
        return new JAXBElement<String>(_SvcStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "XfundPrjNm")
    public JAXBElement<String> createXfundPrjNm(String value) {
        return new JAXBElement<String>(_XfundPrjNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S070030011", name = "InstName")
    public JAXBElement<String> createInstName(String value) {
        return new JAXBElement<String>(_InstName_QNAME, String.class, null, value);
    }

}
