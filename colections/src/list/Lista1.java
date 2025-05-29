package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;

public class Lista1 {


    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Pão de forma");
        lista.add("ovos");
        lista.add("frutas");
        lista.add("frutas"); // não é uma duplicataç
        String itemDaLista = "Café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); // isto é uma duplicata


        // Iteração usando for tradicional
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // Iteração usando for each
        for(String item : lista ) {
            System.out.println(item);

        }

        // Iteração usando for each com expressão Lambda
        lista.forEach(item -> System.out.println(item));


        // Iteração usando um Iterator
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
