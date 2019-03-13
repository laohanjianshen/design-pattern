package com.xpc.proxy;

import java.util.Random;

public class Car implements Moveable {
    public void move() {
        Long begainTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        try {
            System.out.println("汽车行驶中...");
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶完毕,行驶了:"+(endTime-begainTime)+"毫秒");
    }
}
