package controlStructures;

import java.util.Locale;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        String range = "brown";

        switch (range) {
            case "black":
                System.out.println("Is this color black");
            case "blue":
                System.out.println("Is this color blue");
            case "orange":
                System.out.println("Is this color orange");
        }

        // with break

        /*Scanner scanner = new Scanner(System.in);

        String concept = "";
        //System.out.print("Enter your note: ");
        int note = scanner.nextInt();

        switch(note) {
            case 10: case 9:
                concept = "A";
                break;
            case 8: case 7:
                concept = "B";
                break;
            case 6: case 5:
                concept = "C";
                break;
            case 4: case 3:
                concept = "D";
                break;
            case 2: case 1:
                concept = "E";
                break;
            default:
                System.out.println("This concept not existed");
        }

        System.out.printf("Your concept is: %s", concept);*/

        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }

            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 1) {
                continue;
            }

            System.out.println(i);
        }
    }
}
