package com.dio.estruturaDados.equalsHashCode.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Media", "5,5");
        aluno.put("Turma", "Ja");

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "16");
        aluno2.put("Media", "8,5");
        aluno2.put("Turma", "Ja");
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
        System.out.println(aluno.containsKey("Nome2"));



    }
}
