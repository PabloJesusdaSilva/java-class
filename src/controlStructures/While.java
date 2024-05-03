package controlStructures;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        int counter = 1;

        while(counter <= 10) {
            System.out.printf("i = %d\n", counter);
            counter++;
        }

        // while challengue
        Scanner scanner = new Scanner(System.in);

        String valueInput = "";

        while(!valueInput.equalsIgnoreCase("exit")) {
            System.out.print("Enter value: ");
             valueInput = scanner.nextLine();
        }

        scanner.close();
    }
}
