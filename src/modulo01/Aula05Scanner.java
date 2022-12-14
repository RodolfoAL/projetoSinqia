package modulo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula05Scanner {
    static Scanner entrance = new Scanner(System.in);

    public static void main(String[] args) {
        double number01 = userEntrance();
        double number02 = userEntrance();
        System.out.println(number01 + number02);
        entrance.close();
    }

    /**
     * M�todo respons�vel para receber a entrada do usu�rio
     *
     * @return um double digitado pelo usu�rio.
     */
    public static double userEntrance() {
        boolean verify = true;
        double number = 0;

        while (verify) {
            try {
                System.out.println("Digite um n�mero:");
                number = Double.parseDouble(entrance.nextLine());
                verify = false;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Caractere incorreto " + e.getMessage());
                System.out.println("Digito inv�lido, digite um n�mero por favor.");
            }
        }

        return number;
    }
}
