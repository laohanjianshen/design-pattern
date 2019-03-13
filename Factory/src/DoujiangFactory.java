public class DoujiangFactory {
    public  static Doujiang getDoujiang(String DoujiangType) {
        switch (DoujiangType) {
            case "jujube":
                return new Jujube();
            case "sesame":
                return new Sesame();
            default:
                throw new RuntimeException("对不起,没有这种豆浆...");
        }
    }
}
