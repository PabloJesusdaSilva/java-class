package classes;

public class Product {

    String name;
    double price;
    static double discount = 0.25;

    Product() {}

    Product(String initialName, double initialPrice) {
        name = initialName;
        price = initialPrice;
    }

    double discountPrice (double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}

