package com.dio.estruturaDados.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top(){
        return refNoEntradaPilha;

    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRef(refAuxiliar);
    }

    public No pop (){
        if(!this.isEmpty()){
            No poped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRef();
            return poped;

        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true:false;
    }

    public No getRefNoEntradaPilha() {
        return refNoEntradaPilha;
    }

    public void setRefNoEntradaPilha(No refNoEntradaPilha) {
        this.refNoEntradaPilha = refNoEntradaPilha;
    }
    @Override
    public String toString(){
        String stringRetorno = "-------------------------\n";
        stringRetorno += "         Pilha\n";
        stringRetorno += "------------------------\n";

        No noAuxiliar = refNoEntradaPilha;
        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado="+ noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRef();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}
