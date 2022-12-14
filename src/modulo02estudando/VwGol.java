package modulo02estudando;

public class VwGol {

    int fabricationYear;
    String color;
    int howManyDoors;

    boolean turnedOn = false;

    /**
     * A palavra "static" faz com q o método pertença à CLASSE
     * usou-se a classe no método para pedir um return.
      */
    public static VwGol build(int fabricationYear, String color, int howManyDoors) {
        return new VwGol(fabricationYear, color, howManyDoors);
    }

    /**
     * sem o static pertence ao objeto
     */
    public void turnOn() {
        this.turnedOn = true; // a palavra this faz uma referência ao objeto que estou manipulando no momento. - ao objeto q chama o método.
    }

    /**
     * Método construtor do VwGol em que foram passados os seguintes parâmetros:
     * @param fabricationYear
     * @param color
     * @param howManyDoors
     * Para que possam ser construídos outros objetos já nesses moldes
     */
    public VwGol(int fabricationYear, String color, int howManyDoors) {
        this.fabricationYear = fabricationYear;
        this.color = color;
        this.howManyDoors = howManyDoors;
    }
    public void buyAndRollOut(String name) {
        System.out.println(name + " comprou um automóvel gol do ano " + fabricationYear + " com " + howManyDoors + " portas e da cor " + color + ". Se o carro estiver ligado: " + turnedOn + " pode sair. " );
    }
}
