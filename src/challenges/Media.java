package challenges;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int validNotes = 0;
        int invalidNotes = 0;
        int total = 0;
        double totalSum = 0;

        double note = 0;

        while (note != -1) {
            System.out.println("\nIf you want to leave, type -1");
            System.out.print("Enter your note: ");
            note = scanner.nextDouble();

            if(note < 0 || note > 10) {
                System.out.println("\nInvalid note!\n");

                total++;
                invalidNotes++;
            } else if(note <= 10 && note > 0) {
                total++;
                totalSum += note;
                validNotes++;
            }
        }

        double media = totalSum / validNotes;

        System.out.printf("\nTotal marks: %d\n", total);
        System.out.printf("\nValidad notes: %d\n", validNotes);
        System.out.printf("\nInvalid notes: %d\n", invalidNotes);
        System.out.printf("\nIs media: %.2f\n", media);

        scanner.close();
    }
}
