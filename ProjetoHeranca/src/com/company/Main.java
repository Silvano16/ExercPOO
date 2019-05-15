package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();
        Operador operador = new Operador();
        gerente.setIdFunc(1);
        gerente.setNome("JOÂO");
        gerente.setEmail("Joao@Joao");
        gerente.setDocumento("12345");
        gerente.setLogin("joao");
        gerente.setSenha("123");
        secretaria.setIdFunc(2);
        secretaria.setNome("Luana");
        secretaria.setEmail("luana@luan");
        secretaria.setDocumento("6789");
        secretaria.setTelefone("3806-1010");
        secretaria.setRamal("99999");
        operador.setIdFunc(3);
        operador.setNome("Lucas");
        operador.setEmail("lucas@lucas");
        operador.setDocumento("102030");
        operador.setValorHora(10.0D);
        RegistroPonto registroPonto1 = new RegistroPonto();
        registroPonto1.setIdRegPonto(1L);
        registroPonto1.setFunc(gerente);
        registroPonto1.setDataRegistro(LocalDate.now());
        registroPonto1.setHoraEntrada(LocalDateTime.now());

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException var10) {
            System.out.println(" a");
        }

        registroPonto1.setHoraSaida(LocalDateTime.now());
        registroPonto1.apresentarRegistro();
        RegistroPonto registroPonto2 = new RegistroPonto();
        registroPonto2.setIdRegPonto(2L);
        registroPonto2.setFunc(secretaria);
        registroPonto2.setDataRegistro(LocalDate.now());
        registroPonto2.setHoraEntrada(LocalDateTime.now());

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException var9) {
            System.out.println(" a");
        }

        registroPonto2.setHoraSaida(LocalDateTime.now());
        registroPonto2.apresentarRegistro();
        RegistroPonto registroPonto3 = new RegistroPonto();
        registroPonto3.setIdRegPonto(3L);
        registroPonto3.setFunc(operador);
        registroPonto3.setDataRegistro(LocalDate.now());
        registroPonto3.setHoraEntrada(LocalDateTime.now());

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException var8) {
            System.out.println(" a");
        }

        registroPonto3.setHoraSaida(LocalDateTime.now());
        registroPonto3.apresentarRegistro();
    }
}