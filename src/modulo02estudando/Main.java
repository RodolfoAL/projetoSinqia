package modulo02estudando;

import modulo02estudando.docencia.Aluno;
import modulo02estudando.docencia.Professor;
import modulo02estudando.veiculo.VwGol;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno rodolfo = new Aluno("Rodolfo");
        rodolfo.register("Dev_Makers_2");
        rodolfo.grade = 10;
        rodolfo.presence = 100;
        rodolfo.attendClass("POO-1", "Trabalho 01A");
        rodolfo.receivActivity("POO-1", "Trabalho 01A");

        ArrayList<String> disciplines = new ArrayList<>();
        disciplines.add("POO-1");

        Professor william = new Professor("William");
        william.register("Dev_Makers_2", disciplines);
        william.teach("Trabalho 01A", disciplines.get(0));
        william.correctActivity("POO-1", "Trabalho 01A");

        System.out.println("=================================================================="); //=================================================================================================

        //casaRodolfo � o objeto criado a partir da classe PlantaCasa
        PlantaCasa casaRodolfo = new PlantaCasa(); // instanciei um objeto - recebe um ponteiro para indicar onde foi alocado na mem�ria

        System.out.println("A casa tem: " + casaRodolfo.room + " quartos, " + casaRodolfo.livingRoom + " salas, " + casaRodolfo.kitchen + " cozinha, " + casaRodolfo.bathroom+ " banheiros.");

        System.out.println("=================================================================="); //=================================================================================================

        /* golRodolfo � o objeto criado a partir da classe ProjetoGol
        quando se coloca o "new", � que se cria um novo objeto.
         */

        VwGol golDoRodolfo = new VwGol(2022, "White", 5);
        /* Como era descrito abaixo antes da cria��o do construtor com os par�metros
        golDoRodolfo.howManyDoors = 5;
        golDoRodolfo.fabricationYear = 2022;
        golDoRodolfo.color = "White";
        */

        System.out.println("O VW Gol do Rodolfo � da cor: " + golDoRodolfo.color);
        changeColor(golDoRodolfo);
        System.out.println("O VW Gol do Rodolfo mudou para a cor: " + golDoRodolfo.color);
        golDoRodolfo.turnOn();

        VwGol golDaKatia = new VwGol(2022, "Red", 5);
        /*
        N�o � usado mais pois est�o sendo instanciados pelo m�todo construtor.
        golDaKatia.fabricationYear = 2022;
        golDaKatia.color = "Red";
        golDaKatia.howManyDoors = 5;
         */
        golDaKatia.turnOn();
        golDaKatia.buyAndRollOut("K�tia");

        // M�TODO: representam a��es poss�veis de um objeto.
        // ATRIBUTO: representam caracter�sticas dos objetos.

    }
        public static void changeColor(VwGol gol) {
            gol.color = "Black";
        }
}
