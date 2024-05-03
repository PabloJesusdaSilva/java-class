package controlStructures;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your media: ");
        double media = scanner.nextDouble();

        boolean approved = media <= 10 && media >= 7;
        boolean recovery = media < 7 && media >= 4.5;

        if(approved) {
            System.out.print("Approved\n");
        }

        if(recovery) {
            System.out.print("Recovery");
        }

        if(media < 4.5) {
            System.out.print("Disapproved\n");
        }

        scanner.close();
    }
}
