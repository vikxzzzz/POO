import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        String salario = JOptionPane.showInputDialog("Digite seu salário atual:");
        String percentual = JOptionPane.showInputDialog("Digite o seu percentual:");

        float salarioreal = Float.parseFloat(salario);
        float percentualreal = Float.parseFloat(percentual);

        if (salarioreal > 0.0f && percentualreal > 0.0f) {
            float aumento = salarioreal * (percentualreal / 100);
            float novosalario = salarioreal + aumento;

            JOptionPane.showMessageDialog(null, "O aumento foi de R$ " + aumento + ", e seu salário atual é: R$ " + novosalario);
        } else {
            JOptionPane.showMessageDialog(null, "Digite um valor correto!");
        }
    }
}
