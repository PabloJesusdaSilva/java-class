package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Product> isDear = prod -> (prod.price * (1 - prod.discount)) >= 739;

        Product product = new Product("MacBook Air", 23929.92, 0.3);
        System.out.println(isDear.test(product));
    }
}
