package patterns.mix.specification.define;

public class OrSpecification extends CompositeSpecification{
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification _left, ISpecification _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public boolean isSatifiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
    }
}
