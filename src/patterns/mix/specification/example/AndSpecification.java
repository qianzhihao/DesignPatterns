package patterns.mix.specification.example;

public class AndSpecification extends CompositeSpecification {

    private IUserSpecification left;
    private IUserSpecification right;

    public AndSpecification(IUserSpecification _left, IUserSpecification _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
    }
}
