package sobrescrita;

public class Moto extends Veiculo {
    @Override
    public void acelerar(){
        System.out.println("Acelerando a Moto");
    }

    @Override
    public void frear(){
        System.out.println("Freando a Moto");
    }
}
