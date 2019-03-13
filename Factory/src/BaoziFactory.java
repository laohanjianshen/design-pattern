public class BaoziFactory {
    public static Baozi getBaozi(String BaoziType) {
        switch (BaoziType) {
            case "cream":
                return new Cream();
            case "meat":
                return new Meat();
            case "tofu":
                return new Tofu();
            default:
                throw new RuntimeException("对不起,没有这种包子...");
        }
    }
}
