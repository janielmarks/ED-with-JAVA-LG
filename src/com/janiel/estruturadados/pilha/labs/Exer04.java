package com.janiel.estruturadados.pilha.labs;

import com.janiel.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<>();

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

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
        System.out.println("empilhando livros na pilha: ");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " Livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
        System.out.println("Espiando o topo da pilha: " + pilha.peek());
        System.out.println("Desempilhando livros da pilha: ");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());

    }
}

