package org.example;

import java.util.Scanner;

public class SequenciaDeFibonacii {
    public static void main(String[]args) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número");

        int valor;
        for(valor = sc.nextInt(); valor > num3; num2 = num3) {
            num3 = num1 + num2;
            num1 = num2;
        }

        if (valor == num3) {
            System.out.print("O valor esta na sequencia de fibonacci. " + valor);
        } else {
            System.out.print("O valor nao esta na sequencia de fibonacci " + valor);
        }
    }
}
