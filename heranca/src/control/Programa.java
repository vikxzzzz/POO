package control;

import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {

    public static void main(String[] args) {

        // Instancia da classe model.Pessoa
        Pessoa pessoa1 = new Pessoa();
        //pessoa1.nome = "João";
        pessoa1.setNome("Rafael");
        pessoa1.setTelefone("342342342");
        System.out.println(pessoa1.getNome());
        pessoa1.mudarTelefone("39589670");
        System.out.println("TEL: " + pessoa1.getTelefone());


        Pessoa pessoa2 = new Pessoa("Ronaldo" ,"4393846435");
        System.out.println("Nome " + pessoa2.getNome());
        System.out.println("TEL normal: " + pessoa2.getTelefone());
        pessoa2.mudarTelefone("39589670");
        System.out.println("TEL trocado: " + pessoa2.getTelefone());

        Pessoa pessoa3 = new Pessoa("Julia");
        System.out.println("Nome: " + pessoa3.getNome());



        // Instancia da classe model.Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Enzo");
        aluno1.setTelefone("48353484");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTelefone());

        aluno1.mudarTelefone("8453462950");
        System.out.println(aluno1.getTelefone());

        aluno1.setMatricula("8888888");
        System.out.println(aluno1.getMatricula());

        Aluno aluno2 = new Aluno("Sara", "233423524", "99999999");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println(aluno2.getTelefone());
        System.out.println(aluno2.getMatricula());


        // Instancia da classe model.Professor
        Professor professor1 = new Professor();

        professor1.setNome("Ronaldo");
        professor1.setTitulacao("Sei la");

        System.out.println(professor1.getNome());
        System.out.println(professor1.getTitulacao());

        professor1.mudarTitulacao("Doutor");
        System.out.println(professor1.getTitulacao());

        // Metodo constrututor
        Professor professor2 = new Professor("Rafael", "555555555", "Mestre");
        System.out.println("Nome: " + professor2.getNome());

        // Instancia da classe model.Monitor
        Monitor monitor1 = new Monitor();
        monitor1.setNome("Fabio");
        // monitor1.percentualBolsa = 20;
        monitor1.setPercentualBolsa(30.0);
        monitor1.setMatricula("33333333");
        System.out.println(monitor1.getNome());
        System.out.println("Desconto: " + monitor1.getPercentualBolsa() +"%");
        System.out.println(monitor1.getMatricula());


        Monitor monitor2 = new Monitor("Viktor", "11111111111", "444444", 20);
        System.out.println(monitor2.getNome());
        System.out.println(monitor2.getTelefone());
        System.out.println(monitor2.getMatricula());
        System.out.println(monitor2.getPercentualBolsa() + "%");


    }
}
