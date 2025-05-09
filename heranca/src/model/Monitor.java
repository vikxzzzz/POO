package model;

public class Monitor extends Aluno {

    private double percentualBolsa;

    public Monitor(){

    }

    public Monitor(String nome,String telefone, String matricula, double percentualBolsa){
        super (nome, telefone, matricula);
        this.percentualBolsa = percentualBolsa;
    }

    public double getPercentualBolsa() {

        return percentualBolsa;
    }

    public void setPercentualBolsa(double percentualBolsa) {

        this.percentualBolsa = percentualBolsa;
    }
}