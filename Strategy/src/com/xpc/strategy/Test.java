package com.xpc.strategy;

import com.xpc.strategy.impl.RunOnAir;
import com.xpc.strategy.impl.RunOnRoald;
import com.xpc.strategy.impl.RunOnWater;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Car suv = new Suv(new RunOnRoald());
        suv.init();
        Car mpv = new Mpv(new RunOnWater());
        mpv.init();
        Car skr = new Skr(new RunOnAir());
        skr.init();
    }
}
