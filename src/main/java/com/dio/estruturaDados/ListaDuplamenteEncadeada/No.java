package com.dio.estruturaDados.ListaDuplamenteEncadeada;

public class No<T> {
    private T conteudo;
    private No<T> noNext;
    private No<T> noPrevius;

    public No(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoNext() {
        return noNext;
    }

    public void setNoNext(No<T> noNext) {
        this.noNext = noNext;
    }

    public No<T> getNoPrevius() {
        return noPrevius;
    }

    public void setNoPrevius(No<T> noPrevius) {
        this.noPrevius = noPrevius;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
