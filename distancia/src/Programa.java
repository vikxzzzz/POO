import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int distancia = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da distância em km"));
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de viagem em horas"));
        float combustivel = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de combustível consumido em litros"));

        float velocidadeMedia = (float) distancia / tempo;
        float consumoCombustivel = combustivel / distancia;

        JOptionPane.showMessageDialog(null,
                "Velocidade média: " + velocidadeMedia + " km/h\n" +
                        "Consumo de combustível: " + consumoCombustivel + " litros por km");
    }
}

