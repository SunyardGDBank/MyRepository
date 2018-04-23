package com.sunyard.check;


import org.moqui.context.ExecutionContext;
import org.moqui.entity.EntityFind;
import org.moqui.entity.EntityValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class GetChannelStatus {

    private static final Logger logger = LoggerFactory.getLogger(GetChannelStatus.class);

    public static Map<String,Object> getChannelStatus(ExecutionContext ec){

        logger.info("银联渠道交易状态定时查询开始");
        EntityValue evtxitem = ec.getEntity().makeValue("InnerAcct");
        if (ec != null){
            EntityFind entityFind = ec.getEntity().find("InnerAcct").condition("innerAcctKey","GetChannelStatus");
            logger.info("【查询返回结果】"+entityFind.list());
            if ("00".equals(entityFind.getSelectFields().get(1))) {
                Statement statement = null;
                ResultSet rs = null;
                try {
                    ec.getEntity().find("InnerAcct").condition("innerAcctKey", "GetChannelStatus").one().set("innerAcctNo", "22").update();
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                    String dateStr = sdf.format(date);
                    //获取前一天的日期
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.DATE, -1);
                    Date time = cal.getTime();
                    String preDate = sdf.format(time);
                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                    String nowTime = df.format(new Date());
                    long end = (df.parse(nowTime)).getTime();
                    String timestamp = df.format(new Date(end - 300000));

                    String sq = "select * from NACS.tx_Item_Channel where channelcode = '20001' and (tran_Stas in ('UnionPayAccepted','03','04','05','01','12','34') or tran_Stas is NULL) and workdate in ('" + dateStr + "','" + preDate + "') and to_char(last_Updated_Stamp,'yyyy-mm-dd hh24:mi:ss') <= '" + timestamp + "'";
                    Connection connection = GetChannelStatus.getConn();
                    statement = connection.createStatement();
                    rs = statement.executeQuery(sq);

                    while (rs.next()) {
                        ec.getContext().put("nacstxid", rs.getString("nacstxid"));
                        ec.getContext().put("subCompanyNo", rs.getString("subcompanyno"));
                        ec.getContext().put("bizType", rs.getString("busitype"));
                        ec.getContext().put("txnTime", rs.getString("txntime"));

                        ec.getContext().put("firmerchantcode", rs.getString("firmerchantcode"));
                        ec.getContext().put("firmerchantname", rs.getString("firmerchantname"));
                        ec.getContext().put("buitxid", rs.getString("buitxid"));
                        try {
                            ec.getContext().put("amount", rs.getDouble("amount"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        ec.getContext().put("payeeacctno", rs.getString("payeeacctno"));
                        ec.getContext().put("payeracctno", rs.getString("payeracctno"));
                        //dctx.getDispatcher().runAsync("toUnionPayServiceQuery", context, false);
                    }

                } catch (Exception e) {
                    logger.error("【异常】" + e.getMessage());
                } finally {
                    try {
                        ec.getEntity().find("InnerAcct").condition("innerAcctKey", "GetChannelStatus").one().set("innerAcctNo", "00").update();
                        if (statement != null) {
                            statement.close();
                        }
                        if (rs != null) {
                            rs.close();
                        }
                    } catch (Exception e) {
                        logger.error("【关闭流异常】" + e.getMessage());
                    }
                }
            }
        }
        return null;
    }


    private static Connection getConn() {
        /*String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:ORACLE";
        String username = "ceb";
        String password = "ceb1234";*/

        String driver = "org.h2.Driver";
        String url = "jdbc:h2:~/moqui";
        String username = "sa";
        String password = "";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
