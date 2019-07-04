package patterns.mix.specification.example;

public class UserByAgeThan extends CompositeSpecification{

    private int age;
    public UserByAgeThan(int _age) {
        this.age = _age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > age;
    }
}
