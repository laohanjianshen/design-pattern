package com.xpc.strategy;

/**
 * 父类-车
 */
public abstract class Car {
    private RunStrategy runStrategy;

    public Car(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }
    public void init(){
        runStrategy.run();
    }
}
