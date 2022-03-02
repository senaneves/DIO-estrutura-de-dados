package com.dio.estruturaDados.ListaDuplamenteEncadeada;

import com.dio.estruturaDados.listaEncadeada.ListaEncadeada;

public class ListaDuplamenteEncadeada <T>{
    private No<T> primeiroNO;
    private No<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNO = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        No<T> novoNo = new No<>(elemento);
        novoNo.setNoNext(null);
        novoNo.setNoPrevius(ultimoNo);
        if (primeiroNO ==null){
            primeiroNO = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoNext(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista ++;

    }

    public void add (int index, T elemento){
        No<T> noAuxiliar = getNo(index);
        No<T> novoNo = new No<>(elemento);
        novoNo.setNoNext(noAuxiliar);

        if (novoNo != null){
            novoNo.setNoPrevius(noAuxiliar.getNoPrevius());
            novoNo.getNoNext().setNoPrevius(novoNo);
        }else{
            novoNo.setNoPrevius(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0) {
        primeiroNO = novoNo;
        } else {
            novoNo.getNoPrevius().setNoNext(novoNo);
        }
        tamanhoLista++;
        }

        public void remove(int index){
        if(index == 0 ){
        primeiroNO = primeiroNO.getNoNext();
            if(primeiroNO != null){
                primeiroNO.setNoPrevius(null);
        }
        }else {
            No<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevius().setNoNext(noAuxiliar.getNoNext());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getNoNext().setNoPrevius(noAuxiliar.getNoPrevius());
            }else {
                ultimoNo = noAuxiliar;
            }
        }

        this.tamanhoLista--;

        }


    private No<T> getNo(int index){
        No<T> noAuxiliar = primeiroNO;
        for (int i = 0; (i<index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoNext();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = primeiroNO;
        for(int i = 0; i < size(); i++){
            strRetorno += "No{conteudo=" +noAuxiliar.getConteudo() + "}]---->";
            noAuxiliar = noAuxiliar.getNoNext();
        }
        strRetorno += "null";
        return  strRetorno;
    }
}
