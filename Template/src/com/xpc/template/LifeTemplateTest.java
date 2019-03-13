package com.xpc.template;

/**
 * 测试类
 */
public class LifeTemplateTest {
    public static void main(String[] args) {
        LifeTemplate A = new PersonA();
        LifeTemplate B = new PersonB();
        System.out.println("有请A表演他的一天>>>");
        A.Life();
        System.out.println("*****************************");
        System.out.println("有请B表演他的一天>>>");
        B.Life();
    }
}
