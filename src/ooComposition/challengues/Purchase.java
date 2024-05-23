package ooComposition.challengues;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    final List<Item> items = new ArrayList<>();

    void addItem (Product product, int amound) {
        this.items.add(new Item(product, amound));
    }

    void addItem (String name, double price, int amound) {
        var product = new Product(name, price);
        this.items.add(new Item(product, amound));
    }

    double getTotalValue() {
        double total = 0;

        for(Item item: items) {
            total += item.amound * item.product.price;
        }

        return total;
    }
}
