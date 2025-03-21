import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Indique o tempo em segundos"));
        int hora = tempo / 3600;
        int min = (tempo % 3600) / 60;
        int seg = tempo % 60;

        JOptionPane.showMessageDialog(null, "Horas: " + hora + "  ;Minutos: " + min + "  ;Segundos: " + seg);
    }
}
