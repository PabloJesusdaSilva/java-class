package streams;

import java.util.Arrays;
import java.util.List;

public class FilterChallengue {

    public static void main(String[] args) {

        Item item1 = new Item("iPhone 13", true ,false);
        Item item2 = new Item("iPhone 15 Pro", true, true);
        Item item3 = new Item("Apple Watch Series 3", true, true);
        Item item4 = new Item("MacBook M2", false, false);

        List<Item> items = Arrays.asList(item1, item2, item3, item4);

        items.stream()
                .filter(item -> item.lowStock == true)
                .filter(item -> item.critical == true)
                .map(item -> "The item " + item.name + " is considered critical and needs to be purchased")
                .forEach(System.out::println);
    }
}
