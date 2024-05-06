package classes;

public class Product {

    String name;
    double price;
    double discount;

    Product() {}

    Product(String initialName, double initialPrice, double initialDiscount) {
        name = initialName;
        price = initialPrice;
        discount = initialDiscount;
    }

    double discountPrice (double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}

