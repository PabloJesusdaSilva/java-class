package controlStructures;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("Enter the magic words");
            System.out.print("Want exit?");

            text = scanner.nextLine();
        } while (!text.equalsIgnoreCase("please"));

        scanner.close();
    }
}
