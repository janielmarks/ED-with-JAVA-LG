package com.janiel.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução com base no livro Effective Java
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    //

    public boolean adiciona(int posicao, T elemento) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        this.aumentaCapacidade();;
        //mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];

    }

    public int busca(T elemento){
        for (int i=0; i<this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento){
        int ultimaPos = -1;
        for (int i=this.tamanho-1; i>=0; i--) {
            if(this.elementos[i].equals(elemento)){
               return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){

       /* int pos = busca(elemento);
        if(pos > -1){
            return true;
        }
        return false; */

       return busca(elemento) > -1; //>=0
    }

    // B G D E F -> posição a ser removida é 1(G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    //vetor[3] = vetpr[4]
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho>0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();

    }
}
