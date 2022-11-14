package Modulo01;

import java.util.Scanner;

public class Exercicio03Class {
    public static void main(String[] args) {
        /*
        Desenvolver um programa que deverá desenhar um triângulo conforme a figura abaixo. O programa deverá receber quantidade de linhas a serem impressas.
            Exemplo, se for informado 10 linhas, o resultado deverá ser:
            **********
            *********
            ********
            *******
            ******
            *****
            ****
            ***
            **
            *
         */

        Scanner entrance = new Scanner(System.in);
        System.out.println("De quantas linhas será seu triângulo?");
        int triangle = entrance.nextInt();
        String asterisk = "*";
        int number = triangle;

        for (int i = 0; i <= triangle; i++) {
            System.out.println(asterisk.repeat(number));
            number--;
        }
        entrance.close();
    }
}
