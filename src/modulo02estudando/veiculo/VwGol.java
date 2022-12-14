package modulo02estudando.veiculo;

public class VwGol {

    public int fabricationYear;
    public String color;
    public int howManyDoors;
    public boolean turnedOn = false;
    public boolean arCondicionado;

    /**
     * Construtor vazio somente para que quando vc for usar alguma outra forma de fazer um objeto, ele n�o seja obrigat�rio passar todos os par�metros que foram instanciados.
     * Dessa forma vc pode continuar escrevendo da forma mais simples, (como no m�todo build acima)
     */
    public VwGol(int fabricationYear, String color, int howManyDoors) {
        this(fabricationYear, color, howManyDoors, false);
    }

    /**
     * M�todo construtor do VwGol em que foram passados os seguintes par�metros:
     * @param fabricationYear
     * @param color
     * @param howManyDoors
     * Para que possam ser constru�dos outros objetos j� nesses moldes
     */
    public VwGol(int fabricationYear, String color, int howManyDoors, boolean arCondicionado) {
        this.fabricationYear = fabricationYear;
        this.color = color;
        this.howManyDoors = howManyDoors;
        this.arCondicionado = arCondicionado;
    }

    /**
     * Caracter�sticas para se criar um novo objeto:
     * A palavra "static" faz com q o m�todo perten�a � CLASSE
     * usou-se a classe no m�todo para pedir um return.
     * O construtor vazio somente para que quando vc for usar alguma outra forma de fazer um objeto, ele n�o seja obrigat�rio passar todos os par�metros que foram instanciados.
     * Dessa forma vc pode continuar escrevendo da forma mais simples.
      */
    public static VwGol build(int fabricationYear, String color, int howManyDoors) {
        // N�o � muito usado dessa forma, por isso podemos deixar de lado.
        return new VwGol(fabricationYear, color, howManyDoors);
    }

    /**
     * sem o static pertence ao objeto
     */
    public void turnOn() {
        enableElectricCircuits();
        this.turnedOn = true; // a palavra this faz uma refer�ncia ao objeto que estou manipulando no momento. - ao objeto q chama o m�todo.
        System.out.println("Seu carro foi ligado");
    }

    private void enableElectricCircuits() {
        System.out.println("Circuitos el�tricos habilitados");
    }

    public void buyAndRollOut(String name) {
        System.out.println(name + " comprou um autom�vel gol do ano " + fabricationYear + " com " + howManyDoors + " portas e da cor " + color + ". Se o carro estiver ligado: " + turnedOn + " pode sair. " );
    }
}

