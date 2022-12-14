package modulo01;

import java.util.InputMismatchException;
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
        String operation;
        Double number1 = 0.0;
        Double number2 = 0.0;
        boolean verify = true;

        do {
            System.out.println("Qual operação você deseja fazer:");
            System.out.println("somar, subtrair, multiplicar ou dividir?");
            operation = entrance.nextLine().toLowerCase();
            switch (operation) {
                case "somar":
                case "subtrair":
                case "multiplicar":
                case "dividir":
                    verify = false;
                    break;
                default:
                    System.out.println("Operação inválida, digite novamente!");
            }
        } while (verify);

        verify = true;

        while (verify) {
            try {
                System.out.println("Digite o 1º número:");
                number1 = Double.parseDouble(entrance.nextLine());
                verify = false;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Caractere incorreto " + e.getMessage());
                System.out.println("Digito inválido, digite um número por favor.");
            }
        }

        verify = true;

        while (verify == true) {
            try {
                System.out.println("Digite o 2º valor");
                number2 = Double.parseDouble(entrance.nextLine());
                verify = false;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println(e);
                System.out.println("Digito inválido, digite um número por favor.");
            }
        }
        double resultado = 0;

        /* if (operation.equals("somar")) {
            resultado = number1 + number2;
        } else if (operation.equals("subtrair")) {
            resultado = number1 - number2;
        } else if (operation.equals("multiplicar")) {
            resultado = number1 * number2;
        } else if (operation.equals("dividir")) {
            if (number2 == 0) {
                do {
                    System.out.println("Opção inválida, digite outro número: ");
                    number2 = entrance.nextDouble();
                } while (number2 == 0);
            }
            resultado = number1 / number2;
        } */

        switch (operation) {
            case "somar":
                resultado = number1 + number2;
                break;
            case "subtrair":
                resultado = number1 - number2;
                break;
            case "multiplicar":
                resultado = number1 * number2;
                break;
            case "dividir":
                if (number2 == 0) {
                    do {
                        System.out.println("Opção inválida, digite outro número: ");
                        number2 = entrance.nextDouble();
                    } while (number2 == 0);
                    resultado = number1 / number2;
                }
                break;
            default:
                System.out.println("Pam, Tela azul! Você fez algo errado! Rode outra vez");
        }

        System.out.println("O resultado da sua operação é: " + resultado);
        entrance.close();
    }
}
