package model;

public class Professor extends Pessoa{

    private String titulacao;

    public Professor(){

    }

    public Professor(String nome, String telefone, String titulacao){
        // a clausula super() repassa os parâmetros exigidos pelo
        // construtor da superclasse
        super(nome, telefone);
        this.titulacao = titulacao;
    }


    public void mudarTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
