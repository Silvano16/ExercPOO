package com.company;

public class Secretaria extends Funcionario {
    private String telefone;
    private String ramal;

    public Secretaria() {
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return this.ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}