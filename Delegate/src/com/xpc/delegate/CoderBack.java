package com.xpc.delegate;

/**
 * 后端码农
 */
public class CoderBack implements ICoder{
    @Override
    public void dowork() {
        System.out.println("我是后端,写java...");
    }
}
