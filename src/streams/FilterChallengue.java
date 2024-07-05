package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallengue {

    public static void main(String[] args) {

        Item item1 = new Item("iPhone 13", 5893, 0.20, 0);
        Item item2 = new Item("iPhone 15 Pro", 7239, 0.32, 0);
        Item item3 = new Item("Apple Watch Series 3", 4390, 0.40, 0);
        Item item4 = new Item("MacBook M2", 23199, 0.23, 0);

        List<Item> items = Arrays.asList(item1, item2, item3, item4);

        Predicate<Item> superPromotion = i -> i.discount >= 0.3;
        Predicate<Item> freeShipping = i -> i.freight == 0;
        Predicate<Item> relevantProduct = i -> i.price >= 3000;

        Function<Item, String> promotionalItem = i -> "Aproveite " + i.name + " por R$ " + i.price;

        items.stream()
                .filter(superPromotion)
                .filter(freeShipping)
                .filter(relevantProduct)
                .map(promotionalItem)
                .forEach(System.out::println);
    }
}
