package Modulo01;

public class Aula05matrix {
    public static void main(String[] args) {
        String[][] matrix = {{"casa", "bola", "brinquedo" }, {"skate", "livro", "celular" }};
        for (String[] linha : matrix) {
            System.out.println();
            for (String intemLinha : linha) {
                System.out.print(intemLinha + " ");
            }
        }
    }
}
