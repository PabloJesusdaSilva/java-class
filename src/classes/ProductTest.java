package classes;

public class ProductTest {

    public static void main(String[] args) {

        Product productOne = new Product();

        productOne.name = "MacBook Air3";
        productOne.price = 23902.39;
        productOne.discount = 0.25;

        double finalPrice = productOne.discountPrice(0.5);
        System.out.printf("Is discount price: %.2f", finalPrice);
    }
}
