package com.janiel.estruturadados.vetor.teste;

import com.janiel.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "3456-6789", "contato3@gmail.com");

        vetor.adiciona(c1);
    }
}
