package patterns.mix.specification.example;

public abstract class CompositeSpecification implements IUserSpecification {
    public abstract boolean isSatisfiedBy(User user);
    public IUserSpecification and(IUserSpecification specification) {
        return new AndSpecification(this,specification);
    }
    public IUserSpecification not() {
        return new NotSpecification(this);
    }
    public IUserSpecification or(IUserSpecification specification) {
        return new OrSpecification(this,specification);
    }

}
