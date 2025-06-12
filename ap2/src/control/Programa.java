package control;

import model.*;

public class Programa {
    public static void main(String[] args) {

        //ALUNOS
        Aluno viktor = new Aluno("Viktor", "viktor@gmail.com", "2024021");
        Aluno gabriel = new Aluno("Gabriel", "gabriel@gmail.com", "762142");

        //PROFESSORES
        Professor profThaigo = new Professor("Thiago", "thiago@gmail.com", "Doutor");
        Professor profAnderson = new Professor("Anderson", "anderson@gmail.com", "Mestre");

        // Cursos
        Curso cdia = new Curso("CD e IA");
        Curso engSoftware = new Curso("Engenharia de Software");


        // Disciplinas
        Disciplina poo = new Disciplina("POO", 80, cdia);
        Disciplina dados = new Disciplina("Engenharia de dados", 80, engSoftware);

        Turma pooThiago = new Turma("30000", "M1 e M2","210", poo, profThaigo);
        Turma dadosThiago = new Turma("5000", "M3 e M3", "303", dados, profThaigo);
        Turma dadosAnderson = new Turma("232332", "M3 e M4", "102", dados, profAnderson);

        //Turma sem professor
        Turma semProf = new Turma("23232", "qwsqw", "123", poo);

        // Associações
        profThaigo.addTurma(pooThiago);
        profThaigo.addTurma(dadosThiago);
        profAnderson.addTurma(pooThiago);

        semProf.setProfessor(profAnderson);

        viktor.addTurma(pooThiago);
        viktor.addTurma(dadosAnderson);
        gabriel.addTurma(pooThiago);

        pooThiago.addAluno(viktor);
        pooThiago.addAluno(gabriel);
        dadosAnderson.addAluno(viktor);

        cdia.addDisciplina(poo);
        cdia.addDisciplina(dados);

        engSoftware.addDisciplina(poo);

        poo.addTurma(pooThiago);
        dados.addTurma(dadosAnderson);

        // Nome do professor que foi alocado para a turma sem professor
        System.out.println(semProf.getProfessor().getNome());

        System.out.println("---------");

        // Quais sao os professores que ministram poo?
        for (Turma turma : poo.getTurmas()){
            System.out.println(turma.getProfessor().getNome());
        }

        // Quais turmas pelo codigo,  o thiago ministra ?
        for (Turma turma : profThaigo.getTurmas()){
            System.out.println(turma.getCodigo());
        }

        //Quais disciplinas o Thiago ministra?
        for(Turma turma : profThaigo.getTurmas()){
            System.out.println(turma.getDisciplina().getNomeDisciplina());
        }

        System.out.println("---------");
        // Quais disciplinas tem o curso de cdia
        for(Disciplina disciplina : cdia.getDisciplinas()){
            System.out.println(disciplina.getNomeDisciplina());
        }

        //Quais turmas o viktor está alocado ?
        System.out.println("--------");
        for(Turma turma : viktor.getTurmas()){
            System.out.println(turma.getSala());
        }


        System.out.println("\nAlunos alocados na turma de POO:");
        for (Aluno aluno : pooThiago.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }


    }
}
