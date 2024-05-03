package challenges;

import java.util.Scanner;

public class ControlStructureOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number from 0 to 10: ");
        double noteNumber = scanner.nextDouble();

        if (noteNumber > 0 && noteNumber <= 10) {
            System.out.println("\nIs number valid!");
        } else {
            System.out.println("\nIs number invalid!\n");
        }

        if (noteNumber % 2 == 0) {
            System.out.println("Is number pair");
        } else {
            System.out.println("Is number odd");
        }
    }
}
