package challenges;

import java.util.Scanner;

public class DatOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String dayOfTheWeek = scanner.next();

        if(dayOfTheWeek.equalsIgnoreCase("sunday")) {
            System.out.println(1);
        } else if(dayOfTheWeek.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if(dayOfTheWeek.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if(dayOfTheWeek.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if(dayOfTheWeek.equalsIgnoreCase("thursday")) {
            System.out.println(5);
        } else if(dayOfTheWeek.equalsIgnoreCase("friday")) {
            System.out.println(7);
        } else if(dayOfTheWeek.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Day of the week invalid!");
        }
    }
}
