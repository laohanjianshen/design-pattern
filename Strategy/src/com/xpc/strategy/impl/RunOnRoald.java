package com.xpc.strategy.impl;

import com.xpc.strategy.RunStrategy;

public class RunOnRoald implements RunStrategy {
    @Override
    public void run() {
        System.out.println("在陆地上疾驰...");
    }
}
