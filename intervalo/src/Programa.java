import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int inferior  = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior"));
        int superior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior"));


        if(n > superior){
            JOptionPane.showMessageDialog(null, "O valor de n está depois do intervalo");

        } else if (n < inferior){
            JOptionPane.showMessageDialog(null, "O valor de n está antes do intervalo");

        } else {
            JOptionPane.showMessageDialog(null, "O valor de n está dentro do intervalo");
        }

    }
}
