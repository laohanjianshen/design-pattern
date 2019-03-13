/**
 * 模拟卖包子
 */
public class SellBaoziTest {
    public static void main(String[] args) {
        //顾客一:老板,我要个肉包
        BaoziFactory.getBaozi("meat").Stuffing();
        //顾客二:老板,我要个豆腐包
        BaoziFactory.getBaozi("tofu").Stuffing();
        //顾客三:老板,我要个奶黄包
        BaoziFactory.getBaozi("cream").Stuffing();
        //顾客四:老板,我要个大沙包
        BaoziFactory.getBaozi("sb").Stuffing();
    }
}
