package com.xpc.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    /**
     * 获取代理对象的实例
     *
     * @param clazz 目标对象的字节码文件
     * @return 代理对象的实例
     */
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * @param o           目标类的实例
     * @param method      目标方法的反射对象
     * @param objects     目标方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("检票进站了...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(o, objects);
        System.out.println("火车开往幼儿园...");
        return null;
    }
}
