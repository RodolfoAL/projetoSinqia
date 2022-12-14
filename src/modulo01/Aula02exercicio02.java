package modulo01;
import java.util.Scanner;

public class Aula02exercicio02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor do salário");
        int salario = ent.nextInt();
        System.out.println("Digite o cargo do funcionário");
        String cargo = ent.next();
        double novoSalario = 0;

        if (cargo.equals("tecnico")) {
            novoSalario = salario * 1.5;
        } else if (cargo.equals("gerente")) {
            novoSalario = salario * 1.3;
        }else if (cargo.equals("demais")) {
            novoSalario = salario * 1.2;
        }
        System.out.printf("O cargo %s tem como novo salário: R$" + novoSalario, cargo);

    }
}
