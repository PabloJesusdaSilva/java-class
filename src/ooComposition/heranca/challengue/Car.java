package ooComposition.heranca.challengue;

public class Car {

    int currentSpeed;

    boolean speedUp() {
        currentSpeed += 5;

        return true;
    }

    boolean brake() {
        if(currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }

        return true;
    }
}
