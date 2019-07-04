package patterns.mix.specification.example;

public class NotSpecification extends CompositeSpecification {

    private IUserSpecification specification;

    public NotSpecification(IUserSpecification _spec) {
        this.specification = _spec;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return !specification.isSatisfiedBy(user);
    }
}
