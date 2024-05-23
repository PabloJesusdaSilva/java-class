package ooComposition;

public class CarTest {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.itsOn());

        c1.toConnect();
        System.out.println(c1.itsOn());

        System.out.println(c1.motor.spin());

        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        c1.speedUp();

        System.out.println(c1.motor.spin());
        
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        
        System.out.println(c1.motor.spin());
    }
}
