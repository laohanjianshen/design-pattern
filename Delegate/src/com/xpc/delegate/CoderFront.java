package com.xpc.delegate;

/**
 * 前端码农
 */
public class CoderFront implements ICoder {
    @Override
    public void dowork() {
        System.out.println("我是前端,写js...");
    }
}
