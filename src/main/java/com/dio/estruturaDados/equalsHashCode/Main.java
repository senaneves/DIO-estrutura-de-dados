package com.dio.estruturaDados.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("GM"));
        listaCarros.add(new Carro("Renault"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford1").hashCode());
        System.out.println(new Carro("Fordk").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));


    }
}
