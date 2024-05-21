package finalChallenge;

public class Dinner {

    public static void main(String[] args) {

        Food firstFood = new Food("Rice", 0.200);
        Food secondFirst = new Food("Potato", 0.300);

        Person person = new Person("Pablo", 94.64);

        System.out.println(person.present());
        person.eat(firstFood);

        System.out.println(person.present());
        person.eat(secondFirst);

        System.out.println(person.present());
    }
}
