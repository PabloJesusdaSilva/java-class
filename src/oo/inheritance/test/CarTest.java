package oo.inheritance.test;

import oo.inheritance.challengue.Car;
import oo.inheritance.challengue.Civic;
import oo.inheritance.challengue.Ferrari;

public class CarTest {

    public static void main(String[] args) {

        Car civic = new Civic(220);

        civic.speedUp();
        System.out.println(civic);

        civic.speedUp();
        System.out.println(civic);

        civic.brake();
        System.out.println(civic);

        Ferrari ferrari = new Ferrari(350);
        ferrari.turnOnTurbo();
        ferrari.turnOnAirConditioning();

        ferrari.speedUp();
        System.out.println(ferrari);
        System.out.println(ferrari.airSpeed());

        ferrari.speedUp();
        System.out.println(ferrari);

        ferrari.brake();
        System.out.println(ferrari);
    }
}
