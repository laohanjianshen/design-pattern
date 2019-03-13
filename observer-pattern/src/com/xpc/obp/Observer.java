package com.xpc.obp;

/**
 * 观察者对象
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
