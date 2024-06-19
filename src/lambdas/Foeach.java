package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foeach {

    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Thi");

        System.out.println("Forma tradicional...");
        for(String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01");
        approved.forEach(name -> System.out.println(name + "!!!"));

        System.out.println("\nMethod Reference");
        approved.forEach(System.out::println);

        System.out.println("\nLambda #02");
        approved.forEach(name -> myPrint(name));

        System.out.println("\nMethod Reference #2");
        approved.forEach(Foeach::myPrint);

    }

    static void myPrint(String name) {
        System.out.println("Hello, my name is " + name);
    }
}
