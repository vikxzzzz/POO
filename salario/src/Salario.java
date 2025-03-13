import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float salario, percentual;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu salário:");
        salario = teclado.nextFloat();
        System.out.println("Informe a % do aumento:");
        percentual = teclado.nextFloat();

        float aumento = salario * (percentual / 100);
        float novoSalario = salario + aumento;
        System.out.println("Novo salário:" + novoSalario);
    }
}

