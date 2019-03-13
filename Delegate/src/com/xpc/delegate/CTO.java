package com.xpc.delegate;

/**
 * 技术总监
 */
public class CTO {
    public void dowork(){
        ICoder coderFront = new CoderFront();
        ICoder coderBack = new CoderBack();
        //CTO收到老板指令后,将任务分配给前端和后端,让他们去敲代码...
        System.out.println("好的,老板,我这就安排人去做...");
        coderFront.dowork();
        coderBack.dowork();
    }
}
