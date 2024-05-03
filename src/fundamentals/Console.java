package fundamentals;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Good Morning");

        System.out.printf("Megasena: %d %d %d %d", 1, 2, 3, 4);

        System.out.printf("\nWage is: %.1f", 1234.5678);

        Scanner enter = new Scanner(System.in);

        System.out.println("\nEnter your name: ");
        String name = enter.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = enter.nextLine();

        System.out.println("Enter your age: ");
        int age = enter.nextInt();

        System.out.printf("Name: %s \nLast name: %s \nAge: %d", name, lastName, age);

        enter.close();
    }
}
