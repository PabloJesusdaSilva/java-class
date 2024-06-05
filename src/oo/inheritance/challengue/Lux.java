package oo.inheritance.challengue;

public interface Lux {

    void turnOnAirConditioning();
    void turnOffAirConditioning();

    default int airSpeed() {
        return 1;
    }
}
