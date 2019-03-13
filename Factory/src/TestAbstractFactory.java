/**
 * 模拟卖包子和豆浆
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        //顾客一:我要一个肉包,一杯芝麻豆浆
        Object obj1 = AbstractFactory.getType("baozi").type();
        if (obj1.getClass().getName().equals(BaoziFactory.class.getName())){
            BaoziFactory.getBaozi("meat").Stuffing();
        }
        Object obj2 = AbstractFactory.getType("doujiang").type();
        if (obj2.getClass().getName().equals(DoujiangFactory.class.getName())){
            DoujiangFactory.getDoujiang("sesame").flavor();
        }
        //顾客二:我要一个豆腐包,一杯红枣豆浆
        Object obj3 = AbstractFactory.getType("baozi").type();
        if (obj3.getClass().getName().equals(BaoziFactory.class.getName())){
            BaoziFactory.getBaozi("tofu").Stuffing();
        }
        Object obj4 = AbstractFactory.getType("doujiang").type();
        if (obj4.getClass().getName().equals(DoujiangFactory.class.getName())){
            DoujiangFactory.getDoujiang("jujube").flavor();
        }
        //顾客三:我要一个登山包,一杯柠檬汁
        Object obj5 = AbstractFactory.getType("dengshanbao").type();
        if (obj5.getClass().getName().equals(BaoziFactory.class.getName())){
            BaoziFactory.getBaozi("sb").Stuffing();
        }
        Object obj6 = AbstractFactory.getType("yinliao").type();
        if (obj6.getClass().getName().equals(DoujiangFactory.class.getName())){
            DoujiangFactory.getDoujiang("sb").flavor();
        }
    }
}
