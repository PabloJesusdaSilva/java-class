package ooComposition.heranca.challengue;

public class CarTest {

    public static void main(String[] args) {

        Car civic = new Civic();
        Car ferrari = new Ferrari();

        System.out.println("Velocidae atual: " + civic.currentSpeed);
        System.out.println("Velocidae atual: " + ferrari.currentSpeed);

        civic.speedUp();
        ferrari.speedUp();

        System.out.println("Velocidae atual: " + civic.currentSpeed);
        System.out.println("Velocidae atual: " + ferrari.currentSpeed);

        civic.speedUp();
        ferrari.speedUp();

        System.out.println("Velocidae atual: " + civic.currentSpeed);
        System.out.println("Velocidae atual: " + ferrari.currentSpeed);

        civic.brake();
        ferrari.brake();

        System.out.println("Velocidae atual: " + civic.currentSpeed);
        System.out.println("Velocidae atual: " + ferrari.currentSpeed);
    }
}
