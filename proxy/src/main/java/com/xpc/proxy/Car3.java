package com.xpc.proxy;

/**
 * 静态代理-聚合
 */
public class Car3 implements Moveable {
    private Moveable moveable;

    public Car3(Moveable moveable) {
        this.moveable = moveable;
    }

    public void move() {
        System.out.println("前面有山洞,驾驶员打开了近光灯...");
        moveable.move();
        System.out.println("车子故障了,驾驶员下了车...");
    }
}
