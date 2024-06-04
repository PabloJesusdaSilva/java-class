package ooComposition.heranca.challengue;

public class Ferrari extends Car {

    public Ferrari() { this(315); }

    public Ferrari(int maximumSpeed) {
        super(maximumSpeed);
        delta = 15;
    }

    // @Override
    // public void speedUp() {
    //     super.speedUp();
    // }
}
