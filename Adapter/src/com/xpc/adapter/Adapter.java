package com.xpc.adapter;

/**
 * 适配器-继承实现
 */
public class Adapter extends Test implements Target{
    @Override
    public void powerWithThreePlug() {
        super.powerWithTwoPlug();
    }
}
