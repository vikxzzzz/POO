import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int contarVogais = 0;
        int contarDigitos = 0;
        int contarOutros = 0;

        while (true) {
            String caracter = JOptionPane.showInputDialog("Digite qualquer caractere (ou digite '.' para encerrar o programa): ");

            if (caracter.equals(".")) {
                break;
            }

            char caracterDef = caracter.charAt(0);

            if (caracterDef == 'A' || caracterDef == 'E' || caracterDef == 'I' || caracterDef == 'O' || caracterDef == 'U' ||
                    caracterDef == 'a' || caracterDef == 'e' || caracterDef == 'i' || caracterDef == 'o' || caracterDef == 'u') {
                contarVogais++;
            } else if (caracterDef >= '0' && caracterDef <= '9') {
                contarDigitos++;
            } else {
                contarOutros++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de vogais: " + contarVogais +
                "\nQuantidade de dígitos: " + contarDigitos +
                "\nQuantidade de outros caracteres: " + contarOutros);
    }
}

