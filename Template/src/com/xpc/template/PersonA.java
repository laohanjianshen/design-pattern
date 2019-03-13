package com.xpc.template;

public class PersonA extends LifeTemplate {
    @Override
    protected void dowork() {
        System.out.println("我是A,我在努力工作赚老婆本...");
    }

    @Override
    protected boolean isEat() {
        return false;
    }
}
