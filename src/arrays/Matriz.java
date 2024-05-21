package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students: ");
        int howStudents = scanner.nextInt();

        System.out.print("How many notes for students: ");
        int howNotesForStudents = scanner.nextInt();

        double[] [] notesForClass = new double[howStudents][howNotesForStudents];

        double total = 0;
        for (int i = 0; i < notesForClass.length; i++) {
            for (int j = 0; j < notesForClass[i].length; j++) {
                System.out.printf("Enter the student %d grade %d: ", j, i);

                notesForClass[i][j] = scanner.nextDouble();
                total += notesForClass[i][j];
            }
        }

        double media = total / (howStudents * howNotesForStudents);
        System.out.printf("The avarage of the class is %.2f: ", media);

        for(double[] noteForStudent: notesForClass) {
            System.out.printf(Arrays.toString(noteForStudent));
        }
        scanner.close();
    }
}
