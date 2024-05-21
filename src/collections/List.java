package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("Pablo");
        list.add(u1);
        list.add(new User("Fulano"));
        list.add(new User("Ciclano"));
        list.add(new User("Beltrano"));

        System.out.println(list.get(3).name);

        list.remove(2);
        list.remove(new User("Fulano"));

        System.out.println(list.contains(u1));

        for(User u: list) {
            System.out.println(u.name);
        }
    }
}
