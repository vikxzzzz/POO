package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {

        Set<String> lista = new LinkedHashSet<String>();
        lista.add("Pão de forma");
        lista.add("ovos");
        lista.add("frutas");
        lista.add("frutas");
        String itemDaLista = "Café";
        lista.add(itemDaLista);
        lista.add(itemDaLista); // isto é uma duplicata

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
