package sobrescrita;

public class TestePolimorifsmo {
    public static void main(String[] args) {
        Veiculo minhaMoto = new Moto();
        Veiculo meuCarro = new Carro();

        minhaMoto.acelerar();
        minhaMoto.frear();
        meuCarro.acelerar();
        meuCarro.frear();

    }
}
