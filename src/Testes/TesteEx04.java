package Testes;

import Exercicios.Ex04;

public class TesteEx04 {
    public static void main(String[] args) {

        int[] heapValido = {1, 3, 5, 7, 9, 8};
        int[] heapInvalido = {3, 1, 4, 2};

        System.out.println("Heap válido? " + Ex04.isMinHeap(heapValido));
        System.out.println("Heap inválido? " + Ex04.isMinHeap(heapInvalido));
    }
}
