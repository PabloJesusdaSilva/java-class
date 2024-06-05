package lambdas;

public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Sum();
        System.out.println(calc.toExecuted(3, 5));

        calc = new Multiplication();
        System.out.println(calc.toExecuted(3, 5));
    }
}
