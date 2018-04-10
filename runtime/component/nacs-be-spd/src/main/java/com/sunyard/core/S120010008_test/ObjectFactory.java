
package com.sunyard.core.S120010008_test;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunyard.core.S120010008_test package. 
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

    private final static QName _ReqHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ReqHeader");
    private final static QName _RspHeader_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "RspHeader");
    private final static QName _TranDate_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranDate");
    private final static QName _TranTime_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranTime");
    private final static QName _TranTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranTellerNo");
    private final static QName _TranSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranSeqNo");
    private final static QName _ConsumerId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ConsumerId");
    private final static QName _GlobalSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "GlobalSeqNo");
    private final static QName _SourceSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SourceSysId");
    private final static QName _BranchId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "BranchId");
    private final static QName _TerminalCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TerminalCode");
    private final static QName _CityCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "CityCode");
    private final static QName _AuthrTellerNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AuthrTellerNo");
    private final static QName _AuthrPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AuthrPwd");
    private final static QName _AuthrCardFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AuthrCardFlag");
    private final static QName _AuthrCardNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AuthrCardNo");
    private final static QName _LangCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "LangCode");
    private final static QName _TranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranCode");
    private final static QName _PIN_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "PIN");
    private final static QName _KeyVersionNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "KeyVersionNo");
    private final static QName _SysOffset1_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SysOffset1");
    private final static QName _SysOffset2_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SysOffset2");
    private final static QName _TargetAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TargetAdr");
    private final static QName _SourceAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SourceAdr");
    private final static QName _MsgEndFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "MsgEndFlag");
    private final static QName _MsgSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "MsgSeqNo");
    private final static QName _SubTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SubTranCode");
    private final static QName _TranMode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranMode");
    private final static QName _TranSerialNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranSerialNo");
    private final static QName _BackendSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "BackendSeqNo");
    private final static QName _BackendSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "BackendSysId");
    private final static QName _ReturnCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ReturnCode");
    private final static QName _ReturnMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ReturnMsg");
    private final static QName _LinkTranCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "LinkTranCode");
    private final static QName _SubSvcSysId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SubSvcSysId");
    private final static QName _SubSvcId_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SubSvcId");
    private final static QName _SubSvcRetCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SubSvcRetCode");
    private final static QName _SubSvcRetMsg_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "SubSvcRetMsg");
    private final static QName _RsrvContent_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "RsrvContent");
    private final static QName _ReqExtSnglTfr_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ReqExtSnglTfr");
    private final static QName _AgentBussNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AgentBussNo");
    private final static QName _OutAcctType_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "OutAcctType");
    private final static QName _OutAcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "OutAcctNo");
    private final static QName _OutAcctChar_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "OutAcctChar");
    private final static QName _PwdCheckType_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "PwdCheckType");
    private final static QName _TranPwd_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranPwd");
    private final static QName _InAcctType_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "InAcctType");
    private final static QName _InAcctNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "InAcctNo");
    private final static QName _InAcctChar_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "InAcctChar");
    private final static QName _VchrNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "VchrNo");
    private final static QName _Ccy_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "Ccy");
    private final static QName _CashRateFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "CashRateFlag");
    private final static QName _TranAmt_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "TranAmt");
    private final static QName _AbstractCode_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "AbstractCode");
    private final static QName _Track2_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "Track2");
    private final static QName _Track3_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "Track3");
    private final static QName _CashTranFlag_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "CashTranFlag");
    private final static QName _ThirdPartyAdr_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ThirdPartyAdr");
    private final static QName _ThirdPartyUserNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ThirdPartyUserNo");
    private final static QName _ProductNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "ProductNo");
    private final static QName _RspExtSnglTfr_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "RspExtSnglTfr");
    private final static QName _OutAcctName_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "OutAcctName");
    private final static QName _OutAcctBal_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "OutAcctBal");
    private final static QName _InAcctName_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "InAcctName");
    private final static QName _InAcctBal_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "InAcctBal");
    private final static QName _HostSeqNo_QNAME = new QName("http://esb.spdbbiz.com/services/S120010008", "HostSeqNo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunyard.core.S120010008_test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RspExtSnglTfrType }
     * 
     */
    public RspExtSnglTfrType createRspExtSnglTfrType() {
        return new RspExtSnglTfrType();
    }

    /**
     * Create an instance of {@link ReqExtSnglTfrType }
     * 
     */
    public ReqExtSnglTfrType createReqExtSnglTfrType() {
        return new ReqExtSnglTfrType();
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
     * Create an instance of {@link RspExtSnglTfrType.SvcBody }
     * 
     */
    public RspExtSnglTfrType.SvcBody createRspExtSnglTfrTypeSvcBody() {
        return new RspExtSnglTfrType.SvcBody();
    }

    /**
     * Create an instance of {@link ReqExtSnglTfrType.SvcBody }
     * 
     */
    public ReqExtSnglTfrType.SvcBody createReqExtSnglTfrTypeSvcBody() {
        return new ReqExtSnglTfrType.SvcBody();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ReqHeader")
    public JAXBElement<ReqHeaderType> createReqHeader(ReqHeaderType value) {
        return new JAXBElement<ReqHeaderType>(_ReqHeader_QNAME, ReqHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "RspHeader")
    public JAXBElement<RspHeaderType> createRspHeader(RspHeaderType value) {
        return new JAXBElement<RspHeaderType>(_RspHeader_QNAME, RspHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranDate")
    public JAXBElement<String> createTranDate(String value) {
        return new JAXBElement<String>(_TranDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranTime")
    public JAXBElement<String> createTranTime(String value) {
        return new JAXBElement<String>(_TranTime_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranTellerNo")
    public JAXBElement<String> createTranTellerNo(String value) {
        return new JAXBElement<String>(_TranTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranSeqNo")
    public JAXBElement<String> createTranSeqNo(String value) {
        return new JAXBElement<String>(_TranSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ConsumerId")
    public JAXBElement<String> createConsumerId(String value) {
        return new JAXBElement<String>(_ConsumerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "GlobalSeqNo")
    public JAXBElement<String> createGlobalSeqNo(String value) {
        return new JAXBElement<String>(_GlobalSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SourceSysId")
    public JAXBElement<String> createSourceSysId(String value) {
        return new JAXBElement<String>(_SourceSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "BranchId")
    public JAXBElement<String> createBranchId(String value) {
        return new JAXBElement<String>(_BranchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TerminalCode")
    public JAXBElement<String> createTerminalCode(String value) {
        return new JAXBElement<String>(_TerminalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "CityCode")
    public JAXBElement<String> createCityCode(String value) {
        return new JAXBElement<String>(_CityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AuthrTellerNo")
    public JAXBElement<String> createAuthrTellerNo(String value) {
        return new JAXBElement<String>(_AuthrTellerNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AuthrPwd")
    public JAXBElement<String> createAuthrPwd(String value) {
        return new JAXBElement<String>(_AuthrPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AuthrCardFlag")
    public JAXBElement<String> createAuthrCardFlag(String value) {
        return new JAXBElement<String>(_AuthrCardFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AuthrCardNo")
    public JAXBElement<String> createAuthrCardNo(String value) {
        return new JAXBElement<String>(_AuthrCardNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "LangCode")
    public JAXBElement<String> createLangCode(String value) {
        return new JAXBElement<String>(_LangCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranCode")
    public JAXBElement<String> createTranCode(String value) {
        return new JAXBElement<String>(_TranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "KeyVersionNo")
    public JAXBElement<String> createKeyVersionNo(String value) {
        return new JAXBElement<String>(_KeyVersionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SysOffset1")
    public JAXBElement<String> createSysOffset1(String value) {
        return new JAXBElement<String>(_SysOffset1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SysOffset2")
    public JAXBElement<String> createSysOffset2(String value) {
        return new JAXBElement<String>(_SysOffset2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TargetAdr")
    public JAXBElement<String> createTargetAdr(String value) {
        return new JAXBElement<String>(_TargetAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SourceAdr")
    public JAXBElement<String> createSourceAdr(String value) {
        return new JAXBElement<String>(_SourceAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "MsgEndFlag")
    public JAXBElement<String> createMsgEndFlag(String value) {
        return new JAXBElement<String>(_MsgEndFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "MsgSeqNo")
    public JAXBElement<String> createMsgSeqNo(String value) {
        return new JAXBElement<String>(_MsgSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SubTranCode")
    public JAXBElement<String> createSubTranCode(String value) {
        return new JAXBElement<String>(_SubTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranMode")
    public JAXBElement<String> createTranMode(String value) {
        return new JAXBElement<String>(_TranMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranSerialNo")
    public JAXBElement<String> createTranSerialNo(String value) {
        return new JAXBElement<String>(_TranSerialNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "BackendSeqNo")
    public JAXBElement<String> createBackendSeqNo(String value) {
        return new JAXBElement<String>(_BackendSeqNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "BackendSysId")
    public JAXBElement<String> createBackendSysId(String value) {
        return new JAXBElement<String>(_BackendSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ReturnCode")
    public JAXBElement<String> createReturnCode(String value) {
        return new JAXBElement<String>(_ReturnCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ReturnMsg")
    public JAXBElement<String> createReturnMsg(String value) {
        return new JAXBElement<String>(_ReturnMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "LinkTranCode")
    public JAXBElement<String> createLinkTranCode(String value) {
        return new JAXBElement<String>(_LinkTranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SubSvcSysId")
    public JAXBElement<String> createSubSvcSysId(String value) {
        return new JAXBElement<String>(_SubSvcSysId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SubSvcId")
    public JAXBElement<String> createSubSvcId(String value) {
        return new JAXBElement<String>(_SubSvcId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SubSvcRetCode")
    public JAXBElement<String> createSubSvcRetCode(String value) {
        return new JAXBElement<String>(_SubSvcRetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "SubSvcRetMsg")
    public JAXBElement<String> createSubSvcRetMsg(String value) {
        return new JAXBElement<String>(_SubSvcRetMsg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "RsrvContent")
    public JAXBElement<String> createRsrvContent(String value) {
        return new JAXBElement<String>(_RsrvContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqExtSnglTfrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ReqExtSnglTfr")
    public JAXBElement<ReqExtSnglTfrType> createReqExtSnglTfr(ReqExtSnglTfrType value) {
        return new JAXBElement<ReqExtSnglTfrType>(_ReqExtSnglTfr_QNAME, ReqExtSnglTfrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AgentBussNo")
    public JAXBElement<String> createAgentBussNo(String value) {
        return new JAXBElement<String>(_AgentBussNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "OutAcctType")
    public JAXBElement<String> createOutAcctType(String value) {
        return new JAXBElement<String>(_OutAcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "OutAcctNo")
    public JAXBElement<String> createOutAcctNo(String value) {
        return new JAXBElement<String>(_OutAcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "OutAcctChar")
    public JAXBElement<String> createOutAcctChar(String value) {
        return new JAXBElement<String>(_OutAcctChar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "PwdCheckType")
    public JAXBElement<String> createPwdCheckType(String value) {
        return new JAXBElement<String>(_PwdCheckType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranPwd")
    public JAXBElement<String> createTranPwd(String value) {
        return new JAXBElement<String>(_TranPwd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "InAcctType")
    public JAXBElement<String> createInAcctType(String value) {
        return new JAXBElement<String>(_InAcctType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "InAcctNo")
    public JAXBElement<String> createInAcctNo(String value) {
        return new JAXBElement<String>(_InAcctNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "InAcctChar")
    public JAXBElement<String> createInAcctChar(String value) {
        return new JAXBElement<String>(_InAcctChar_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "VchrNo")
    public JAXBElement<String> createVchrNo(String value) {
        return new JAXBElement<String>(_VchrNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "Ccy")
    public JAXBElement<String> createCcy(String value) {
        return new JAXBElement<String>(_Ccy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "CashRateFlag")
    public JAXBElement<String> createCashRateFlag(String value) {
        return new JAXBElement<String>(_CashRateFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "TranAmt")
    public JAXBElement<BigDecimal> createTranAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TranAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "AbstractCode")
    public JAXBElement<String> createAbstractCode(String value) {
        return new JAXBElement<String>(_AbstractCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "Track2")
    public JAXBElement<String> createTrack2(String value) {
        return new JAXBElement<String>(_Track2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "Track3")
    public JAXBElement<String> createTrack3(String value) {
        return new JAXBElement<String>(_Track3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "CashTranFlag")
    public JAXBElement<String> createCashTranFlag(String value) {
        return new JAXBElement<String>(_CashTranFlag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ThirdPartyAdr")
    public JAXBElement<String> createThirdPartyAdr(String value) {
        return new JAXBElement<String>(_ThirdPartyAdr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ThirdPartyUserNo")
    public JAXBElement<String> createThirdPartyUserNo(String value) {
        return new JAXBElement<String>(_ThirdPartyUserNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "ProductNo")
    public JAXBElement<String> createProductNo(String value) {
        return new JAXBElement<String>(_ProductNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RspExtSnglTfrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "RspExtSnglTfr")
    public JAXBElement<RspExtSnglTfrType> createRspExtSnglTfr(RspExtSnglTfrType value) {
        return new JAXBElement<RspExtSnglTfrType>(_RspExtSnglTfr_QNAME, RspExtSnglTfrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "OutAcctName")
    public JAXBElement<String> createOutAcctName(String value) {
        return new JAXBElement<String>(_OutAcctName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "OutAcctBal")
    public JAXBElement<BigDecimal> createOutAcctBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OutAcctBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "InAcctName")
    public JAXBElement<String> createInAcctName(String value) {
        return new JAXBElement<String>(_InAcctName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "InAcctBal")
    public JAXBElement<BigDecimal> createInAcctBal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InAcctBal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://esb.spdbbiz.com/services/S120010008", name = "HostSeqNo")
    public JAXBElement<String> createHostSeqNo(String value) {
        return new JAXBElement<String>(_HostSeqNo_QNAME, String.class, null, value);
    }

}
