package Modulo01;

import java.util.Arrays;
import java.util.Scanner;

public class Aula04exercicio04 {
    public static void main(String[] args) {

        /* Faça um programa que imprima uma matriz quadrada de dimensão "N" contendo:
            O número 1 nos elementos abaixo da diagonal principal;
            O número 0 nos demais elementos;
        N deve ser menor ou igual a 20. */

        Scanner entrance = new Scanner(System.in);
        int dimension, lines, columns, i, j = 0;
        do {
            System.out.println("Digite uma dimensão da matriz quadrada:");
            dimension = entrance.nextInt();
            lines = columns = dimension;
        } while (dimension < 2 || dimension > 20);

        int[][] matrix = new int[lines][columns];

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++)
                if (j < i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
        }

        for (i = 0; i < matrix.length; i++) {
            System.out.println();
            for (j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
