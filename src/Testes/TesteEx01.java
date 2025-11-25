package Testes;

import java.util.*;
import Exercicios.Ex01;   // <-- IMPORT NECESSÁRIO

public class TesteEx01 {
    public static void main(String[] args) {
        int[] valores = {10, 4, 7, 20, 15, 3, 8};
        int k = 3;

        List<Integer> maiores = Ex01.findKthLargest(valores, k);

        System.out.println("Os " + k + " maiores elementos são: " + maiores);
    }
}
