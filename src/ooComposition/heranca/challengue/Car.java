package ooComposition.heranca.challengue;

public class Car {

    int currentSpeed;

    void speedUp() {
        currentSpeed += 5;
    }

    void brake() {
        if(currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }
    }

    public String toString() {
        return "Current speed: " + currentSpeed + "km/h";
    }
}
