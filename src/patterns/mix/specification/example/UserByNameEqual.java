package patterns.mix.specification.example;

public class UserByNameEqual extends CompositeSpecification {
    private String name;
    public UserByNameEqual(String _name) {
        this.name = _name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
