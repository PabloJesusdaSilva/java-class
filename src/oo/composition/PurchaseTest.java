package oo.composition;

public class PurchaseTest {

    public static void main(String[] args) {

        Purchase purchase1 = new Purchase();

        purchase1.addItem("Macbook", 2, 23.424);
        purchase1.addItem("iPhone 14 Pro Max", 3, 4.356);

        System.out.println(purchase1.items.size());
        System.out.println(purchase1.getTotalValue());
    }
}
