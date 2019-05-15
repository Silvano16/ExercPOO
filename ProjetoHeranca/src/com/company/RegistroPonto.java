package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto() {
    }

    public long getIdRegPonto() {
        return this.idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return this.func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return this.dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistro() {
        System.out.println("Funcionario: " + this.getFunc().getNome());
        System.out.println("Data de Registro: " + this.getDataRegistro());
        System.out.println("Horario Entrada: " + this.getHoraEntrada());
        System.out.println("Horario Saida: " + this.getHoraSaida());
    }
}