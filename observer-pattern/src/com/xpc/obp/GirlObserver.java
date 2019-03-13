package com.xpc.obp;

public class GirlObserver extends Observer {
    /**
     * 被构造时即被添加至观察者列表里
     */
    public GirlObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("状态改变了,状态值变为了:" + subject.getState() +"  我要去购物了....");
    }
}
