package control;

import model.B;
import view.C;

// Se uma classe Java fizer referencia a outra classe que
// esteja em outro pacote, ela deverá importar a classe
// referenciada usando a clásula "import"

public class D {

    public void testeA() {
        A a = new A();
        // a.
    };


    public void testeB() {
        B b = new B();
        // b.
    }


    public void testeC() {
        C c = new C();
        // c.
    }
}



