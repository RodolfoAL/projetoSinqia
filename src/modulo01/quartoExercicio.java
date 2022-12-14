package modulo01;
import java.util.Scanner;

public class quartoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o 1º número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = entrada.nextInt();

        if (num1>num2) {
            System.out.println("O 1º número: " + num1 + " é maior que o 2º: " + num2);
        } else if (num2 > num1) {
            System.out.println("O 2º número: " + num2 + " é maior que o 1:º " + num1);
        }
    }
}
