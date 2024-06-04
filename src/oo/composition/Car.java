package oo.composition;

public class Car {

    Motor motor = new Motor();

    void speedUp() {
        if(motor.injectionFactor < 2.6) {
            motor.injectionFactor += 0.4;
        }
    }

    void brake() {
        if(motor.injectionFactor < 0.5) {
            motor.injectionFactor -= 0.4;
        }
    }
    void toConnect() {
        motor.on = true;
    }

    void off() {
        motor.on = false;
    }

    boolean itsOn() {
        return motor.on;
    }
}
