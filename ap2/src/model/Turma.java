package model;

import java.util.HashSet;
import java.util.Set;

public class Turma {

    private String codigo;
    private String horario;
    private String sala;
    private Disciplina disciplina;
    private Professor professor;
    private Set<Aluno> alunos;

    // CONSTRUTOR
    public Turma(String codigo, String horario, String sala, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.horario = horario;
        this.disciplina = disciplina;
        this.professor = professor;
        this.sala = sala;
        this.alunos = new HashSet<Aluno>();
    }

    // Turma sem professor
    public Turma(String codigo, String horario, String sala, Disciplina disciplina) {
        this.codigo = codigo;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
        this.alunos = new HashSet<Aluno>();
    }

    //GET E SET
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }


    // ADD E REMOVE
    public void addAluno (Aluno aluno){
        this.alunos.add(aluno);
    }

    public void removeAluno (Aluno aluno){
        this.alunos.remove(aluno);
    }
}
