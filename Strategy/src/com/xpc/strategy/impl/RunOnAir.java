package com.xpc.strategy.impl;

import com.xpc.strategy.RunStrategy;

public class RunOnAir implements RunStrategy {
    @Override
    public void run() {
        System.out.println("在空气上疾驰...");
    }
}
