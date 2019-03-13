package com.xpc.template;

/**
 * 模板方法模式-模板:一个人的一天
 */
public abstract class LifeTemplate {
    public void Life() {
        //起床
        getUp();
        //吃饭
        if (isEat()) {
            eat();
        }
        //做一些事
        dowork();
        //睡觉
        sleep();
    }

    /**
     * 钩子
     */
    protected boolean isEat() {
        return true;
    }

    private final void getUp() {
        System.out.println("起床了...");
    }

    private final void eat() {
        System.out.println("大猪蹄子真好吃...");
    }

    protected abstract void dowork();

    private final void sleep() {
        System.out.println("我要睡个香香觉...");
    }
}
