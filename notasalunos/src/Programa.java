import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos: "));

        double somaNotas = 0;

        for (int i = 1; i <= n; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + i + ": "));
            somaNotas += nota;
        }

        double media = somaNotas / n;

        JOptionPane.showMessageDialog(null, "A média da turma é: " + media);
    }
}
