package patterns.mix.specification;

import java.util.ArrayList;

public interface IUserProvider {
//    public ArrayList<User> findUserByNameEqual(String name);
//    public ArrayList<User> findUserByAgeThan(int age);
    public ArrayList<User> findUser(IUserSpecification userSpecification);
}
