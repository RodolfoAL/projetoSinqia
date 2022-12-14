package modulo01;
import java.util.Scanner;

public class primeiroExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(nome);
        System.out.println(idade);
    }
}
