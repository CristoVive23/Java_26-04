
package com.mycompany.mavenproject;

public class Gerente extends CargoDeConfianca{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao) {
        super(bonificacao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
       double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.getValor();
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }
    
}
