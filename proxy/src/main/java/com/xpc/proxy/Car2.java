package com.xpc.proxy;

/**
 * 静态代理-继承实现
 */
public class Car2 extends Car{
    @Override
    public void move() {
        System.out.println("驾驶员打开了左转向灯...");
        super.move();
        System.out.println("驾驶员下车了...");
    }
}
