package challenges;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = enter.nextLine();

        System.out.print("Enter your weight: ");
        double weight = enter.nextDouble();

        System.out.print("Enter your height: ");
        double height = enter.nextDouble();

        double resultHeight = Math.pow(height, 2);
        double result = weight / resultHeight;

        System.out.printf("\nHello %s! \nIs your BMI: %.2f\n", name, result);
    }
}
