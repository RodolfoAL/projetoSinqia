import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int n1 = -11;
        int n2 = -1;
        int primo = 0;

        if (n2 == -2) {
            primo = 1;
        } else {
            for (int i = -2; i > n2; i--) {

            }
        }





















        /*

        Scanner entrada = new Scanner(System.in); // Solicita número natural e fala se é primo ou não (funciona)

        int n1, i;
        int primo = 0;

        System.out.print("digite o menor número: ");
        n1 = entrada.nextInt();

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
        // Final da verificação de número primo. Desta linha para cima está escrito o código que verifica um número.



        // Primeira tentativa - buscar número primo. A partir desse ponto é um código diferente (falhou)
         Scanner entrada = new Scanner(System.in);
        int n1, n2, i, j, primo = 0;

        System.out.printf("digite o menor número:  ");
        n1 = entrada.nextInt();
        System.out.printf("digite o maior número: ");
        n2 = entrada.nextInt();

        for (i = n2; i >= n1; i--) {
            if (n1 == 1 || n1 == 0)
                primo = 0;

            for (j = 2; j < i; j++) {
                if (i % j != 0) {
                    primo = 1;
                    break;
                }
            }
            if (primo == 1) {

                System.out.println(i);
            }
        }
        // Acima desse foi um código na tentative de se estabelecer se um determinado número é primo (falhou)

        */

    }
}