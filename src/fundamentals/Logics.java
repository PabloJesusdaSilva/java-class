package fundamentals;

public class Logics {

    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);

        // True Table AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // True Table OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // True Table OR XOR
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // True Table OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // True Table NOT
        System.out.println(!true);
        System.out.println(!false);
    }
}
