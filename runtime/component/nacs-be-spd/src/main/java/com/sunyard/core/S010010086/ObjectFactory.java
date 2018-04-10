
package com.sunyard.core.S010010086;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunyard.core.S010010086 package. 
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

    private final static QName _ReqHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ReqHeader");
    private final static QName _RspHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "RspHeader");
    private final static QName _TranDate_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranDate");
    private final static QName _TranTime_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranTime");
    private final static QName _TranTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranTellerNo");
    private final static QName _TranSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranSeqNo");
    private final static QName _ConsumerId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ConsumerId");
    private final static QName _GlobalSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "GlobalSeqNo");
    private final static QName _SourceSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SourceSysId");
    private final static QName _BranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "BranchId");
    private final static QName _TerminalCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TerminalCode");
    private final static QName _CityCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "CityCode");
    private final static QName _AuthrTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AuthrTellerNo");
    private final static QName _AuthrPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AuthrPwd");
    private final static QName _AuthrCardFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AuthrCardFlag");
    private final static QName _AuthrCardNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AuthrCardNo");
    private final static QName _LangCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "LangCode");
    private final static QName _TranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranCode");
    private final static QName _PIN_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "PIN");
    private final static QName _KeyVersionNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "KeyVersionNo");
    private final static QName _SysOffset1_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SysOffset1");
    private final static QName _SysOffset2_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SysOffset2");
    private final static QName _TargetAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TargetAdr");
    private final static QName _SourceAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SourceAdr");
    private final static QName _MsgEndFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "MsgEndFlag");
    private final static QName _MsgSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "MsgSeqNo");
    private final static QName _SubTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SubTranCode");
    private final static QName _TranMode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranMode");
    private final static QName _TranSerialNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranSerialNo");
    private final static QName _BackendSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "BackendSeqNo");
    private final static QName _BackendSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "BackendSysId");
    private final static QName _ReturnCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ReturnCode");
    private final static QName _ReturnMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ReturnMsg");
    private final static QName _LinkTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "LinkTranCode");
    private final static QName _SubSvcSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SubSvcSysId");
    private final static QName _SubSvcId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SubSvcId");
    private final static QName _SubSvcRetCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SubSvcRetCode");
    private final static QName _SubSvcRetMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "SubSvcRetMsg");
    private final static QName _RsrvContent_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "RsrvContent");
    private final static QName _ReqLcyFcyDmdSvgCashTlly_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ReqLcyFcyDmdSvgCashTlly");
    private final static QName _AgnclBussId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AgnclBussId");
    private final static QName _RcvPyFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "RcvPyFlag");
    private final static QName _IputMode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "IputMode");
    private final static QName _AcctType_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AcctType");
    private final static QName _ClientAcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ClientAcctNo");
    private final static QName _AcctChar_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AcctChar");
    private final static QName _PymtCd_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "PymtCd");
    private final static QName _TranPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranPwd");
    private final static QName _VchrNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "VchrNo");
    private final static QName _CurrencyId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "CurrencyId");
    private final static QName _CashRateFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "CashRateFlag");
    private final static QName _TranAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TranAmt");
    private final static QName _CtfType_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "CtfType");
    private final static QName _CtfId_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "CtfId");
    private final static QName _AbstractCode_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AbstractCode");
    private final static QName _Track2_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "Track2");
    private final static QName _TrackThrd_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "TrackThrd");
    private final static QName _RspLcyFcyDmdSvgCashTlly_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "RspLcyFcyDmdSvgCashTlly");
    private final static QName _ClientNo_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "ClientNo");
    private final static QName _AcctCHNName_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AcctCHNName");
    private final static QName _AcctBal_QNAME = new QName("http://esb.spdbbiz.com/services/S010010086", "AcctBal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunyard.core.S010010086
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RspLcyFcyDmdSvgCashTllyType }
     * 
     */
    public RspLcyFcyDmdSvgCashTllyType createRspLcyFcyDmdSvgCashTllyType() {
        return new RspLcyFcyDmdSvgCashTllyType();
    }

    /**
     * Create an instance of {@link ReqLcyFcyDmdSvgCashTllyType }
     * 
     */
    public ReqLcyFcyDmdSvgCashTllyType createReqLcyFcyDmdSvgCashTllyType() {
        return new ReqLcyFcyDmdSvgCashTllyType();
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
     * Create an instance of {@link RspLcyFcyDmdSvgCashTllyType.SvcBody }
     * 
     */
    public RspLcyFcyDmdSvgCashTllyType.SvcBody createRspLcyFcyDmdSvgCashTllyTypeSvcBody() {
        return new RspLcyFcyDmdSvgCashTllyType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqLcyFcyDmdSvgCashTllyType.SvcBody }
     * 
     */
    public ReqLcyFcyDmdSvgCashTllyType.SvcBody createReqLcyFcyDmdSvgCashTllyTypeSvcBody() {
        return new ReqLcyFcyDmdSvgCashTllyType.SvcBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ReqHeader")
    public JAXBElement<ReqHeaderType> createReqHeader(ReqHeaderType value) {
        return new JAXBElement<ReqHeaderType>(_ReqHeader_QNAME, ReqHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "RspHeader")
    public JAXBElement<RspHeaderType> createRspHeader(RspHeaderType value) {
        return new JAXBElement<RspHeaderType>(_RspHeader_QNAME, RspHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranDate")
    public JAXBElement<String> createTranDate(String value) {
        return new JAXBElement<String>(_TranDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranTime")
    public JAXBElement<String> createTranTime(String value) {
        return new JAXBElement<String>(_TranTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranTellerNo")
    public JAXBElement<String> createTranTellerNo(String value) {
        return new JAXBElement<String>(_TranTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranSeqNo")
    public JAXBElement<String> createTranSeqNo(String value) {
        return new JAXBElement<String>(_TranSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ConsumerId")
    public JAXBElement<String> createConsumerId(String value) {
        return new JAXBElement<String>(_ConsumerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "GlobalSeqNo")
    public JAXBElement<String> createGlobalSeqNo(String value) {
        return new JAXBElement<String>(_GlobalSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SourceSysId")
    public JAXBElement<String> createSourceSysId(String value) {
        return new JAXBElement<String>(_SourceSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "BranchId")
    public JAXBElement<String> createBranchId(String value) {
        return new JAXBElement<String>(_BranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TerminalCode")
    public JAXBElement<String> createTerminalCode(String value) {
        return new JAXBElement<String>(_TerminalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "CityCode")
    public JAXBElement<String> createCityCode(String value) {
        return new JAXBElement<String>(_CityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AuthrTellerNo")
    public JAXBElement<String> createAuthrTellerNo(String value) {
        return new JAXBElement<String>(_AuthrTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AuthrPwd")
    public JAXBElement<String> createAuthrPwd(String value) {
        return new JAXBElement<String>(_AuthrPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AuthrCardFlag")
    public JAXBElement<String> createAuthrCardFlag(String value) {
        return new JAXBElement<String>(_AuthrCardFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AuthrCardNo")
    public JAXBElement<String> createAuthrCardNo(String value) {
        return new JAXBElement<String>(_AuthrCardNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "LangCode")
    public JAXBElement<String> createLangCode(String value) {
        return new JAXBElement<String>(_LangCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranCode")
    public JAXBElement<String> createTranCode(String value) {
        return new JAXBElement<String>(_TranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "KeyVersionNo")
    public JAXBElement<String> createKeyVersionNo(String value) {
        return new JAXBElement<String>(_KeyVersionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SysOffset1")
    public JAXBElement<String> createSysOffset1(String value) {
        return new JAXBElement<String>(_SysOffset1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SysOffset2")
    public JAXBElement<String> createSysOffset2(String value) {
        return new JAXBElement<String>(_SysOffset2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TargetAdr")
    public JAXBElement<String> createTargetAdr(String value) {
        return new JAXBElement<String>(_TargetAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SourceAdr")
    public JAXBElement<String> createSourceAdr(String value) {
        return new JAXBElement<String>(_SourceAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "MsgEndFlag")
    public JAXBElement<String> createMsgEndFlag(String value) {
        return new JAXBElement<String>(_MsgEndFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "MsgSeqNo")
    public JAXBElement<String> createMsgSeqNo(String value) {
        return new JAXBElement<String>(_MsgSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SubTranCode")
    public JAXBElement<String> createSubTranCode(String value) {
        return new JAXBElement<String>(_SubTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranMode")
    public JAXBElement<String> createTranMode(String value) {
        return new JAXBElement<String>(_TranMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranSerialNo")
    public JAXBElement<String> createTranSerialNo(String value) {
        return new JAXBElement<String>(_TranSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "BackendSeqNo")
    public JAXBElement<String> createBackendSeqNo(String value) {
        return new JAXBElement<String>(_BackendSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "BackendSysId")
    public JAXBElement<String> createBackendSysId(String value) {
        return new JAXBElement<String>(_BackendSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ReturnCode")
    public JAXBElement<String> createReturnCode(String value) {
        return new JAXBElement<String>(_ReturnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ReturnMsg")
    public JAXBElement<String> createReturnMsg(String value) {
        return new JAXBElement<String>(_ReturnMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "LinkTranCode")
    public JAXBElement<String> createLinkTranCode(String value) {
        return new JAXBElement<String>(_LinkTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SubSvcSysId")
    public JAXBElement<String> createSubSvcSysId(String value) {
        return new JAXBElement<String>(_SubSvcSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SubSvcId")
    public JAXBElement<String> createSubSvcId(String value) {
        return new JAXBElement<String>(_SubSvcId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SubSvcRetCode")
    public JAXBElement<String> createSubSvcRetCode(String value) {
        return new JAXBElement<String>(_SubSvcRetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "SubSvcRetMsg")
    public JAXBElement<String> createSubSvcRetMsg(String value) {
        return new JAXBElement<String>(_SubSvcRetMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "RsrvContent")
    public JAXBElement<String> createRsrvContent(String value) {
        return new JAXBElement<String>(_RsrvContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqLcyFcyDmdSvgCashTllyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ReqLcyFcyDmdSvgCashTlly")
    public JAXBElement<ReqLcyFcyDmdSvgCashTllyType> createReqLcyFcyDmdSvgCashTlly(ReqLcyFcyDmdSvgCashTllyType value) {
        return new JAXBElement<ReqLcyFcyDmdSvgCashTllyType>(_ReqLcyFcyDmdSvgCashTlly_QNAME, ReqLcyFcyDmdSvgCashTllyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AgnclBussId")
    public JAXBElement<String> createAgnclBussId(String value) {
        return new JAXBElement<String>(_AgnclBussId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "RcvPyFlag")
    public JAXBElement<String> createRcvPyFlag(String value) {
        return new JAXBElement<String>(_RcvPyFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "IputMode")
    public JAXBElement<String> createIputMode(String value) {
        return new JAXBElement<String>(_IputMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AcctType")
    public JAXBElement<String> createAcctType(String value) {
        return new JAXBElement<String>(_AcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ClientAcctNo")
    public JAXBElement<String> createClientAcctNo(String value) {
        return new JAXBElement<String>(_ClientAcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AcctChar")
    public JAXBElement<String> createAcctChar(String value) {
        return new JAXBElement<String>(_AcctChar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "PymtCd")
    public JAXBElement<String> createPymtCd(String value) {
        return new JAXBElement<String>(_PymtCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranPwd")
    public JAXBElement<String> createTranPwd(String value) {
        return new JAXBElement<String>(_TranPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "VchrNo")
    public JAXBElement<String> createVchrNo(String value) {
        return new JAXBElement<String>(_VchrNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "CurrencyId")
    public JAXBElement<String> createCurrencyId(String value) {
        return new JAXBElement<String>(_CurrencyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "CashRateFlag")
    public JAXBElement<String> createCashRateFlag(String value) {
        return new JAXBElement<String>(_CashRateFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TranAmt")
    public JAXBElement<BigDecimal> createTranAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TranAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "CtfType")
    public JAXBElement<String> createCtfType(String value) {
        return new JAXBElement<String>(_CtfType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "CtfId")
    public JAXBElement<String> createCtfId(String value) {
        return new JAXBElement<String>(_CtfId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AbstractCode")
    public JAXBElement<String> createAbstractCode(String value) {
        return new JAXBElement<String>(_AbstractCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "Track2")
    public JAXBElement<String> createTrack2(String value) {
        return new JAXBElement<String>(_Track2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "TrackThrd")
    public JAXBElement<String> createTrackThrd(String value) {
        return new JAXBElement<String>(_TrackThrd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspLcyFcyDmdSvgCashTllyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "RspLcyFcyDmdSvgCashTlly")
    public JAXBElement<RspLcyFcyDmdSvgCashTllyType> createRspLcyFcyDmdSvgCashTlly(RspLcyFcyDmdSvgCashTllyType value) {
        return new JAXBElement<RspLcyFcyDmdSvgCashTllyType>(_RspLcyFcyDmdSvgCashTlly_QNAME, RspLcyFcyDmdSvgCashTllyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "ClientNo")
    public JAXBElement<String> createClientNo(String value) {
        return new JAXBElement<String>(_ClientNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AcctCHNName")
    public JAXBElement<String> createAcctCHNName(String value) {
        return new JAXBElement<String>(_AcctCHNName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S010010086", name = "AcctBal")
    public JAXBElement<BigDecimal> createAcctBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AcctBal_QNAME, BigDecimal.class, null, value);
    }

}
