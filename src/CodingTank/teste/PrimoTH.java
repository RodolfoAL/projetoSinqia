package CodingTank.teste;

import java.util.Scanner;
public class PrimoTH {
    public static void main(String[] args) {

        /*

        Scanner entrada = new Scanner(System.in);
        int n1, n2, i, j, primo = 0;

        System.out.printf("digite o menor número:  ");
        n1 = entrada.nextInt();
        System.out.printf("digite o maior número: ");
        n2 = entrada.nextInt();

        for (i = n2; i >= n1; i--) {
            if (n1 == 1 || n1 == 0)
                primo = 0;

            for (j = 2; j < i; j++) {
                if (i % j != 0) {
                    primo = 1;
                    break;
                }
            }
            if (primo == 1) {
                System.out.println(i);
            }
        }

        */


        Scanner sc = new Scanner(System.in);
        // variaveis
        int a, b, i, j, priminho;

        //menor numero
        System.out.printf("Digite o menor numero: ");
        a = sc.nextInt();

        //maior numero
        System.out.printf("Digite o maior numero: ");
        b = sc.nextInt();

        // pegamos um indice para percorrer a lista dos numeros começando a partir do menor numero
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0) // verificamos se ele é 0 ou 1 pois eles já são primos!
                continue;
            priminho = 1; // dizemos que ele é primo para depois verificar se ele muda de status

            //tentamos fazer uma divisão para verificar se o resto é 0 se for mudamos o status para não primo
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    priminho = 0; // mudamos o status para não primo se esse caso for verdadeiro e voltamos ao primeiro for
                    break;
                }
            }
            //verifica o status da variavel para printar o numero que está dentro do indice ( nosso priminho )
            if (priminho == 1)
                System.out.println(i);


        }
    }}