package lambdas;

@FunctionalInterface
public interface Calc {

    double toExecuted(double a, double b);

    default String test() {
        return ("Helo World");
    };

    static String hello() {
        return ("Hello Static");
    }
}
