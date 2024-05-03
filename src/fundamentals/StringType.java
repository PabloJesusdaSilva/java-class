package fundamentals;

public class StringType {

    public static void main(String[] args) {
        System.out.println("Hello");

        String goodMorning = "Good Morning";

        System.out.println(goodMorning.concat("!!!"));
        System.out.println(goodMorning.startsWith("Good"));
        System.out.println(goodMorning.toLowerCase().endsWith("morning"));
        System.out.println(goodMorning.toUpperCase().startsWith("GOOD"));
        System.out.println(goodMorning.length());
        System.out.println(goodMorning.equalsIgnoreCase("good morning"));

        String name = "Pablo";
        String lastName = "Jesus";
        int age = 19;
        Double wage = 49234.234;

        System.out.printf("Name: %s %s \nage: %d \nwage: R$%.2f", name, lastName, age, wage);

        String frase = String.format("\n\nName: %s %s \nage: %d \nwage: R$%.2f \n", name, lastName, age, wage);
        System.out.printf(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));

    }
}
