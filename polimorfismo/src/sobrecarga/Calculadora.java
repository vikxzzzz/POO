package sobrecarga;

public class Calculadora {

    // Metodo para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Metodo para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Metodo para somar dois números decimais
    public double somar(double a, double b) {
        return a + b;
    }
}
