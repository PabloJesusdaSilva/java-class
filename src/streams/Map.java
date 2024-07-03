package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        List<String> cars = Arrays.asList("BMW ", "Mercedes ", "Audi");
        cars.stream().map(car -> car.toUpperCase()).forEach(print);

        // UnaryOperator<String> maiscula = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        // UnaryOperator<String> grito = n -> n + "!!!";

        cars.stream()
                .map(Utilitarios.maiscula)
                .map(firstLetter)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
