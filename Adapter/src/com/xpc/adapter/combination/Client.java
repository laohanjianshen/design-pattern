package com.xpc.adapter.combination;

/**
 * 电脑-测试类-对象适配器(组合实现)
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
        Adaptee adaptee = new Adaptee();
        Target power = new Adapter(adaptee);
        Client computer = new Client(power);
        computer.charge();
    }
}
