package fundamentals;

import javax.swing.*;

public class Conversion {

    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.12345; // explícita (cast)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explícita (cast)
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);


        // Number to String convertation

        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;

        System.out.println(Integer.toString(num2));
        System.out.println(("" + num2).length());


        // String to Number convertation

        String valor1 = JOptionPane
                .showInputDialog("Digite o primerio numero");

        String valor2 = JOptionPane
                .showInputDialog("Digite o segundo numero");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma / 2);
    }
}
