package modulo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula04exercicio04 {
    public static void main(String[] args) {

        /* Faça um programa que imprima uma matriz quadrada de dimensão "N" contendo:
            O número 1 nos elementos abaixo da diagonal principal;
            O número 0 nos demais elementos;
        N deve ser menor ou igual a 20. */

        Scanner entrance = new Scanner(System.in);
        int index = 0;
        boolean verify = true;

        while (verify) {
            try {
                do {
                    System.out.println("Digite uma dimensão da matriz quadrada (entre 2 e 20):");
                    index = Integer.parseInt(String.valueOf(entrance.nextLine()));
                } while (index < 2 || index > 20);
                verify = false;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Caractere incorreto " + e.getMessage());
                System.out.println("Digito inválido, digite um número por favor.");
            }
        }

        int[][] matrix = new int[index][index];
        int[][] newMatrix = setMatrix(matrix);

        System.out.println(relocateMatrix(newMatrix));

        entrance.close();
    }

    /**
     * Método responsável em alterar a matriz bidimensional de 0 e 1
     * @param matrix matriz de dimensões informadas pelo usuário
     * @return nova matriz formada no método
     */
    public static int[][] setMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                if (j < i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
        }
        return matrix;
    }

    /**
     * Método responsável em configurar a forma de impressão da matriz
     * @param matrix matriz gerada no método setMatrix
     * @return a própria matriz já configurada
     */
    public static String relocateMatrix(int[][] matrix) {
        String data = " ";
        for (int i = 0; i < matrix.length; i++) {
            data += "\n";
            for (int j = 0; j < matrix.length; j++) {
                data += (matrix[i][j] + " ");
            }
        }
        return data;
    }
}
