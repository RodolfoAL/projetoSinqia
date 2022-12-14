package modulo01;

import java.util.Scanner;

public class Aula04exercicio03 {
    public static void main(String[] args) {

        /*
        Ler N valores inteiros (N < 100) até q seja digitado o valor "0;
        A seguir, inverter o vetor, trocando o 1º elemento com o último, o 2º com o penúltimo e assim sucessivamente;
        Ao final, imprimir o vetor invertido.
         */

        int element, i = 0, count = 100;
        int [] vetor = new int[count];
        int [] vetorInvertido = new int[count];

        Scanner entrance = new Scanner(System.in);
        do {
            System.out.printf("Digite o %dº elemento do vetor, ou 0 para finalizar:", ++i);
            element = entrance.nextInt();
            i--;
            vetor [i] = element;
            i++;
        } while (element != 0);

        for (int j = 0; j < vetor.length; j++) {
            vetorInvertido [j] = vetor [count-1];
            count--;
        }

        System.out.println("O vetor é:");
        for (int j = 0; j < vetorInvertido.length; j++) {
            System.out.print(vetor[j]);
        }

        System.out.println(" Já o vetor invertido é: ");
        for (int j = 0; j < vetorInvertido.length; j++) {
            System.out.print(vetorInvertido[j]);
        }
    }
}
