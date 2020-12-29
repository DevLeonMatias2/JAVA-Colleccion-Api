package org.leonmatias.ejemplos.set.set;

import com.sun.source.doctree.StartElementTree;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs= new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);

        System.out.println(lista);
        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados =" + b);
        System.out.println(hs);

    }
}
