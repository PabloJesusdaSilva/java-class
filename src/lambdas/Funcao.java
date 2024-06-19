package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "par" : "impar";

        System.out.println(evenOrOdd.apply(32));

        Function<String, String> theResultAnd = value -> "The result is" + value;

        Function<String, String> emplogado = value -> value + "!!!";

        String finalResult = evenOrOdd
                .andThen(theResultAnd)
                .andThen(emplogado)
                .apply(32);

    }
}
