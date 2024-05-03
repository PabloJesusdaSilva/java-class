package challenges;

import java.util.Scanner;

public class Convertation {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter your first wage: ");
        String firstWage = enter.nextLine().replace(",", ".");

        System.out.println("Enter your second wage: ");
        String secondWage = enter.nextLine().replace(",", ".");

        System.out.println("Enter your terciary wage: ");
        String terciaryWage = enter.nextLine().replace(",", ".");

        double firstNumber = Double.parseDouble(firstWage);
        double secondNumber = Double.parseDouble(secondWage);
        double terciaryNumber = Double.parseDouble(terciaryWage);

        double average = (firstNumber + secondNumber + terciaryNumber) / 3;

        System.out.println("Your wage media is: " + average);

        enter.close();
    }
}
