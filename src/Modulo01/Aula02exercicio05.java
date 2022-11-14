package Modulo01;
import java.util.Scanner;

public class Aula02exercicio05 {
    public static  void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = entrada.nextInt();

        /* if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        } */

        System.out.println((num % 2 == 0) ? "O número é par" : "O número é impar");
    }
}
