package ooComposition.heranca.challengue;

public class Ferrari extends Car {

    @Override
    void speedUp() { currentSpeed += 15; }

    @Override
    void brake() { currentSpeed -= 15; }
}
