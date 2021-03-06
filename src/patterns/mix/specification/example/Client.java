package patterns.mix.specification.example;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("T-Mac", 3));
        userList.add(new User("LutherHead", 8));
        userList.add(new User("ChrisPaul", 10));
        userList.add(new User("ChrisWebber", 15));
        userList.add(new User("Lebron", 18));
        userList.add(new User("ChrisBosh", 20));
        userList.add(new User("Young", 25));
        userList.add(new User("Bryant", 30));
        userList.add(new User("Yi", 35));
        userList.add(new User("Kobe", 30));

        IUserProvider userProvider = new UserProvider(userList);
        System.out.println("===name contains 'on'===");
        IUserSpecification userSpecification = new UserByAgeThan(10);
        IUserSpecification userSpec = new UserByNameLike("%e%");
        for (User u:userProvider.findUser(userSpecification.and(userSpec))) {
            System.out.println(u);
        }
    }
}
