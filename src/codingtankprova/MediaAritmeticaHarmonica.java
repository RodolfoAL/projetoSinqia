package codingtankprova;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MediaAritmeticaHarmonica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int cond2 = 0;
        int valor = 0;
        double numerosDigitados = 0;
        double numerosInvertidos = 0;
        double num1;
        double[] numeros = new double[50];
        List<Double> number = new ArrayList<Double>();

        while (cond2 == 0) {
            try {
                do {
                    System.out.println("Digite a quantidade desejada de valores (maior que 0, claro!): ");
                    valor = entrada.nextInt();
                } while (valor <= 0);
                cond2 = 1;
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.err.println("Digito errado, por favor, digite um números, não uma letras");
            }
        }

        /*int cond3 = 0;
        while (cond3 == 0) {
            try {
                for (int i = 0; i < valor; i++) {
                    do {
                        System.out.printf("Digite o %dº número (diferente de 0): ", ++i);
                        num1 = entrada2.nextDouble();
                        i--;
                    } while (num1 == 0);
                    numerosDigitados += num1;
                    numerosInvertidos += 1 / num1;
                    numeros[i] = num1;
                    number.add((double) i);

                cond3 = 1;
                }
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.err.println("Digito errado. Digite numeros...");
            }
        }*/

        boolean digitos = false;
        do {
            for (int i = 0; i < valor; i++) {
                do {
                    System.out.printf("Digite o %dº número (diferente de 0): ", ++i);
                    num1 = entrada2.nextDouble();
                    i--;
                } while (num1 == 0);
                numerosDigitados += num1;
                numerosInvertidos += 1 / num1;
                numeros[i] = num1;
                number.add((double) i);

                if (num1 <= 0) {
                    digitos = false;
                } else if (num1 > 0) {
                    digitos = true;
                }
            }
        } while (!digitos);

        String calculo;

        int cond1 = 0;
        boolean verd = false;

        do {
            System.out.println("Escolha qual cálculo você quer fazer:");
            System.out.println("ARITMETICA OU HARMONICA");
            calculo = entrada.next();

            if ((calculo.equals("aritmetica")) || (calculo.equals("ARITMETICA"))) {
                cond1 = 1;
                verd = true;
            } else if ((calculo.equals("harmonica")) || (calculo.equals("HARMONICA"))) {
                cond1 = 2;
                verd = true;
            }
        } while (verd == false);


        double resposta = 0;
        if (cond1 == 1) {
            resposta = numerosDigitados / valor;
        } else if (cond1 == 2) {
            resposta = valor / numerosInvertidos;
        }
        System.out.println("A média escolhida foi: " + calculo);
        System.out.println("O valor da média é: " + resposta);

        for (int i = 0; i < valor; i++) {
            System.out.println("Número digitado: " + numeros[i]);
        }


    }
}




