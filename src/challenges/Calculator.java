package challenges;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the symbol ( + , -, *, /, % ): ");
        String symbol = scanner.next();

        // Logic

        double result = "+".equals(symbol) ? firstNumber + secondNumber : 0;
        result = "-".equals(symbol) ? firstNumber - secondNumber : result;
        result = "*".equals(symbol) ? firstNumber * secondNumber : result;
        result = "/".equals(symbol) ? firstNumber / secondNumber : result;
        result = "%".equals(symbol) ? firstNumber % secondNumber : result;

        System.out.printf("%.2f %s %.2f = %.2f", firstNumber, symbol, secondNumber, result);
        scanner.close();
    }
}
