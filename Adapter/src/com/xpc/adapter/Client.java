package com.xpc.adapter;

/**
 * 电脑-测试类-类适配器(继承实现)
 */
public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void charge() {
        System.out.println("正在充电...");
        target.powerWithThreePlug();
    }

    public static void main(String[] args) {
        //使用原生插头充电
//        Target power = new TargetImpl();
        //使用适配器插头充电
        Target power = new Adapter();
        Client computer = new Client(power);
        computer.charge();
    }
}
