import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));

        int contar = 0;
        int par = 0;
        int soma = 0;
        String numerosPares = "";
        String numerosNormais = "";


        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    par++;
                    soma += i;
                    numerosPares += i + " ";
                }
            }

            contar++;
            double media = soma / (double) par;

            JOptionPane.showMessageDialog(null, "A quantidade de números no intervalo: " + contar +
                    "\nO número de pares é: " + par +
                    "\nNúmeros pares encontrados: " + numerosPares +
                    "\nSoma dos pares: " + soma +
                    "\nMédia dos pares: " + media);

        } else {
            for (int x = b; x < a; x++) {
                numerosNormais += x + " ";
            }
            JOptionPane.showMessageDialog(null, "Os números entre o intervalo são: " + numerosNormais);
        }
    }
}
