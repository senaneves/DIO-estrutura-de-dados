package com.dio.estruturaDados.fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }
    public boolean isEmpty(){

        return refNoEntradaFila == null? true : false;

    }

    public T firstNo(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){

                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }

        return null;

    }public T Dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){

                if(primeiroNo.getRefNo()!=null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;

    }



    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }


    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+noAuxiliar.getObject() + "}] ---->";

                if(noAuxiliar.getRefNo() != null){

                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    //stringRetorno += "null";
                    break;
                }
            }

        }else {
            stringRetorno = "null";

        }
        return  stringRetorno;
    }
}
