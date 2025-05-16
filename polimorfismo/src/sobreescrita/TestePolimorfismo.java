package sobreescrita;

import teste.LuluDaPalmerania;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();
        Animal meuanimal3 = new LuluDaPalmerania();

        meuAnimal1.emitirSom(); // "Au au"
        meuAnimal2.emitirSom(); // "Miau"
        meuanimal3.emitirSom(); // "Au au"
    }
}