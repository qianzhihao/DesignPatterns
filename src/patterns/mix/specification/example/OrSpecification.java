package patterns.mix.specification.example;

public class OrSpecification extends CompositeSpecification {
    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification _left, IUserSpecification _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
