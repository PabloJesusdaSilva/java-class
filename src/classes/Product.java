package classes;

public class Product {

    String name;
    double price;
    double discount;

    double discountPrice (double managerDiscount) {
        return price * (1 - discount + managerDiscount);
    }
}

