public class DoujiangType implements Type {
    @Override
    public Object type() {
        return new DoujiangFactory();
    }
}
