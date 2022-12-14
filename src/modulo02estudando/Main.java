package modulo02estudando;

public class Main {
    public static void main(String[] args) {

        Aluno rodolfo = Aluno.register("Rodolfo", "Dev_Makers_2");
        rodolfo.grade = 10;
        rodolfo.presence = 100;
        rodolfo.attendClass("POO-1");
        rodolfo.doActivity("POO-1", "Trabalho 01A");

        Professor william = Professor.register("William", "Dev_Makers_2");
        william.teach("Trabalho 01A", "POO-1");
        william.correctActivity("POO-1", "Trabalho 01A");

        System.out.println("=================================================================="); //=================================================================================================

        //casaRodolfo é o objeto criado a partir da classe PlantaCasa
        PlantaCasa casaRodolfo = new PlantaCasa(); // instanciei um objeto - recebe um ponteiro para indicar onde foi alocado na memória

        System.out.println("A casa tem: " + casaRodolfo.room + " quartos, " + casaRodolfo.livingRoom + " salas, " + casaRodolfo.kitchen + " cozinha, " + casaRodolfo.bathroom+ " banheiros.");

        System.out.println("=================================================================="); //=================================================================================================

        /* golRodolfo é o objeto criado a partir da classe ProjetoGol
        quando se coloca o "new", é que se cria um novo objeto.
         */

        VwGol golDoRodolfo = new VwGol(2022, "White", 5);
        /* Como era descrito abaixo antes da criação do construtor com os parâmetros
        golDoRodolfo.howManyDoors = 5;
        golDoRodolfo.fabricationYear = 2022;
        golDoRodolfo.color = "White";
        */

        System.out.println("O VW Gol do Rodolfo é da cor: " + golDoRodolfo.color);
        changeColor(golDoRodolfo);
        System.out.println("O VW Gol do Rodolfo mudou para a cor: " + golDoRodolfo.color);
        golDoRodolfo.turnOn();

        VwGol golDaKatia = VwGol.build(2022, "Red", 5);
        golDaKatia.turnOn();
        golDaKatia.buyAndRollOut("Kátia");

        // MÉTODO: representam ações possíveis de um objeto.
        // ATRIBUTO: representam características dos objetos.

    }
        public static void changeColor(VwGol gol) {
            gol.color = "Black";
        }
}
