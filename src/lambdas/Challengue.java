package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challengue {

    public static void main(String[] args) {

        Function<Product, Double> finalPrice =
                product -> product.price * (1 - product.discount);

        UnaryOperator<Double> impostoMunicipal =
                price -> price >= 2500 ? price * 1.085 : price;

        UnaryOperator<Double> frete =
                price -> price >= 3000 ? price + 100 : price + 50;

        UnaryOperator<Double> arredondar = price -> {
            String formattedPrice = String.format("%.2f", price).replace(",", ".");
            return Double.parseDouble(formattedPrice);
        };

        Function<Double, String> formatar =
                price -> ("R$" + price);

        Product p = new Product("iPad", 3543.75, 0.50);
        String price = finalPrice
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("This is final price " + price);
    }
}
