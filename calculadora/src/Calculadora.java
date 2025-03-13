import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int val1;
        int val2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        val1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        val2 = teclado.nextInt();

        int soma = val1 + val2;
        int subtracao = val1 - val2;
        int multiplicacao = val1 * val2;
        int divisao = val1/val2;

        System.out.println("SOMA:" + soma);
        System.out.println("SUBTRAÇÃO:" + subtracao);
        System.out.println("MULTIPLICAÇÃO:" + multiplicacao);
        System.out.println("DIVISÃO:" + divisao);
    }
}