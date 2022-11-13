package CodingTank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class codigoExcecao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        int verify = 0;

        while (verify == 0) {
         try {
             System.out.print("Digite o primeiro número: ");
             num1 = entrada.nextDouble();

             System.out.print("Digite o segundo número: ");
             num2 = entrada.nextDouble();

             if (num2 == 0) {
                 System.out.println("Divisão por 0 não vale, digite outro valor: ");
                 num2 = entrada.nextDouble();
             }
             verify = 1;



         } catch (InputMismatchException e) {
             entrada.nextLine();
             System.out.println("Digito inválido, tente novamente");
         }


        }

        double num3 = num1 / num2;
        System.out.println(num3);
    }
}
