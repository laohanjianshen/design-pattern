package com.xpc.chain;

public class ErrorLog extends Logger {
    public ErrorLog(int level) {
        super.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("=========>ErrorLog:" + msg);
    }
}
