public class AbstractFactory {
    public static Type getType(String ProdType){
        switch (ProdType) {
            case "doujiang" : return new DoujiangType();
            case "baozi" : return new BaoziType();
            default : throw new RuntimeException("不存在这种类型的工厂");
        }
    }
}
