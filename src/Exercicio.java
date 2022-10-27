import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int cond2 = 0;
        int valor = 0;
        double numerosDigitados = 0;
        double numerosInvertidos = 0;
        double num1;

        while (cond2 == 0) {
            try {
                do {
                    System.out.println("Digite a quantidade desejada de valores (maior que 0, claro!): ");
                    valor = entrada.nextInt();
                } while (valor == 0);








                double[] numeros = new double[50];

                List<Double> number = new ArrayList<Double>();

                int cond3 = 0;



                for (int i = 0; i < valor; i++) {
                    do {
                        System.out.println("Digite o número diferente de 0: ");
                        num1 = entrada2.nextDouble();
                    } while (num1 == 0);
                    numerosDigitados += num1;
                    numerosInvertidos += 1 / num1;
                    numeros[i] = num1;
                    number.add((double) i);
                }


                String calculo;


                    System.out.println("Digite o nome de qual cálculo você quer fazer:");
                    System.out.println("ARITMETICA OU HARMONICA");
                    calculo = entrada.next();

                int cond1 = 0;
                String conta1 = "ARITMETICA";
                String conta2 = "aritmetica";
                String conta3 = "HARMONICA";
                String conta4 = "harmonica";

                if ((calculo.equals("aritmetica")) || (calculo.equals("ARITMETICA"))) {
                    cond1 = 1;
                } else if ((calculo.equals("harmonica")) || (calculo.equals("HARMONICA"))) {
                    cond1 = 2;
                }


                double resposta = 0;
                if (cond1 == 1) {
                    resposta = numerosDigitados / valor;
                } else if (cond1 == 2) {
                    resposta = valor / numerosInvertidos;
                }
                System.out.println("O valor da média é: " + resposta);


                for (int i = 0; i < valor; i++) {
                    System.out.println("Número digitado: " + numeros[i]);
                }


                cond2 = 1;

            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Digito errado, por favor, digite um número, não uma letra");
            }

        }

    }}




