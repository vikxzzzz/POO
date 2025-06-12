package model;

import java.util.*;

public class Disciplina {

    private String nomeDisciplina;
    private int cargaHoraria;
    private Set<Curso> cursos;
    private Set<Turma> turmas;

    // CONSTRUTOR
    public Disciplina(String nomeDisciplina, int cargaHoraria, Curso cursoObrigatorio) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.cursos = new HashSet<Curso>();
        this.turmas = new HashSet<Turma>();
        this.addCurso(cursoObrigatorio);
    }

    // GET E SET
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Set<Turma> turmas) {
        this.turmas = turmas;
    }


    // ADD E REMOVE
    public void addCurso (Curso curso){
        this.cursos.add(curso);
    }

    public void removeCurso (Curso curso){
        this.cursos.remove(curso);
    }

    public void addTurma (Turma turma){
        this.turmas.add(turma);
    }

    public void removeTurma (Turma turma){
        this.turmas.remove(turma);
    }


}
