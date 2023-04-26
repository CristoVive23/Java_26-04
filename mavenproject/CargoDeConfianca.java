
package com.mycompany.mavenproject;

public abstract class CargoDeConfianca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca() {
    }

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
}
