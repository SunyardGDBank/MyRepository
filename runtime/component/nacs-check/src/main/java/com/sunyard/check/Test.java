package com.sunyard.check;

import org.moqui.context.ExecutionContext;
import org.moqui.context.LoggerFacade;
import org.moqui.util.ContextStack;

import java.util.Map;

/**
 * Created by Think on 2017/12/26.
 */
public class Test {
    public static void main(String[] args)  {

    }
    public static Map<String, Object> test(ExecutionContext ec) {
        ContextStack context = ec.getContext();
        LoggerFacade logger = ec.getLogger();
        return null;
    }
}
