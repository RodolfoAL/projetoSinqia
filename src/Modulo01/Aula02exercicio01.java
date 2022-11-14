package Modulo01;
import java.util.Scanner;

public class Aula02exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int x = entrada.nextInt();
        System.out.println("Digite o segundo valor");
        int y = entrada.nextInt();

        /* if (x > 0 && y > 0) {
            System.out.println("O ponto está no quadrante B");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no quadrante C");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no quadrante D");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no quadrante A");
        } */

        String planoCartesiano;
        boolean A = (x < 0 && y > 0);
        boolean B = (x > 0 && y > 0);
        boolean C = (x > 0 && y < 0);
        boolean D = (x < 0 && y < 0);

        planoCartesiano = A ? "Quadrante A" : B ? "Quadrante B" : C ? "Quadrante C" : "Quadrante D";
        System.out.println(planoCartesiano);


    }
}
