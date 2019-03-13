package com.xpc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkproxyHandler implements InvocationHandler {
    private Object object;
    public JdkproxyHandler(Object object){
//        super();
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前面有交警,驾驶员绕道了...");
        method.invoke(object);
        System.out.println("交警追上来了,驾驶员吓尿了...");
        System.out.println(method.getClass().getName());
        return object;
    }
}
