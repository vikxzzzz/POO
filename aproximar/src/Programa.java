import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Digite um valor para aproximá-lo");
        float valorReal = Float.parseFloat(x);

        int parteInteira = (int) valorReal;
        float parteDecimal = valorReal - parteInteira;

        if (parteDecimal < 0.5) {
            JOptionPane.showMessageDialog(null, "Valor arredondado: " + parteInteira);
        } else {
            JOptionPane.showMessageDialog(null, "Valor arredondado: " + (parteInteira + 1));
        }
    }
}

