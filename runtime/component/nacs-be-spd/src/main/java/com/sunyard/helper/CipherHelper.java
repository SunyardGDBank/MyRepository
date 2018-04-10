package com.sunyard.helper;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;

public class CipherHelper {

	public static String getConfigPath(String dirName) {
		return CipherHelper.getProjectContext() + "/"+dirName+"/";
	}

	public static String getProjectContext() {
		URL url = CipherHelper.class.getProtectionDomain().getCodeSource().getLocation();
		String filePath = null;
		try {
			filePath = URLDecoder.decode(url.getPath(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		filePath = filePath.substring(0,filePath.length()-1);
		return filePath.substring(1, filePath.lastIndexOf("/"));
	}
	
	public static Certificate getCertificate(String certPath,String certType) throws Exception {
        Certificate certificate = null;
        FileInputStream inputStream =null;
        try{
            CertificateFactory certificateFactory = CertificateFactory.getInstance(certType);
            inputStream = new FileInputStream(new File(certPath));
            certificate = certificateFactory.generateCertificate(inputStream);
        }catch(Exception e){
            throw e;
        }finally {
            if (inputStream!=null){
                try{
                    inputStream.close();
                }catch (Exception e){
                    throw e;
                }
            }
        }
        return certificate;
    }	
	/**
	 * @param data
	 * @param keyWord
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public  static byte[] encryCipherByAES(byte[] data,byte [] keyWord) throws Exception{
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(keyWord);
		kgen.init(128, secureRandom);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] result = cipher.doFinal(data);
		return result;
	}
	/**
	 * @param encryData
	 * @param keyWord
	 * @return
	 * @throws Exception 
	 */
	public static  byte[] decryCipherByAES(byte[] encryData,byte [] keyWord) throws Exception{
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
		secureRandom.setSeed(keyWord);
		kgen.init(128, secureRandom);
		SecretKey secretKey = kgen.generateKey();
		byte[] enCodeFormat = secretKey.getEncoded();
		SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);
		return cipher.doFinal(encryData);

	}
	
	 public static PrivateKey getPrivateKey(String keyPath,String keyPawd,String keyAlias,String keyType) throws  UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {
	        KeyStore keyStore = getKeyStore(keyPath,keyPawd,keyType);
	        return (PrivateKey)keyStore.getKey(keyAlias,keyPawd.toCharArray());

	    }
	    
		public static KeyStore getKeyStore(String keyPath,String keyPawd,String keyType){
	        KeyStore keyStore = null;
	        FileInputStream inputStream =null;

	        try {
	            inputStream = new FileInputStream(new File(keyPath));
	            keyStore = KeyStore.getInstance(keyType);
	            keyStore.load(inputStream, keyPawd.toCharArray());

	        }catch (Exception e){
	            e.printStackTrace();
	        }finally {
	            if (inputStream!=null){
	                try{
	                    inputStream.close();
	                }catch (Exception e){
	                    e.printStackTrace();
	                }
	            }
	        }
	        return keyStore;
	    }
}
