package com.xpc.myproxy;

import com.xpc.proxy.Moveable;
import com.xpc.proxy.InvocationHandler;
import java.lang.reflect.Method;
public class $Proxy0 implements Moveable{

     private InvocationHandler h;

     public $Proxy0(InvocationHandler h) {
        this.h = h;
    }

     public void move() {
           try{ 
               Method md = com.xpc.proxy.Moveable.class.getMethod("move");
               h.invoke(this,md);
           }catch(Exception e){
               e.printStackTrace();
           }
     }
}