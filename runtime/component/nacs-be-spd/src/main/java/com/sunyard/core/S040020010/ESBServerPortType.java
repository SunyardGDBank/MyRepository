package com.sunyard.core.S040020010;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:13:01.252+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://esb.spdbbiz.com/services/S040020010/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBServerPortType {

    @WebMethod(operationName = "ICCardDomainVerf", action = "urn:/ICCardDomainVerf")
    @WebResult(name = "RspICCardDomainVerf", targetNamespace = "http://esb.spdbbiz.com/services/S040020010", partName = "RspICCardDomainVerf")
    public RspICCardDomainVerfType icCardDomainVerf(
            @WebParam(partName = "ReqICCardDomainVerf", name = "ReqICCardDomainVerf", targetNamespace = "http://esb.spdbbiz.com/services/S040020010")
                    ReqICCardDomainVerfType reqICCardDomainVerf
    );

    @WebMethod(operationName = "VerfChipCard55Dmn", action = "urn:/VerfChipCard55Dmn")
    @WebResult(name = "RspVerfChipCard55Dmn", targetNamespace = "http://esb.spdbbiz.com/services/S040020010", partName = "RspVerfChipCard55Dmn")
    public RspVerfChipCard55DmnType verfChipCard55Dmn(
            @WebParam(partName = "ReqVerfChipCard55Dmn", name = "ReqVerfChipCard55Dmn", targetNamespace = "http://esb.spdbbiz.com/services/S040020010")
                    ReqVerfChipCard55DmnType reqVerfChipCard55Dmn
    );
}
