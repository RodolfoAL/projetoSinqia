package modulo02estudando.docencia;

import java.util.List;
import java.util.UUID;

public class Aluno {

    public String name;
    public String registerNumber;
    public String course;
    public int presence;
    public int grade;
    public List<String> activities;

    /**
     * O Construtor não tem retorno e tem exatamente o mesmo nome da classe.
     * Forma de construir o objeto
     * Pode ter parâmetros
     */
    public Aluno(String name, String course) {
        this(name);
        register(course);
    }

    public Aluno(String name) {
        this.name = name;
        this.registerNumber = UUID.randomUUID().toString();
    }

    /**
     * Método para registrar um aluno em um determinado curso.
     *
     * @param course
     */
    public void register(String course) {
        this.course = course;
    }

    public void attendClass(String disciplina, String atividade) {
        System.out.println("O aluno " + name + " nº de matrícula: " + registerNumber + ", matriculado no curso: " + course + " assistiu a aula de: " + disciplina);
    }

    public void receivActivity(String disciplina, String atividade) {
        doActivity(disciplina, atividade);
    }
    protected void doActivity(String disciplina, String atividade) {
        System.out.println("O aluno " + name + " realizou a atividade de " + atividade + " na disciplina " + disciplina + " do curso de " + course);
    }

}
