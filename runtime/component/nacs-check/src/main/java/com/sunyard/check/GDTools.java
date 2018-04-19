package com.sunyard.check;

import org.moqui.context.ExecutionContext;
import org.moqui.entity.EntityListIterator;
import org.moqui.entity.EntityValue;
import org.moqui.util.ContextStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GDTools {
    private static final Logger logger = LoggerFactory.getLogger(SFTPServiceContext.class);
    //渠道手续费统计
    public static Map<String, Object> getChannelFee(ExecutionContext ec){
        logger.info("开始获取参数！");
        ContextStack context = ec.getContext();
        Map<String, Object> result = new java.util.HashMap<>();
        String endFeeDate = (String) context.get("feeDate_thru");
        String startFeeDate = (String) context.get("feeDate_from");
        String channelSeqId = (String) context.get("channelSeqId");
        //EntityFind channelFee = ec.getEntity().find("TxItemChannel");
        EntityValue channelFee = ec.getEntity().makeValue("TxItemChannel");
        channelFee.set("channelSeqId",channelSeqId);
        EntityListIterator el = null;

        //ec.getEntity().sqlFind()


        return result;
    }
}
