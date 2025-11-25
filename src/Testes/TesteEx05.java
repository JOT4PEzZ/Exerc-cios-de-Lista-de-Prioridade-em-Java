package Testes;

import Exercicios.Ex05;

public class TesteEx05 {
    public static void main(String[] args) {

        Ex05 mf = new Ex05();

        mf.addNum(5);
        mf.addNum(2);
        mf.addNum(8);
        mf.addNum(1);

        System.out.println("Mediana atual: " + mf.findMedian());

        mf.addNum(10);
        System.out.println("Nova mediana: " + mf.findMedian());
    }
}
