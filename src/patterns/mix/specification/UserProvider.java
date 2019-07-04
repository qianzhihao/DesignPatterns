package patterns.mix.specification;

import java.util.ArrayList;

public class UserProvider implements IUserProvider {

    private ArrayList<User> userList;

    public UserProvider(ArrayList<User> _userList) {
        this.userList = _userList;
    }

    @Override
    public ArrayList<User> findUser(IUserSpecification userSpecification) {
        ArrayList<User> result = new ArrayList<User>();
        for (User u:userList
             ) {
            if (userSpecification.isSatisfiedBy(u)) {
                result.add(u);
            }
        }
        return result;
    }


//    @Override
//    public ArrayList<User> findUserByNameEqual(String name) {
//        ArrayList<User> result = new ArrayList<User>();
//        for (User u:userList
//             ) {
//            if (u.getName().equals(name)) {
//                result.add(u);
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public ArrayList<User> findUserByAgeThan(int age) {
//        ArrayList<User> result = new ArrayList<User>();
//        for (User u:userList
//             ) {
//            if (u.getAge() > age) {
//                result.add(u);
//            }
//        }
//        return result;
//    }
}
