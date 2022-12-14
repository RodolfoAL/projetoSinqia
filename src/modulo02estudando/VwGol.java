package modulo02estudando;

public class VwGol {

    int fabricationYear;
    String color;
    int howManyDoors;

    boolean turnedOn = false;

    /**
     * A palavra "static" faz com q o m�todo perten�a � CLASSE
     * usou-se a classe no m�todo para pedir um return.
      */
    public static VwGol build(int fabricationYear, String color, int howManyDoors) {
        return new VwGol(fabricationYear, color, howManyDoors);
    }

    /**
     * sem o static pertence ao objeto
     */
    public void turnOn() {
        this.turnedOn = true; // a palavra this faz uma refer�ncia ao objeto que estou manipulando no momento. - ao objeto q chama o m�todo.
    }

    /**
     * M�todo construtor do VwGol em que foram passados os seguintes par�metros:
     * @param fabricationYear
     * @param color
     * @param howManyDoors
     * Para que possam ser constru�dos outros objetos j� nesses moldes
     */
    public VwGol(int fabricationYear, String color, int howManyDoors) {
        this.fabricationYear = fabricationYear;
        this.color = color;
        this.howManyDoors = howManyDoors;
    }
    public void buyAndRollOut(String name) {
        System.out.println(name + " comprou um autom�vel gol do ano " + fabricationYear + " com " + howManyDoors + " portas e da cor " + color + ". Se o carro estiver ligado: " + turnedOn + " pode sair. " );
    }
}
