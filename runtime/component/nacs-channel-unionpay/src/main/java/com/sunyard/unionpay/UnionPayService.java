package com.sunyard.unionpay;

import org.moqui.context.ExecutionContext;
import org.moqui.entity.EntityValue;
import org.moqui.entity.EntityList;
import org.moqui.service.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sunyard.sdk.SDKConfig;
//import com.sunyard.sdk.AcpService;
import com.sunyard.sdk.AcpService;
import java.util.HashMap;
import java.util.Map;
import com.sunyard.unionpay.DemoBase;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Created by xxjsb134 on 2017/9/21.
 */
public class UnionPayService {
    private static final Logger logger = LoggerFactory.getLogger(UnionPayService.class);
    public static Map<String, Object> UnionPayDaiFu(ExecutionContext ec) {
        logger.info("银联代付服务调用开始");
        Map<String, Object> result = new HashMap<String, Object>();
        String payerAcctno = (String) ec.getContext().get("payerAcctno");
        String payerAcctName = (String) ec.getContext().get("payerAcctName");
        String payeeAcctno = (String) ec.getContext().get("payeeAcctno");
        String payeeAcctName = (String) ec.getContext().get("payeeAcctName");
        String useRemark = (String) ec.getContext().get("useRemark");

        String merId = (String) ec.getContext().get("merId");
        String amt = (String) ec.getContext().get("trxAmt");
        //String txnAmt = String.valueOf((int)Integer.parseInt(new java.text.DecimalFormat("0").format((Double)ec.getContext().get("trxAmt"))));
        String orderId = (String) ec.getContext().get("nacsTxId");
        logger.info("第二种方式："+ec.getContext().get("orderId")+(String) ec.getContext().get("trxAmt"));
        logger.info("订单号orderId："+orderId);
        logger.info("交易金额："+amt);
        logger.info("上下文："+ec.getContext());
        orderId = "201803051123570000003";
        payerAcctno = "6216261000000000018";
        payerAcctName = "全渠道";
        payeeAcctno = "6216261000000000018";
        payeeAcctName = "全渠道";
        useRemark = "303330160120002";
        merId = "303330160120002";
        String txnAmt = "100";

        String txnTime = (String) ec.getContext().get("workTime");
        txnTime = "20180305112734";
        Map<String, String> data = new HashMap<String, String>();

        /***银联全渠道系统，产品参数，除了encoding自行选择外其他不需修改***/
        data.put("version", DemoBase.version);            //版本号 全渠道默认值
        data.put("encoding", DemoBase.encoding);     //字符集编码 可以使用UTF-8,GBK两种方式
        data.put("signMethod", SDKConfig.getConfig().getSignMethod()); //签名方法
        data.put("txnType", "12");              		 	//交易类型 12：代付
        data.put("txnSubType", "00");           		 	//默认填写00
        data.put("bizType", "000401");          		 	//000401：代付
        data.put("channelType", "07");          		 	//渠道类型
        data.put("acqInsCode", "03033472");					//机构号
        data.put("merCatCode", "4816");					//测试环境送一个真实存在的mcc，生产由收单自己的业务人员定。测试环境使用4816
        data.put("merName", "（特约）中国光大银行杭州分行（跨行转账）");					//测试环境符合格式随便送，生产由收单自己的业务人员定
        data.put("merAbbr", "光大银行");					//测试环境符合格式随便送，生产由收单自己的业务人员定

        /***商户接入参数***/
        data.put("merId", merId);   		 				//商户号码，请改成自己申请的商户号或者open上注册得来的777商户号测试
        data.put("accessType", "1");            		 	//接入类型，商户接入填0 ，不需修改（0：直连商户， 1： 收单机构 2：平台商户）
        data.put("orderId", orderId);        	 	    	//商户订单号，8-40位数字字母，不能含“-”或“_”，可以自行定制规则
        data.put("txnTime", txnTime);		 		    	//订单发送时间，取系统时间，格式为YYYYMMDDhhmmss，必须取当前时间，否则会报txnTime无效
        data.put("accType", "01");					 		//账号类型 01：银行卡

        //sourcesOfFunds为01时payerVerifiInfo必送，其他情况不送payerVerifiInfo。
        //付款方账号        payerAccNo     1到19位数字
        //付款方姓名        payerNm 30字节以下，支持汉字，1个汉字算2字节
        data.put("sourcesOfFunds", "01");
        data.put("payerVerifiInfo", "{payerAccNo="+payerAcctno+"&payerNm="+payerAcctName+"}");


        //收款账号为对公时：测试卡使用 6212142600000000167（单位结算卡）
        //单位结算卡完整账户名称        comDebitCardAccName 120字节以下，支持汉字，1个汉字算2字节
        //营业执照注册号        businessLicenseRegNo 20字节以下，支持汉字，1个汉字算2字节
        //data.put("accType", "04"); //04表示对公账户,当04时不需要送customerInfo
        //data.put("reserved", "{comDebitCardAccName=中国银联单位结算卡&businessLicenseRegNo=1101888888}");

        //////////如果商户号开通了  商户对敏感信息加密的权限那么，需要对 卡号accNo加密使用：
        data.put("encryptCertId",AcpService.getEncryptCertId());      						//上送敏感信息加密域的加密证书序列号
        //String accNo = AcpService.encryptData("6216261000000000018", DemoBase.encoding); 	//这里测试的时候使用的是测试卡号，正式环境请使用真实卡号
        //data.put("accNo", accNo);
        //////////

        /////////商户未开通敏感信息加密的权限那么不对敏感信息加密使用：
        data.put("accNo", payeeAcctno);                  				//这里测试的时候使用的是测试卡号，正式环境请使用真实卡号
        ////////

        //代付交易的上送的卡验证要素：姓名或者证件类型+证件号码
        Map<String,String> customerInfoMap = new HashMap<String,String>();
        //customerInfoMap.put("certifTp", "01");						    //证件类型
        //customerInfoMap.put("certifId", "341126197709218366");		    //证件号码
        customerInfoMap.put("customerNm", payeeAcctName);					//姓名
        String customerInfoStr = AcpService.getCustomerInfo(customerInfoMap,payeeAcctno,DemoBase.encoding);

        data.put("customerInfo", customerInfoStr);
        data.put("txnAmt", txnAmt);						 		    //交易金额 单位为分，不能带小数点
        data.put("currencyCode", "156");                    	    //境内商户固定 156 人民币
        data.put("billNo", useRemark);                    	            //银行附言。会透传给发卡行，完成改造的发卡行会把这个信息在账单、短信中显示给用户的，请按真实情况填写。


        //后台通知地址（需设置为外网能访问 http https均可），支付成功后银联会自动将异步通知报文post到商户上送的该地址，【支付失败的交易银联不会发送后台通知】
        //后台通知参数详见open.unionpay.com帮助中心 下载  产品接口规范  网关支付产品接口规范 消费交易 商户通知
        //注意:1.需设置为外网能访问，否则收不到通知    2.http https均可  3.收单后台通知后需要10秒内返回http200或302状态码
        //    4.如果银联通知服务器发送通知后10秒内未收到返回状态码或者应答码非http200或302，那么银联会间隔一段时间再次发送。总共发送5次，银联后续间隔1、2、4、5 分钟后会再次通知。
        //    5.后台通知地址如果上送了带有？的参数，例如：http://abc/web?a=b&c=d 在后台通知处理程序验证签名之前需要编写逻辑将这些字段去掉再验签，否则将会验签失败
        data.put("backUrl", DemoBase.backUrl);

        // 请求方保留域，
        // 透传字段，查询、通知、对账文件中均会原样出现，如有需要请启用并修改自己希望透传的数据。
        // 出现部分特殊字符时可能影响解析，请按下面建议的方式填写：
        // 1. 如果能确定内容不会出现&={}[]"'等符号时，可以直接填写数据，建议的方法如下。
//		data.put("reqReserved", "透传信息1|透传信息2|透传信息3");
        // 2. 内容可能出现&={}[]"'符号时：
        // 1) 如果需要对账文件里能显示，可将字符替换成全角＆＝｛｝【】“‘字符（自己写代码，此处不演示）；
        // 2) 如果对账文件没有显示要求，可做一下base64（如下）。
        //    注意控制数据长度，实际传输的数据长度不能超过1024位。
        //    查询、通知等接口解析时使用new String(Base64.decodeBase64(reqReserved), DemoBase.encoding);解base64后再对数据做后续解析。
//		data.put("reqReserved", Base64.encodeBase64String("任意格式的信息都可以".toString().getBytes(DemoBase.encoding)));


        /**对请求参数进行签名并发送http post请求，接收同步应答报文**/
        Map<String, String> reqData = AcpService.sign(data,DemoBase.encoding);			 		 //报文中certId,signature的值是在signData方法中获取并自动赋值的，只要证书配置正确即可。
        String requestBackUrl = SDKConfig.getConfig().getBackRequestUrl();									 //交易请求url从配置文件读取对应属性文件acp_sdk.properties中的 acpsdk.backTransUrl
        Map<String, String> rspData = AcpService.post(reqData,requestBackUrl,DemoBase.encoding);        //发送请求报文并接受同步应答（默认连接超时时间30秒，读取返回结果超时时间30秒）;这里调用signData之后，调用submitUrl之前不能对submitFromData中的键值对做任何修改，如果修改会导致验签不通过
        /**对应答码的处理，请根据您的业务逻辑来编写程序,以下应答码处理逻辑仅供参考------------->**/
        //应答码规范参考open.unionpay.com帮助中心 下载  产品接口规范  《平台接入接口规范-第5部分-附录》
        if(!rspData.isEmpty()){
            if(AcpService.validate(rspData, DemoBase.encoding)){
              //  logger.info("验证签名成功");
                String respCode = rspData.get("respCode");
                if(("00").equals(respCode)){
                    //交易已受理(不代表交易已成功），等待接收后台通知确定交易成功，也可以主动发起 查询交易确定交易状态。
                    //TODO
                    result.put("tranStas", "UnionPayAccepted");
                    result.put("tranDesc", "银联已受理");
                    result.put("successflag", "0");
                    /*try {
                        EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                        evtxitem.set("nacsTxId", orderId);
                        evtxitem.set("tranStas", "UnionPayAccepted");
                        evtxitem.set("tranDesc", "银联已受理");
                        evtxitem.set("txStatuId", "05");
                        evtxitem.set("txStatuDsc", "已受理");
                        evtxitem.update();
                        EntityValue ev1 = ec.getEntity().makeValue("txItemChannel");
                        ev1.set("nacsTxId", orderId);
                        ev1.set("tranStas", "UnionPayAccepted");
                        ev1.set("tranDesc", "银联已受理");
                        ev1.set("txStatuId", "05");
                        ev1.set("txStatuDsc", "已受理");
                        ev1.update();
                    } catch (ServiceException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }*/
                    //如果返回卡号且配置了敏感信息加密，解密卡号方法：
                    //String accNo1 = resmap.get("accNo");
                    //String accNo2 = AcpService.decryptPan(accNo1, "UTF-8");	//解密卡号使用的证书是商户签名私钥证书acpsdk.signCert.path
                    //logger.info("解密后的卡号："+accNo2);
                }else if(("03").equals(respCode) ||
                        ("04").equals(respCode) ||
                        ("05").equals(respCode) ||
                        ("01").equals(respCode) ||
                        ("12").equals(respCode) ||
                        ("60").equals(respCode) ){
                    //后续需发起交易状态查询交易确定交易状态。
                    //TODO
                    result.put("tranStas", rspData.get("respCode"));
                    result.put("tranDesc", rspData.get("respMsg"));
                    result.put("successflag", "1");
                    /*try {
                        EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                        evtxitem.set("nacsTxId", orderId);
                        evtxitem.set("tranStas", rspData.get("respCode"));
                        evtxitem.set("tranDesc", rspData.get("respMsg"));
                        evtxitem.set("txStatuId", "02");
                        evtxitem.set("txStatuDsc", "交易未明");
                        evtxitem.update();
                        EntityValue ev1 = ec.getEntity().makeValue("txItemChannel");
                        ev1.set("nacsTxId", orderId);
                        ev1.set("tranStas", rspData.get("respCode"));
                        ev1.set("tranDesc", rspData.get("respMsg"));
                        ev1.set("txStatuId", "02");
                        ev1.set("txStatuDsc", "交易未明");
                        ev1.update();
                    } catch (ServiceException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }*/
                }else{
                    //其他应答码为失败请排查原因
                    //TODO
                    result.put("tranStas", rspData.get("respCode"));
                    result.put("tranDesc", rspData.get("respMsg"));
                    result.put("successflag", "1");
                    try {
                        EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                        evtxitem.set("nacsTxId", orderId);
                        evtxitem.set("tranStas", rspData.get("respCode"));
                        evtxitem.set("tranDesc", rspData.get("respMsg"));
                        evtxitem.set("txStatuId", "03");
                        evtxitem.set("txStatuDsc", "失败");
                        evtxitem.update();
                        EntityValue ev1 = ec.getEntity().makeValue("txItemChannel");
                        ev1.set("nacsTxId", orderId);
                        ev1.set("tranStas", rspData.get("respCode"));
                        ev1.set("tranDesc", rspData.get("respMsg"));
                        ev1.set("txStatuId", "03");
                        ev1.set("txStatuDsc", "失败");
                        ev1.update();
                    } catch (ServiceException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }else {
                logger.info("验证签名失败");
                //TODO 检查验证签名失败的原因
                result.put("tranStas", "0100301");
                result.put("tranDesc", "验证签名失败");
                result.put("successflag", "1");
                EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                evtxitem.set("nacsTxId", orderId);
                evtxitem.set("tranStas", rspData.get("respCode"));
                evtxitem.set("tranDesc", rspData.get("respMsg"));
                evtxitem.set("txStatuId", "03");
                evtxitem.set("txStatuDsc", "失败");
                evtxitem.update();
                EntityValue ev1 = ec.getEntity().makeValue("txItemChannel");
                ev1.set("nacsTxId", orderId);
                ev1.set("tranStas", rspData.get("respCode"));
                ev1.set("tranDesc", rspData.get("respMsg"));
                ev1.set("txStatuId", "03");
                ev1.set("txStatuDsc", "失败");
                ev1.update();
            }
        }else{
            //未返回正确的http状态
                logger.info("未获取到返回报文或返回http状态码非200");
                result.put("tranStas", "0100302");
                result.put("tranDesc", "未获取到返回报文或返回http状态码非200");
                result.put("successflag", "1");
                logger.info("未获取到返回报文或返回http状态码非200,应答码："+rspData.get("respCode")+"，应答信息："+rspData.get("respMsg"));
                /*try {
                    EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                    evtxitem.set("nacsTxId", orderId);
                    evtxitem.set("tranStas", "0100302");
                    evtxitem.set("tranDesc", "未获取到返回报文或返回http状态码非200");
                    evtxitem.set("txStatuId", "02");
                    evtxitem.set("txStatuDsc", "交易未明");
                    evtxitem.update();
                    EntityValue ev1 = ec.getEntity().makeValue("txItemChannel");
                    ev1.set("nacsTxId", orderId);
                    ev1.set("tranStas", "0100302");
                    ev1.set("tranDesc", "未获取到返回报文或返回http状态码非200");
                    ev1.set("txStatuId", "02");
                    ev1.set("txStatuDsc", "交易未明");
                    ev1.update();
                } catch (ServiceException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
        }

        String reqMessage = DemoBase.genHtmlResult(reqData);
        //resp.getWriter().write("代付交易</br>请求报文:<br/>"+reqMessage+"<br/>" + "应答报文:</br>"+rspMessage+"");
        return result;
    }
    /**
     * 银联交易状态综合查询
     */
    public static Map<String, Object> UnionPayService(ExecutionContext ec) {
        logger.info("打日志打日志");
//        Map<String, Object> result = HashMap.newInstance();
        Map<String, Object> result = new HashMap<String, Object>();
        //String merId = (String) context.get("subCompanyNo");
        String orderId = (String)ec.getContext().get("nacsTxId");
        String txnTime = (String)ec.getContext().get("txnTime");
        String bizType = (String)ec.getContext().get("bizType");
        String subcompanynoContext = (String)ec.getContext().get("subCompanyNo");
        String firmerchantcodeContext = (String)ec.getContext().get("firmerchantcode");
        String firmerchantnameContext = (String)ec.getContext().get("firmerchantname");
        String buitxidContext = (String)ec.getContext().get("buitxid");
//        Log.flowDebug("返回查询结果集 buitxidContext："+buitxidContext);
        logger.info("打日志orderId:"+orderId);
        logger.info("txnTime:"+txnTime);
        logger.info("bizType:"+bizType);
        Double amountContext=null;
        try {
            amountContext = (Double) ec.getContext().get("amount");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        logger.info("amountContext:"+bizType);
        String payeeacctnoContext = (String)ec.getContext().get("payeeacctno");
        String payeracctnoContext = (String)ec.getContext().get("payeracctno");
        logger.info("payeeacctnoContext:"+payeeacctnoContext);
        logger.info("payeracctnoContext:"+payeracctnoContext);

        Map<String, String> data = new HashMap<String, String>();

        /***银联全渠道系统，产品参数，除了encoding自行选择外其他不需修改***/
        data.put("version", DemoBase.version);                 //版本号
        data.put("encoding", DemoBase.encoding);               //字符集编码 可以使用UTF-8,GBK两种方式
        data.put("signMethod", "01");                          //签名方法 目前只支持01-RSA方式证书加密
        data.put("txnType", "00");                             //交易类型 00-默认
        data.put("txnSubType", "00");                          //交易子类型  默认00
        //data.put("bizType", "000501");                         //业务类型 代收-000501 代付-000401
        data.put("bizType", bizType);                         //业务类型

        /***商户接入参数***/
        data.put("merId", "303330160120002");                  			   //商户号码，请改成自己申请的商户号或者open上注册得来的777商户号测试
        data.put("accessType", "1");                           //接入类型，商户接入固定填0，不需修改
        data.put("acqInsCode", "03033472");					//机构号
        data.put("merCatCode", "4816");					//测试环境送一个真实存在的mcc，生产由收单自己的业务人员定。测试环境使用4816
        data.put("merName", "（特约）中国光大银行杭州分行（跨行转账）");					//测试环境符合格式随便送，生产由收单自己的业务人员定
        data.put("merAbbr", "光大银行");					//测试环境符合格式随便送，生产由收单自己的业务人员定

        /***要调通交易以下字段必须修改***/
        data.put("orderId", orderId);                 //****商户订单号，每次发交易测试需修改为被查询的交易的订单号
        data.put("txnTime", txnTime);                 //****订单发送时间，每次发交易测试需修改为被查询的交易的订单发送时间
        logger.info("data:"+data);
        /**请求参数设置完毕，以下对请求参数进行签名并发送http post请求，接收同步应答报文------------->**/
        //EntityValue evtxitems = ec.entity.find("moqui.test.TestNoSqlEntity").condition("testId", "TEST1").one();
        //EntityValue evtxitems = ec.getEntity().makeValue("TxItem");
        logger.info("更新表");
        Map<String, String> reqData = AcpService.sign(data,DemoBase.encoding);			//报文中certId,signature的值是在signData方法中获取并自动赋值的，只要证书配置正确即可。
        logger.info("reqData:"+reqData);
        String url = SDKConfig.getConfig().getSingleQueryUrl();								//交易请求url从配置文件读取对应属性文件acp_sdk.properties中的 acpsdk.singleQueryUrl
        logger.info("url:"+url);
        Map<String, String> rspData = AcpService.post(reqData,url,DemoBase.encoding);  //发送请求报文并接受同步应答（默认连接超时时间30秒，读取返回结果超时时间30秒）;这里调用signData之后，调用submitUrl之前不能对submitFromData中的键值对做任何修改，如果修改会导致验签不通过
        logger.info("rspData:"+rspData);
        /**对应答码的处理，请根据您的业务逻辑来编写程序,以下应答码处理逻辑仅供参考------------->**/
        //应答码规范参考open.unionpay.com帮助中心 下载  产品接口规范  《平台接入接口规范-第5部分-附录》
        if(!rspData.isEmpty()){
            logger.info("结果不为空开始验签");
            if(AcpService.validate(rspData, DemoBase.encoding)){
                logger.info(String.valueOf(AcpService.validate(rspData, DemoBase.encoding)));
//                LogUtil.writeLog("验证签名成功");
                String origRespCode = rspData.get("respCode");
                String origRespMsg = rspData.get("origRespMsg");
                String ylsettledate =rspData.get("settleDate");//银联清算日期
                logger.info("respCode:"+rspData.get("respCode"));
                if(("00").equals(rspData.get("respCode"))){//如果查询交易成功
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                    String year = sdf.format(date);
                    ylsettledate = year + ylsettledate;
                    if(("00").equals(origRespCode)){
                        //交易成功，更新商户订单状态
                        //TODO
                        result.put("tranStas", origRespCode);
                        result.put("tranDesc",origRespMsg);
                        result.put("successflag", "0");
                            //更新交易状态为成功
//11                            List<GenericValue> gv = dctx.getDelegator().findByAnd("txItemChannel", BizContext.newContext("nacsTxId",orderId));
                            EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                            if(ec != null){
                                ec.getContext().put("tranStas", origRespCode);
                                ec.getContext().put("tranDesc",origRespMsg);
                                ec.getContext().put("ylsettledate",ylsettledate);
                                ec.getContext().put("txStatuId", "01");
                                ec.getContext().put("txStatuDsc", "成功");
                                evtxitem.setAll(ec.getContext());
                                evtxitem.update();
                            }
//11                            List<GenericValue> gvtxitem = dctx.getDelegator().findByAnd("TxItem", BizContext.newContext("nacsTxId",orderId));
//                            if(gvtxitem != null){
//                                gvtxitem.get(0).set("tranStas", origRespCode);
//                                gvtxitem.get(0).set("tranDesc",origRespMsg);
//                                gvtxitem.get(0).set("ylsettledate",ylsettledate);
//                                gvtxitem.get(0).set("txStatuId", "01");
//                                gvtxitem.get(0).set("txStatuDsc", "成功");
//                                gvtxitem.get(0).store();
//                            }

                    }else if(("03").equals(origRespCode)||
                            ("04").equals(origRespCode)||
                            ("05").equals(origRespCode)){
                        //订单处理中或交易状态未明，需稍后发起交易状态查询交易 【如果最终尚未确定交易是否成功请以对账文件为准】
                        //TODO
                        result.put("tranStas", origRespCode);
                        result.put("tranDesc", origRespMsg);
                        result.put("successflag", "1");
                            //更新交易状态为成功
//11                            List<GenericValue> gv = dctx.getDelegator().findByAnd("txItemChannel", BizContext.newContext("nacsTxId",orderId));
                            EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                            if(ec != null){
                                ec.getContext().put("tranStas", origRespCode);
                                ec.getContext().put("tranDesc",origRespMsg);
                                ec.getContext().put("txStatuId", "02");
                                ec.getContext().put("txStatuDsc", "交易未明");
                                evtxitem.setAll(ec.getContext());
                                evtxitem.update();
                            }
//11                            List<GenericValue> gvtxitem = dctx.getDelegator().findByAnd("TxItem", BizContext.newContext("nacsTxId",orderId));
//                            if(gvtxitem != null){
//                                gvtxitem.get(0).set("tranStas", origRespCode);
//                                gvtxitem.get(0).set("tranDesc",origRespMsg);
//                                gvtxitem.get(0).set("txStatuId", "02");
//                                gvtxitem.get(0).set("txStatuDsc", "交易未明");
//                                gvtxitem.get(0).store();
//                            }
                        }
                        else{
                        //其他应答码为交易失败
                        //TODO
                        result.put("tranStas", origRespCode);
                        result.put("tranDesc", origRespMsg);
                        result.put("successflag", "1");
                            //更新交易状态为成功
//11                            List<GenericValue> gv = dctx.getDelegator().findByAnd("txItemChannel", BizContext.newContext("nacsTxId",orderId));
                            EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                            if(ec != null){
                                ec.getContext().put("tranStas", origRespCode);
                                ec.getContext().put("tranDesc",origRespMsg);
                                ec.getContext().put("txStatuId", "03");
                                ec.getContext().put("txStatuDsc", "失败");
                                evtxitem.setAll(ec.getContext());
                                evtxitem.update();
                            }
//11                            List<GenericValue> gvtxitem = dctx.getDelegator().findByAnd("TxItem", BizContext.newContext("nacsTxId",orderId));
//                            if(gvtxitem != null){
//                                gvtxitem.get(0).set("tranStas", origRespCode);
//                                gvtxitem.get(0).set("tranDesc",origRespMsg);
//                                gvtxitem.get(0).set("txStatuId", "03");
//                                gvtxitem.get(0).set("txStatuDsc", "失败");
//                                gvtxitem.get(0).store();
//                            }

                            //查询明确失败的交易放入交易差错表中，自动退款操作
//11                            GenericValue txItemWr = dctx.getDelegator().makeValue("checkWrongInfoAutoRefund");
                            EntityValue txItemWr = ec.getEntity().makeValue("TxItem");
                            //Double amount = Double.valueOf(txnAmt);
                            txItemWr.put("nacsTxId", orderId);
                            txItemWr.put("orderId", orderId);
                            txItemWr.put("paytxid", orderId);
                            txItemWr.put("checkwrongdate", txnTime.substring(0, 8));
                            txItemWr.put("busitype", "000401");
                            txItemWr.put("checktypest", "00");
                            txItemWr.put("acounttype", "02");
                            txItemWr.put("firmerchantcode", firmerchantcodeContext);
                            txItemWr.put("firmerchantname", firmerchantnameContext);
                            txItemWr.put("secmerchantcode", subcompanynoContext);
                            //txItemWr.put("secmerchantname", "");
                            txItemWr.put("channelcode", "20001");
                            txItemWr.put("channelname", "银联渠道");
                            txItemWr.put("reqTime", txnTime);
                            txItemWr.put("checktype", "01");//错帐类型 01-日间错帐  02-日终错账
                            txItemWr.put("payeeAccount", payeeacctnoContext);
                            txItemWr.put("payerAccount", payeracctnoContext);
                            txItemWr.put("buitxid", buitxidContext);
                            txItemWr.put("amount", amountContext);
                            txItemWr.put("trsMemo", "日间错账，需自动退款(查询明确失败的交易)");
//11                            dctx.getDelegator().createOrStore(txItemWr);
                        }
                }else if(("34").equals(rspData.get("respCode"))){
                    //订单不存在，可认为交易状态未明，需要稍后发起交易状态查询，或依据对账结果为准
                    logger.info("返回34，交易不存在");
                    result.put("tranStas", rspData.get("respCode"));
                    result.put("tranDesc", rspData.get("respMsg")+"交易状态未明,稍后发起交易状态查询");
                    result.put("successflag", "1");
                    String subCompanyNo = "";
                    String idtype = "";
                    String idno = "";
                    String acctno = "";
                    Double amount = 0.00;
                    String firmerchantcode = "";
                    String firmerchantname = "";
                    String payeeacctname = "";
                    String buitxid = "";
                        //更新交易状态为成功
//11                        List<GenericValue> gv = dctx.getDelegator().findByAnd("txItemChannel", BizContext.newContext("nacsTxId",orderId));

                        EntityValue evtxitem = ec.getEntity().makeValue("TxItem");
                        if(ec != null){
                            logger.info(rspData.get("respCode"));
                            ec.getContext().put("tranStas", rspData.get("respCode"));
                            //ec.getContext().put("tranDesc",rspData.get("respMsg"));
                           // ec.getContext().put("txStatuId", "02");
                            //ec.getContext().put("txStatuDsc", "交易未明");
                            ec.getContext().put("nacsTxId","201801310001");

//                            EntityValue testValue = ec.entity.find("'nacs.trx.TxItem").condition("nacxTxId", "2001212555").one();
//                            testValue.tranStas = "35";
//                            testValue.update();
//                            ec.getEntity().find("nacs.trx.TxItem").condition("serviceName", serviceName).condition("parameterValue", parameterValue).useCache(false).one();
                            ec.getEntity().find("nacs.trx.TxItem").condition("nacsTxId","201801310001").one().set("tranStas","34").update();
                            result.put("nacsTxId","201801310001");
                            result.put("tranStas","34");
                            ec.getEntity().makeValue("nacs.trx.TxItem").setAll(result).createOrUpdate();
                            ec.getTransaction().commit();
                            evtxitem.setAll(ec.getContext());
                            evtxitem.update();

                        }
//11                        List<GenericValue> gvtxitem = dctx.getDelegator().findByAnd("TxItem", BizContext.newContext("nacsTxId",orderId));
                        EntityValue gvtxitem = ec.getEntity().makeValue("TxItem");
                        if(gvtxitem != null){
                            logger.info("进2");
//                            subCompanyNo = (String) gvtxitem.get(0).get("subcompanyno");
//                            idtype = (String) gvtxitem.get(0).get("certcode");
//                            idno = (String) gvtxitem.get(0).get("certno");
//                            acctno = (String) gvtxitem.get(0).get("payeeacctno");
//                            amount = (Double) gvtxitem.get(0).get("amount");
//                            firmerchantcode = (String) gvtxitem.get(0).get("firmerchantcode");
//                            firmerchantname = (String) gvtxitem.get(0).get("firmerchantname");
//                            payeeacctname = (String) gvtxitem.get(0).get("payeeacctname");
//                            gvtxitem.get(0).set("tranStas", rspData.get("respCode"));
//                            gvtxitem.get(0).set("tranDesc",rspData.get("respMsg"));
//
//                            buitxid = (String) gvtxitem.get(0).get("buitxid");
//                            gvtxitem.get(0).set("txStatuId", "02");
//                            gvtxitem.get(0).set("txStatuDsc", "交易未明");
//                            gvtxitem.get(0).store();
                        }
                    //重复发起交易
                        ec.getContext().put("nacsTxId", orderId);
                        ec.getContext().put("subCompanyNo", subCompanyNo);
                        ec.getContext().put("idtype", idtype);
                        ec.getContext().put("idno", idno);
                        ec.getContext().put("acctno", acctno);
                        ec.getContext().put("txnTime", txnTime);
                        ec.getContext().put("amount", amount);
                        ec.getContext().put("requestNo", buitxid);
                        ec.getContext().put("firmerchantcode", firmerchantcode);
                        ec.getContext().put("firmerchantname", firmerchantname);
                        ec.getContext().put("payeeacctname", payeeacctname);
//                        dctx.getDispatcher().runAsync("toUnionPayServiceDaiFu", ec.getContext(), false);
                }else{//查询交易本身失败，如应答码10/11检查查询报文是否正确
                    //TODO
//11                    LogUtil.writeErrorLog("查询交易本身失败,应答码："+rspData.get("respCode")+"，应答信息："+rspData.get("respMsg"));
                    logger.info("查询交易本身失败,应答码："+rspData.get("respCode")+"，应答信息："+rspData.get("respMsg"));
                    result.put("tranStas", "0100300");
                    result.put("tranDesc", "查询交易本身失败,检查查询报文是否正确");
                    result.put("successflag", "1");
					/*try {
						//更新交易状态为成功
						List<GenericValue> gv = dctx.getDelegator().findByAnd("txItemChannel", BizContext.newContext("nacsTxId",orderId));
						if(gv != null){
							gv.get(0).set("tranStas", rspData.get("respCode"));
							gv.get(0).set("tranDesc",rspData.get("respMsg"));
							gv.get(0).store();
						}
						List<GenericValue> gvtxitem = dctx.getDelegator().findByAnd("TxItem", BizContext.newContext("nacsTxId",orderId));
						if(gvtxitem != null){
							gvtxitem.get(0).set("tranStas", rspData.get("respCode"));
							gvtxitem.get(0).set("tranDesc",rspData.get("respMsg"));
							gvtxitem.get(0).store();
						}
					} catch (GenericEntityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
                }
            }else{
//11                LogUtil.writeErrorLog("验证签名失败,应答码："+rspData.get("respCode")+"，应答信息："+rspData.get("respMsg"));
                //TODO 检查验证签名失败的原因
                result.put("tranStas", "0100301");
                result.put("tranDesc", "验证签名失败啊啊啊");
                result.put("successflag", "1");
            }
        }else{
            //未返回正确的http状态
            result.put("tranStas", "0100302");
            result.put("tranDesc", "未获取到返回报文或返回http状态码非200");
            result.put("successflag", "1");
//11            LogUtil.writeErrorLog("未获取到返回报文或返回http状态码非200,应答码："+rspData.get("respCode")+"，应答信息："+rspData.get("respMsg"));
        }

        String reqMessage = DemoBase.genHtmlResult(reqData);
        String rspMessage = DemoBase.genHtmlResult(rspData);
//11        LogUtil.writeErrorLog("请求报文:<br/>"+reqMessage+"<br/>" + "应答报文:</br>"+rspMessage+"");
        return result;
    }

}
