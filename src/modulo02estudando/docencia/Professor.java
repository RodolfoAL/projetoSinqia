package modulo02estudando.docencia;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Professor {
    public String name;
    public String registerNumber;
    public String course;
    public List<String> disciplines = new ArrayList<>();
    public List<String> turmas = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
        this.registerNumber = UUID.randomUUID().toString();
    }

    public void register(String course, List<String> disciplines) {;
        this.course = course;
        this.disciplines = disciplines;
    }

    public void teach(String aula, String disciplina) {
        System.out.println("O professor " + name + " ministrou a aula de " + aula + " na disciplina de " + disciplina + " do curso de " + course);
    }

    public void correctActivity(String disciplina, String atividade) {
        System.out.println("O professor " + name + " que dá aula na turma " + course + " corrigiu a atividade de " + disciplines.get(0) + " na disciplina de " + disciplina);
    }
}
