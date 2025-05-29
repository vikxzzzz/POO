package model;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {

    private String codigo;
    private String nome;
    private int cargaHoraria;
    private Set<Turma> turmas;

    public Disciplina(String codigo, String nome, int cargaHoraria) {
        this.turmas = new HashSet<Turma>();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }


    public void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    public void removeTurma(Turma turma){
        this.turmas.remove(turma);
    }

}
