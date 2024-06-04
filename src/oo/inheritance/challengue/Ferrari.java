package oo.inheritance.challengue;

public class Ferrari extends Car implements Sporty, Lux {

    private boolean turnOnTurbo;
    private boolean turnOnAirConditioning;

    public Ferrari() { this(315); }

    public Ferrari(int maximumSpeed) {
        super(maximumSpeed);
        setDelta(15);
    }

    @Override
    public void turnOnTurbo() {
        turnOnTurbo = true;
    }

    @Override
    public void turnOffTurbo() {
        turnOnTurbo = false;
    }

    @Override
    public void turnOnAirConditioning() {
        turnOnAirConditioning = true;
    }

    @Override
    public void turnOffAirConditioning() {
        turnOnAirConditioning = false;
    }

    @Override
    public int getDelta() {
        if(turnOnTurbo && !turnOnAirConditioning) {
            return 35;
        } else if(turnOnTurbo && turnOnAirConditioning) {
            return 30;
        } else if(!turnOnTurbo && !turnOnAirConditioning) {
            return 20;
        }

        return 15;
    }

    // @Override
    // public void speedUp() {
    //     super.speedUp();
    // }
}
