package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {

        Supplier<List<String>> aList = () -> Arrays.asList("Lia", "Bia", "Gui");

        System.out.println(aList.get());
    }
}
