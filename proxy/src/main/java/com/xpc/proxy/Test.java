package com.xpc.proxy;

public class Test {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        InvocationHandler h = new CarHandler(car);
       Moveable moveable = (Moveable) Proxy.newProxyInstance(Moveable.class,h);
       Thread.sleep(100);//模拟将创建的class文件加载至内存中的延迟
       moveable.move();
    }
}
