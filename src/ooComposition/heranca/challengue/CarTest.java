package ooComposition.heranca.challengue;

public class CarTest {

    public static void main(String[] args) {

        Car civic = new Civic();

        civic.speedUp();
        System.out.println(civic);

        civic.speedUp();
        System.out.println(civic);

        civic.brake();
        System.out.println(civic);

        Car ferrari = new Ferrari();
        
        ferrari.speedUp();
        System.out.println(ferrari);

        ferrari.speedUp();
        System.out.println(ferrari);

        ferrari.brake();
        System.out.println(ferrari);
    }
}
