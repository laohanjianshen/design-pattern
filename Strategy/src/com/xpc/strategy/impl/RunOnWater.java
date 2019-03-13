package com.xpc.strategy.impl;

import com.xpc.strategy.RunStrategy;

public class RunOnWater implements RunStrategy {
    @Override
    public void run() {
        System.out.println("在水面上疾驰...");
    }
}
