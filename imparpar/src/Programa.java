import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));

        if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O valor " + n + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + n + " é ímpar.");
        }
    }
}
