import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String op = JOptionPane.showInputDialog("Digite uma operação (+, -, *, /):");

        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));

        if (op.equals("+")) {
            double valor1 = a + b;
            JOptionPane.showMessageDialog(null, a + " + " + b + " = " + valor1);

        } else if (op.equals("-")) {
            double resultado = a - b;
            JOptionPane.showMessageDialog(null, a + " - " + b + " = " + resultado);

        } else if (op.equals("*")) {
            double resultado = a * b;
            JOptionPane.showMessageDialog(null, a + " * " + b + " = " + resultado);

        } else if (op.equals("/")) {
            if (b != 0) {
                double resultado = a / b;
                JOptionPane.showMessageDialog(null, a + " / " + b + " = " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Divisão por zero não permitida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação inválida!");
        }
    }
}

