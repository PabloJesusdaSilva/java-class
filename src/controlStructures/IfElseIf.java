package controlStructures;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your note: ");
        double note = scanner.nextDouble();

        if(note > 10 || note < 0){
            System.out.print("Invalid note!");
        } else if(note >= 8.1) {
            System.out.print("Concept A");
        } else if(note >= 6.1) {
            System.out.print("Concept B");
        } else if(note >= 4.1) {
            System.out.print("Concept C");
        } else if(note >= 2.1) {
            System.out.print("Concept D");
        } else {
            System.out.print("Concept E");
        }

        scanner.close();
    }
}
