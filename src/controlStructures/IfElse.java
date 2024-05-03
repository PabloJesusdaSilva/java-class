package controlStructures;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valueNumber = JOptionPane.showInputDialog("Enter the number");

        int number = Integer.parseInt(valueNumber);

        if(number % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Odd");
        }
    }
}
