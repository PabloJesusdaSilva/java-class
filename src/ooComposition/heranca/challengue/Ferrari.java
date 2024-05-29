package ooComposition.heranca.challengue;

public class Ferrari extends Car {

    Ferrari() { this(315); }

    Ferrari(int maximumSpeed) {
        super(maximumSpeed);
        delta = 15;
    }
}
