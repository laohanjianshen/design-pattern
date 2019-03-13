public class BaoziType implements Type{
    @Override
    public Object type() {
        return new BaoziFactory();
    }
}
