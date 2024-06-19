package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperatorBinary {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (num1, num2) -> (num1 + num2) / 2;

        BiFunction<Double, Double, String> result = (num1, num2) -> {
            double finalNote = (num1 + num2) / 2;

            return finalNote >= 7 ? "Approved" : "Disapproved";
        };

        System.out.println(result.apply(3.7, 8.5));

        Function<Double, String> concept = m -> m >= 7 ? "Approved" : "Disapproved";
        System.out.println(media.andThen(concept).apply(9.4, 7.4));
    }
}
