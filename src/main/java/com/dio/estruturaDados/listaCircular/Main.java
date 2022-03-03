package com.dio.estruturaDados.listaCircular;

public class Main {
           public static void main(String args[]){

            ListaCircular<String> minhaListaCircular = new ListaCircular<>();

            minhaListaCircular.add("c0");
            System.out.println(minhaListaCircular);

            minhaListaCircular.remove(0);
            System.out.println(minhaListaCircular);

            minhaListaCircular.add("c1");
            System.out.println(minhaListaCircular);

            minhaListaCircular.add("c2");
            minhaListaCircular.add("c3");
            System.out.println(minhaListaCircular);

            System.out.println(minhaListaCircular.get(7));
            System.out.println(minhaListaCircular.get(323));

            // na lista circular mesmo passando um índice que não existe ele faz fazendo um loop até finalizar o index colocado

        }

    }
