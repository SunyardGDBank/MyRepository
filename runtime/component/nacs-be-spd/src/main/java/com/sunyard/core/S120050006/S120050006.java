package com.sunyard.core.S120050006;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:14:46.043+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "S120050006", 
                  wsdlLocation = "file:S120050006.wsdl",
                  targetNamespace = "http://esb.spdbbiz.com/services/S120050006/wsdl") 
public class S120050006 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://esb.spdbbiz.com/services/S120050006/wsdl", "S120050006");
    public final static QName ESBServerSoapEndpoint = new QName("http://esb.spdbbiz.com/services/S120050006/wsdl", "ESBServerSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:S120050006.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(S120050006.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:S120050006.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public S120050006(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public S120050006(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public S120050006() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns ESBServerPortType
     */
    @WebEndpoint(name = "ESBServerSoapEndpoint")
    public ESBServerPortType getESBServerSoapEndpoint() {
        return super.getPort(ESBServerSoapEndpoint, ESBServerPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ESBServerPortType
     */
    @WebEndpoint(name = "ESBServerSoapEndpoint")
    public ESBServerPortType getESBServerSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(ESBServerSoapEndpoint, ESBServerPortType.class, features);
    }

}
