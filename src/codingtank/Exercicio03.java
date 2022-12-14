package codingtank;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        System.out.println("Digite qual operação você quer realizar ( +, -, / ou *): ");
        String operacao = entrada.next();
        System.out.println("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();


        if ((operacao.equals("+")) || (operacao.equals("soma")) || (operacao.equals("mais"))) {
            double numero = valor1 + valor2;
            System.out.println("A soma dos valores é: " + numero);
        } else if ((operacao.equals("-")) || (operacao.equals("subtração")) || (operacao.equals("menos"))) {
            double numero = valor1 - valor2;
            System.out.println("O 1º valor menos o 2º valor dá: " + numero);
        } else if ((operacao.equals("/")) || (operacao.equals("divisão")) || (operacao.equals("dividido"))) {
            double numero = valor1 / valor2;
            System.out.println("O 1º valor dividido pelo 2º valor é: " + numero);
        } else if ((operacao.equals("*")) || (operacao.equals("multiplicação")) || (operacao.equals("vezes"))) {
            double numero = valor1 * valor2;
            System.out.println("O 1º valor multiplicado pelo 2º valor é: " + numero);

        }

    }
}
