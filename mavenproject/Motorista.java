
package com.mycompany.mavenproject;

import java.time.LocalDate;

public class Motorista extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motorista() {
    }

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissão);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    
}
