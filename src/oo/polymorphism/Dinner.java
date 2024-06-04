package oo.polymorphism;

public class Dinner {

    public static void main(String[] args) {

        Person guest = new Person(99.37);

        Rice ingredient1 = new Rice(0.3);
        Bean ingredient2 = new Bean(0.8);
        IceCream ingredient3 = new IceCream(0.5);

        System.out.println(guest.getWeight());

        guest.eat(ingredient1);
        guest.eat(ingredient2);

        System.out.println(guest.getWeight());

        guest.eat(ingredient3);

        System.out.println(guest.getWeight());
    }
}
