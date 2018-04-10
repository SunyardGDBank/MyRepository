package com.sunyard.cxf;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;




public class CxfUtil
{
    public static void getLogFunction(Object cli){
        Client client=ClientProxy.getClient(cli);
        client.getInInterceptors().add(LoggingInInterceptor.getInstance());
        client.getOutInterceptors().add(LoggingOutInterceptor.getInstance());
        client.getInFaultInterceptors().add(LoggingInInterceptor.getInstance());
        client.getOutFaultInterceptors().add(LoggingOutInterceptor.getInstance());
    }
    
    public static void getLogFunction(Client client,long timeout)
    {
//        Client client=ClientProxy.getClient(obj);
        HTTPConduit http= (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(timeout);
        httpClientPolicy.setAllowChunking(false);
        httpClientPolicy.setReceiveTimeout(timeout);
        http.setClient(httpClientPolicy);
        System.out.println(httpClientPolicy.getHost());
        
        client.getInInterceptors().add(LoggingInInterceptor.getInstance());
        client.getOutInterceptors().add(LoggingOutInterceptor.getInstance());
        client.getInFaultInterceptors().add(LoggingInInterceptor.getInstance());
        client.getOutFaultInterceptors().add(LoggingOutInterceptor.getInstance());
    }
    
    public static Object post(Object sendObject) throws Exception
    {
        return new Object();
    }
  
}

