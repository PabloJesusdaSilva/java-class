package collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<User> users = new HashSet<User>();

        users.add(new User("Pablo"));
        users.add(new User("Karen"));

        boolean result = users.contains(new User("Pablo"));
        System.out.println(result);
    }
}
