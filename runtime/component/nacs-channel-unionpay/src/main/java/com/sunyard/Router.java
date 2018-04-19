package com.sunyard;

import org.moqui.context.ExecutionContext;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by sq795 on 2018/4/19.
 */
public class Router {
    public static Map<String,Object> GetCpspTxid(ExecutionContext ec){
        Map<String,Object> result = new HashMap<String,Object>();
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        Format format = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = format.format(new Date());
        String nacsTxId = date + String.valueOf(number);
        result.put(nacsTxId,nacsTxId);
        return result;
    }
}
