import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float qkilowatts = Float.parseFloat(JOptionPane.showInputDialog("Digite o consumo de kilowatts"));
        float valorawatt = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do kilowatt (em R$)"));

        float valorreal = qkilowatts * valorawatt;
        float valordesconto = valorreal;

        if(qkilowatts < 150){
            float desconto = valorreal * 10 / 100;
            valordesconto = valorreal - desconto;
        }

        JOptionPane.showMessageDialog(null, "O valor a ser pago é de: " + valordesconto + " R$");
    }
}

