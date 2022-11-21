package Modulo01;

import java.util.Scanner;

public class Aula05exercicio01Scanner {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        String[][] turma = new String[5][6];
        int count = 1, count2 = 1;
        String student, registration, grade1, grade2, grade3, grade4;
        boolean verify = true;

        for (int i = 0; i < turma.length; i++) {
            System.out.printf("Para cadastrar o %dº aluno(a), digite seu nome: ", count);
            student = entrance.nextLine();
            turma[i][0] = student;
            System.out.print("Digite agora sua matrícula: ");
            registration = entrance.nextLine();
            turma[i][1] = registration;
            while (verify) {
                try {
                    System.out.printf("Entre com a nota do %dº semestre: ", count2);
                    grade1 = entrance.nextLine();
                    turma[i][2] = grade1;
                    Double grade01 = Double.parseDouble(grade1);
                    verify = false;
                } catch (NumberFormatException e) {
                    System.out.println("Valor incorreto " + e.getMessage());
                }
            }
            count2++;
            verify = true;
            while (verify) {
                try {
                    System.out.printf("Entre com a nota do %dº semestre: ", count2);
                    grade2 = entrance.nextLine();
                    turma[i][3] = grade2;
                    Double grade02 = Double.parseDouble(grade2);
                    verify = false;
                } catch (NumberFormatException e) {
                    System.out.println("Valor incorreto " + e.getMessage());
                }
            }
            count2++;
            verify = true;
            while (verify) {
                try {
                    System.out.printf("Entre com a nota do %dº semestre: ", count2);
                    grade3 = entrance.nextLine();
                    turma[i][4] = grade3;
                    Double grade03 = Double.parseDouble(grade3);
                    verify = false;
                } catch (NumberFormatException e) {
                    System.out.println("Valor incorreto " + e.getMessage());
                }
            }
            count2++;
            verify = true;
            while (verify) {
                try {
                    System.out.printf("Entre com a nota do %dº semestre: ", count2);
                    grade4 = entrance.nextLine();
                    turma[i][5] = grade4;
                    Double grade04 = Double.parseDouble(grade4);
                    verify = false;
                } catch (NumberFormatException e) {
                    System.out.println("Valor incorreto " + e.getMessage());
                }
            }
            verify = true;
            count++;
            count2 -= 3;
        }
        for (int i = 0; i < turma.length; i++) {
            System.out.println();
            for (int j = 0; j < turma.length + 1; j++) {
                System.out.print(turma[i][j]);
            }
        }

    }
}
