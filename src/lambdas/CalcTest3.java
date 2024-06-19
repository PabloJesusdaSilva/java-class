package lambdas;

import java.util.function.BinaryOperator;

public class CalcTest3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0, 3.0 ));

        calc = (x, y) -> x * y;

        BinaryOperator<Integer> calc2 = (x, y) -> { return x * y; };
        System.out.println(calc2.apply(3, 9));

        System.out.println(calc.apply(2.0, 3.0));
        System.out.println(Calc.hello());

    }
}
