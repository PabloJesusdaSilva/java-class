package oo.encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("Pablo", "Jesus", -19);

        System.out.println(); // toString
        System.out.println(person); // toString
        System.out.println(person.fullName());
    }
}
