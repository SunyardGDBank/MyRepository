
package com.sunyard.core.S010030004;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunyard.core.S010030004 package. 
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

    private final static QName _ReqHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqHeader");
    private final static QName _RspHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspHeader");
    private final static QName _TranDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranDate");
    private final static QName _TranTime_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranTime");
    private final static QName _TranTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranTellerNo");
    private final static QName _TranSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranSeqNo");
    private final static QName _ConsumerId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ConsumerId");
    private final static QName _GlobalSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "GlobalSeqNo");
    private final static QName _SourceSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SourceSysId");
    private final static QName _BranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "BranchId");
    private final static QName _TerminalCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TerminalCode");
    private final static QName _CityCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "CityCode");
    private final static QName _AuthrTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AuthrTellerNo");
    private final static QName _AuthrPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AuthrPwd");
    private final static QName _AuthrCardFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AuthrCardFlag");
    private final static QName _AuthrCardNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AuthrCardNo");
    private final static QName _LangCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "LangCode");
    private final static QName _TranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranCode");
    private final static QName _PIN_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "PIN");
    private final static QName _KeyVersionNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "KeyVersionNo");
    private final static QName _SysOffset1_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SysOffset1");
    private final static QName _SysOffset2_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SysOffset2");
    private final static QName _TargetAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TargetAdr");
    private final static QName _SourceAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SourceAdr");
    private final static QName _MsgEndFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "MsgEndFlag");
    private final static QName _MsgSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "MsgSeqNo");
    private final static QName _SubTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SubTranCode");
    private final static QName _TranMode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranMode");
    private final static QName _TranSerialNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranSerialNo");
    private final static QName _BackendSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "BackendSeqNo");
    private final static QName _BackendSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "BackendSysId");
    private final static QName _ReturnCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReturnCode");
    private final static QName _ReturnMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReturnMsg");
    private final static QName _LinkTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "LinkTranCode");
    private final static QName _SubSvcSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SubSvcSysId");
    private final static QName _SubSvcId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SubSvcId");
    private final static QName _SubSvcRetCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SubSvcRetCode");
    private final static QName _SubSvcRetMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SubSvcRetMsg");
    private final static QName _RsrvContent_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RsrvContent");
    private final static QName _ReqAcntgBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqAcntgBalQry");
    private final static QName _AcctType_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AcctType");
    private final static QName _ClientAcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ClientAcctNo");
    private final static QName _CurrencyId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "CurrencyId");
    private final static QName _AcctChar_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AcctChar");
    private final static QName _CashRateFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "CashRateFlag");
    private final static QName _PwdCheckType_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "PwdCheckType");
    private final static QName _TranPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "TranPwd");
    private final static QName _RspAcntgBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspAcntgBalQry");
    private final static QName _AcctBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "AcctBal");
    private final static QName _BfrLastDayBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "BfrLastDayBal");
    private final static QName _CntlBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "CntlBal");
    private final static QName _FreezeBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "FreezeBal");
    private final static QName _RsrvBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RsrvBal");
    private final static QName _ActualBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ActualBal");
    private final static QName _Accrual_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "Accrual");
    private final static QName _ReqCrnAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqCrnAcctBalQry");
    private final static QName _QueryType_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "QueryType");
    private final static QName _ClientNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ClientNo");
    private final static QName _QueryPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "QueryPwd");
    private final static QName _CardNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "CardNo");
    private final static QName _StartNum1_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "StartNum1");
    private final static QName _QueryNum1_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "QueryNum1");
    private final static QName _RspCrnAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspCrnAcctBalQry");
    private final static QName _ClientCHNName_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ClientCHNName");
    private final static QName _OpenBranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "OpenBranchId");
    private final static QName _FloatMode_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "FloatMode");
    private final static QName _ValidDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ValidDate");
    private final static QName _FloatType_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "FloatType");
    private final static QName _FloatAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "FloatAmt");
    private final static QName _RecordStatus_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RecordStatus");
    private final static QName _ReqHistNetChgValMntQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqHistNetChgValMntQry");
    private final static QName _RspHistNetChgValMntQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspHistNetChgValMntQry");
    private final static QName _ReqTermAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqTermAcctBalQry");
    private final static QName _SerialNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "SerialNo");
    private final static QName _VchrNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "VchrNo");
    private final static QName _RspTermAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspTermAcctBalQry");
    private final static QName _InrAcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "InrAcctNo");
    private final static QName _DepositType_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "DepositType");
    private final static QName _OpenAcctAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "OpenAcctAmt");
    private final static QName _BussBranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "BussBranchId");
    private final static QName _OpenAcctDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "OpenAcctDate");
    private final static QName _ExpiredDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ExpiredDate");
    private final static QName _DepositTerm_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "DepositTerm");
    private final static QName _IntRate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "IntRate");
    private final static QName _StartIntDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "StartIntDate");
    private final static QName _RenewDepFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RenewDepFlag");
    private final static QName _ReqTmAIOAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "ReqTmAIOAcctBalQry");
    private final static QName _RspTmAIOAcctBalQry_QNAME = new QName("http://esb.spdbbiz.com/services/S010030004", "RspTmAIOAcctBalQry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunyard.core.S010030004
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RspTmAIOAcctBalQryType }
     * 
     */
    public RspTmAIOAcctBalQryType createRspTmAIOAcctBalQryType() {
        return new RspTmAIOAcctBalQryType();
    }

    /**
     * Create an instance of {@link ReqTmAIOAcctBalQryType }
     * 
     */
    public ReqTmAIOAcctBalQryType createReqTmAIOAcctBalQryType() {
        return new ReqTmAIOAcctBalQryType();
    }

    /**
     * Create an instance of {@link RspTermAcctBalQryType }
     * 
     */
    public RspTermAcctBalQryType createRspTermAcctBalQryType() {
        return new RspTermAcctBalQryType();
    }

    /**
     * Create an instance of {@link ReqTermAcctBalQryType }
     * 
     */
    public ReqTermAcctBalQryType createReqTermAcctBalQryType() {
        return new ReqTermAcctBalQryType();
    }

    /**
     * Create an instance of {@link RspHistNetChgValMntQryType }
     * 
     */
    public RspHistNetChgValMntQryType createRspHistNetChgValMntQryType() {
        return new RspHistNetChgValMntQryType();
    }

    /**
     * Create an instance of {@link ReqHistNetChgValMntQryType }
     * 
     */
    public ReqHistNetChgValMntQryType createReqHistNetChgValMntQryType() {
        return new ReqHistNetChgValMntQryType();
    }

    /**
     * Create an instance of {@link RspCrnAcctBalQryType }
     * 
     */
    public RspCrnAcctBalQryType createRspCrnAcctBalQryType() {
        return new RspCrnAcctBalQryType();
    }

    /**
     * Create an instance of {@link ReqCrnAcctBalQryType }
     * 
     */
    public ReqCrnAcctBalQryType createReqCrnAcctBalQryType() {
        return new ReqCrnAcctBalQryType();
    }

    /**
     * Create an instance of {@link RspAcntgBalQryType }
     * 
     */
    public RspAcntgBalQryType createRspAcntgBalQryType() {
        return new RspAcntgBalQryType();
    }

    /**
     * Create an instance of {@link ReqAcntgBalQryType }
     * 
     */
    public ReqAcntgBalQryType createReqAcntgBalQryType() {
        return new ReqAcntgBalQryType();
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
     * Create an instance of {@link CrnBalDtlInfoType }
     * 
     */
    public CrnBalDtlInfoType createCrnBalDtlInfoType() {
        return new CrnBalDtlInfoType();
    }

    /**
     * Create an instance of {@link TermBalDtlInfoType }
     * 
     */
    public TermBalDtlInfoType createTermBalDtlInfoType() {
        return new TermBalDtlInfoType();
    }

    /**
     * Create an instance of {@link RspTmAIOAcctBalQryType.SvcBody }
     * 
     */
    public RspTmAIOAcctBalQryType.SvcBody createRspTmAIOAcctBalQryTypeSvcBody() {
        return new RspTmAIOAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqTmAIOAcctBalQryType.SvcBody }
     * 
     */
    public ReqTmAIOAcctBalQryType.SvcBody createReqTmAIOAcctBalQryTypeSvcBody() {
        return new ReqTmAIOAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link RspTermAcctBalQryType.SvcBody }
     * 
     */
    public RspTermAcctBalQryType.SvcBody createRspTermAcctBalQryTypeSvcBody() {
        return new RspTermAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqTermAcctBalQryType.SvcBody }
     * 
     */
    public ReqTermAcctBalQryType.SvcBody createReqTermAcctBalQryTypeSvcBody() {
        return new ReqTermAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link RspHistNetChgValMntQryType.SvcBody }
     * 
     */
    public RspHistNetChgValMntQryType.SvcBody createRspHistNetChgValMntQryTypeSvcBody() {
        return new RspHistNetChgValMntQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqHistNetChgValMntQryType.SvcBody }
     * 
     */
    public ReqHistNetChgValMntQryType.SvcBody createReqHistNetChgValMntQryTypeSvcBody() {
        return new ReqHistNetChgValMntQryType.SvcBody();
    }

    /**
     * Create an instance of {@link RspCrnAcctBalQryType.SvcBody }
     * 
     */
    public RspCrnAcctBalQryType.SvcBody createRspCrnAcctBalQryTypeSvcBody() {
        return new RspCrnAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqCrnAcctBalQryType.SvcBody }
     * 
     */
    public ReqCrnAcctBalQryType.SvcBody createReqCrnAcctBalQryTypeSvcBody() {
        return new ReqCrnAcctBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link RspAcntgBalQryType.SvcBody }
     * 
     */
    public RspAcntgBalQryType.SvcBody createRspAcntgBalQryTypeSvcBody() {
        return new RspAcntgBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqAcntgBalQryType.SvcBody }
     * 
     */
    public ReqAcntgBalQryType.SvcBody createReqAcntgBalQryTypeSvcBody() {
        return new ReqAcntgBalQryType.SvcBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqHeader")
    public JAXBElement<ReqHeaderType> createReqHeader(ReqHeaderType value) {
        return new JAXBElement<ReqHeaderType>(_ReqHeader_QNAME, ReqHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspHeader")
    public JAXBElement<RspHeaderType> createRspHeader(RspHeaderType value) {
        return new JAXBElement<RspHeaderType>(_RspHeader_QNAME, RspHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranDate")
    public JAXBElement<String> createTranDate(String value) {
        return new JAXBElement<String>(_TranDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranTime")
    public JAXBElement<String> createTranTime(String value) {
        return new JAXBElement<String>(_TranTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranTellerNo")
    public JAXBElement<String> createTranTellerNo(String value) {
        return new JAXBElement<String>(_TranTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranSeqNo")
    public JAXBElement<String> createTranSeqNo(String value) {
        return new JAXBElement<String>(_TranSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ConsumerId")
    public JAXBElement<String> createConsumerId(String value) {
        return new JAXBElement<String>(_ConsumerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "GlobalSeqNo")
    public JAXBElement<String> createGlobalSeqNo(String value) {
        return new JAXBElement<String>(_GlobalSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SourceSysId")
    public JAXBElement<String> createSourceSysId(String value) {
        return new JAXBElement<String>(_SourceSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "BranchId")
    public JAXBElement<String> createBranchId(String value) {
        return new JAXBElement<String>(_BranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TerminalCode")
    public JAXBElement<String> createTerminalCode(String value) {
        return new JAXBElement<String>(_TerminalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "CityCode")
    public JAXBElement<String> createCityCode(String value) {
        return new JAXBElement<String>(_CityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AuthrTellerNo")
    public JAXBElement<String> createAuthrTellerNo(String value) {
        return new JAXBElement<String>(_AuthrTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AuthrPwd")
    public JAXBElement<String> createAuthrPwd(String value) {
        return new JAXBElement<String>(_AuthrPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AuthrCardFlag")
    public JAXBElement<String> createAuthrCardFlag(String value) {
        return new JAXBElement<String>(_AuthrCardFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AuthrCardNo")
    public JAXBElement<String> createAuthrCardNo(String value) {
        return new JAXBElement<String>(_AuthrCardNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "LangCode")
    public JAXBElement<String> createLangCode(String value) {
        return new JAXBElement<String>(_LangCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranCode")
    public JAXBElement<String> createTranCode(String value) {
        return new JAXBElement<String>(_TranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "KeyVersionNo")
    public JAXBElement<String> createKeyVersionNo(String value) {
        return new JAXBElement<String>(_KeyVersionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SysOffset1")
    public JAXBElement<String> createSysOffset1(String value) {
        return new JAXBElement<String>(_SysOffset1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SysOffset2")
    public JAXBElement<String> createSysOffset2(String value) {
        return new JAXBElement<String>(_SysOffset2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TargetAdr")
    public JAXBElement<String> createTargetAdr(String value) {
        return new JAXBElement<String>(_TargetAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SourceAdr")
    public JAXBElement<String> createSourceAdr(String value) {
        return new JAXBElement<String>(_SourceAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "MsgEndFlag")
    public JAXBElement<String> createMsgEndFlag(String value) {
        return new JAXBElement<String>(_MsgEndFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "MsgSeqNo")
    public JAXBElement<String> createMsgSeqNo(String value) {
        return new JAXBElement<String>(_MsgSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SubTranCode")
    public JAXBElement<String> createSubTranCode(String value) {
        return new JAXBElement<String>(_SubTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranMode")
    public JAXBElement<String> createTranMode(String value) {
        return new JAXBElement<String>(_TranMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranSerialNo")
    public JAXBElement<String> createTranSerialNo(String value) {
        return new JAXBElement<String>(_TranSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "BackendSeqNo")
    public JAXBElement<String> createBackendSeqNo(String value) {
        return new JAXBElement<String>(_BackendSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "BackendSysId")
    public JAXBElement<String> createBackendSysId(String value) {
        return new JAXBElement<String>(_BackendSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReturnCode")
    public JAXBElement<String> createReturnCode(String value) {
        return new JAXBElement<String>(_ReturnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReturnMsg")
    public JAXBElement<String> createReturnMsg(String value) {
        return new JAXBElement<String>(_ReturnMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "LinkTranCode")
    public JAXBElement<String> createLinkTranCode(String value) {
        return new JAXBElement<String>(_LinkTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SubSvcSysId")
    public JAXBElement<String> createSubSvcSysId(String value) {
        return new JAXBElement<String>(_SubSvcSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SubSvcId")
    public JAXBElement<String> createSubSvcId(String value) {
        return new JAXBElement<String>(_SubSvcId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SubSvcRetCode")
    public JAXBElement<String> createSubSvcRetCode(String value) {
        return new JAXBElement<String>(_SubSvcRetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SubSvcRetMsg")
    public JAXBElement<String> createSubSvcRetMsg(String value) {
        return new JAXBElement<String>(_SubSvcRetMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RsrvContent")
    public JAXBElement<String> createRsrvContent(String value) {
        return new JAXBElement<String>(_RsrvContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqAcntgBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqAcntgBalQry")
    public JAXBElement<ReqAcntgBalQryType> createReqAcntgBalQry(ReqAcntgBalQryType value) {
        return new JAXBElement<ReqAcntgBalQryType>(_ReqAcntgBalQry_QNAME, ReqAcntgBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AcctType")
    public JAXBElement<String> createAcctType(String value) {
        return new JAXBElement<String>(_AcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ClientAcctNo")
    public JAXBElement<String> createClientAcctNo(String value) {
        return new JAXBElement<String>(_ClientAcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "CurrencyId")
    public JAXBElement<String> createCurrencyId(String value) {
        return new JAXBElement<String>(_CurrencyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AcctChar")
    public JAXBElement<String> createAcctChar(String value) {
        return new JAXBElement<String>(_AcctChar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "CashRateFlag")
    public JAXBElement<String> createCashRateFlag(String value) {
        return new JAXBElement<String>(_CashRateFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "PwdCheckType")
    public JAXBElement<String> createPwdCheckType(String value) {
        return new JAXBElement<String>(_PwdCheckType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "TranPwd")
    public JAXBElement<String> createTranPwd(String value) {
        return new JAXBElement<String>(_TranPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspAcntgBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspAcntgBalQry")
    public JAXBElement<RspAcntgBalQryType> createRspAcntgBalQry(RspAcntgBalQryType value) {
        return new JAXBElement<RspAcntgBalQryType>(_RspAcntgBalQry_QNAME, RspAcntgBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "AcctBal")
    public JAXBElement<BigDecimal> createAcctBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AcctBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "BfrLastDayBal")
    public JAXBElement<BigDecimal> createBfrLastDayBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BfrLastDayBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "CntlBal")
    public JAXBElement<BigDecimal> createCntlBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CntlBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "FreezeBal")
    public JAXBElement<BigDecimal> createFreezeBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FreezeBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RsrvBal")
    public JAXBElement<BigDecimal> createRsrvBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RsrvBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ActualBal")
    public JAXBElement<BigDecimal> createActualBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ActualBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "Accrual")
    public JAXBElement<BigDecimal> createAccrual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Accrual_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqCrnAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqCrnAcctBalQry")
    public JAXBElement<ReqCrnAcctBalQryType> createReqCrnAcctBalQry(ReqCrnAcctBalQryType value) {
        return new JAXBElement<ReqCrnAcctBalQryType>(_ReqCrnAcctBalQry_QNAME, ReqCrnAcctBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "QueryType")
    public JAXBElement<String> createQueryType(String value) {
        return new JAXBElement<String>(_QueryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ClientNo")
    public JAXBElement<String> createClientNo(String value) {
        return new JAXBElement<String>(_ClientNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "QueryPwd")
    public JAXBElement<String> createQueryPwd(String value) {
        return new JAXBElement<String>(_QueryPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "CardNo")
    public JAXBElement<String> createCardNo(String value) {
        return new JAXBElement<String>(_CardNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "StartNum1")
    public JAXBElement<Integer> createStartNum1(Integer value) {
        return new JAXBElement<Integer>(_StartNum1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "QueryNum1")
    public JAXBElement<Integer> createQueryNum1(Integer value) {
        return new JAXBElement<Integer>(_QueryNum1_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspCrnAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspCrnAcctBalQry")
    public JAXBElement<RspCrnAcctBalQryType> createRspCrnAcctBalQry(RspCrnAcctBalQryType value) {
        return new JAXBElement<RspCrnAcctBalQryType>(_RspCrnAcctBalQry_QNAME, RspCrnAcctBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ClientCHNName")
    public JAXBElement<String> createClientCHNName(String value) {
        return new JAXBElement<String>(_ClientCHNName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "OpenBranchId")
    public JAXBElement<String> createOpenBranchId(String value) {
        return new JAXBElement<String>(_OpenBranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "FloatMode")
    public JAXBElement<String> createFloatMode(String value) {
        return new JAXBElement<String>(_FloatMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ValidDate")
    public JAXBElement<String> createValidDate(String value) {
        return new JAXBElement<String>(_ValidDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "FloatType")
    public JAXBElement<String> createFloatType(String value) {
        return new JAXBElement<String>(_FloatType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "FloatAmt")
    public JAXBElement<BigDecimal> createFloatAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_FloatAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RecordStatus")
    public JAXBElement<String> createRecordStatus(String value) {
        return new JAXBElement<String>(_RecordStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHistNetChgValMntQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqHistNetChgValMntQry")
    public JAXBElement<ReqHistNetChgValMntQryType> createReqHistNetChgValMntQry(ReqHistNetChgValMntQryType value) {
        return new JAXBElement<ReqHistNetChgValMntQryType>(_ReqHistNetChgValMntQry_QNAME, ReqHistNetChgValMntQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspHistNetChgValMntQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspHistNetChgValMntQry")
    public JAXBElement<RspHistNetChgValMntQryType> createRspHistNetChgValMntQry(RspHistNetChgValMntQryType value) {
        return new JAXBElement<RspHistNetChgValMntQryType>(_RspHistNetChgValMntQry_QNAME, RspHistNetChgValMntQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqTermAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqTermAcctBalQry")
    public JAXBElement<ReqTermAcctBalQryType> createReqTermAcctBalQry(ReqTermAcctBalQryType value) {
        return new JAXBElement<ReqTermAcctBalQryType>(_ReqTermAcctBalQry_QNAME, ReqTermAcctBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "SerialNo")
    public JAXBElement<String> createSerialNo(String value) {
        return new JAXBElement<String>(_SerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "VchrNo")
    public JAXBElement<String> createVchrNo(String value) {
        return new JAXBElement<String>(_VchrNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspTermAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspTermAcctBalQry")
    public JAXBElement<RspTermAcctBalQryType> createRspTermAcctBalQry(RspTermAcctBalQryType value) {
        return new JAXBElement<RspTermAcctBalQryType>(_RspTermAcctBalQry_QNAME, RspTermAcctBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "InrAcctNo")
    public JAXBElement<String> createInrAcctNo(String value) {
        return new JAXBElement<String>(_InrAcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "DepositType")
    public JAXBElement<String> createDepositType(String value) {
        return new JAXBElement<String>(_DepositType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "OpenAcctAmt")
    public JAXBElement<BigDecimal> createOpenAcctAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpenAcctAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "BussBranchId")
    public JAXBElement<String> createBussBranchId(String value) {
        return new JAXBElement<String>(_BussBranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "OpenAcctDate")
    public JAXBElement<String> createOpenAcctDate(String value) {
        return new JAXBElement<String>(_OpenAcctDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ExpiredDate")
    public JAXBElement<String> createExpiredDate(String value) {
        return new JAXBElement<String>(_ExpiredDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "DepositTerm")
    public JAXBElement<String> createDepositTerm(String value) {
        return new JAXBElement<String>(_DepositTerm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "IntRate")
    public JAXBElement<BigDecimal> createIntRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IntRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "StartIntDate")
    public JAXBElement<String> createStartIntDate(String value) {
        return new JAXBElement<String>(_StartIntDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RenewDepFlag")
    public JAXBElement<String> createRenewDepFlag(String value) {
        return new JAXBElement<String>(_RenewDepFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqTmAIOAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "ReqTmAIOAcctBalQry")
    public JAXBElement<ReqTmAIOAcctBalQryType> createReqTmAIOAcctBalQry(ReqTmAIOAcctBalQryType value) {
        return new JAXBElement<ReqTmAIOAcctBalQryType>(_ReqTmAIOAcctBalQry_QNAME, ReqTmAIOAcctBalQryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspTmAIOAcctBalQryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010030004", name = "RspTmAIOAcctBalQry")
    public JAXBElement<RspTmAIOAcctBalQryType> createRspTmAIOAcctBalQry(RspTmAIOAcctBalQryType value) {
        return new JAXBElement<RspTmAIOAcctBalQryType>(_RspTmAIOAcctBalQry_QNAME, RspTmAIOAcctBalQryType.class, null, value);
    }

}
