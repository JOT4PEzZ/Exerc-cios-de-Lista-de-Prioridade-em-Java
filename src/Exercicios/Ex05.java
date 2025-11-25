package Exercicios;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ex05 {

    private PriorityQueue<Integer> lower;
    private PriorityQueue<Integer> upper;

    public Ex05() {
        lower = new PriorityQueue<>(Collections.reverseOrder());
        upper = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (lower.isEmpty() || num <= lower.peek()) {
            lower.add(num);
        } else {
            upper.add(num);
        }

        if (lower.size() > upper.size() + 1) {
            upper.add(lower.poll());
        } else if (upper.size() > lower.size()) {
            lower.add(upper.poll());
        }
    }

    public double findMedian() {
        if (lower.size() > upper.size()) {
            return lower.peek();
        }
        return (lower.peek() + upper.peek()) / 2.0;
    }
}
