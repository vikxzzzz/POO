import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        int contarAlunos = 0;
        double somarNotas = 0;

        while (true){
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite as notas dos alunos: "));

            somarNotas += nota;
            contarAlunos++;

            if(nota == -1){
                break;
            }

        }
    }
}
