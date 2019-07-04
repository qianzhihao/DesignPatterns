package patterns.mix.specification.define;

public abstract class CompositeSpecification implements ISpecification {
    public abstract boolean isSatifiedBy(Object candidate);
    public ISpecification and(ISpecification specification) {
        return new AndSpecification(this, specification);
    }
    public ISpecification not() {
        return new NotSpecification(this);
    }
    public ISpecification or(ISpecification specification) {
        return new OrSpecification(this, specification);
    }
}
