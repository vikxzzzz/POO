import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        float val1;
        float val2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        val1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        val2 = teclado.nextInt();

        float soma = val1 + val2;
        float subtracao = val1 - val2;
        float multiplicacao = val1 * val2;
        float divisao = val1/val2;

        System.out.println("SOMA:" + soma);
        System.out.println("SUBTRAÇÃO:" + subtracao);
        System.out.println("MULTIPLICAÇÃO:" + multiplicacao);
        System.out.println("DIVISÃO:" + divisao);
    }
}
