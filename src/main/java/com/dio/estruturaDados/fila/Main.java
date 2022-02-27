package com.dio.estruturaDados.fila;

public class Main {
    public static void main(String[] args){

    Fila minhaFila = new Fila();

    minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
//        System.out.println(minhaFila.firstNo());
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.Dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new No("último"));
        System.out.println(minhaFila);
        System.out.println(minhaFila.firstNo());

    }
}
