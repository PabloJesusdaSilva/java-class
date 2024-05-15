package challenges;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of notes: ");
        int numberNotes = scanner.nextInt();

        double[] notes = new double[numberNotes];

        for(int i = 0; i < numberNotes; i++) {
            System.out.print("\nEnter the note" + (i + 1) + ": ");

            notes[i] = scanner.nextDouble();
        }

        double total = 0;
        for(double note: notes) {
            total += note;
        }

        double media = total / notes.length;
        System.out.printf("Is media: %.2f", media );
    }
}
