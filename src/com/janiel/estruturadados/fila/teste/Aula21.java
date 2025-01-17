package com.janiel.estruturadados.fila.teste;

import com.janiel.estruturadados.fila.Fila;

import javax.print.attribute.standard.Fidelity;

public class Aula21 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileira(4);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.espiar());
        System.out.println(fila.toString());
    }
}
