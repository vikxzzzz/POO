public class Programa {

    public static void main(String[] args) {

        // Instancia da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "1234567";
        System.out.println("TEL: " + pessoa1.telefone);
        pessoa1.mudarTelefone("39589670");
        System.out.println("TEL: " + pessoa1.telefone);


        // Instancia da classe Aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Enzo";
        aluno1.telefone = "0993842643";
        System.out.println(aluno1.nome);
        System.out.println(aluno1.telefone);

        aluno1.mudarTelefone("8453462950");
        System.out.println(aluno1.telefone);

        aluno1.matricula = "9497327";
        System.out.println(aluno1.matricula);


        // Instancia da classe Professor
        Professor professor1 = new Professor();
        professor1.nome = "Ronaldo";
        professor1.titulacao = "Sei la";
        System.out.println(professor1.nome);
        System.out.println(professor1.titulacao);
        professor1.mudarTitulacao("Doutor");
        System.out.println(professor1.titulacao);


        // Instancia da classe Monitor
        Monitor monitor1 = new Monitor();
        monitor1.nome = "Claudio";
        monitor1.percentualBolsa = 20;
        monitor1.matricula = "00000";
        System.out.println(monitor1.nome);
        System.out.println(monitor1.percentualBolsa +"%");
        System.out.println(monitor1.matricula);


    }
}
