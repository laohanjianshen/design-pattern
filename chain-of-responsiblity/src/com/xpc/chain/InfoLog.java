package com.xpc.chain;

public class InfoLog extends Logger {
    public InfoLog(int level) {
        super.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("=========>InfoLog:" + msg);
    }
}
