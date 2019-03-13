package com.xpc.chain;

/**
 * 责任链模式测试类
 */
public class ResponsiblityPatternTest {
    private static Logger getLogger(){
        Logger infoLog = new InfoLog(Logger.INFO);
        Logger debugLog = new DebugLog(Logger.DEBUG);
        Logger errorLog = new ErrorLog(Logger.ERROR);
        debugLog.setNextLogger(infoLog);
        infoLog.setNextLogger(errorLog);
        return debugLog;
    }
    public static void main(String[] args) {
        Logger logger = getLogger();
        logger.logMessage(Logger.DEBUG,"这是debug级别的log");
        System.out.println("------------------------------------");
        logger.logMessage(Logger.INFO,"这是info级别的log");
        System.out.println("------------------------------------");
        logger.logMessage(Logger.ERROR,"这是error级别的log");
    }
}
