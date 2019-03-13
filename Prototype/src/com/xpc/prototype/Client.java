package com.xpc.prototype;

import java.io.IOException;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //构造保时捷卡宴原型
        Key key = new Key();
        key.setKeyName("保时捷车钥匙");
        Porsche porsche = new Porsche("卡宴", 1000000, "黑色",key);
        System.out.println("原型车:" + porsche);
        //批量生产卡宴
        for (int i = 1; i <= 10; i++) {
//            Porsche porschei = (Porsche) porsche.clone();
            Porsche porschei = (Porsche) porsche.deepClone();
            if (porschei == porsche) {
                System.out.println("原型和批量生产的车是同一个对象");
            }
            if (porsche.getClass()==porschei.getClass()){
                System.out.println("这是生产的第" + i + "辆卡宴:" + porschei);
            }
            System.out.println(porsche.getKey() == porschei.getKey() ? "每辆车拥有同一把钥匙":"每辆车有各自的钥匙");
        }
    }
}
