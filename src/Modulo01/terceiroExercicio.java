package Modulo01;
import java.util.Scanner;

public class terceiroExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite o 3º número: ");
        int num3 = entrada.nextInt();

        System.out.println(num1 + " , " + num2 + " , " + num3);
        boolean maior;
        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println(num1 + " é o maior número seguido de " + num2 + " e o menor é: " + num3);
        } else if (num2 > num2 && num2 > num3 && num1 > num3) {
            System.out.println(num2 + " é o maior número seguido de " + num1 + " e o menor é: " + num3);
        } else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println(num1 + " é o maior número seguido de " + num3 + " e o menor é: " + num2);
        }


    }
}
