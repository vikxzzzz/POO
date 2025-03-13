import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float salario;
        float aumento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário:");
        salario = teclado.nextFloat();
        System.out.println("Informe a % do aumento:");
        aumento = teclado.nextFloat();

        float novoSalario = salario + (salario * aumento / 100);
        System.out.println("Novo salário:" + novoSalario);
    }
}

