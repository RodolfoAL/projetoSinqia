package Modulo01;
import java.util.Scanner;

public class Aula02exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, i;
        int primo = 0;

        System.out.print("digite um número: ");
        n1 = entrada.nextInt();

        if (n1 < 0) {
            n1 = n1 * (-1);
        }

        if (n1 == 2) {
            primo = 1;
        }
        else {
            for (i = 2; i < n1; i++) {
                if (n1 % i != 0) {
                    primo = 1;
                } else if (n1 % i == 0) {
                    primo = 0;
                    break;
                }
            }
        }
        if (primo == 1) {
            System.out.println("O número é primo");
        }   else {
            System.out.println("O número não é primo");
        }
    }
}
