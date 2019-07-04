package patterns.mix.specification;

public class UserByAgeThan implements IUserSpecification {

    private int age;
    public UserByAgeThan(int _age) {
        this.age = _age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
