package model;

public class Turma {

    private String codigo;
    private String diaDaSemana;
    private String horario;
    private String sala;
    private Professor professor;
    private Disciplina disciplina;

    public Turma(String codigo, String diaDaSemana, String horario, String sala, Disciplina disciplina) {
        this.codigo = codigo;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public Turma(String codigo, String diaDaSemana, String horario, String sala, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
        this.sala = sala;
        this.professor = professor;
        this.disciplina = disciplina;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
