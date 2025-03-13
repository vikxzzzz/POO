import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        float raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        raio = teclado.nextFloat();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * (raio * raio);

        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);

    }
}
