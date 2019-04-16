package com.company;


public class Fornecedor {
    private int idForm;
    private String nome ;
    private String contato;
    private String telefone;
    private String email;

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void imprimirFornecedor(){
        System.out.println("idForm = " + getIdForm());
        System.out.println("nome = " + getNome());
        System.out.println("contato = " + getContato());
        System.out.println("telefone = " + getTelefone());
        System.out.println("email = " + getEmail());
    }
}
