package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa{

    private String matricula;
    private Set<Turma> turmas;

    //CONSTRUTOR
    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
        this.turmas = new HashSet<Turma>();
    }


    //GET E SET
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
