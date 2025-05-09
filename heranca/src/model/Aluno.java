package model;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(){

    }
    public Aluno(String nome, String telefone, String matricula){
        super(nome, telefone);
        this.matricula = matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
