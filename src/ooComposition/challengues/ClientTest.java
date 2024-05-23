package ooComposition.challengues;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) {

        Client client = new Client("Pablo Jesus da Silva");

        Purchase purchaseOne = new Purchase();
        purchaseOne.addItem("MacBook Pro", 38.999, 2);
        purchaseOne.addItem(new Product("iPhone 15 Pro Max", 12.499), 2);

        Purchase purchaseTwo = new Purchase();
        purchaseTwo.addItem("iPad Pro", 15.889, 2);
        purchaseTwo.addItem(new Product("Watch Series 9", 5.399), 2);

        client.addPurchase(purchaseOne);
        client.purchases.add(purchaseTwo);

        System.out.println("$" + client.getTotalValue());
    }
}
