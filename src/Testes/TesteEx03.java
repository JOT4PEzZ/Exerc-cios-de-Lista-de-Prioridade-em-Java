package Testes;

import Exercicios.Ex03;

public class TesteEx03 {
    public static void main(String[] args) {

        Ex03 fila = new Ex03();

        fila.insert(10);
        fila.insert(4);
        fila.insert(7);
        fila.insert(20);
        fila.insert(15);

        System.out.println("Min: " + fila.getMin());
        System.out.println("Max: " + fila.getMax());

        System.out.println("Remove Max: " + fila.removeMax());
        System.out.println("Remove Min: " + fila.removeMin());

        System.out.println("Novo Min: " + fila.getMin());
        System.out.println("Novo Max: " + fila.getMax());
    }
}
