package com.janiel.estruturadados.pilha.labs;

import com.janiel.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){

            System.out.println("Entre com um número: ");
            int num = scan.nextInt();
            if (num % 2 ==0){
                System.out.println("Empilhando o número "+ num);
                pilha.empilha(num);
            } else {

                Integer desepilhado = pilha.desempilha();

                if (desepilhado == null){
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desepilhado);
                }
            }
        }
        System.out.println("todos os números foram lidos, desempilhando números da pilha");
        while (!pilha.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());

        }
        System.out.println("Todos os elementos foram desempilhados");
    }
}
