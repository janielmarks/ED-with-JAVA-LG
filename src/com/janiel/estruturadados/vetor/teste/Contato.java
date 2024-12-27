package com.janiel.estruturadados.vetor.teste;

import java.util.Objects;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato(String email, String nome, String telefone) {
        super();
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato() {}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + email + '\'' +
                ", telefone='" + nome + '\'' +
                ", email='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(telefone, contato.telefone) && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, email);
    }
}
