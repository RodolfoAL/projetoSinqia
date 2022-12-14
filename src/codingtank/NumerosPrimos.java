package codingtank;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1, n2, j, contador = 0;

        System.out.print("digite o menor número: ");
        n1 = entrada.nextInt();
        System.out.print("digite o maior número: ");
        n2 = entrada.nextInt();

        int[] numerosPrimos = new int[50];

        for (j = n2; j >= n1; j--) {
            int numeroAVerificar = verificaPrimo(j);
            if (numeroAVerificar != 0) {
                numerosPrimos[contador] = numeroAVerificar;
                //System.out.println("Consta no array: " + numerosPrimos[contador]);
                contador++;
            }
        }
        for (int i = 0; i < numerosPrimos.length; i++) System.out.println(numerosPrimos[i]);
    }
    public static int verificaPrimo(int dig1){
         int i;
        int primo = 0;

        if (dig1 == 2) {
            primo = 1;
        }
        else {
            for (i = 2; i < dig1; i++) {
                if (dig1 % i != 0) {
                    primo = 1;
                } else if (dig1 % i == 0) {
                    primo = 0;
                    break;
                }
            }
        }
        int numeroVerificado = 0;
        if (primo == 1) {
            //System.out.printf("%d é primo", dig1);
            numeroVerificado = dig1;
        }   else {

        }
        return numeroVerificado;
    } // Função que verifica se é primo um determinado número
}





/*



import java.util.Scanner;

public class PrimoRAL {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2, i, j, primo = 0;

        System.out.printf("digite o menor número: ");
        n1 = entrada.nextInt();
        System.out.printf("digite o maior número: ");
        n2 = entrada.nextInt();


        // Abaixo desse ponto foi uma tentativa de verificar se no intervalo solicitado quais números são primos

        for (i = n2; i >= n1; i--) {
            if (i == 0 || i == 1) {
                primo = 0;
            }

            for (j = 2; j < i; j++) {
                if (i % j != 0) {
                    primo = 1;
                } else if (i % j == 0) {
                    primo = 0;
                    break;
                }
            }
            if (primo == 1) {
                System.out.println(i);
            }
        }
        //Acima desse ponto foi um código para tentar verificar se no intervalo quais números são primos


        // Tentativa de código de estabelecer se no intervalo de 2 números solicitados quais números são primos
        // fuinciona em partes...

        int l = 0;

        for (i = n1; i <= n2; i++) {
            if (i == 0 || i == 1) {
               // System.out.println("i = " + i + ", n1 = " + n1 + " n2 = " + n2);
                primo = 0;
                continue;
            }
        }
        // System.out.println("primo = " + primo);
        // System.out.println("i = " + i + ", n1 = " + n1 + " n2 = " + n2);
        // System.out.println("próximo FOR: ");

        for (l = n2; l >= n1; l--) {
        // System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", l = " + l);

           for (j = 2; j < l; j++) {
            // System.out.println("n1 = " + n1 + ", l = " + l + ", j = " + j);
                if (l % j != 0) {
                // System.out.println(n2 + " / " + j + " = " + n2 / j + " resto: " + n2 % j);
                    primo = 1;
                    // System.out.println("primo = " + primo);
                } else if (l % j == 0) {
                    primo = 0;
                    // System.out.println("primo = " + primo);
                    break;
                }
            }
            if (primo == 1) {
            // System.out.println("seguem os números primos:");
                System.out.println(l);
            }
        }
        // System.out.println("saiu do FOR: ");
        // System.out.println("primo = " + primo);
        // System.out.println("i = " + i + ", n1 = " + n1 + ", n2 = " + n2);

        // Acima desse ponto é a tentativa de se estabelecer se no intervalo de 2 números solicitados quais números
        // são primos - Funcionou em partes



        for (i = n1; i <= n2; i++) {
            if (i == 1 || i == 2)
                continue;
            primo = 1;

        }
        for (j = 2; j <= i/2; ++j) {
            if (i % j == 0) {
                primo = 0;
                break;
            }
        }
        if (primo == 1) {
            System.out.println(i);
        }

        long n1 = 5;
        long n2 = 16;
        boolean primo = true;

        //for (long j = n2; j > n1; j--) {
        while (n2 >= n1) {
            //System.out.println(n1);
            for (long i = 2; i < n1; i++) {
                if (n1 % i == 0) {
                    //System.out.println("o número: " + n1 + " resto " + i + " tem resto diferente de 0");
                    primo = false;
                    break;
                } else {
                }
            if (primo = true) {
                System.out.println(n1);
            }
            }
            n1++;
            }
        }
    }



            for (long i = 2; i < n2; i++) {
                if (n2 % i != 0) {
                    //System.out.println(i);
                } else {
                   // System.out.println(n2);

    }
}
 */