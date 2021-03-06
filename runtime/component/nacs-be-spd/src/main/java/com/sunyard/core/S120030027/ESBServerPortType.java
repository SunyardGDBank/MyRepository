package com.sunyard.core.S120030027;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:14:18.356+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://esb.spdbbiz.com/services/S120030027/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBServerPortType {

    @WebMethod(operationName = "StmtSendInfoQry", action = "urn:/StmtSendInfoQry")
    @WebResult(name = "RspStmtSendInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspStmtSendInfoQry")
    public RspStmtSendInfoQryType stmtSendInfoQry(
            @WebParam(partName = "ReqStmtSendInfoQry", name = "ReqStmtSendInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqStmtSendInfoQryType reqStmtSendInfoQry
    );

    @WebMethod(operationName = "LvlInfoQry", action = "urn:/LvlInfoQry")
    @WebResult(name = "RspLvlInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspLvlInfoQry")
    public RspLvlInfoQryType lvlInfoQry(
            @WebParam(partName = "ReqLvlInfoQry", name = "ReqLvlInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqLvlInfoQryType reqLvlInfoQry
    );

    @WebMethod(operationName = "RelPersonQry", action = "urn:/RelPersonQry")
    @WebResult(name = "RspRelPersonQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspRelPersonQry")
    public RspRelPersonQryType relPersonQry(
            @WebParam(partName = "ReqRelPersonQry", name = "ReqRelPersonQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqRelPersonQryType reqRelPersonQry
    );

    @WebMethod(operationName = "ClntCtfQry", action = "urn:/ClntCtfQry")
    @WebResult(name = "RspClntCtfQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspClntCtfQry")
    public RspClntCtfQryType clntCtfQry(
            @WebParam(partName = "ReqClntCtfQry", name = "ReqClntCtfQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqClntCtfQryType reqClntCtfQry
    );

    @WebMethod(operationName = "PrhbtOpenAcctListQry", action = "urn:/PrhbtOpenAcctListQry")
    @WebResult(name = "RspPrhbtOpenAcctListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspPrhbtOpenAcctListQry")
    public RspPrhbtOpenAcctListQryType prhbtOpenAcctListQry(
            @WebParam(partName = "ReqPrhbtOpenAcctListQry", name = "ReqPrhbtOpenAcctListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqPrhbtOpenAcctListQryType reqPrhbtOpenAcctListQry
    );

    @WebMethod(operationName = "AttentionListQry", action = "urn:/AttentionListQry")
    @WebResult(name = "RspAttentionListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspAttentionListQry")
    public RspAttentionListQryType attentionListQry(
            @WebParam(partName = "ReqAttentionListQry", name = "ReqAttentionListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqAttentionListQryType reqAttentionListQry
    );

    @WebMethod(operationName = "AlikeClntQry", action = "urn:/AlikeClntQry")
    @WebResult(name = "RspAlikeClntQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspAlikeClntQry")
    public RspAlikeClntQryType alikeClntQry(
            @WebParam(partName = "ReqAlikeClntQry", name = "ReqAlikeClntQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqAlikeClntQryType reqAlikeClntQry
    );

    @WebMethod(operationName = "MultiClntInfoQry", action = "urn:/MultiClntInfoQry")
    @WebResult(name = "RspMultiClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspMultiClntInfoQry")
    public RspMultiClntInfoQryType multiClntInfoQry(
            @WebParam(partName = "ReqMultiClntInfoQry", name = "ReqMultiClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqMultiClntInfoQryType reqMultiClntInfoQry
    );

    @WebMethod(operationName = "CtcInfoQry", action = "urn:/CtcInfoQry")
    @WebResult(name = "RspCtcInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspCtcInfoQry")
    public RspCtcInfoQryType ctcInfoQry(
            @WebParam(partName = "ReqCtcInfoQry", name = "ReqCtcInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqCtcInfoQryType reqCtcInfoQry
    );

    @WebMethod(operationName = "SimpClntInfoQryByCtfNo", action = "urn:/SimpClntInfoQryByCtfNo")
    @WebResult(name = "RspSimpClntInfoQryByCtfNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspSimpClntInfoQryByCtfNo")
    public RspSimpClntInfoQryByCtfNoType simpClntInfoQryByCtfNo(
            @WebParam(partName = "ReqSimpClntInfoQryByCtfNo", name = "ReqSimpClntInfoQryByCtfNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqSimpClntInfoQryByCtfNoType reqSimpClntInfoQryByCtfNo
    );

    @WebMethod(operationName = "SpclListQry", action = "urn:/SpclListQry")
    @WebResult(name = "RspSpclListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspSpclListQry")
    public RspSpclListQryType spclListQry(
            @WebParam(partName = "ReqSpclListQry", name = "ReqSpclListQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqSpclListQryType reqSpclListQry
    );

    @WebMethod(operationName = "OTmsTranClntInfoQry", action = "urn:/OTmsTranClntInfoQry")
    @WebResult(name = "RspOTmsTranClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspOTmsTranClntInfoQry")
    public RspOTmsTranClntInfoQryType oTmsTranClntInfoQry(
            @WebParam(partName = "ReqOTmsTranClntInfoQry", name = "ReqOTmsTranClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqOTmsTranClntInfoQryType reqOTmsTranClntInfoQry
    );

    @WebMethod(operationName = "SmlMicroClntFlagQry", action = "urn:/SmlMicroClntFlagQry")
    @WebResult(name = "RspSmlMicroClntFlagQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspSmlMicroClntFlagQry")
    public RspSmlMicroClntFlagQryType smlMicroClntFlagQry(
            @WebParam(partName = "ReqSmlMicroClntFlagQry", name = "ReqSmlMicroClntFlagQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqSmlMicroClntFlagQryType reqSmlMicroClntFlagQry
    );

    @WebMethod(operationName = "ClntNoQryByClntAcctNo", action = "urn:/ClntNoQryByClntAcctNo")
    @WebResult(name = "RspClntNoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspClntNoQryByClntAcctNo")
    public RspClntNoQryByClntAcctNoType clntNoQryByClntAcctNo(
            @WebParam(partName = "ReqClntNoQryByClntAcctNo", name = "ReqClntNoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqClntNoQryByClntAcctNoType reqClntNoQryByClntAcctNo
    );

    @WebMethod(operationName = "RiskInfoQry", action = "urn:/RiskInfoQry")
    @WebResult(name = "RspRiskInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspRiskInfoQry")
    public RspRiskInfoQryType riskInfoQry(
            @WebParam(partName = "ReqRiskInfoQry", name = "ReqRiskInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqRiskInfoQryType reqRiskInfoQry
    );

    @WebMethod(operationName = "FncInfoQry", action = "urn:/FncInfoQry")
    @WebResult(name = "RspFncInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspFncInfoQry")
    public RspFncInfoQryType fncInfoQry(
            @WebParam(partName = "ReqFncInfoQry", name = "ReqFncInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqFncInfoQryType reqFncInfoQry
    );

    @WebMethod(operationName = "SimpClntInfoQryByClntAcctNo", action = "urn:/SimpClntInfoQryByClntAcctNo")
    @WebResult(name = "RspSimpClntInfoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspSimpClntInfoQryByClntAcctNo")
    public RspSimpClntInfoQryByClntAcctNoType simpClntInfoQryByClntAcctNo(
            @WebParam(partName = "ReqSimpClntInfoQryByClntAcctNo", name = "ReqSimpClntInfoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqSimpClntInfoQryByClntAcctNoType reqSimpClntInfoQryByClntAcctNo
    );

    @WebMethod(operationName = "ClntLblInfoQry", action = "urn:/ClntLblInfoQry")
    @WebResult(name = "RspClntLblInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspClntLblInfoQry")
    public RspClntLblInfoQryType clntLblInfoQry(
            @WebParam(partName = "ReqClntLblInfoQry", name = "ReqClntLblInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqClntLblInfoQryType reqClntLblInfoQry
    );

    @WebMethod(operationName = "SpclClntSetAndQry", action = "urn:/SpclClntSetAndQry")
    @WebResult(name = "RspSpclClntSetAndQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspSpclClntSetAndQry")
    public RspSpclClntSetAndQryType spclClntSetAndQry(
            @WebParam(partName = "ReqSpclClntSetAndQry", name = "ReqSpclClntSetAndQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqSpclClntSetAndQryType reqSpclClntSetAndQry
    );

    @WebMethod(operationName = "ClntInfoQryByClntAcctNo", action = "urn:/ClntInfoQryByClntAcctNo")
    @WebResult(name = "RspClntInfoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspClntInfoQryByClntAcctNo")
    public RspClntInfoQryByClntAcctNoType clntInfoQryByClntAcctNo(
            @WebParam(partName = "ReqClntInfoQryByClntAcctNo", name = "ReqClntInfoQryByClntAcctNo", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqClntInfoQryByClntAcctNoType reqClntInfoQryByClntAcctNo
    );

    @WebMethod(operationName = "NonPerfAcctClntInfoQry", action = "urn:/NonPerfAcctClntInfoQry")
    @WebResult(name = "RspNonPerfAcctClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspNonPerfAcctClntInfoQry")
    public RspNonPerfAcctClntInfoQryType nonPerfAcctClntInfoQry(
            @WebParam(partName = "ReqNonPerfAcctClntInfoQry", name = "ReqNonPerfAcctClntInfoQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqNonPerfAcctClntInfoQryType reqNonPerfAcctClntInfoQry
    );

    @WebMethod(operationName = "ClntAdrQry", action = "urn:/ClntAdrQry")
    @WebResult(name = "RspClntAdrQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027", partName = "RspClntAdrQry")
    public RspClntAdrQryType clntAdrQry(
            @WebParam(partName = "ReqClntAdrQry", name = "ReqClntAdrQry", targetNamespace = "http://esb.spdbbiz.com/services/S120030027")
                    ReqClntAdrQryType reqClntAdrQry
    );
}
