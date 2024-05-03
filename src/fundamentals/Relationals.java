package fundamentals;

public class Relationals {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);

        System.out.println(3 > 5);
        System.out.println(3 >= 5);
        System.out.println(43 < 45);
        System.out.println(23 != 1);

        double nota = 7.4;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota > 7;

        boolean temDesconto = bomComportamento && passouPorMedia;
    }
}
