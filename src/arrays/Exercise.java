package arrays;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        double[] studentsGradesA = new double[3];

        studentsGradesA[0] = 8.5;
        studentsGradesA[1] = 8;
        studentsGradesA[2] = 9.2;

        System.out.println(Arrays.toString(studentsGradesA));
        System.out.println(studentsGradesA[studentsGradesA.length - 1]);
        System.out.println(studentsGradesA[2]);

        double totalStudentA = 0;
        for(int i = 0; i < studentsGradesA.length; i++) {
            totalStudentA += studentsGradesA[i];
        }

        System.out.println(totalStudentA / studentsGradesA.length);

        final double storedNote = 4.5;
        double[] studentsGradesB = { 6.6, storedNote, 9.4 };

        double totalStudentB = 0;
        for(int i = 0; i < studentsGradesB.length; i++) {
            totalStudentB += studentsGradesB[i];
        }

        System.out.println(totalStudentB / studentsGradesB.length);
    }
}
