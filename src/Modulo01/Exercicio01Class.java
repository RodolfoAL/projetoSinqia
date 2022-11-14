package Modulo01;

import java.util.Scanner;

public class Exercicio01Class {
    public static void main(String[] args) {
        /*
        Crie um programa calculadora que recebe a operação matemática (somar, subtrair, multiplicar ou dividir) e os dois números. Mostre o resultado da operação.
        Entrada:
            Operação (somar, subtrair, multiplicar ou dividir)
            Número 1
            Número 2
        Saida:
            Resultado da operaçao
         */
        Scanner entrance = new Scanner(System.in);
        System.out.println("Qual operação você deseja fazer:");
        System.out.println("somar, subtrair, multiplicar ou dividir?");
        String operation = entrance.next();
        System.out.println("Digite o 1º valor");
        double number1 = entrance.nextDouble();
        System.out.println("Digite o 2º valor");
        double number2 = entrance.nextDouble();
        double resultado = 0;

        if (operation.equals("somar")) {
            resultado = number1 + number2;
        } else if (operation.equals("subtrair")) {
            resultado = number1 - number2;
        } else if (operation.equals("multiplicar")) {
            resultado = number1 * number2;
        } else if (operation.equals("dividir")) {
            resultado = number1 / number2;
        }

        System.out.println("O resultado da sua operação é: " + resultado);
        entrance.close();
    }
}
