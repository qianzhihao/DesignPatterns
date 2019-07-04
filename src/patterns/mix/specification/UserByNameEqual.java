package patterns.mix.specification;

public class UserByNameEqual implements IUserSpecification {
    private String name;
    public UserByNameEqual(String _name) {
        this.name = _name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
