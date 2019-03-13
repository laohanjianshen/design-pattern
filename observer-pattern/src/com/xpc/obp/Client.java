package com.xpc.obp;

/**
 * 测试客户端
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer girlObserver = new GirlObserver(subject);
        Observer boyObserver = new BoyObserver(subject);
        System.out.println("==========第一次===========>");
        subject.setState(1);
        System.out.println("==========第二次===========>");
        subject.setState(2);
        System.out.println("==========第三次===========>");
        subject.remove(boyObserver);
        subject.setState(3);
    }
}
