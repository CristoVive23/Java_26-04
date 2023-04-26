
package com.mycompany.mavenproject;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected double salarioBase;
    protected LocalDate dataAdmissão;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase, LocalDate dataAdmissão) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.dataAdmissão = dataAdmissão;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public abstract double getSalarioFinal();

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(LocalDate dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }
    
    
}
