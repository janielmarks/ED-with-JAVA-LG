package com.janiel.estruturadados.pilha.labs;

import com.janiel.estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro1 = new Livro();
        livro1.setNome("Estruturas de Dados e Algoritmos com JavaScript: Escreva um Código JavaScript Complexo e Eficaz Usando a Mais Recente ECMAScript");
        livro1.setAutor("Loione groner");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("8575226932");


        Livro livro2 = new Livro();
        livro2.setNome("Introdução à Linguagem SQL: Abordagem Prática Para Iniciantes");
        livro2.setAutor("Loione groner");
        livro2.setAnoLancamento(2016);
        livro2.setIsbn("8575225014");

        Livro livro3 = new Livro();
        livro3.setNome("teste 3");
        livro3.setAutor("Loione groner");
        livro3.setAnoLancamento(2016);
        livro3.setIsbn("8575225014");

        Livro livro4 = new Livro();
        livro4.setNome("teste 4");
        livro4.setAutor("Loione groner");
        livro4.setAnoLancamento(2016);
        livro4.setIsbn("8575225014");

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("empilhando livros na pilha: ");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " Livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Espiando o topo da pilha: " + pilha.topo());
        System.out.println("Desempilhando livros da pilha: ");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());

        }
    }

