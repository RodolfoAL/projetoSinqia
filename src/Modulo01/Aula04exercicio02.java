package Modulo01;

import java.util.Scanner;

public class Aula04exercicio02 {
    public static void main(String[]args) {

        /* Ler um elemento "K";
        Ler um vetor "A" de "N" elementos;
        Verificar se o elemento "K" está presente no vetor;
            Se estiver, imprimir qual a posição que ele se encontra.
            Se não estiver, imprimir a mensagem "Elemento K não encontrado". */

        Scanner entrance = new Scanner(System.in);
        System.out.println("Digite um número:");
        int number1 = entrance.nextInt();

        int [] vetor = new int[5];
        int count = 1, i = 0;
        boolean verify = false;

        do {
            System.out.printf("Digite o %dº elemento do vetor:", count);
            int element = entrance.nextInt();
            vetor[i] = element;
            i++;
            count++;
        } while (i < vetor.length);

        for (int j = 0; j < vetor.length; j++) {
            // System.out.print(vetor[j]);
            if (number1 == vetor[j]) {
                System.out.printf("O número digitado é igual ao %dº elemento do vetor", ++j);
                --j;
                verify = true;
            }
        }
        if (verify == false) {
            System.out.printf("O número %d não se encontra no vetor", number1);
        }
    }
}
