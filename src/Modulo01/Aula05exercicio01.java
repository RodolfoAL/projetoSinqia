package Modulo01;

public class Aula05exercicio01 {
    public static void main(String[] args) {

        String[][] turma = {{"Chico Bento", "04M01", "57", "62", "65", "59"},
                {"Rosinha", "04M02", "82", "87", "86", "96"},
                {"Zé Lelé", "04M03", "62", "66", "71", "73"},
                {"Zé da Roça", "04M04", "67", "75", "72", "77"},
                {"Hiro", "04M05", "82", "85", "81", "82"}};

        String student;

        dataPrint(turma);

        for (int i = 0; i < turma.length; i++) {
            student = turma[i][0];
            String studentRegistration = turma[i][1];
            System.out.printf("\nO(a) aluno(a) %s tem a matrícula %s e a média das suas notas é: " + average(student,turma), student, studentRegistration);
        }

    }

    /**
     * Método responsável em imprimir informações das matrículas e notas dos alunos
     * @param turma Matriz contendo informações de matricula e notas de alunos
     */
    public static void dataPrint(String[][] turma) {
        System.out.print("A lista de matrículas é: ");
        for (int i = 0; i < turma.length; i++) {
            if (i < turma.length - 2) {
                System.out.print(turma[i][1] + ", ");
            } else if (i < turma.length - 1) {
                System.out.print(turma[i][1] + " e ");
            } else {
                System.out.print(turma[i][1]);
            }
        }

        for (int i = 0; i < turma.length; i++) {
            System.out.printf("\nAs notas do(a) aluno(a) %s são: " + turma[i][2] + ", " + turma[i][3] + ", " + turma[i][4] + " e " + turma[i][5], turma[i][0]);
        }
    }

    /**
     * Método responsável por calcular a média aritmética das notas de um determinado aluno
     *
     * @param student solicitado para o usuário
     * @param turma   matriz contendo informações de matrícula e notas de alunos
     * @return média aritmética das notas
     */
    public static double average(String student, String[][] turma) {
        int index = 0;
        for (int i = 0; i < turma.length; i++) {
            if (student.equals(turma[i][0])) {
                index = i;
            }
        }
        double grade01 = Double.parseDouble(turma[index][2]);
        double grade02 = Double.parseDouble(turma[index][3]);
        double grade03 = Double.parseDouble(turma[index][4]);
        double grade04 = Double.parseDouble(turma[index][5]);

        double average = (grade01 + grade02 + grade03 + grade04) / 4;

        return average;
    }
}
