package com.sunyard.usl;
/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/



import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.moqui.context.ExecutionContext;
import org.moqui.context.LoggerFacade;
import org.moqui.util.ContextStack;

import java.io.*;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;



/**
 *  FTP Services
 *
 */
public class FtpServices {

    public final static String module = FtpServices.class.getName();
    public static final String resource = "CommonUiLabels";

    public static Map<String, Object> getFile(ExecutionContext ec) {
        ContextStack context = ec.getContext();
        LoggerFacade logger = ec.getLogger();
        Map<String, Object> result = new java.util.HashMap<>();
        Locale locale = (Locale) context.get("locale");
        String localFilename = (String) context.get("localFilename");
        OutputStream localFile = null;
        try {
            localFile = new FileOutputStream(localFilename);
        } catch (IOException ioe) {
            logger.error("[getFile] Problem opening local file"+ioe.getStackTrace().toString());
            ec.getMessage().addError("");
        }

        FTPClient ftp = new FTPClient();
        try {
            ftp.connect((String) context.get("hostname"));
            if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                logger.error("[getFile] Problem Error To Ftp IsPositiveCompletion" );
            } else {
                String username = (String) context.get("username");
                String password = (String) context.get("password");

                if (!ftp.login(username, password)) {
                    logger.error("[getFile] Problem Error Username And Password to Login");
                } else {
                    Boolean binaryTransfer = (Boolean) context.get("binaryTransfer");
                    boolean binary = (binaryTransfer == null) ? false : binaryTransfer.booleanValue();
                    if (binary) { ftp.setFileType(FTP.BINARY_FILE_TYPE); }

                    Boolean passiveMode = (Boolean) context.get("passiveMode");
                    boolean passive = (passiveMode == null) ? false : passiveMode.booleanValue();
                    if (passive) { ftp.enterLocalPassiveMode(); }

                    if (!ftp.retrieveFile((String) context.get("remoteFilename"), localFile)) {
                        logger.error("[getFile] Problem Error retrieveFile");
                    }
                }
                ftp.logout();
            }
        } catch (IOException ioe) {
            logger.error("[getFile] Problem opening local file"+ioe.getStackTrace().toString());
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException dce) {
                    logger.error("[getFile] Problem with FTP disconnect"+dce.getStackTrace().toString());
                }
            }
        }
        try {
            localFile.close();
        } catch (IOException ce) {
            logger.error("[getFile] Problem closing local file"+ce.getStackTrace().toString());
        }
        return result;
    }




    public static Map<String, Object> unGzipFile(ExecutionContext ec) {
        ContextStack context = ec.getContext();
        LoggerFacade logger = ec.getLogger();
        Map<String, Object> result = new java.util.HashMap<>();
        String sourcedir = (String) context.get("srcRarPath");
        String ouputfile = "";
        try {
            //建立gzip压缩文件输入流
            FileInputStream fin = new FileInputStream(sourcedir);

            //建立gzip解压工作流
            GZIPInputStream gzin = new GZIPInputStream(fin);
            InputStreamReader reader = new InputStreamReader(gzin,"GBK");
            BufferedReader br = new BufferedReader(reader);
            //建立解压文件输出流
            ouputfile = sourcedir.substring(0,sourcedir.lastIndexOf('.'));
            FileOutputStream fout = new FileOutputStream(ouputfile);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout,"GBK"));
            /*int num;
            byte[] buf=new byte[1024];

            while ((num = gzin.read(buf,0,buf.length)) != -1)
            {
            	bw.write(buf.toString());
                //fout.write(buf,0,num);
            }*/
            String tempbf;
            while((tempbf = br.readLine()) != null){
                //Log.flowDebug("tempbf="+tempbf);
                bw.write(tempbf.toString());
                bw.flush();
                bw.newLine();
            }
            result.put("ouputfile", ouputfile);
            gzin.close();
            fout.close();
            fin.close();
            bw.close();
        } catch (Exception ex){
            logger.error("[unGzipFile] Problem Error is"+ex.getStackTrace().toString());
        }
        return result;
    }
}
