package Testes;

import java.util.*;
import Exercicios.Ex02;

public class TesteEx02 {
    public static void main(String[] args) {

        List<List<Integer>> listas = new ArrayList<>();

        listas.add(Arrays.asList(1, 4, 7));
        listas.add(Arrays.asList(2, 5, 8));
        listas.add(Arrays.asList(3, 6, 9));

        List<Integer> resultado = Ex02.mergeKSortedLists(listas);

        System.out.println("Lista mesclada: " + resultado);
    }
}
