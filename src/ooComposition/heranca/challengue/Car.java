package ooComposition.heranca.challengue;

public class Car {

    public final int MAXIMUM_SPEED;
    protected int currentSpeed;
    protected int delta = 5;

    Car(int maximumSpeed) {
        MAXIMUM_SPEED = maximumSpeed;
    }

    public void speedUp() {
        if(currentSpeed + delta > MAXIMUM_SPEED) {
            currentSpeed = MAXIMUM_SPEED;
        } else {
            currentSpeed += delta;
        }
    }

    public void brake() {
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
