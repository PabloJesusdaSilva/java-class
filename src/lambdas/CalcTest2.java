package lambdas;

public class CalcTest2 {

    public static void main(String[] args) {

        Calc calc = (x, y) -> { return x + y; };
        System.out.println(calc.toExecuted(2, 3 ));

        calc = (x, y) -> x * y;
        System.out.println(calc.toExecuted(2, 3 ));
        System.out.println(calc.test());
        System.out.println(Calc.hello());

    }
}
