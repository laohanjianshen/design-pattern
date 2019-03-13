package com.xpc.jdkproxy;

import com.xpc.proxy.Car;
import com.xpc.proxy.Moveable;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Moveable moveable = (Moveable) Proxy.newProxyInstance(Car.class.getClassLoader(),new Class[]{Moveable.class},new JdkproxyHandler(new Car()));
        moveable.move();
    }
}
