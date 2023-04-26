
package com.mycompany.mavenproject;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private double PREMIO;

    public Diretor() {
    }

    public Diretor(double PREMIO, Bonificacao bonificacao) {
        super(bonificacao);
        this.PREMIO = PREMIO;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void demitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.getValor();
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }
}
