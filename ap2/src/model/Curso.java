package model;

import java.util.*;

public class Curso {

    private String nome;
    private Set<Disciplina> disciplinas;

    // Construtor
    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new HashSet<Disciplina>();
    }


    // GET e SET
    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // ADD E REMOVE
    public void addDisciplina (Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removeDisciplina (Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}
