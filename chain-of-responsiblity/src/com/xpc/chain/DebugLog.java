package com.xpc.chain;

public class DebugLog extends Logger {
    public DebugLog(int level) {
        super.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("=========>DebugLog:" + msg);
    }
}
