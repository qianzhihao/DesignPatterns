package patterns.mix.specification.define;

public class BizSpecification extends CompositeSpecification {

    private Object obj;
    public BizSpecification(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public boolean isSatifiedBy(Object candidate) {
        return false;
    }
}
