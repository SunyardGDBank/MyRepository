package com.sunyard.cxf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;


import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CxfLoggingInterceptor extends AbstractPhaseInterceptor<Message>
{

    private static final Logger logger = LoggerFactory.getLogger(CxfLoggingInterceptor.class);
    private String phase;

    public CxfLoggingInterceptor()
    {
        super(Phase.PRE_INVOKE);
        // TODO Auto-generated constructor stub
    }

    public CxfLoggingInterceptor(String phase)
    {   
        super(phase);
        this.phase = phase;
        // TODO Auto-generated constructor stub
    }

    public void handleMessage(Message msg) throws Fault
    {
        OutputStream os = null;
        InputStream is = null;
        try{
            logger.info("begin send..........");
            os = msg.getContent(OutputStream.class);
            CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
            msg.setContent(OutputStream.class, newOut);
            String xmlin = IOUtils.toString(newOut.getInputStream());
            logger.info(xmlin);
            
            is = msg.getContent(InputStream.class);
            String xml = IOUtils.toString(is);
            logger.info(formatXML(xml));
            logger.info("begin end..........");
        }catch (Exception e) {
            // TODO: handle exception
        }finally{
            try
            {
                if (is != null)
                    is.close();
            } catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    
    private String formatXML(String inputXML) throws Exception
    {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new StringReader(inputXML));
        String requestXML = null;
        XMLWriter writer=null;
        if(document !=null)
        {
            try
            {
                StringWriter stringWriter = new StringWriter();
                OutputFormat format = new OutputFormat(" ",true);
                writer = new XMLWriter(stringWriter,format);
                writer.write(document);
                writer.flush();
                requestXML = stringWriter.getBuffer().toString();
            }
            finally
            {
                if(writer !=null)
                {
                    try
                    {
                        writer.close();
                    }catch(IOException e)
                    {
                        throw e;
                    }
                }
            }
        }
        return requestXML;
    }
    
}