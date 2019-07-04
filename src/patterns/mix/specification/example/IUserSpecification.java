package patterns.mix.specification.example;

public interface IUserSpecification {
    public boolean isSatisfiedBy(User user);

    public IUserSpecification and(IUserSpecification specification);
    public IUserSpecification or(IUserSpecification specification);
    public IUserSpecification not();
}
