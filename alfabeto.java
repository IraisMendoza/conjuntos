import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.lang.model.type.UnionType;

import java.util.*;++




public class alfabeto {
    /*Practica conjuntos 
     * @author Laura Irais Garcia Mendoza 
     * @mail iraisgm1219@gmail.com
     */

 public static void main(String[] args) {

    // Conjunto de Alfabeto
    Character Alfabeto = 65;
    int numeroNatural = 0;
        Set<Character> listaSet = new HashSet<>();
        for (int i=0; i<26; i++) {
            listaSet.add ((char) (Alfabeto +i));
        }

        Iterator value = listaSet.iterator ();
        while (value.hasNext()) {
            System.out.println("letra: "+value.next()); 
        }

        // Numeros Naturales
    Set<Integer> numerosNaturales = new TreeSet<>();
    for(int i=1; i<400; i++ ) {
            if (i%2 == 0) {
                numerosNaturales.add(i);
            }
    }

    Iterator valueNN = numerosNaturales.iterator(); 
    while (valueNN.hasNext()) {
        System.out.println(valueNN.next()); 
    }

    // Numeros Enteros
    Set<Integer> numerosEnteros = new TreeSet<>();
    for(int i=-300; i<100; i++) {
        numerosEnteros.add(i);
    }
    System.out.println(numerosEnteros);


    //Conjunto 1 (B union C)
    numerosNaturales.addAll(numerosEnteros);
    System.out.println("union"+ numerosNaturales);
  
    //Conjunto 2 (B interseccion C)
    numerosNaturales.retainAll(numerosEnteros);
    System.out.println("interseccion"+numerosNaturales);

    //Conjunto 3 (B subconjunto C)
    numerosNaturales.subSet(numerosEnteros);
    System.out.println("subconjunto de B:"+numerosNaturales);

    }// fin de main    

}// fin de clase conjuntos



