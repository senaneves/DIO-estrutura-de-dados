package com.dio.estruturaDados.equalsHashCode.queue;

import com.dio.estruturaDados.equalsHashCode.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("pegeout")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //apenas verifica o elemento
        System.out.println(queueCarros);
        System.out.println(queueCarros.poll()); //remove o elemento
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());
    }




}
