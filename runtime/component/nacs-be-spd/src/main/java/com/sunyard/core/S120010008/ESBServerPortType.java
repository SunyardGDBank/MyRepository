package com.sunyard.core.S120010008;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:13:50.959+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://esb.spdbbiz.com/services/S120010008/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBServerPortType {

    @WebMethod(operationName = "ExtSnglTfr", action = "urn:/ExtSnglTfr")
    @WebResult(name = "RspExtSnglTfr", targetNamespace = "http://esb.spdbbiz.com/services/S120010008", partName = "RspExtSnglTfr")
    public RspExtSnglTfrType extSnglTfr(
            @WebParam(partName = "ReqExtSnglTfr", name = "ReqExtSnglTfr", targetNamespace = "http://esb.spdbbiz.com/services/S120010008")
                    ReqExtSnglTfrType reqExtSnglTfr
    );
}
