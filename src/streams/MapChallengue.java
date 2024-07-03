package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallengue {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String textAoContrario = new StringBuilder().reverse().toString();

        // UnaryOperator<Integer> numberBinary = n -> Integer.valueOf(Integer.toBinaryString(n));
        UnaryOperator<String> reverseString =
                text -> new StringBuilder(text).reverse().toString();
        Function<String, Integer> binaryToInt =
                text -> Integer.parseInt(text, 2);

        numbers.stream()
                .map(Integer::toBinaryString)
                .map(reverseString)
                .map(binaryToInt)
                .forEach(System.out::println);
    }
}
