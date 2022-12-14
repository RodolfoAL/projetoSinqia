package modulo02estudando;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Professor {
    String name;
    String registerNumber;
    String course;
    List<String> disciplines = new ArrayList<>();
    List<String> turmas = new ArrayList<>();

    public static Professor register(String name, String course) {
        Professor professor = new Professor();
        professor.name = name;
        professor.registerNumber = UUID.randomUUID().toString();
        professor.course = course;
        professor.disciplines.add("POO-1");
        professor.disciplines.add("Banco de Dados");
        professor.turmas.add("Dev_Makers_2");
        return professor;
    }

    public void teach(String aula, String disciplina) {
        System.out.println("O professor " + name + " ministrou a aula de " + aula + " na disciplina de " + disciplina + " do curso de " + course);
    }

    public void correctActivity(String disciplina, String atividade) {
        System.out.println("O professor " + name + " que dá aula na turma " + course + " corrigiu a atividade de " + disciplines.get(0) + " na disciplina de " + disciplina);
    }
}
