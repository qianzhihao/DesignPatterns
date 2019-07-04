package patterns.mix.specification.define;

public class NotSpecification extends CompositeSpecification {
    private ISpecification specification;
    public NotSpecification(ISpecification _spec) {
        this.specification = _spec;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !specification.isSatisfiedBy(candidate);
    }
}
