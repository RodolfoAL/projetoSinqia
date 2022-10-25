import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        System.out.println("Existe(m) " + args.length + " argumento(s)");
        if (args.length == 0) {
            Scanner entrada01 = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            double valor01 = entrada01.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double valor02 = entrada01.nextDouble();
            double soma = valor01 + valor02;
            System.out.println("A soma dos valores digitados é: " + soma);
        } else if (args.length == 1) {
            double valor01 = Double.parseDouble(args[0]);
            Scanner entrada01 = new Scanner(System.in);
            System.out.println("Digite somente um valor: ");
            double valor02 = entrada01.nextDouble();
            double soma = valor01 + valor02;
            System.out.println("A soma do argumento com o valor digitado é: " + soma);
        } else if (args.length == 2) {
            double valor01 = Double.parseDouble(args[0]);
            double valor02 = Double.parseDouble(args[1]);
            double soma = valor01 + valor02;
            System.out.println("A soma dos valores no argumento é: " + soma);
        } else if (args.length > 2) {
            System.out.println("Existem argumentos em demasia, deixe no máximo 2!");
        }

        }

    }
