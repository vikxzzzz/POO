package control;

import model.Disciplina;
import model.Professor;
import model.Turma;

public class Programa {
    public static void main(String[] args) {

        Professor profThiago = new Professor("123", "Thiago", "Doutor");
        Professor profAnderson = new Professor("456", "Anderson Silva", "Doutor");
        Professor profThalita = new Professor("001", "Thalita Vieira", "Doutora");

        Disciplina poo = new Disciplina("IBM0513", "POO", 80);
        Disciplina engDados  = new Disciplina("IBM3213", "ED", 80);
        Disciplina engSoftware = new Disciplina("IBM565", "ES", 80);

        Turma pooSemProf = new Turma("CDIA001", "quinta-feira", "M1 a M4", "207", poo);
        Turma pooThiago = new Turma("CDIA001", "quarta-feira", "T1 a T4", "302", profThiago, poo);
        Turma engDadosAnderson = new Turma("CD1212", "terça-feira", "M1 a M4", "209", profAnderson, engDados);
        Turma engSoftwareThiago = new Turma("798", "sexta-feira", "T1 a T3", "309", profThiago, engSoftware);

        pooSemProf.setProfessor(profThalita);

        profThiago.addTurma(pooThiago);
        profAnderson.addTurma(engDadosAnderson);
        profThiago.addTurma(engSoftwareThiago);
        profThalita.addTurma(pooSemProf);


        poo.addTurma(pooThiago);
        poo.addTurma(pooSemProf);
        
        System.out.println(pooThiago.getProfessor().getNome());

        for(Turma turma : profThiago.getTurmas()){
            System.out.println(turma.getDisciplina().getNome());
        }


        // Qual professores ministram a disciplina POO?
        for(Turma turma : poo.getTurmas()){
            System.out.println(turma.getProfessor().getNome());

        }

    }
}
