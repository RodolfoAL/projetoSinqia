package modulo02estudando.veiculo;

public class VwGol {

    public int fabricationYear;
    public String color;
    public int howManyDoors;
    public boolean turnedOn = false;
    public boolean arCondicionado;

    /**
     * Construtor vazio somente para que quando vc for usar alguma outra forma de fazer um objeto, ele não seja obrigatório passar todos os parâmetros que foram instanciados.
     * Dessa forma vc pode continuar escrevendo da forma mais simples, (como no método build acima)
     */
    public VwGol(int fabricationYear, String color, int howManyDoors) {
        this(fabricationYear, color, howManyDoors, false);
    }

    /**
     * Método construtor do VwGol em que foram passados os seguintes parâmetros:
     * @param fabricationYear
     * @param color
     * @param howManyDoors
     * Para que possam ser construídos outros objetos já nesses moldes
     */
    public VwGol(int fabricationYear, String color, int howManyDoors, boolean arCondicionado) {
        this.fabricationYear = fabricationYear;
        this.color = color;
        this.howManyDoors = howManyDoors;
        this.arCondicionado = arCondicionado;
    }

    /**
     * Características para se criar um novo objeto:
     * A palavra "static" faz com q o método pertença à CLASSE
     * usou-se a classe no método para pedir um return.
     * O construtor vazio somente para que quando vc for usar alguma outra forma de fazer um objeto, ele não seja obrigatório passar todos os parâmetros que foram instanciados.
     * Dessa forma vc pode continuar escrevendo da forma mais simples.
      */
    public static VwGol build(int fabricationYear, String color, int howManyDoors) {
        // Não é muito usado dessa forma, por isso podemos deixar de lado.
        return new VwGol(fabricationYear, color, howManyDoors);
    }

    /**
     * sem o static pertence ao objeto
     */
    public void turnOn() {
        enableElectricCircuits();
        this.turnedOn = true; // a palavra this faz uma referência ao objeto que estou manipulando no momento. - ao objeto q chama o método.
        System.out.println("Seu carro foi ligado");
    }

    private void enableElectricCircuits() {
        System.out.println("Circuitos elétricos habilitados");
    }

    public void buyAndRollOut(String name) {
        System.out.println(name + " comprou um automóvel gol do ano " + fabricationYear + " com " + howManyDoors + " portas e da cor " + color + ". Se o carro estiver ligado: " + turnedOn + " pode sair. " );
    }
}

