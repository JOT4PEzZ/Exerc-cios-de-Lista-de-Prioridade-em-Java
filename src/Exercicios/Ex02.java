package Exercicios;

import java.util.*;
public class Ex02 {

    static class Elemento implements Comparable<Elemento> {
        int valor;
        int listaIndex;
        int elementoIndex;

        Elemento(int valor, int listaIndex, int elementoIndex) {
            this.valor = valor;
            this.listaIndex = listaIndex;
            this.elementoIndex = elementoIndex;
        }

        @Override
        public int compareTo(Elemento outro) {
            return Integer.compare(this.valor, outro.valor);
        }
    }

    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        PriorityQueue<Elemento> minHeap = new PriorityQueue<>();
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                minHeap.add(new Elemento(lists.get(i).get(0), i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            Elemento atual = minHeap.poll();
            resultado.add(atual.valor);

            int nextIndex = atual.elementoIndex + 1;
            if (nextIndex < lists.get(atual.listaIndex).size()) {
                int nextVal = lists.get(atual.listaIndex).get(nextIndex);
                minHeap.add(new Elemento(nextVal, atual.listaIndex, nextIndex));
            }
        }

        return resultado;
    }
}

