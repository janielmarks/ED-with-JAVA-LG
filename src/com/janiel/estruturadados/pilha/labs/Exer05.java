package com.janiel.estruturadados.pilha.labs;

import com.janiel.estruturadados.pilha.Pilha;

public class Exer05 {
    public static void main(String[] args) {

        imprimeResultados("ADA");
        imprimeResultados("ABCD");
        imprimeResultados("ABCCBA");
        imprimeResultados("MARIA");



    }
    public static void imprimeResultados(String palavra){
        System.out.println(palavra + "é palindromo? " + testaPalindromo(palavra));


    }

    public static boolean testaPalindromo(String palavra) {

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();

        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }
        return false;
    }
}
