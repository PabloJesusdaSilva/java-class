package lambdas;

import java.util.function.Predicate;

public class PredicateComposition {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> hasThreeDigts = num -> num >= 100 && num < 999;

        System.out.println(isPar.and(hasThreeDigts).negate().test(123));
        System.out.println(isPar.or(hasThreeDigts).test(123));
    }
}
