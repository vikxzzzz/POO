import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        int contarAlunos = 0;
        double somarNotas = 0;
        double maiorNota = -Double.MAX_VALUE;
        double menorNota = Double.MAX_VALUE;

        while (true) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno (ou -1 para sair): "));

            if (nota == -1) {
                break;
            }

            somarNotas += nota;
            contarAlunos++;

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double media = somarNotas / contarAlunos;

        JOptionPane.showMessageDialog(null, "Total de alunos: " + contarAlunos +
                "\nMédia das notas: " + media +
                "\nMaior nota: " + maiorNota +
                "\nMenor nota: " + menorNota);
    }
}
