package oo.abstracts;

public class AbstractTest {

    public static void main(String[] args) {

        Mamifero dog = new Cachorro();
        System.out.println(dog.toWalk());
        System.out.println(dog.toMove());
        System.out.println(dog.breathe());
    }
}
