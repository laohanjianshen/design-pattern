package com.xpc.delegate;

/**
 * 老板
 */
public class Boss {
    public static void main(String[] args) {
        CTO cto = new CTO();
        //老板跟CTO说我要做个ERP系统
        System.out.println("CTO啊,现在公司需要做一个ERP系统...");
        cto.dowork();
    }
}
