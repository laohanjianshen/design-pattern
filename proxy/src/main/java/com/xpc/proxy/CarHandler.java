package com.xpc.proxy;

import java.lang.reflect.Method;

public class CarHandler implements InvocationHandler {
    private Object target;

    public CarHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object proxy, Method method) {
        try {
            System.out.println("测试手写代理...");
            method.invoke(target);
            System.out.println("jdk源码太高深了,吓得我车都停了...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
