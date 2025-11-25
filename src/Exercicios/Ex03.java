package Exercicios;

import java.util.*;

public class Ex03 {

    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private Map<Integer, Integer> freq;

    public Ex03() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        freq = new HashMap<>();
    }

    private void limparMinHeap() {
        while (!minHeap.isEmpty() && freq.getOrDefault(minHeap.peek(), 0) == 0) {
            minHeap.poll();
        }
    }

    private void limparMaxHeap() {
        while (!maxHeap.isEmpty() && freq.getOrDefault(maxHeap.peek(), 0) == 0) {
            maxHeap.poll();
        }
    }

    public void insert(int value) {
        minHeap.add(value);
        maxHeap.add(value);
        freq.put(value, freq.getOrDefault(value, 0) + 1);
    }

    public int getMin() {
        limparMinHeap();
        if (minHeap.isEmpty()) throw new RuntimeException("Fila vazia");
        return minHeap.peek();
    }

    public int getMax() {
        limparMaxHeap();
        if (maxHeap.isEmpty()) throw new RuntimeException("Fila vazia");
        return maxHeap.peek();
    }

    public int removeMin() {
        limparMinHeap();
        if (minHeap.isEmpty()) throw new RuntimeException("Fila vazia");
        int min = minHeap.poll();
        freq.put(min, freq.get(min) - 1);
        return min;
    }

    public int removeMax() {
        limparMaxHeap();
        if (maxHeap.isEmpty()) throw new RuntimeException("Fila vazia");
        int max = maxHeap.poll();
        freq.put(max, freq.get(max) - 1);
        return max;
    }
}
