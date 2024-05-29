package ooComposition.heranca.challengue;

public class Ferrari extends Car {
    boolean speedUp() {
        currentSpeed += 10;

        return true;
    }

    boolean brake() {
        currentSpeed -= 10;

        return true;
    }
}
