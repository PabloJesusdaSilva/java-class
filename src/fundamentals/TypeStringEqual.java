package fundamentals;

import java.util.Scanner;

public class TypeStringEqual {

    public static void main(String[] args) {

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner scanner =  new Scanner(System.in);

        String s2 = scanner.next();

        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        scanner.close();
    }
}
