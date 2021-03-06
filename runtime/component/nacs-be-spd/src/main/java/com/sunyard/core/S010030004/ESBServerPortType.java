package com.sunyard.core.S010030004;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:11:52.054+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://esb.spdbbiz.com/services/S010030004/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBServerPortType {

    @WebMethod(operationName = "TmAIOAcctBalQry", action = "urn:/TmAIOAcctBalQry")
    @WebResult(name = "RspTmAIOAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004", partName = "RspTmAIOAcctBalQry")
    public RspTmAIOAcctBalQryType tmAIOAcctBalQry(
            @WebParam(partName = "ReqTmAIOAcctBalQry", name = "ReqTmAIOAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004")
                    ReqTmAIOAcctBalQryType reqTmAIOAcctBalQry
    );

    @WebMethod(operationName = "CrnAcctBalQry", action = "urn:/CrnAcctBalQry")
    @WebResult(name = "RspCrnAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004", partName = "RspCrnAcctBalQry")
    public RspCrnAcctBalQryType crnAcctBalQry(
            @WebParam(partName = "ReqCrnAcctBalQry", name = "ReqCrnAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004")
                    ReqCrnAcctBalQryType reqCrnAcctBalQry
    );

    @WebMethod(operationName = "TermAcctBalQry", action = "urn:/TermAcctBalQry")
    @WebResult(name = "RspTermAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004", partName = "RspTermAcctBalQry")
    public RspTermAcctBalQryType termAcctBalQry(
            @WebParam(partName = "ReqTermAcctBalQry", name = "ReqTermAcctBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004")
                    ReqTermAcctBalQryType reqTermAcctBalQry
    );

    @WebMethod(operationName = "HistNetChgValMntQry", action = "urn:/HistNetChgValMntQry")
    @WebResult(name = "RspHistNetChgValMntQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004", partName = "RspHistNetChgValMntQry")
    public RspHistNetChgValMntQryType histNetChgValMntQry(
            @WebParam(partName = "ReqHistNetChgValMntQry", name = "ReqHistNetChgValMntQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004")
                    ReqHistNetChgValMntQryType reqHistNetChgValMntQry
    );

    @WebMethod(operationName = "AcntgBalQry", action = "urn:/AcntgBalQry")
    @WebResult(name = "RspAcntgBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004", partName = "RspAcntgBalQry")
    public RspAcntgBalQryType acntgBalQry(
            @WebParam(partName = "ReqAcntgBalQry", name = "ReqAcntgBalQry", targetNamespace = "http://esb.spdbbiz.com/services/S010030004")
                    ReqAcntgBalQryType reqAcntgBalQry
    );
}
