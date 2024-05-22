package ooComposition;

public class Motor {

    boolean on = false;
    double injectionFactor = 1;

    int spin() {
        if(!on) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
