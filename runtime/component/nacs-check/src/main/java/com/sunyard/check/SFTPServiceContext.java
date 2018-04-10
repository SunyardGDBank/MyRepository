package com.sunyard.check;

import com.jcraft.jsch.*;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.moqui.context.ExecutionContext;
import org.moqui.util.ContextStack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Vector;

/**
 * 连接sftp服务器
 */
public class SFTPServiceContext {

    private static final Logger logger = LoggerFactory.getLogger(SFTPServiceContext.class);

    //连接器
public ChannelSftp connect(String host, int port, String username,
        String password) {
    ChannelSftp sftp = null;
    try {
        JSch jsch = new JSch();
        jsch.getSession(username, host, port);
        Session sftpSession = jsch.getSession(username, host, port);
        logger.debug("Session created.");

        sftpSession.setPassword(password);
        Properties sshConfig = new Properties();
        sshConfig.put("StrictHostKeyChecking", "no");
        sftpSession.setConfig(sshConfig);
        sftpSession.connect();
        logger.debug("Session connected.");

        logger.debug("Opening Channel.");
        Channel channel = sftpSession.openChannel("sftp");
        channel.connect();
        sftp = (ChannelSftp) channel;
        logger.info("连接 " + host + "成功");
    } catch (Exception e) {
        logger.error("连接 " + host + "异常："+e.getMessage());
    }
    return sftp;
}

/**
 * 上传文件
 * @param directory 上传的目录
 * @param uploadFile 要上传的文件
 * @param sftp
 */
public void upload(String directory, String uploadFile, ChannelSftp sftp) {
    try {
        sftp.cd(directory);
        File file=new File(uploadFile);
        sftp.put(new FileInputStream(file), file.getName());
    } catch (Exception e) {
        e.printStackTrace();
    }
}

/**
 * 下载文件
 * @param directory 下载目录
 * @param downloadFile 下载的文件
 * @param saveFile 存在本地的路径
 * @param sftp
 */
public void download(String directory, String downloadFile,File saveFile, ChannelSftp sftp) throws Exception {
    try {
        sftp.cd(directory);
        sftp.get(downloadFile, new FileOutputStream(saveFile));
    } catch (Exception e) {
       throw new Exception("下载文件异常"+e.getMessage());
    }
}

/**
 * 删除文件
 * @param directory 要删除文件所在目录
 * @param deleteFile 要删除的文件
 * @param sftp
 */
public void delete(String directory, String deleteFile, ChannelSftp sftp) {
    try {
        sftp.cd(directory);
        sftp.rm(deleteFile);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

/**
 * 列出目录下的文件
 * @param directory 要列出的目录
 * @param sftp
 * @throws SftpException
 */
@SuppressWarnings("unchecked")
public Vector<LsEntry> listFiles(String directory, ChannelSftp sftp) throws SftpException{
    return sftp.ls(directory);
}



/**
 * 获取远端文件到本地服务
 * @param ec 参数上下文
 * @return Map<String, Object>
 */
public static Map<String, Object> getFileService(ExecutionContext ec){
    logger.info("开始获取参数！");
    ContextStack context = ec.getContext();
    Map<String, Object> result = new java.util.HashMap<>();
    String host=(String) context.get("ip");
    String portStr = (String) context.get("port");
    String username=(String)context.get("username");
    String password=(String)context.get("password");
    String remoteFIlePath=(String)context.get("remoteFilePath");
    String remoteFileName=(String)context.get("remoteFileName");
    String saveFile=(String)context.get("saveFile");
    logger.info("准备开始下载文件:[" + remoteFileName + "]");
    try {
        SFTPServiceContext sftpContext = new SFTPServiceContext();
        ChannelSftp sftp = sftpContext.connect(host, Integer.valueOf(portStr), username, password);
        sftpContext.download(remoteFIlePath, remoteFileName, new File(saveFile), sftp);
    } catch (Exception e) {
        logger.error("下载文件:["+remoteFileName+"]异常"+e.getMessage());
    }
    return result;

}


/* 测试方法
*    public static void main(String[] args) throws Exception {

    SFTPServiceContext sftpContext=new SFTPServiceContext ();
    ChannelSftp  sftp = sftpContext.connect("192.168.1.200", 22, "chaos", "chaos");
    //准备开始
    logger.info("开始下载文件:[" + "test.txt"+"]");
    sftpContext.download("sftptest", "test.txt", "D://test/fire.txt", sftp);
    logger.info("下载文件完成:[" + "test.txt"+"]");

}  */
}