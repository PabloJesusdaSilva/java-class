package fundamentals;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        //Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(enter.next()); // int
        Long l = 1000000l;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean boo = Boolean.parseBoolean("true");

        System.out.println(boo);
        System.out.println(boo.toString().toUpperCase());

        Character c = '#';

        System.out.println(c + "...");
    }
}
