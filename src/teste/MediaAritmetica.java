package teste;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite valores de 0 a 10: ");

        int num1;
        do { num1 = entrada.nextInt();
        } while (num1 < 10);

        if (num1 > 10) {
            System.out.println(num1);
            System.err.println("nota inválida, digite números entre 0 e 10");
        }

        int num2 = 5;
        int num3 = mediaAritmetica(num1, num2);
        System.out.printf(" %d é o resultado", num3);
    }

    public static int mediaAritmetica(int dig1, int dig2) {
        int dig3 = dig1 * dig2;
        return dig3;
    }
}
