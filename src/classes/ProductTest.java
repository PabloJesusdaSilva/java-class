package classes;

public class ProductTest {

    public static void main(String[] args) {

        Product oneProduct = new Product("MacBook Air3", 23902.39, 0.25);
        Product secondProduct = new Product("iPhone 15 Pro Max", 6.345, 0.2);

        //productOne.name = "MacBook Air3";
        //productOne.price = 23902.39;
        //productOne.discount = 0.25;

        double finalPriceOneProduct = oneProduct.discountPrice(0.5);
        double finalPriceSecondProduct = secondProduct.discountPrice(0.2);

        System.out.println(oneProduct.name);
        System.out.printf("Is discount price: %.2f", finalPriceOneProduct);
        System.out.printf("Is discount price: %.2f", finalPriceSecondProduct);
    }
}
