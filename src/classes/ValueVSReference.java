package classes;

import challenges.Data;

public class ValueVSReference {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // attributation by value (primitive type)

        a++;
        b--;

        System.out.println(a + "" + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // attrbutation by reference (object)

        d1.day = 31;
        d2.month = 12;

        d1.year = 2024;

        System.out.println(d1.formatData());
        System.out.println(d2.formatData());

        defaultData(d1);

        System.out.println(d1.formatData());
        System.out.println(d2.formatData());

       int c = 5;
       changePrimitive(c);
        System.out.println(c);
    }

    static void defaultData(Data d) {
        d.day = 1;
        d.month = 1;
        d.year = 1970;
    }

    static void changePrimitive(int a) {
        a++;
    }

}
