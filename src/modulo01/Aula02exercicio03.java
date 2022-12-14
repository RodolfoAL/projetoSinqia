package modulo01;
import java.util.Scanner;

public class Aula02exercicio03 {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário");
        double salario = entrada.nextDouble();
        /*
        double novoSalario = (13 * salario) / 12;
        System.out.println("A média simples do salário é: R$" + novoSalario);

        */
        double inss = salario * 0.925;
        // System.out.printf("O salário líquido é de R$%d", inss);

        double terco = salario / 3;
        // System.out.println("o terço de férias é R$" + terco);

        double salarioAnual = ((salario * 13) + terco );
        double salarioLiquidoAnual = salarioAnual* 0.925;
        System.out.println("O salário anual é de: R$" + salarioAnual);
        System.out.println("O salário liquido anual é de: R$" + salarioLiquidoAnual);
    }
}
