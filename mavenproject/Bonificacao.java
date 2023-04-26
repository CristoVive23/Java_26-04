
package com.mycompany.mavenproject;

public enum Bonificacao {
    GERENTE(0.3),
    DIRETOR(0.4);
    
    private double valor;

    private Bonificacao() {
    }

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
}
