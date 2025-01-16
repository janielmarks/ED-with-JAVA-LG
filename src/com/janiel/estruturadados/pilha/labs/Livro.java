package com.janiel.estruturadados.pilha.labs;

public class Livro {

    private String isbn;
    private String autor;
    private int anoLancamento;
    private String nome;

    public Livro() {
        super();
    }

    public Livro(int anoLancamento, String autor, String isbn, String nome) {
        this.anoLancamento = anoLancamento;
        this.autor = autor;
        this.isbn = isbn;
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "anoLancamento='" + anoLancamento + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
