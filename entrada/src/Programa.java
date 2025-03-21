import javax.swing.*;

public class Programa {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String idade = JOptionPane.showInputDialog("Digite a sua idade:");
        int idadedef = Integer.parseInt(idade);

        if (idadedef >= 18) {
            System.out.println("Você está habilitado para começar o curso");
            JOptionPane.showMessageDialog(null,"Você está habilitado para começar o curso\"");
        }

        System.out.println(nome);

    }
}
