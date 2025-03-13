import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        final float PI = 3.14F;
        float raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        raio = teclado.nextFloat();

        float perimetro = 2 * PI * raio;
        float area = PI *(raio * raio);

        System.out.println("Perímetro:" + perimetro);
        System.out.println("Área:" + area);

    }
}
