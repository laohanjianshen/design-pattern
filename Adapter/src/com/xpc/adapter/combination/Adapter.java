package com.xpc.adapter.combination;

/**
 * 适配器-对象适配器
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void powerWithThreePlug() {
        adaptee.powerWithTwoPlug();
    }
}
