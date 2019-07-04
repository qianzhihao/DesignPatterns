package patterns.mix.specification.define;

public interface ISpecification {
    public boolean isSatisfiedBy(Object candidate);
    public ISpecification and(ISpecification specification);
    public ISpecification or(ISpecification specification);
    public ISpecification not();
}
