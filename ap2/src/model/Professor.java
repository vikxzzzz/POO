package model;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Pessoa {

    private String titulacao;
    private Set<Turma> turmas;

    // CONSTRUTOR
    public Professor(String nome, String email, String titulacao) {
        super(nome, email);
        this.titulacao = titulacao;
        this.turmas = new HashSet<Turma>();
    }

    // GET E SET
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }


    // ADD E REMOVE
    public void addTurma (Turma turma){
        this.turmas.add(turma);
    }

    public void removeTurma (Turma turma){
        this.turmas.remove(turma);
    }
}

