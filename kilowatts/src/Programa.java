import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int qkilowatts = Integer.parseInt(JOptionPane.showInputDialog("Digite o consumo de kilowatts"));
        float valorawatt = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do kilowatt (em R$)"));

        float valorTotal = qkilowatts * valorawatt;

        JOptionPane.showMessageDialog(null, "O valor a ser pago é: R$ " + valorTotal);
    }
}
