package patterns.mix.specification.define;

public class AndSpecification extends CompositeSpecification {
    private ISpecification left;
    private ISpecification right;

    public AndSpecification(ISpecification _left, ISpecification _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public boolean isSatifiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
    }
}
