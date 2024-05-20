package classes;

public class EqualsHashcode {

    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "Pablo";
        u1.email = "pablo@gmail.com";

        User u2 = new User();
        u2.name = "Pablo";
        u2.email = "pablo@gmail.com";

        System.out.println(u1 == u2); // false
        System.out.println(u1.equals(u2)); // false
    }
}
