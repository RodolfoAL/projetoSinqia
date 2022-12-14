package modulo02estudando;

import java.util.List;
import java.util.UUID;

public class Aluno {

    String name;
    String registerNumber;
    String course;
    int presence;
    int grade;
    List<String> activities;

    /**
     * O Construtor não tem retorno e tem exatamente o mesmo nome da classe.
     * Forma de construir o objeto
     * Pode ter parâmetros
     */
    public Aluno(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public static Aluno register(String name, String course) {
        Aluno aluno = new Aluno(name, course);
        aluno.registerNumber = UUID.randomUUID().toString();
        return aluno;

    }

    public void attendClass(String disciplina) {
        System.out.println("O aluno " + name + " nº de matrícula: " + registerNumber + ", matriculado no curso: " + course + " assistiu a aula de: " + disciplina);
    }

    public void doActivity(String disciplina, String atividade) {
        System.out.println("O aluno " + name + " realizou a atividade de " + atividade + " na disciplina " + disciplina + " do curso de " + course);
    }

}
